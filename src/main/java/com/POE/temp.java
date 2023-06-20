package com.POE;
import javax.swing.* ;


public class temp {


    public static void main(String[] args){

        String name = JOptionPane.showInputDialog(null,"Enter your name");
        String StudentN = JOptionPane.showInputDialog(null,"Enter your student number");

        int opt = JOptionPane.showConfirmDialog(null,"Would you like to register");

        if(opt == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Welcome"  + name +", "+ StudentN);

        }else{
            JOptionPane.showMessageDialog(null,"OK!!! I'll see u next year");
        }

    }
    
}
