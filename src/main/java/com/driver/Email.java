package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(){

    }
    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(password)){

            if(newPassword.length()>=8){
                int ucL=0,lcL=0,d=0,sc=0;

                for(int i=0;i<newPassword.length();i++){
                    if(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z') ucL++;
                    else if(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z') lcL++;
                    else if(newPassword.charAt(i)>='0' && newPassword.charAt(i)<='9') d++;
                    else sc++;
                }
                if(ucL>0 && lcL>0 && d>0 && sc>0) {
                    password = newPassword;
                    System.out.println("Password Changed Successfully !");
                }
                else System.out.println("Your New Password does not meet the required conditions...");
            }else System.out.println("Your New Password is having less than 8 charcters...");

        }else System.out.println("Incorrect Old Password...");
    }
}
