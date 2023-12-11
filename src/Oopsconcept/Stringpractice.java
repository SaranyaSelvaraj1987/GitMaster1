package Oopsconcept;

public class Stringpractice {

	public static void main(java.lang.String[] args) {
		//Literal way of defining String
		String a1 = "Saranya is a mom";
		String b1="Saranya is a mom";
		//in the above, java will allocate same memory for both a1 and b1 since the values are same.
		
		//Allocating new memory
		String b = new String();
		b="Saranya new";
		String c = new String();
		c="Sarnya new";
		//this will allocate new memory even though the values are same.
		
		//To access the methods of String
		
		String[] splitted = a1.split(" ");
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		
		String b2 = "Saranya9is a& mom7";
		//split Saranya from the String and reverse mom
		String[] splittedSaranya = b2.split("9");
		System.out.println(splittedSaranya[0]);
		String[] splitted1 = splittedSaranya[1].split("&");
		String momvalue=splitted1[1].trim();
		for(int i=momvalue.length()-1;i>=0;i--)
		{
			System.out.println(momvalue.charAt(i));
		}
		
		
		
	}

}
