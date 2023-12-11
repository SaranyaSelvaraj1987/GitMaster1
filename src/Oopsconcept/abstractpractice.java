package Oopsconcept;

import pack1.abstractclass1;

public class abstractpractice extends abstractclass1 {

	public static void main(String[] args) {
		
		//child           child
		abstractpractice obj = new abstractpractice();
		obj.absmethod1();
		obj.method1();
		//parent        child
		abstractclass1 obj3= new abstractpractice();
		obj3.absmethod1();
		//Parent Parent is not possible in abstract class
		//abstractclass1 obj4 = new abstractclass1();
		}

	@Override
	public void absmethod1() {
		System.out.println("implemented");
		System.out.println("Modified");
	}

}
