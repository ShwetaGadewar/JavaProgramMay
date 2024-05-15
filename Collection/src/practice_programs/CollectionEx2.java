package practice_programs;

import java.util.ArrayList;

public class CollectionEx2 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(15);
		a1.add("shweta");
		a1.add("prasadC");
		a1.add(18);
		
		System.out.println(a1);

		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		a2.add(67);
		a2.add("Prasad");
		//a2.addAll(3, a1);
		System.out.println(a2);

	}

}
