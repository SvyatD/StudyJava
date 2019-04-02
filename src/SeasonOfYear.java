import java.io.*;

public class SeasonOfYear {
    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter current Month:");
        String input = reader.readLine();
        Season season;

        switch (input) {
        case "December":
        case "January":
        case "February":
            season = Season.WINTER;
            System.out.println("Current Season is:" + season);
            break;
        case "March":
        case "April":
        case "May":
            season = Season.SPRING;
            System.out.println("Current Season is:" + season);
            break;
        case "June":
        case "July":
        case "August":
            season = Season.SUMMER;
            System.out.println("Current Season is:" + season);
            break;
        case "September":
        case "October":
        case "November":
            season = Season.AUTUMN;
            System.out.println("Current Season is:" + season);
            break;
            default:
                System.out.println("No such Month");
        }

    }
}
