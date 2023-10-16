package Javaprectice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Ex {

	public static void main(String[] args) {
		int i;
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("Dinesh");
		al.add("Dashrath");
		al.add("Ravi");
		al.add(100);
		al.add('D');
		al.add(12.3);
		System.out.println(al);
		System.out.println("-------By using for loop-------");
		for(i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------By using for Each--------");
		for(Object s:al) {
			System.out.println(s);
		}
		System.out.println("--------By using iterator--------");
		Iterator<Object>it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
