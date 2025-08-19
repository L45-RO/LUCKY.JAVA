package javaprograms;
import java.util.Scanner;
public class Ovals {
	public static void main(String[] arg) {
		Scanner Sc=new Scanner(System.in);
		char ch=Sc.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			System.out.println("given character is Oval");
		}
		else {
			System.out.println("given character is not an Oval");
		}
	}


}
