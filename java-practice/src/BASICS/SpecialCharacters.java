package BASICS;

public class SpecialCharacters {
public static void main(String[] args) {
	 String x = "CONGRATS MANI !!!.IT WAS A WONDERFULL PROGRAM. YOU OFFER A CODE IS !abc123....$%@#&";
	 char a[] = x.toCharArray();
	 int count = 0;
	 for (int i = 0; i < a.length; i++)
	 {
		 if (a[i] == '!'||  a[i] == '$' || a[i] == '%'|| a[i] == '&' || a[i] == '#' || a[i] == '@' )
		 {
			 count++;
		 }
	 }
	 System.out.println("THE NO OF SPECIAL CHARACTERS IS " +count);
}
}
