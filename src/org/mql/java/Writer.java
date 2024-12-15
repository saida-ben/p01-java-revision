package org.mql.java;

import java.util.List;

 
public class Writer extends Thread{
	
	private List<Integer> data;

	public Writer(List<Integer> data) {
		super();
		this.data =data;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run () {
		
		for(int i=0; i<100; i++) {
			int e = (int) (Math.random() *9000 +1000);
			data.add(e);
		}
		
	}
}
