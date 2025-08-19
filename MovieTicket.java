package com;
import java.util.Scanner;
public class MovieTicket {
	 static int availabletickets=100;
	public static String book(int quantity) {
		if(quantity<=0) {
			return"ticket quantity should be positive.";
			
		}
		availabletickets -= quantity;
		int totalamount = quantity*50;
		return"successfully booked"+quantity+"tickets.total"
		+"cost:"+totalamount+".remaining tickets:"+availabletickets;
		
		
	}
	public static String showavaliabletickets() {
		return"avaliabletickets:"+showavaliabletickets();
		
	}
	public static String canceltickets(int quantity) {
		if(quantity<=0) {
			return"cancel quantity should be positive.";
					
		}
		else if(quantity>(100 - availabletickets)) {
			return"cannot cancel more tickets than booked.";
			
			
		}
		availabletickets +=quantity;
		return"successfully cancled"+quantity+"tickets.remaining tickets:";
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("select an option:");
			System.out.println("1.book movie tickets");
			System.out.println("2.cancel tickets");
			System.out.println("3.show avaliable tickets");
			System.out.println("4.exit");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter the number of tickets to book:");
				int quantity=sc.nextInt();
				System.out.println(book(quantity));
				break;
			case 2:
				System.out.println("enter the number of tickets to cancel:");
				int cancelquantity=sc.nextInt();
				System.out.println(canceltickets(cancelquantity));
				break;
			case 3:
				System.out.println(showavaliabletickets());
				break;
			case 4:
				System.out.println("thjank you! exiting.......");
				break;
				default:
					System.out.println("invalid option-----");
				
			}
			
		}
	}

}

