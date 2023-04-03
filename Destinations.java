public class Destinations {
  String title;
  int numStudents;
  String[] students = new String[numStudents];


  public Destinations(String title, int numStudents) {
    this.title = title;
    this.numStudents = numStudents;
  }

  public void addStudent(String student) {
    for (int i = 0; i < numStudents; i++) {
      if (students[i] == null) {
        students[i] = student;
        break;
      }
    }
  }

}
