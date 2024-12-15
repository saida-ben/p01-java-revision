package org.mql.java;

import java.awt.Color;

import javax.swing.JFrame;

public class ScreenFrame extends JFrame  {
	
	// JApplet  deprecated
	// JWindow => Splash Screen (sans decoration)
	// JDialog (boite dialogue ktkhrj mn fenetre principale jframe d habitude)
	// JFrame

private Screen screen;

public ScreenFrame() {
userInterface();
generateShapes();
}

private void userInterface() {
  screen = new Screen(800, 500);
  setContentPane(screen);
  
  
  pack();
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  setVisible(true);
  
}

private void generateShapes() {
	CircleGenerator cg = new CircleGenerator(screen);
	cg.start();
	//screen.add(new Circle(100, 100, 80));
	//screen.add(new Circle(200, 100, 80, Color.red));
	//screen.add(new Rectangle(200,200, 300, 100));

}
public static void main(String[] args) {
	new ScreenFrame();
}
}
