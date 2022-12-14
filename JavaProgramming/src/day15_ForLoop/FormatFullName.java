package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDEo",
                lastName = "SCHOOL";
        // firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        //C                        +       ydeo  ==>   "Cydeo"

        firstName = ( "" + firstName.charAt(0)  ).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);



    }


}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */