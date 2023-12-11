package Oopsconcept;

public class DataTypesArray {

	public static void main(String[] args) {
		
		int a = 10;
		double b=23.6;
		char a1='S';
		String b2="Saranya";
		boolean c = true;
		System.out.println("My name is:"+b2+"returns:"+c);
		//Array method1
		int[] array1= new int[5];
		array1[0]=30;
		array1[1]=40;
		array1[2]=50;
		array1[3]=10;
		array1[4]=100;
		System.out.println("Array values:"+array1[3]+array1[4]);
		//Array Method2
		int[] array2 = {20,30,40,25};
		System.out.println("Array2 values:"+array2[3]);
		//for looop
		for(int i=0;i<array1.length;i++)
		{
		if(array1[i]==40)
		{
		System.out.println("40 present at index:"+i);	
		}
		}
		for(int j=0;j<array1.length;j++)
		{
			System.out.println("Array value at "+j+"is:"+array1[j]);
		}
		//Enhanced for loop
		String[] names= {"Saran","Leelu","Bavith","Bavthik"};
		for(String nameFound:names)
		{
		if(nameFound.equals("Leelu"))
		{
			System.out.println("Name is:"+nameFound);
		}
		System.out.print(nameFound);
		}
		
		

	}

}
