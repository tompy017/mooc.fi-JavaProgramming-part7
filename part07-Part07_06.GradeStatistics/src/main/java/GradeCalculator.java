
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author tom
 
public class GradeCalculator {
    
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    
    
    public GradeCalculator() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        
    }
    
    
    
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }
    
    
    public void addPassingGrade(int grade) {
        if (grade >= 50 && grade <= 100) {
            this.passingGrades.add(grade);
        }
    }
    
    public double average() {
        int sum = 0;
        
        if (this.grades.isEmpty()) {
            System.out.println("There are no grades added to the list");
            return -1;
        
        } else {
            for (int grade : grades) {
                sum += grade;
            }
        }
        
        double avg = 1.0 * sum /this.grades.size();
        return avg;
    }
    
    
    
    public double passingAverage() {
        int sum = 0;
        
        for (int grade : this.passingGrades) {
                sum += grade;
            }
        
        if (this.passingGrades.isEmpty()) {
            return -1;
        
        } else {
            double passingAvg = 1.0 * sum / this.passingGrades.size();
            return passingAvg;            
        }
    }

    public ArrayList<Integer> getPassingGrades() {
        return passingGrades;
    }
    
    
    public double passPercentage() {
        if (this.passingGrades.isEmpty()) {
            return -1;
        }
        
        int participants = this.grades.size();
        int passing = this.passingGrades.size();
        double percentage = (1.0 * passing / participants) * 100;
        return percentage;
    }
    

    

    }
    
    */
   
public class GradeCalculator {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public GradeCalculator() {

        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Add grades to points ArrayList
    public void addPoints(int points) {

        this.points.add(points);

        if (points >= 50) {
            this.passingPoints.add(points);
        }

        this.grades.add(pointsToGrade(points));
    }

    // Method to return the average of all points
    public double averageOfPointsAll() {

        int lengthAll = this.points.size();

        int total = 0;

        if (this.points.isEmpty()) {
            return -1;
        } else {
            for (Integer point : this.points) {
                total += point;
            }
        }

        return 1.0 * total / lengthAll;
    }

    // Method to return the average of only passing grades
    public double averageOfPassingPoints() {

        int passingLength = passingPoints.size();

        int total = 0;

        if (passingPoints.isEmpty()) {
            return 0.00;
        } else {
            for (Integer passingPoint : passingPoints) {
                total += passingPoint;
            }
        }

        return 1.0 * total / passingLength;
    }

    // Method to calculate pass percentage for all course participants
    public double passPercentage() {

        int participants = points.size();
        int passing = passingPoints.size();
        double passingRatio = (double) passing / participants;

        if (participants == 0) {
            return -1;
        } else {
            return 100.00 * passingRatio;
        }
    }

    // Method to convert points received into a grade
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    // Method to return the total of a given grade for the whole class
    public int totalGradesFromPoints(int grade) {

        int total = 0;
        for (int received : this.grades) {
            if (received == grade) {
                total++;
            }
        }

        return total;

    }
}