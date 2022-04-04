// switch stmnt 1. Write a Program to Check Vowel or Consonant

import java.util.Scanner;
class Vowel{
	public static void main(String args[])
	{
		System.out.println("Enter character")
		Scanner scan=new Scanner(System.in);
		char c = scan.next().charAt(0);
		
		switch(c){
		case 'a' : System.out.println(c+" is a vowel");
		break;
		case 'e' : System.out.println(c+" is a vowel");
		break;
		case 'i' : System.out.println(c+" is a vowel");
		break;
		case 'o' : System.out.println(c+" is a vowel");
		break;
		case 'u' : System.out.println(c+" is a vowel");
		break;
		default : System.out.println(c+" is a consonent");
		}
	
	}
}