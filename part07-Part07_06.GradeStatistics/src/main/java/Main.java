
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        
        UserInterface UI = new UserInterface(scanner, gradeCalculator);
        
        UI.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
