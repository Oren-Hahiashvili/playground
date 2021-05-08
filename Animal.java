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
	private int _id;
	private Colors eyeColor;
	private Colors bodyColor;
	private String name;
	
	void initilaizeID(){
		_lastID++;
		_id = _lastID;
	}
	
	int getID() {
		return _id;
	}

	String getName() {
		return name;
	}

	Colors getEyeColor() {
		return eyeColor;
	}
	
	Colors getBodyColor() {
		return bodyColor;
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
		
		Dog dubi = new Dog("Dubi");
		Dog milki = new Dog("Milki");
		System.out.println(milki.getName());
		dubi.talk();

	}
	
    
}



