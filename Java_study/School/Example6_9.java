package six;

public class Example6_9 {
	   public static void main (String args[ ]) {
	      String str= "���¼:http://www.cctv.cn������";
	      String regex="(http://|www)[.]?\\w+[.]{1}\\w+[.]{1}\\p{Alpha}+";
	      String newStr=str.replaceAll(regex,"");
	      System.out.println(str); 
	      System.out.println(newStr);
	   }
	}