package parser;
import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student();


        try {
            Student student_test= new Student();
            student.firstName.toString();
            Assert.assertEquals("Ibrahim", "Ibrahim", "match");
            student.lastName.toString();
            Assert.assertEquals("Gumani", "shaha", "not match");
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
