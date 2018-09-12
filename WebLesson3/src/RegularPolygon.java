/**
   @Author:
      Date: Jan 05, 2009
   Teacher:
       Lab:
      Misc:
  */


import java.util.*;

import javax.swing.JOptionPane;

public class RegularPolygon {
	private int numsides;
	private double sidelength;
	private double myR;  //radius of circumscribed circle
	private double myr;  // radius of inscribed circle
	

	public RegularPolygon(){
		numsides = 3;
		sidelength = 10;
		this.calcr();
		this.calcR();
	}
	public RegularPolygon(int myNumSides, double mySideLength){
		numsides = myNumSides;  //# of sides
		sidelength = mySideLength;  //length of sides
		this.calcr();
		this.calcR();
	}
	private void calcR(){
		myR = (sidelength/2)*(1/(Math.sin(Math.PI/numsides)));
	}
	private void calcr(){
		myr = (sidelength/2)*(1/(Math.tan(Math.PI/numsides))) ;
	}
	public double vertexAngle(){
		double vertang = Math.toRadians((numsides-2)*numsides*180);
		return vertang;
	}
	public static double toRadians(double angdeg){
		return angdeg;
	}
	public double Perimeter(){
		return numsides*sidelength;
	}
	public double Area(){
		return 0.5*numsides*(myR*myR)*Math.sin((2*Math.PI)/numsides);
	}
	public double getNumSide(){
		return numsides;
	}
	public double getSideLength(){
		return sidelength;
	}
	public double getR(){
		return myR;
	}
	public double getr(){
		return myr;
	}
}