package javaSession4Assignment1;

class Super{
	int x;
	Super(int x){
		this.x = x;
	}
	
	void display(){
		System.out.println("Super x = "+x);// method defined in superclass
	}
	
	void display(int y){ // method name same as previous method but signature different, ie;overloading
		System.out.println("***Super-Class Method is called - this is overloading***");
		System.out.println("Super x = "+x);
		System.out.println("Super y = "+y);
	}
}

class Sub extends Super{
	int y;
	Sub(int x, int y) {
		super(x);
		this.y = y;
	}
	void display(){ // method name and signature same as method in superclass; ie;overriding
		System.out.println("***Sub-Class Method is called - this is overriding***");
		System.out.println("Super x = "+x);
		System.out.println("Sub y = "+y);
	}
}

public class MethodsExample {

	public static void main(String[] args) {
		
		Sub s1 = new Sub(10,60); // instance of subclass
		s1.display();	// calling the methods 
		s1.display(80);
	}

}
