package activity;

public class EncapsulationSetOnly {

  private String studentName;
  private int idNumber;

  EncapsulationSetOnly() {
    this.studentName = "";
    this.idNumber = 0;

  }

  // setter - studentName
  void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  // getter - studentName
  String getStudentName() {
    return studentName;
  }

  //////////////

  // setter - idNumber
  void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  // getter - idNumber
  int getIdNumber() {
    return idNumber;
  }

  // mainOutput
  void mainOutput() {
    System.out.println("StudentName: " + studentName);
    System.out.println("ID Number: " + idNumber);

  }

  public static void main(String[] args) {

    EncapsulationSetOnly sp = new EncapsulationSetOnly();

    // setter - setStudentName
    sp.setStudentName("Andrei");

    // setter - setIdNumber
    sp.setIdNumber(26393);

    sp.mainOutput();

  }
}
