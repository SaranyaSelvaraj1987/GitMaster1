package Oopsconcept;

import pack1.testinterface;
import pack1.testinterface2;

public class interfacepractice implements testinterface,testinterface2 {

	//implementing 2 interfaces
	public static void main(String[] args) {
		testinterface obj1 = new interfacepractice();
		obj1.test1();
		obj1.test2();
		interfacepractice obj2 = new interfacepractice();
		obj2.childmethod1();
		testinterface2 obj3 = new interfacepractice();
		obj3.driver();
		int a1 = obj3.a;
		String s1 = obj3.b;
		
	}
public void childmethod1()
{
	
}
	@Override
	public void driver() {
		// TODO Auto-generated method stub
		
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
