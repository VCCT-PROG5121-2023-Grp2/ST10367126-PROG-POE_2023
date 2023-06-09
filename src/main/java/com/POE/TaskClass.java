package com.POE;

import javax.swing.JOptionPane;

public class TaskClass {
    
     public TaskClass(){   
    }
    //------------------------------------------------------------------------//
    //-------- Initliazing Task Variables
    public int controller = 1000;
    public int loop = 0;
    public int loopR =0;
    public int[] t_num = new int[controller];
    public String[] t_name = new String[controller];
    public String[] t_des = new String[controller];
    public int[] t_duration = new int[controller];
    public String[] dev = new String[controller];
    public String[] id = new String[controller];
    public int count = 1;
    public String[] t_status = new String[controller];
    public int num = 0;
    
   //-------------------------...POE Methods-------------------------------------------------//
    //-------------------
     public String createTaskID() {
        String d = dev[loop];
        String name = getNameBeforeSpace(d);

        if (d == null) {
            return "";
        }
  
        id[loop] = t_name[loop].substring(0, 2) + ":" + t_num[loop] + ":" + name.substring(name.length() - 3, name.length());
        id[loop] = id[loop].toUpperCase();
        return id[loop];
    }
    //-------------------------
    public boolean checkTaskDescription(String D) {
        if(D.length() > 50) {
            return false;
        } else {
            return true;
        }
    }
        //----------
     public String printTaskDetails(){
        loopR=0;
        while(loopR<loop){
            System.out.println("|-----------------------------------------------");
            System.out.println("|Task Status: " + t_status[loopR]);
            System.out.println("|Developer Details: " + dev[loopR]);
            System.out.println("|Task Number: " + t_num[loopR]);
            System.out.println("|Task Name: " + t_name[loopR]);
            System.out.println("|Task Description: " + t_des[loopR]);
            System.out.println("|Task ID: " + id[loopR]);
            System.out.println("|Task Duration: " + t_duration[loopR] + "hrs");
            System.out.println("|-----------------------------------------------");
            loopR=loopR + 1;
        }
        return " ";
        
    }
    //---------------------------------------
    public int returnTotalHours() {
        int h = 0;
        for (count = 0;count <=loop; count++){
            h = t_duration[count] + h;
        }
        return h;
    }
//------------------------------------------------------------------------------//
//----------------------------...ORIGINAL Methods...----------------------------//
//-------------------------------------------------------------------------------//
    
//-------------------------------Setters----------------------//
    
    //---------------------------------------
    public void set_TaskName(String TN){
        this.t_name [loop] = TN;
    }
    
    //---------------------------------------
    public void set_TaskDescription(String TDes){
        this.t_des[loop] = TDes;
    }
    
    //---------------------------------------    
    public void set_TaskDevDetails(String DD){
        this.dev[loop] = DD;
    }
    
    //---------------------------------------
    public void set_TaskStatus(String Tstatus){
        this.t_status[loop] = Tstatus;
    }
    
    //---------------------------------------
    public void set_TaskDuration(int TDur){
        this.t_duration[loop] = TDur;
    }
    
    //---------------------------------------
    public void set_TaskNam(String TN){
        this.t_name [loop] = TN;
    }
    
    
    //---------------------------GETTERS-----------------------------------------------------//
    //-------------------------------
    public String get_TaskName(int index){
        return t_name[index];
    }
    //-------------------------------
    public String get_TaskDescription(int index){
        return t_des[index];
    }
    
    //-------------------------------   
    public void get_TaskDevDetails(String DD){
        this.dev[loop] = DD;
    }
    
    //-------------------------------
    public void get_TaskStatus(String Tstatus){
        this.t_status[loop] = Tstatus;
    }
    
    //-------------------------------
    public void get_TaskDuration(int TDur){
        this.t_duration[loop] = TDur;
    }
    
    //-------------------------------
    public void get_TaskNam(String TN){
        this.t_name [loop] = TN;
    }
    
    
    
