/**
   @Author:
      Date: Jan 05, 2009
   Teacher:
       Lab:
      Misc:
  */


import java.util.*;

import javax.swing.JOptionPane;

public class WebLesson3_1 {
	
	public static void main(String args[]) {
		EasterCalculator ec = new EasterCalculator();
		
		List<String> optionList = new ArrayList<String>();
		optionList.add("Find date");
		optionList.add("Find years");
		optionList.add("Find most common date between years");
		Object[] options = optionList.toArray(); 
		Object value = JOptionPane.showInputDialog(null, "Make Selection", "input box", 0, null, options, 0);
		int index = optionList.indexOf(value);
		if(index == 0){
			String years = JOptionPane.showInputDialog("Enter a year to find it's Easter date");
			int y = Integer.parseInt(years);
			ec.getMonth(y);
			ec.getDay(y);
		}
		else if(index == 1){
			String months = JOptionPane.showInputDialog("Enter a month to find a series of years between 1583 and 2014");
			int month = Integer.parseInt(months);
			if(month < 3){
				System.out.println("That's not a valid easter month. Try 3 or 4");
				return;
			}			
			if(month > 4 && month < 12){
				System.out.println("That's not a valid easter month. Try 3 or 4");
				return;
			}			
			if(month > 12){
				System.out.println("That's not even a valid month. Get it together.");
				return;
			}
			String days = JOptionPane.showInputDialog("Enter a day of that month");
			int day = Integer.parseInt(days);
			ec.getYear(month, day);
		}
		else if(index == 2){
			String bYear1 = JOptionPane.showInputDialog("Enter the most recent year");
			int bYear = Integer.parseInt(bYear1);
			String sYear1 = JOptionPane.showInputDialog("Enter the earliest year");
			int sYear = Integer.parseInt(sYear1);
			//ec.getMultiYears(bYear, sYear);
			//ec.
		}
	}
}