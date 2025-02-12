package com.dara;

import java.util.ArrayList;

//wrapper class
//semua tipe data yang berbentuk angka bisa diubah menjadi tipe data yang lainr
//punya nilai konstan (max dan min)
public class Main {
//	int x;
//	Integer y = 99;
//	Float y = 99f; 
//	String name = "Budi";
//	String name1 = "PRO_2802538460";
	
//	String x;
//	String newX;

	
	int[] x = new int[4];
	ArrayList<Integer> y = new ArrayList<Integer>();
	
	HashMap<String,Integer>or
	
	public Main() {
//		y.toString(); //ngubah int jadi string
//		y.longValue();
//		System.out.print(y.MAX_VALUE);
//		x = Integer.parseInt("99996"); //ngubah string jdi int
//		x = Integer.parseInt("Hello"); //bakalan error, karna bukan bentuk angka
//		System.out.print(x);
//		x = Integer.parseInt("999");
		
				
//		System.out.println(name.compareTo("Budi")); //ini ngasih tau dia perbedaan nya kek mana
//		System.out.println(name == "cudi"); //kalo ini, kalo sama dia bakalan true, kalo ngga false. kaya boolean
//		System.out.println(name1.substring(4)); //skip 4 huruf, diitung dari depAN
//		System.out.println(name1.indexOf("0")); //buat nyari, search nya ada di index ke brp
		
		x[0] = 100;
		System.out.println(x[0]);
		
		y.add(7);
		y.add(5);
		y.add(4);
		y.add(90);
		System.out.println(y.get(3)); //print index ke 3
		
		for(Integer n : y) {
//			System.out.println(n);
			System.out.println(n + " size: " + y.size())
		}
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
