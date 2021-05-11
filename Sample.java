import java.sql.*;

public class Sample
{
  public static void main(String[] args)throws Exception
  {
    Connection connection = null;
	try {
		Class.forName("org.sqlite.JDBC");
		
		try
	    {
		// create a database connection
	      connection = DriverManager.getConnection("jdbc:sqlite:tst.db");
	      //connection = DriverManager.getConnection("jdbc:sqlite::memory:tst");
	      Statement statement = connection.createStatement();
	      statement.setQueryTimeout(30);  // set timeout to 30 sec.

	      statement.executeUpdate("drop table if exists `users`");
	      statement.executeUpdate("create table `users` (id integer, name string)");
	      statement.executeUpdate("insert into `users` values(1, 'Oren')");
	      statement.executeUpdate("insert into `users` values(2, 'Test')");
	      ResultSet rs = statement.executeQuery("select * from `users`");
	      while(rs.next())
	      {
	        // read the result set
	        System.out.println("name = " + rs.getString("name"));
	        System.out.println("id = " + rs.getInt("id"));
	      }
	    }
	    catch(SQLException e)
	    {
	      // if the error message is "out of memory",
	      // it probably means no database file is found
	      System.err.println(e.getMessage());
	    }	
	    finally
	    {
	      try
	      {
	        if(connection != null)
	          connection.close();
	      }
	      catch(SQLException e)
	      {
	        // connection close failed.
	        System.err.println(e.getMessage());
	      }
	    }
		
	}
	catch(ClassNotFoundException e) {
		System.out.println(e);
	}
	
    
  }
}
