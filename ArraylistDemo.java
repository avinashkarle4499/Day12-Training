package day12;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList o = new ArrayList();
		System.out.println("size of arraylist" + o.size());

		o.add(1);
		o.add("sam");
		o.add("c");
		o.add("23.45");	
		o.add(null);	
		o.add("c");	
		o.add("23.45");	
		o.add(null);	

		System.out.println("size of arraylist after adding" + o.size());

		System.out.println("element of arraylist" + o);

		System.out.println("exists" + o.contains("sam"));
		System.out.println("index" + o.indexOf(1));
		System.out.println("index" + o.indexOf("c"));
		System.out.println("element at index 2" + o.get(2));

		System.out.println("========remove=======");
		o.remove(Integer.valueOf(1));

		System.out.println("after removing " + o);
	}

}
