import java.util.ArrayList;
import java.util.List;


enum Colors {
	WHITE,
	RED,
	BLUE,
	BLACK,
	BROWN,
	PURPLE,
	YELLOW
}


class Creator {

	private static int _lastID = 0;
	private static List<Creator> _allCreators = new ArrayList<>();
	private int _id;
	private Colors eyeColor;
	private Colors bodyColor;
	private String name;
	
	void initilaizeID(){
		_id = _lastID;
		_lastID++;
		_allCreators.add(this);
	}
	
	int getID() {
		return _id;
	}

	String getName() {
		return getName(this._id);
	}
	
	String getName(int id) {
		return _allCreators.get(id).name;
	}

	Colors getEyeColor() {
		return eyeColor;
	}

	Colors getBodyColor() {
		return getBodyColor(this._id);
	}
	
	Colors getBodyColor(int id) {
		return _allCreators.get(id).bodyColor;
	}

		
	Creator(String name, Colors bodyColor, Colors eyeColor){
		this.name = name;
		this.bodyColor = bodyColor;
		this.eyeColor = eyeColor;
		initilaizeID();
	}
	
	Creator(String name, Colors bodyColor){
		this.name = name;
		this.bodyColor = bodyColor;
		initilaizeID();
	}

	Creator(String name){
		this.name = name;
		initilaizeID();
	}
	
}



interface Legs {

	void walk();
	void jump();
	void seat();
	
}

interface Head {

	void eat();
	void talk();
	void look();
	
}



class Dog extends Creator implements Legs, Head {

    public void eat(){
        System.out.println("Eating");
    } 
    
    public void talk(){
        System.out.println("Barking");
    } 

    public void look(){
        System.out.println("Looking");
    } 

    public void walk(){
        System.out.println("Walking");
    } 
    
    public void jump(){
        System.out.println("Jumping");
    } 

    public void seat(){
        System.out.println("Seating");
    } 

    public void sniff(){
        System.out.println("Sniffing");
    } 

	Dog(String name, Colors bodyColor, Colors eyeColor){
		super(name, bodyColor, eyeColor);
	}

	Dog(String name, Colors bodyColor){
		super(name, bodyColor);
	}

	Dog(String name){
		super(name);
	}
	

}


public class Animal {
    
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dubi = new Dog("Dubi", Colors.BLACK);
		Dog milki = new Dog("Milki");
		System.out.println(milki.getName(0));
		System.out.println(milki.getBodyColor(0));
		dubi.talk();

	}
	
    
}



