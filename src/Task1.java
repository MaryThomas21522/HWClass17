public class Task1 {

    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    Task1(String studentName, int subjectGrade1, int subjectGrade2, int subjectGrade3){
        name = studentName;
        grade1 = subjectGrade1;
        grade2 = subjectGrade2;
        grade3 = subjectGrade3;
    }
    void calAverageGrade(){
        System.out.println((grade1+grade2+grade3)/3);
    }
}

/*
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each student's name.

 */
