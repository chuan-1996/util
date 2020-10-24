package util;

public class transDouble {
	
 	public static String doubleTrans(double d){
		 String s = (long) d == d ? "" + (long) d : "" + d;
		 return s;
	}
	 public static void main(String[] args) throws Exception {
		 System.out.print(doubleTrans(10.0));
	 }
}
