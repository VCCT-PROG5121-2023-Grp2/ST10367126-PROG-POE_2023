package com.POE;


public class core {
    public static void main(String[] args){

        // ------------------------------------Test 1--------------------------------------
       /* Login Test1 = new Login("Jose","Lubota","kyl_1","2J@4");
        Test1.registerUser("kyl_1","2J@4");
        Test1.loginUser("kyl_1", "2J@4");
        Test1.returnLoginStatus();*/ 

        // ------------------------------------Test 1--------------------------------------
     //  Login Test2 = new Login("Jose","Lubota","kyle!!!!!!!","2J@4");
        
        // ------------------------------------Test 1--------------------------------------
  //      Login Test3 = new Login("Jose","Lubota","kyl_1","h&&sec@ke99!");

        // ------------------------------------Test 1--------------------------------------
         Login Test4 = new Login("Jose","Lubota","kyl_1","2J_@4");
        Test4.registerUser("kyl_1","2J_@4");
        System.out.println(Test4.loginUser("kyl_1", "2J_@4"));
       String x = Test4.returnLoginStatus();
        
              

        // ------------------------------------Test 1--------------------------------------
      /*  Login Test5 = new Login("Jose","Lubota","kyl1","2J@4");
        Test5.registerUser("kyl1","2J@4");
        System.out.println(Test5.loginUser("ky---l1", "2J_@4"));
        Test5.returnLoginStatus();

        

*/


    }
    
}
