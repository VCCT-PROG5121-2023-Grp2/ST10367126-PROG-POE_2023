package com.POE;
import javax.swing.JOptionPane;


public class core {
    public static void main(String args[]){

        MyLoginClass user = new MyLoginClass();
        user.loginMenuPrompt();
    
           
            if(user.returnLoginStatus().equals("A successful login")){
                TaskClass task = new TaskClass();  
                task.TaskMenuPrompt();
                }     
            }
        }
    
 
        

