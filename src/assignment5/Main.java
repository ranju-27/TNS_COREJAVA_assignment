package Assisgnment5;

import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int choice = sc.nextInt();
	        int hours = sc.nextInt();
	        double costPerHour = sc.nextDouble();

	        AirIndia airfare = null;

	        switch(choice) {
	            case 1:
	                airfare = new AirIndia(hours, costPerHour);
	                break;
	            case 2:
	                airfare = new AirIndia(hours, costPerHour);
	                break;
	            case 3:
	                airfare = new AirIndia(hours, costPerHour);
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                System.exit(0);
	        }

	        airfare.display();
	        sc.close();
	    }
	}

