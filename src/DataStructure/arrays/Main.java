package DataStructure.arrays;

public class Main {

    public static void main(String[] args) {

       // Create a method that takes in N students and
        // then stores the students into an array. This method
        // returns an array of students

        // 1. Create a student class and define the class
        // 2. Now create a method that will generate N number of students and store them
        // into an array of students, which will be returned

        Student[] studentArray = getStudentArray(100);

        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("The student id for student " + (i+1) +
                    " is " + studentArray[i].getStudentId());
        }
    }

    public static Student[] getStudentArray(int studentSize) {
        Student[] studentArray = new Student[studentSize];
        for (int i = 0; i < studentSize; i++) {
            Student student = new Student(i+1);
            studentArray[i] = student;
        }
        return studentArray;
    }

}
