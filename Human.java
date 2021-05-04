import java.util.Random;

public class Human { // the class definition (the class is the object blueprint)
	
	private double _weight; // the variable of the Human weight
	private double _height; // the variable of the Human height
	private String _fullname; // the variable of the human full name
	
	public Human(String name) { // constructor method for set values on the variables while object is initialized.
		
		Random _rand = new Random();
		
		_weight = _rand.nextInt((5 - 2) + 1) + 2 + ( _rand.nextInt(99) / 100 );
		_height = _rand.nextInt((25 - 15) + 1) + 15 + ( _rand.nextInt(99) / 100 );
		_fullname  = name;
		System.out.println("Hello everyone, i am " + _fullname + " it is nice to meet you all.");
		System.out.println("My height is " + _height);
		System.out.println("My weight is " + _weight);
	
	}
	
	
	public void walk(int distance, int speed) { // the class method `walk` use the variables `speed`, `distance` (formal parameters)
		
		_weight = _weight -  distance * speed / 1000000;
		System.out.println(_fullname + " is done walking, his weight is: " + _weight);

		
	}
	
	public void sleep(int duration) { // the class method for sleeping
		
		_height = _height + duration * 1.01; // math for the variables(value) of human height
		System.out.println(_fullname + " is finished to sleep, his height is: " + _height);

		
	}
	
	public void greetPerson(String name) { // the class method(action) for greeting a friend
		
		if (name != null && name != "") {
			System.out.println("Hello dear " + name + " it is " + _fullname + ", How are you today?");	
		} else {
			System.out.println("Im fine, Thank you, How are you?");
		}
		
	}
	
	public void eat(double amount) { // the class method for eating
		_weight = _weight + amount / 100;
		System.out.println(_fullname + " is finished to eat, his weight is: " + _weight);
	}
	
	
	public static void main(String[] args) { // method
		
		Human personOne = new Human("Oren"); //  
		Human personTwo = new Human("Denis");
		
		personOne.eat(750);
		personTwo.eat(1220);
		personOne.walk(400, 5);
		personTwo.walk(700, 5);
		personOne.greetPerson("Denis");
		personTwo.greetPerson("");
		personOne.greetPerson("");
		personOne.sleep(100);
		personTwo.sleep(150);
		
	}
	

}
