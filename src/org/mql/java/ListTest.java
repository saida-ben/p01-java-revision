package org.mql.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

 
public class ListTest {
     private int counter;
     
		// TODO Auto-generated constructor stub
		public ListTest(int counter) {
			this.counter = counter;
		}
		

		
		public 	void TestLinkedList() {
			List<String> list = new LinkedList<String>();
			for (int i =0; i< counter; i++) {
				list.add(0, "" + i);
			}
		}
		
		public 	void TestVector() {
			List<String> list = new Vector<String>();
			for (int i =0; i< counter; i++) {
				list.add(0, "" + i);
			}
		}
		
		public 	void TestArrayList() {
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
