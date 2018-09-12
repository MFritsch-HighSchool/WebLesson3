public class EasterCalculator {
	int p;
	int n;
	int loop;
	int[] array1;

	
	/**
	 * Method getMonth
	 *
	 *
	 * @param y
	 *
	 * @return
	 *
	 */
	public int getMonth(int y) {
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int f = (b+8)/25;
		int g = (b-f+1)/3;
		int h = (19*a+b-d-g+15)%30;
		int i = c/4;
		int k = c%4;
		int r = (32+2*e+2*i-h-k)%7;
		int m = (a+11*h+22*r)/451;
		n = (h+r-7*m+114)/31;
		p = (h+r-7*m+114)%31;
		System.out.println(n+" is the month!");
		return n;
	}
	
	public int getDay(int y) {
		System.out.println(p+1+" is the day!");
		String month = null;
		if(n == 3){
			month = "March";
		}
		else if(n == 4){
			month = "April";
		}
		System.out.print(month + " the "+(p+1)+" is the date!");
		return p;
	}
	
	public int getYear(int month, int day){
		int y = 1583;
		for(int looper = 0; looper < 432; looper++){
			int a = y%19;
			int b = y/100;
			int c = y%100;
			int d = b/4;
			int e = b%4;
			int f = (b+8)/25;
			int g = (b-f+1)/3;
			int h = (19*a+b-d-g+15)%30;
			int i = c/4;
			int k = c%4;
			int r = (32+2*e+2*i-h-k)%7;
			int m = (a+11*h+22*r)/451;
			n = (h+r-7*m+114)/31;
			p = (h+r-7*m+114)%31;
			if(n ==  month && (p+1)==day){
				System.out.println(y);
			}
			y++;
		}
		return 0;
	}
	
	public int getMultiYears(int bYear, int sYear){
		loop = bYear - sYear;
		loop++;
		int y = sYear;
		for(int looper = 0; looper < loop; looper++){
			int a = y%19;
			int b = y/100;
			int c = y%100;
			int d = b/4;
			int e = b%4;
			int f = (b+8)/25;
			int g = (b-f+1)/3;
			int h = (19*a+b-d-g+15)%30;
			int i = c/4;
			int k = c%4;
			int r = (32+2*e+2*i-h-k)%7;
			int m = (a+11*h+22*r)/451;
			n = (h+r-7*m+114)/31;
			p = (h+r-7*m+114)%31;
			y++;
			p++;
			mostCommonInt(array1);
		}
		return 0;
	}
	private int mostCommonInt(int[] a)
	{
	  int count = 1, tempCount;
	  int popular = a[0];
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = a[i];
	    tempCount = 0;
	    for (int j = 1; j < a.length; j++)
	    {
	      if (temp == a[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  return popular;
	}
}
