package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "WoodenSpoon123";

        int countUppercase= 0;
        int countLowercase =0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUppercase++;
            } else if (Character.isLowerCase(each)) {
                countLowercase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else{
                countSpecialChar++;
            }


        }
        boolean hasUpperCase = countUppercase > 0;
        boolean hasLowercase = countLowercase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

        boolean strongPassword1 = password.length()>=8 && !password.contains(" ") && hasSpecialChar && hasLowercase && hasSpecialChar &&hasUpperCase;

        System.out.println("strongPassword = " + strongPassword1);

        boolean strongPassword2 =false;

        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(hasUpperCase){
                    if(hasLowercase){
                        if(hasDigit){
                            if(hasSpecialChar){
                                strongPassword2 = true;
                            }
                        }
                    }
                }
            }
        }


        System.out.println("strongPassword = " + strongPassword2);
    }
}
