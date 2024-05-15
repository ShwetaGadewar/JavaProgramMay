package practice_programs;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionEx {

	public static void main(String[] args) {
Set<String> s1=new HashSet<>();
s1.add("shwets");
s1.add("shreya");
s1.add("pratik");
s1.add("prsasd");
s1.add("fdghjklopiuytf");
s1.add("5");
s1.add("6");
s1.add("7");
s1.add("8");
s1.add("abc");
s1.add("aa");
System.out.println(s1);


Set s2=new HashSet();
s2.add("fdghjklopiuytf");
s2.add("1");
s2.add("5");
s2.add("2");
s2.add("zzzzzzzzzzdghjklopiuytf");

s2.add("6");
s2.add("3");

s2.add("4");
System.out.println(s2);

Set s4=new HashSet();
s4.add("Prasad");
s4.add("abc");
s4.add("Shweta");

s4.add("Pooja");
System.out.println(s4);

	}

}
