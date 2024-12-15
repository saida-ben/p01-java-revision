package org.mql.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Examples {
    
	public Examples() {
        exp03();
     }
     
     void exp01() {
    	 TimeProcessing tp= new TimeProcessing();
    	 tp.run(new ListTest(1000000));
     }
     
     void exp02() {
    	 // Shared Ressource = Ressource Partegee
    	 List<Integer> data = new Vector<Integer>();
    	 
    	 Writer w1 = new Writer(data);
    	 Writer w2 = new Writer(data);

    	 w1.start();
    	 w2.start();
    	 
    	 // Attendre que les deux processus terminent
    	 try {
    	 w1.join();
    	 w2.join();
    	 }
    	 
    	 catch(Exception e) {}
     
        System.out.println("taille de data : " + data.size());
        
     }
     
     void exp03() {
    	 TimeProcessing tp= new TimeProcessing();
    	 tp.run(new StringTest(100000));
     }
     
	public static void main(String[] args) {
       /*
         Examples e = new Examples();
         e.exp01();
        */
		new Examples();
	}

	
}
