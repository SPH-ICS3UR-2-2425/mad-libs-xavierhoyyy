import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Enter a Number: ");
		int num1 = in.nextInt();
		in.nextLine();//flush
		System.out.println("Enter a place: ");
		String place = in.nextLine();  
		System.out.println("Enter a date: ");
		String date = in.nextLine();
		System.out.println("Enter a time of day: ");
		String time = in.nextLine();
		System.out.println("Enter a decimal number: ");
		double decimal = in.nextDouble();
		in.nextLine();//flush
		System.out.println("Enter a Phrase: ");
		String phrase = in.nextLine();
		System.out.println("Enter a meal: ");
		String meal = in.nextLine();
	    System.out.println("Enter your favourite number: ");
		int num2 =in.nextInt();
		in.nextLine();//flush
		System.out.println("Enter a famous person: ");
		String famous = in.nextLine();
		
		
		
		
		
		
		//Story
		System.out.println("One day, "+name+" Mad Libs in "+place+" at "+time+" on "+date+", "+name+" keeps mentioning that his favourite number is "+num1+". All " +name+ " really does is talk about "+num1+". "+name+" loves adding "+decimal+" to the end of his number "+name+". While in "+place+", "+name+" loves shouting out "+phrase+" While eating "+meal+". After eating and screaming "+name+" realised that his new favourite number is "+num2+". "+name+", after eating met "+famous+" and the started to scream "+num2+" at him, until he got a photo." );
	}

}