 //---------------------------------------AUTOMATION------------------------------------------------//
        //-------------------
    public void increment_TNum(){
         if(loop==0){
            t_num[loop]=0;
        }else{
            t_num[loop]= 1 + t_num[loop-1];
        }
    }
    //-----------------------
    public void increment_Loop(){
        loop = loop +1;   
    }
    
    //--------------------...Methods for Menu...---------------------------//
    //----------------
    public void TaskMenuPrompt(){
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        Boolean runner = true;
        int opt;
        while(runner){
            String[] options = { "Create new task","Display Report","Exit" };
            opt = JOptionPane.showOptionDialog(null,
                    "EasyKanban", 
                    "Task Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, 
                null, options, options[0]);
                    
            switch(opt){
                case 0 :
                    enterValues();
                    break;
                case 1:
                    reportPrompt();
                    break;
                case 2:
                    runner = false;
                    break;
            }
        }
        
    }
    //------------------- 
    public void enterValues() {
        increment_TNum();
        taskName();
        createTaskDescription();
        verifyCheckDescription();
        InsertDevName();
        setTotalHours();
        createTaskID();
        createTaskStatus();
        increment_Loop();

    }
    //---------------------------------
    public void createTaskStatus() {
        String[] options = { "To Do", "Done", "Doing" };
        int opt = JOptionPane.showOptionDialog(null, "Select the task status:", "Task Status",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        switch(opt){
            case 0:
                t_status[loop] = "To Do";
                break;
            case 1:
                t_status[loop] = "Done";
                break;
            case 2:
                t_status[loop] = "Doing";
                break;

        }
    }
    //-------------------
     public String taskName() {
        t_name[loop] = JOptionPane.showInputDialog(null, "Insert the task name:");
        return "";
    }
    //-------------------
    public void InsertDevName() {
        dev[loop] = JOptionPane.showInputDialog(null, "Insert the developer name: "); 
    }
    
    //----------------------------
    public String setTotalHours() {
        t_duration[loop] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the number of hours spent on this task:"));
        return "";
    }
    //-----------------
    public String createTaskDescription() {
        t_des[loop] = JOptionPane.showInputDialog(null, "Insert the task description:");
        return "";
    }
    //--------------------
     public void verifyCheckDescription() {
        if (checkTaskDescription(t_des[loop]) == false) {
            while (checkTaskDescription(t_des[loop]) == false) {
                t_des[loop] = JOptionPane.showInputDialog(null,
                        "Please enter a task description of less than 50 characters:");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Task successfully captured");
        }
    }
    //----------------------------------
    public void reportPrompt(){
        loopR=0;
        while(loopR<loop){
            JOptionPane.showMessageDialog(null,
            "|-----------------------------------------------" +
            "\n|Task Status :"+ t_status[loopR] + 
            "\n|Developer Details : " + dev[loopR] +
            "\n|Task Number : " + t_num[loopR] +
            "\n|Task Name : " + t_name[loopR] +
            "\n|Task Description : " + t_des[loopR] +
            "\n|Task ID : " + id[loopR] +
            "\n|Task Duration : " + t_duration[loopR]+"hrs" +
            "\n|-----------------------------------------------" );
            loopR=loopR + 1;
        }
        
    }
    
    //--------------------------...OTHERS...-----------------------------//
    
     //-------------------
     public String UpdateTaskID(int idx) {
        String d = dev[idx];
        String name = getNameBeforeSpace(d);

        if (d == null) {
            return "";
        }
  
        id[idx] = t_name[idx].substring(0, 2) + ":" + t_num[idx] + ":" + name.substring(name.length() - 3, name.length());
        id[idx] = id[idx].toUpperCase();
        return id[idx];
    }
     
    public String getNameBeforeSpace(String newName) {
        String name;
        int spaceIndex = newName.indexOf(" ");
        if (spaceIndex != -1) {
            name = newName.substring(0, spaceIndex);
            return name;
        } else {
            return newName; 
        }
    }

    
}
//--------------------END OF FILE-----------------------------------------------------------------------------//