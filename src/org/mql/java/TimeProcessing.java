package org.mql.java;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class TimeProcessing {
   public TimeProcessing() {
	// TODO Auto-generated constructor stub
    }

   public void run(Object object) {
	   // Introspection = Reflexion
	   
	   Method methods[] = object.getClass().getDeclaredMethods();
	   for(Method m : methods) {
		   try {
			   Instant i1 = Instant.now();
			   m.invoke(object);
			   Instant i2 = Instant.now();
			   long time = Duration.between(i1, i2).toMillis();
			   System.out.println(" - " + m.getName() + ": " + time + "ms");
		   }
		   
		   catch (Exception e) {}
	   }
   }
}
