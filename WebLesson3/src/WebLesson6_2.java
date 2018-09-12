/**
   @Author:
      Date: Jan 05, 2009
   Teacher:
       Lab:
      Misc:
  */


import java.util.*;

import javax.swing.JOptionPane;

public class WebLesson6_2 {
	
	public static void main(String[] args){
//		String numside = JOptionPane.showInputDialog("Enter the number of sides for the polygon");
//		int sides = Integer.parseInt(numside);
//		String sidelengths = JOptionPane.showInputDialog("Enter side length");
//		double mySideLength = Double.parseDouble(sidelengths);
		RegularPolygon poly = new RegularPolygon(4,10);
		
		System.out.println("The poly you entered has area: "+poly.Area());
		System.out.println("The poly you entered has a vertex angle of "+poly.vertexAngle());
		System.out.println("The poly you entered has a perimeter of "+poly.Perimeter());
		System.out.println("The poly you entered has a circumscribed angle of "+poly.getR());
		System.out.println("The poly you entered has an inscribed angle of "+poly.getr());
	}
	
	
	
	
}