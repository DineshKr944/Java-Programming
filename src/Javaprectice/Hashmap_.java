package Javaprectice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashmap_ {

	public static void main(String[] args) {
		HashMap<Integer, String>hs=new HashMap<Integer, String>();
		hs.put(01, "Dinesh");
		hs.put(02, "Dashrathi");
		hs.put(03, "Abhijeet");
		hs.put(04, "Ravi");
		hs.put(05, "Amit");
		Hashtable<Integer, String>ht=new Hashtable<Integer, String>(hs);
		System.out.println(ht);
		System.out.println("By using For loop");
		Set<Object>s=(Set)ht.entrySet();
		Iterator<Object>it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
