/**
   @Author:
      Date: Jan 05, 2009
   Teacher:
       Lab:
      Misc:
  */


import java.util.*;

import javax.swing.JOptionPane;

public class WebLesson6_1 {
	public static void main(String args[]){
		final double FED_TAX = .154;
		final double FICA_TAX = .0775;
		final double STATE_TAX = .04;
		
		String worked = JOptionPane.showInputDialog("Enter Worked Hours");
		double workHours = Double.parseDouble(worked);
		String hourly = JOptionPane.showInputDialog("Enter Hourly Rate");
		double hrRate = Double.parseDouble(hourly);
		double grossPay = workHours*hrRate;
		double netPay = grossPay-((grossPay*FED_TAX)+(grossPay*FICA_TAX)+(grossPay*STATE_TAX));
		
		System.out.println("The gross pay for this worker is "+grossPay);
		System.out.println("The Federal Tax = "+FED_TAX);
		System.out.println("The FICA Tax = "+FICA_TAX);
		System.out.println("The State Tax = "+STATE_TAX);
		System.out.println("The net pay for this worker is "+netPay);
	}
	
}