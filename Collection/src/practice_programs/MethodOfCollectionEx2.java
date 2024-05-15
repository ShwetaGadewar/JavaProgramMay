package practice_programs;

import java.util.ArrayList;
import java.util.Set;

public class MethodOfCollectionEx2 {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("10");
	a1.add("20");
	a1.add("30");
	a1.add("40");
	System.out.println(a1);
	System.out.println("=========================================");
	
	
	ArrayList a2=new ArrayList();
	a2.add("Shweta");
	a2.add("Null");
	a2.add("true");
	a2.add("10");
	a2.add("20");
	a2.add("30");
	a2.add("40");
	System.out.println(a2);
	
	a2.addAll(a1);
	//a2.remove(3);
	
	a2.add(3, 55);
	System.out.println(a2);
	//a2.removeAll(a1);
	
	//System.out.println("After removing a1"+a2);
	
	}

}
