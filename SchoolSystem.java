import java.util.Scanner;
    public class SchoolSystem{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Primitive Data Types
        String studentName;
        int studentAge;
        double utsScore, englishScore, programmingScore, averageScore;
        String finalGrade;
        String remarks;
        //Input: Student details
        System.out.print("Enter student name:");
        studentName = sc.nextLine();
        System.out.print("Enter student age:");
        studentAge = sc.nextInt();
        //Input: Student scores
        System.out.print("Enter uts score:");
        utsScore = sc.nextDouble();
        System.out.print("Enter english score:");
        englishScore = sc.nextDouble();
        System.out.print("Enter programmingscore:");
        programmingScore = sc.nextDouble();
        //Calculating the scores of each subject
            averageScore = (utsScore + englishScore + programmingScore) / 3;

            //Conditions
            if (averageScore>=90){
                finalGrade = "1.0";
                remarks = "Outstanding";
            }
            else if (averageScore>=85){
                finalGrade = "1.25-1.75";
                remarks = "Very Satisfactory";
            }
            else if (averageScore>=80){
                finalGrade = "2.0-2.25";
                remarks = "Satisfactory";
            }
            else if (averageScore>=75){
                finalGrade = "2.5-3.0";
                remarks = "Passed";
            }
            else {
              finalGrade = "5.0";
              remarks = "Failed";  
            }
                //Output: Display student details and results
                System.out.println("-----Student Report Card-----");
                System.out.println("Name: " + studentName);
                System.out.println("Age: " + studentAge);
                System.out.println("Programming score: " + programmingScore);
                System.out.println("Uts score:" + utsScore);
                System.out.println("English score: " + englishScore);
                System.out.println("Average Score: " + averageScore);
                System.out.println("Final Grade: " + finalGrade);
                System.out.println("Remarks: " + remarks);

                sc.close();
    }
}