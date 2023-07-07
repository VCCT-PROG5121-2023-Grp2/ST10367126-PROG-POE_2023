package com.POE;


public class core {
    public static void main(String args[]){
    
        MyLoginClass User = new MyLoginClass("Jose","Lubota","J_Kig","2J@42J@42J@4");
        User.registerUser(User.getUserName(), User.getPassword());
        User.loginUser(User.getUserName(), User.getPassword());
        if ( User.LoginStatus().equals("A successful login")){
            TaskClass task = new TaskClass();  
            task.TaskMenuPrompt();
        }
        
        
    
    }     
}
//---------------------------...END OF FILE----------------------------------//
 