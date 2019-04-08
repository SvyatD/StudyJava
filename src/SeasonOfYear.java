import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonOfYear {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter current Month:");
    String input = reader.readLine();
    Season season = null;

    switch (input) {
      case "December":
      case "January":
      case "February":
        season = Season.WINTER;
        break;
      case "March":
      case "April":
      case "May":
        season = Season.SPRING;
        break;
      case "June":
      case "July":
      case "August":
        season = Season.SUMMER;
        break;
      case "September":
      case "October":
      case "November":
        season = Season.AUTUMN;
        break;
      default:
        System.out.println("No such Month");
    }
    if (season != null) {
      System.out.println("Current Season is:" + season);
    }
  }

  enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
  }
}
