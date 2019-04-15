public class Student {
  private static int instanceCounter = 0;
  private static int overallRating = 0;
  private static float averageRating = 0;
  private String name;
  private int rating = 0;

  public Student() {
    instanceCounter++;
  }

  public Student(String name, int rating) {
    instanceCounter++;
    overallRating =+ rating;
    averageRating = overallRating / instanceCounter;
    this.name = name;
    this.rating = rating;
  }

  public static void main(String[] args) {
    Student stud1 = new Student();
    stud1.setName("Bro-bro-bro");
    stud1.changeRating(75);
    Student stud2 = new Student("Pip", 65);
    Student stud3 = new Student("3o3o", 93);
    int quantity = getNumOfInstances();
    System.out.println(quantity);
    System.out.println(stud1.getName());
    System.out.println(stud2.getRating());
    System.out.println(betterStudent(stud2, stud3));
    System.out.println(stud1.toString());
    System.out.println(getAverageRating());
  }

  public static int getNumOfInstances() {
    return instanceCounter;
  }

  public static boolean betterStudent(Student stud1, Student stud2) {
    if (stud1.getRating() > stud2.getRating()) return true;
    else return false;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return this.rating;
  }

  public void changeRating(int value) {
    this.rating = value;
  }

  public static float getAverageRating() {
    return averageRating;
  }

  @Override
  public String toString() {
    return "Student " + name + "has Rating: " + rating + "";
  }
}
