package BASICS;


public class VowelsConsonants {
	public static void main(String[] args) {
		String x = "it is a great day let us learn java today & TODAY WE NEED TO COMPLETE MYSQL";
		
		char ch[] = x.toCharArray();
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o' || ch[i]=='u'|| ch[i] == 'A'|| ch[i] == 'E'|| ch[i] =='I'|| ch[i] =='O'|| ch[i] == 'U') {
				count = count +1;
				count1=count1 +1;
			}
			else if(ch[i] == ' ' || ch[i] == '.') {
				continue;
			}
			else {
				count1 = count1 + 1;
		
			}
		}
		System.out.println("THE NO.OF VOWELS IS "+count);
		System.out.println("THE NO.OF.CONSONANTS IS "+count1);
	}
}