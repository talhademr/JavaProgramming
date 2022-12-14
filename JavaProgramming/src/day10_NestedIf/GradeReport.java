package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

 /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */

        int score = 95;

        if (score >= 0 && score <=100){
            // 5 possibilities: A, B, C, D, F
            if(score>= 90 ){ //false:  score < 90
                System.out.println("Excellent");
            }else if(score >= 80 ){ // false: score < 80
                System.out.println("Great");
            }else if(score >= 70){ // false: score < 70
                System.out.println("Good");
            }else if(score >= 60){// false: score < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the score is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------------------");

        String result = ""; // temporary

        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )

            if(score>= 90 ){ //false:  score < 90
                result = "Excellent";
            }else if(score >= 80 ){ // false: score < 80
                result = "Great";
            }else if(score >= 70){ // false: score < 70
                result = "Good";
            }else if(score >= 60){// false: score < 60
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{ // if the score is NOT valid
            result = "Invalid Score";
        }


        System.out.println( result);




    }

    public static class DaysInWeek  {
        public static void main(String[] args) {

            // long number = 9L;
            // float number = 9F;
            // double number = 9D;
            //  boolean number = true;
            int number = 9;

            /*
            if(number == 1){
                System.out.println("Monday");
            }
            ....
             */
            //   <=  <= ....
            switch(number){ //1,2,3,4,5,6,7.  ==

                case 1:
                    System.out.println("Monday");
                    break; // exits the switch after executing the case block

                case 2:
                    System.out.println("Tuesday");
                    break; // exits the switch after executing the case block

                case 3:
                    System.out.println("Wednesday");
                    break; // exits the switch after executing the case block

                case 4:
                    System.out.println("Thursday");
                    break; // exits the switch after executing the case block

                case 5:
                    System.out.println("Friday");
                    break; // exits the switch after executing the case block

                case 6:
                    System.out.println("Saturday");
                    break; // exits the switch after executing the case block

                case 7:
                    System.out.println("Sunday");
                    break; // exits the switch after executing the case block

                default: // only gets executed if none of the case blocks are matching
                    System.out.println("Invalid");
                    // we don't need to give break statement for the last block of the switch in order to exit the switch
            }




        }

    }
}
