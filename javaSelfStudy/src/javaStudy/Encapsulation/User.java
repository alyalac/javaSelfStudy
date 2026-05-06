package javaStudy.Encapsulation;

//Encapsulation 

public class User {
    // private para hindi maedit ang attributes
    private int userID;
    private String uniqueName;
    



    User(int userID, String uniqueName){

        this.userID = userID;
        this.uniqueName = uniqueName;
        

    }
    
    //setter
    void setUserID(int userID){
      this.userID = userID;
    }

    //getter
    int getUserID(){
        return this.userID;
    }

   //setter
   void setUniqueName(String uniqueName){
    this.uniqueName = uniqueName;
   }

   
   //getter
   String getUniqueName(){
    return this.uniqueName;
   }

  
   void mainOutput(){
     
    System.out.println("User ID: " + userID);
    System.out.println("Unique Name: " + uniqueName);

   }









}

