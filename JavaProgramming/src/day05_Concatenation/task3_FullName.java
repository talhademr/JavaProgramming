package day05_Concatenation;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class task3_FullName {

    public static void main(String[] args) {

        String firstName = "Talha";
        String lastName = "DEMİR";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "CYDEO";
        double salary = 1000.58;


        String fullName = firstName + " " +lastName;

        // Full name of the person is ____

        System.out.println(" Full Name of the person is " + fullName );

        // ____is ____ years old
        System.out.println(fullName + " is " + age + " years old.");

        //FullName is JobTitle + works at CompanyName

        System.out.println(fullName + " is " + jobTitle + " works at " + companyName + " and " + fullName + "'s salary is " + salary);




    }

}
