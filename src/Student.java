import java.util.Arrays;
import java.util.Comparator;

public class Student extends Info {

    public Student(String name,String gender, String email) {
       super(name,gender,email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", email='" + getEmail()+ '\'' +
                '}';
    }




    public String searchByStudentName(String name){
        if(name.equals(getName())){
            return "Student{" +
                    "name='" + getName() + '\'' +
                    ", gender='" + getGender() + '\'' +
                    ", email='" + getEmail()+ '\'' +
                    '}';
        }

        return null;
}
    public static Student[] onlyFemaleOrMaleGenders(Student[] students, String gender) {
        int count = 0;
        for (Student student : students) {
            if (student.getGender().equalsIgnoreCase(gender)) {
                count++;
            }
        }

        Student[] filteredStudents = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.getGender().equalsIgnoreCase(gender)) {
                filteredStudents[index++] = student;
            }
        }
        return filteredStudents;
    }


}
