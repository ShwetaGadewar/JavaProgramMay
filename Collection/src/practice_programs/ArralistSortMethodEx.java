package practice_programs;

import java.util.ArrayList;
import java.util.Collections;

public class ArralistSortMethodEx {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(15);
		a1.add(100);
		a1.add(300);
		a1.add(18);
		a1.add(-120);
		a1.add(55);
		Collections.sort(a1);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add("ashish");
		a2.add("zz");
		a2.add("vidhi");
		a2.add("prasad");
		a2.add("pooja");
		a2.add("shweta");
		a2.add("shreya");
		//Collections.sort(a2);
		//System.out.println(a2);
		System.out.println(a2.indexOf(4));
		
		System.out.println(a2.get(4));
		a2.set(3, "sachin");
		System.out.println("------------after changing the value of index3");
		System.out.println(a2);
		

	}

}
