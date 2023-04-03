import java.util.Dictionary;
import java.util.Hashtable;

public class Student {
  String name;
  Dictionary preferences = new Hashtable();

  public Student(String name) {
    this.name = name;
  }

  public void addPreference(String project, int rank) {
    preferences.put(project, rank);
  }

}
