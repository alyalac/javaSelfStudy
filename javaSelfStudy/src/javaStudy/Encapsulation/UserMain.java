package javaStudy.Encapsulation;


public class UserMain {
   
    

public static void main(String[]args){

User u  = new User(256920,"AndreiYALA"); // na access natin yung user.java pero private naka encapsulate siya //User.java

u.mainOutput();

//set and getter userID
u.setUserID(6789);

int num = u.getUserID();


//set and getter uniquename

u.setUniqueName("Minecraft67user");

String uq = u.getUniqueName();

u.mainOutput();




}
}
