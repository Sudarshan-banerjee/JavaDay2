package Day2;

public class Activity implements Eat, Bark {

	@Override
	public void bark() {
		System.out.println("Woof!");
		
	}

	@Override
	public void eat() {
		System.out.println("Yum, Yum!!");
		
	}
	public static void main(String[] args) {
		Eat obj = new Activity();
		obj.eat();
		Bark obj1 = new Activity();
		obj1.bark();
		//obj.bark();
	}
}
