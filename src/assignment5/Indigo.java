package Assisgnment5;

public class Indigo {
	 private int hours;
	    private double costPerHour;

	    // Default constructor
	    public Indigo() {}

	    // Parameterized constructor
	    public Indigo(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    // Getters and Setters
	    public int getHours() {
	        return hours;
	    }

	    public void setHours(int hours) {
	        this.hours = hours;
	    }

	    public double getCostPerHour() {
	        return costPerHour;
	    }

	    public void setCostPerHour(double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    // Implemented methods
	    public double calculateAmount() {
	        return (hours * costPerHour) * 8;
	    }

	    public void display() {
	        System.out.printf("%.2f%n", calculateAmount());
	    }
	}

