package com.POE;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MyLoginClass {
    public String FirstName;
    public String Surname;
    public String Username;
    public String Password;
    public String Login_UN ="1" ;
    public String Login_PW ="2" ;
    public String Register_UN ="3" ;
    public String Register_PW ="4" ;
    
    public MyLoginClass(){
        
    }
    
    public MyLoginClass(String FN, String SN, String UN, String PW){
        this.FirstName = FN;
        this.Surname = SN;
        this.Username = UN;
        this.Password = PW;
    }
    
    // ----------------------------------------------- ---------------------------------------------
    // ----- SETTERS -------------
    
     // ----- SETTERS -------------
    public void setUserName(String UN){
        Username= UN;
    }
     // ----- SETTERS -------------
    public void setSurname(String SN){
        Surname= SN;
    }
     // ----- SETTERS -------------
    public void setFirstName(String FN){
        FirstName= FN;
    }
     // ----- SETTERS -------------
    public void setPassword(String PW){
        Password= PW;
    }

     // ----------------------------------------------- GETTERS ---------------------------------------------
     // ----- SETTERS -------------
     public String getUserName(){
       return Username;
    }
     
     // ----- SETTERS -------------
    public String getSurname(){
        return Surname;
    }
    
    // ----- SETTERS -------------
    public String  getFirstName(){
        return FirstName;
    }
    
    // ----- SETTERS -------------
    public String  getPassword(){
        return Password;
    }

    //-------------------------------------------------- Conditions --------------------------------------------------------------
     // ----- SETTERS -------------
    public boolean checkUserName(){
        if(Username.length()<=5 && Username.contains("_")){
            if(Username.contains("_")){
                JOptionPane.showMessageDialog(null,"Username successfully  captured");
                System.out.println("Username successfully  captured");
                return true;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Username is not correctly formatted,  please ensure that  your username  contains an  underscore and is no  more than 5 characters in length");
   
            return  false;
        }
        return checkUserName();
        
    }
     // ----- SETTERS -------------
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
// ----- SETTERS -------------
public  boolean password_matcher(String password){
    
    // Check if password is at least eight characters long
    if (password.length() < 8) {
        return false;
    }
    
    // Check if password contains a capital letter
    if (!password.matches(".*[A-Z].*")) {
        return false;
    }
    
    // Check if password contains a number
    if (!password.matches(".*\\d.*")) {
        return false;
    }
    
    // Check if password contains a special character
    if (!password.matches(".*[^a-zA-Z0-9].*")) {
        return false;
    }
    
    return true;


    /*if(Password.length()>=8){

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
    }*/
}
//-----------------------------------------------------------------------------------
     // ----- SETTERS -------------
    public boolean checkPasswordComplexity(){

        if(password_matcher(Password)){
            JOptionPane.showMessageDialog(null,"Password successfully captured");
       
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password  contains at least 8 characters, a capital letter, a number and a special character");
            return false;
        }
        
    }
     // ----- SETTERS -------------
    public boolean c_PasswordComplexity(){

        if(password_matcher(Password)){
            return true;
        }else{
            return false;
        }
        
    } 

//-----------------------------------------------------------------------------------
   // ----- SETTERS -------------
   public String registerUser(String un, String pw){
       
       if( c_UserName(Username) && c_PasswordComplexity()){
            Register_UN = un;
            Register_PW = pw;
            JOptionPane.showMessageDialog(null,"The two above conditions have been met and the user has been registered successfully." );
            return "The two above conditions have been met and the user has been registered successfully.";
            
        }else{

            if((c_UserName(Username) == false) &&( c_PasswordComplexity() == false)){
                JOptionPane.showMessageDialog(null,"The username is incorrectly formatted\nThe password does not meet the complexity");
                return "The username is incorrectly formatted\nThe password does not meet the complexity";
            
            }else if(c_UserName(Username) == false){
                JOptionPane.showMessageDialog(null,"The username is incorrectly formatted");
                return "The username is incorrectly formatted";
                
            }else if(c_PasswordComplexity()== false){
                JOptionPane.showMessageDialog(null,"The password does not meet the complexity");
                return "The password does not meet the complexity";
                
            }else{
            
                return"";
        }
       }

}
    // ----- SETTERS -------------
    public boolean loginUser(String un , String pw){

        if (un.equals(Register_UN) && pw.equals(Register_PW)){
            Login_PW = pw;
            Login_UN= un;
           
            return true;
        }else{
            return false;
        }
    
    }
     // ----- SETTERS -------------
    public String returnLoginStatus(){
        
        if(loginUser(Login_UN,Login_PW) == true ){
            if( c_UserName(Username) && c_PasswordComplexity()){ 
                JOptionPane.showMessageDialog(null,"A successful login");
                JOptionPane.showMessageDialog(null,"Welcome "+ FirstName +","+ Surname + " it is great to see you again");
                 return "A successful login";     
            }else{
                JOptionPane.showMessageDialog(null,"username or password incorrect, please try again");
            }  
        }else{
            JOptionPane.showMessageDialog(null,"A failed login");
            return "A failed login";

        }
        return "";
       
    }
// ---------------------------------------------------------------------------------//
// ---------------------------------------------------
    
     // ----- SETTERS -------------
    public void setUser(){
        FirstName = JOptionPane.showInputDialog(null,"Enter your firstrname");
        Surname = JOptionPane.showInputDialog(null,"Enter your Surname");
        Username = JOptionPane.showInputDialog(null, "Enter your username");    
        Password = JOptionPane.showInputDialog(null,"Enter your Password");
    }
    
    //-----------------------------
    //----------------
    public void loginMenuPrompt(){
        Boolean runner = true;
        int opt;
         while(runner){
            String[] options = { "Create User","Register User","Login", "Exit" };
            opt = JOptionPane.showOptionDialog(null,
                    "Do as you please", 
                    "Login Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, 
                null, options, options[0]);
                    
            switch(opt){
                //------- Create User
                case 0 :
                    setUser();
                    break;
                //------Register
                case 1:
                    registerUser(Username,Password);
                    break;
                    
                case 2:
                    loginUser(Register_UN, Register_PW);
                    returnLoginStatus();
                    break;
                    
                case 3:
                    runner = false;
                    break;                    
            default:
                break;
            }
    }
        
    }
       


}
 // ------------------------------...END OF FILE... ---------------------------//

