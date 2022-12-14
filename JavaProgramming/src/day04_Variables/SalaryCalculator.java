package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourly rate, weekly hours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeek = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeek; // here 52 is yearly week

        // System.out.println(salary);
        System.out.println("hourlyRate = $"  + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeek = " + numberOfWeek);
        System.out.println("salary = $" + salary);


    }


}
