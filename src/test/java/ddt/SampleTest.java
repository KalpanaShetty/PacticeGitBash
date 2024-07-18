package ddt;

import java.util.Random;

public  class SampleTest {
static int number;
	public static void main(String[] args) {
	SampleTest t1 = new SampleTest();
	t1.number=new Random().nextInt();
	System.out.println(t1.number);
	
	SampleTest t2 = new SampleTest();
	t2.number=new Random().nextInt();
	
	
	SampleTest t3 = new SampleTest();
	t3.number=new Random().nextInt();
 
	
	System.out.println(t3.number);
	
	}

}
