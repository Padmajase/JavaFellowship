//1.6 Write a program to demonstrate static variables, methods, and blocks.
class Demonstration{
static int a; //static variable, Global a
	public static void main(String[] args){
		int a=1;  //local a
		System.out.println("local value of a is "+a);
		a=1;
		System.out.println("after local value of a is "+a);
		System.out.println("static value of a is "+Demonstration.a);
		System.out.println("main method executed");
		System.out.println("main method block executed");
  }
}