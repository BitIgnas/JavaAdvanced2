package Annotations.Example1;

public class AnnotationsMain {
    public static void main(String[] args) {

        //.class info about specific class
        Class<Student> classObject = Student.class;

        if (classObject.isAnnotationPresent(StudentInfo.class)) {
            System.out.println("Annotation exist in annotation");
            StudentInfo studentInfo = classObject.getAnnotation(StudentInfo.class);
            System.out.println("StudentInfo from specific annotation");
            System.out.println(studentInfo.studentName());
            System.out.println(studentInfo.studentAddress());
        } else {
            System.out.println("Annotation is not found");
        }
    }
}
