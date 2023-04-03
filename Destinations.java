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

  //write a method that will create destinations with random title and with random number from 1 to 5 students
  public static Destinations[] createDestinations() {
    Destinations[] destinations = new Destinations[5];
    String[] titles = {"A", "B", "C", "D", "E"};
    for (int i = 0; i < 5; i++) {
      int numStudents = (int) (Math.random() * 5) + 1;
      destinations[i] = new Destinations(titles[i], numStudents);
    }
    return destinations;
  }

}
