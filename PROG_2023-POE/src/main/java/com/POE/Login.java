package com.POE;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Login {
    public String FirstName;
    public String Surname;
    public String Username;
    public String Password;
    public String Login_UN ="1" ;
    public String Login_PW ="2" ;
    public String Register_UN ="3" ;
    public String Register_PW ="4" ;


    public Login(String FN, String SN, String UN, String PW){
        this.FirstName = FN;
        this.Surname = SN;
        this.Username = UN;
        this.Password = PW;
    }

    // ----------------------------------------------- SETTERS ---------------------------------------------

    public void setUserName(String UN){
        Username= UN;
    }

    public void setSurname(String SN){
        Surname= SN;
    }

    public void setFirstName(String FN){
        FirstName= FN;
    }

    public void setPassword(String PW){
        Password= PW;
    }

     // ----------------------------------------------- GETTERS ---------------------------------------------

     public String getUserName(){
       return Username;
    }

    public String getSurname(){
        return Surname;
    }

    public String  getFirstName(){
        return FirstName;
    }

    public String  getPassword(){
        return Password;
    }

    //-------------------------------------------------- Conditions --------------------------------------------------------------
    
    public boolean checkUserName(){
        if(Username.length()<=5 && Username.contains("_")){
            if(Username.contains("_")){
                System.out.println("Username successfully  captured");
                return true;
            }
        }else{
            System.out.println("Username is not correctly formatted,  please ensure that  your username  contains an  underscore and is no  more than 5 characters in length");
            return  false;
        }
        return checkUserName();
        
    }
    public boolean c_UserName(String un){
        if(un.length()<=5 && un.contains("_")){
            if(un.contains("_")){
                return true;
            }
        }else{
            return  false;
        }
        return c_UserName(un);
    }

//-----------------------------------------------------------------------------------

public  boolean password_matcher(String str){
    if(Password.length()>8){

        String regex="(.*[A-Z].*)"
                + "[!@#$%&*()_+=|<>?{}\\[\\]~-]"
                + "[0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        if(m.matches()){
            return true;
        }else{
            return false;    
        }
    }else{
        return false;    
    }
}
//-----------------------------------------------------------------------------------

    public boolean checkPasswordComplexity(){

        if(password_matcher(Password)){
            System.out.println("Password successfully captured");
            return true;
        }else{
            System.out.println("Password is not correctly formatted, please ensure that the password  contains at least 8 characters, a capital letter, a number and a special character");
            return false;
        }
        
    }

    public boolean c_PasswordComplexity(){

        if(password_matcher(Password)){
            return true;
        }else{
            return false;
        }
        
    } 

//-----------------------------------------------------------------------------------

   public String registerUser(String un, String pw){

        if((Password == pw && un == Username)){
            Register_UN = un;
            Register_PW = pw;
            return "The two above conditions have been met and the user has been registered successfully.";
        }

        if((Password != pw && un != Username)){
            return "The username is incorrectly formatted\nThe password does not meet the complexity";
        }


        if(un != Username){
            return "The username is incorrectly formatted";
        }

        if(pw != Password){
            return "The password does not meet the complexity";
        }else{
            return"";
        }

}

    public boolean loginUser(String un , String pw){

        if (un == Register_UN && pw == Register_PW){
            Login_PW = pw;
            Login_UN= un;
           
            return true;
        }else{
            return false;
        }
    
    }

    public String returnLoginStatus(){

        
        if(loginUser(Login_UN,Login_PW) == true ){
            
            if( c_UserName(Username) && c_PasswordComplexity()){
                System.out.println("Welcome "+ FirstName +","+ Surname + " it is great to see you again");
            }else{
                System.out.println("username or password incorrect, please try again");
    
            }
            System.out.println("A successful login");
            return "A successful login";

        }else{
            System.out.println("A failed login");
            return "A failed login";

        }
       
    }
}