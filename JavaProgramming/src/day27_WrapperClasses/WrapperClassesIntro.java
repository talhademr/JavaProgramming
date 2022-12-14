package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; //autoboxing

        int num2 = n1; // unboxing

        System.out.println("--------------------------");

        Integer integervalue = 100;

        long longValue = integervalue; // I can convert any wrapper class to any primitive.
        //wrapperı açarken istediğimiz primiteve atayabiliriz. O primitiven Range'inde olduğu sürece
        Byte b1= 25;
        byte a1 = b1;
        short a2=b1;
        int a3=b1;
        long a4= b1;

        System.out.println("--------------------------");

        int num3= 200;
       // Long l2= num3;  bu olmaz ancak int i integera atayabiliriz
        //primitive olan şeyi ancak kendi türüne atayabiliriz. intse Integer, long sa Long gibi

        Integer num4= num3;// autoboxing

        System.out.println("--------------------------");

        Integer z= 900;
        Integer y = z;


        System.out.println("--------------------------");

        int[] numbers1 = {1,2,3,4,5 };
        Integer [] numbers2 = {1,2,3,4,5};





    }
}
