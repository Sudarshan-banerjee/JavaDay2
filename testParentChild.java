package Day2;

public class testParentChild {
	public static void main(String[] args) {
		Child child = new Child();   //Calling the non parameterized constructor
		Child children = new Child(200);  //calling the parameterized constructor
		children.addition();  
		children.display();
		children.show();
		child.display();
		child.show();
		child.addition();
		child.multiply();
		
	}
}
