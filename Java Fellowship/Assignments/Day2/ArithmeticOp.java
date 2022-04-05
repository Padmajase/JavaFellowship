// Operator program 1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c

import java.util.Scanner;
class ArithmeticOp{
	public static void main(String args[])
	{
		System.out.println("Enter a b c values");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int firstOp = a+b*c;
		int secondOp = c + a /b;
		int thirdOp = a % b + c;
		int forthOp = a * b + c;

		System .out.println("firstOp = "+firstOp +"  secondOp = "+secondOp +
					"  thirdOp = "+thirdOp +"  forthOp = "+forthOp);
		 
		int op[] = new int[]{firstOp, secondOp, thirdOp, forthOp};
      		int max = op[0];
      		int min = op[0];
      
      		for(int i = 1; i < op.length; i++) {
         		if(op[i] > max)
				max = op[i];
         		else if (op[i] < min)
				min = op[i];
		}
		System.out.println("maximum output is : " + max);
      		System.out.println("minimum output is : " + min);	
	}


}