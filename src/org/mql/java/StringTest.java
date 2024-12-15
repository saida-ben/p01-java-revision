package org.mql.java;

public class StringTest {

	
    private int counter;
    private String word = "*";
    private String data ;
    
		// TODO Auto-generated constructor stub
		public StringTest(int counter) {
			this.counter = counter;
		}
		
		public void testString() {
			String s = "";
			for(int i = 0; i < counter; i++) {
				char letter = (char)('A' + (int)( Math.random() * 26)) ;
				s += letter ;
			}
			data = s ;

		} 
		
		public void testStringBuffer() {
			// thread safe
			StringBuffer s =new StringBuffer("");
			for(int i = 0; i < counter; i++) {
				char letter = (char)('A' + (int)( Math.random() * 26)) ;
				s.append(letter);
			}
			data = s.toString() ;
		}
		
		public void testStringBuilder() {
			StringBuilder s =new StringBuilder("");
			for(int i = 0; i < counter; i++) {
				char letter = (char)('A' + (int)( Math.random() * 26)) ;
				s.append(letter);
			}
			data = s.toString() ;
			
		}
		
		
}
