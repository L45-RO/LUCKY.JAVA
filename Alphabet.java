package javaprograms;
import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);;
		char ch=Sc.next().charAt(0);
		if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z'){
			System.out.println("given character is an Alphabet");
		}
		else{
			System.out.println("given character is not an alphabet");
		}
				
		{
			
		}
		
		
	}

}
