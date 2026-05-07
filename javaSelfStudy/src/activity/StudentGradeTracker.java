package activity;

public class StudentGradeTracker {
    
    private String name;
    private int studentid;
    private float grade;
    private String  remarks;


    StudentGradeTracker (String name, int studentid, int grade, String remarks){
      this.name = name;
      this.studentid = studentid;
      this.grade = grade;
      this.remarks = remarks;
    } 

     //set - setName
      void setName(String name){
        this.name = name;
     }
     //get - getName
      String getName(){
         return name;
     }


     //set - setStudentId
      void setStudentId(int studentid){
        this.studentid = studentid;
     }
     //get - setStudentId
        int getStudentId(){
          return  studentid;
        }
     

    
     //set - grade
      void setGrade(float grade){
        this.grade = grade;
      }
     //get - grade
      float getGrade(){
        return grade;
      }



     //set - remarks
     void setRemarks(String remarks){
      this.remarks = remarks;
     }
     //get - remarks
      String getRemarks(){
        return remarks;
      }



     
    void studentInformation(){

      System.out.println("\n===== Student Information =====\n");
      System.out.println("Name: " + name);
      System.out.println("Student ID: " +  studentid);
      System.out.println("Grade: " + grade);
      System.out.println("Remarks:" + remarks);

    }


    public static void main(String[]args){

    StudentGradeTracker st = new StudentGradeTracker("Andrei Lance Camata",256290,89,"Passed");


      st.studentInformation();

      
      

      //name  - set and get 
        st.setName("Yala Yala");

       String name = st.getName();

          
       
       //studentid  - set and get 

        st.setStudentId(6767);

        int id = st.getStudentId();


        //grade- set and get 
        st.setGrade(79);

        float fg = st.getGrade();



        //remarks - set and get   
        st.setRemarks("PASSED");

        String sr = st.getRemarks();







        st.studentInformation();




    }

}
