package Oopsconcept;

import pack1.testinterface;

public class practice1 implements testinterface {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr1.length;i++)
		{
		if(arr1[i]%2==0)	
		{
		System.out.println(arr1[i]);	
		}
		else
		{
		System.out.println("Odd:"+arr1[i]);	
		}
		}
		
		
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

}
