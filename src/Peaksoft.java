import java.util.Arrays;
import java.util.Comparator;

public class Peaksoft {
    private String name;
    private String address;
    Mentor []mentors;
    Student[]students;

    public Peaksoft(String name, String address, Mentor[] mentors, Student[] students) {
        this.name = name;
        this.address = address;
        this.mentors = mentors;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;


    }



    public Mentor[] getAllMentor(String name) {

        if (name.equals(getName( ))){
            return mentors;
        }
        return null;
    }

    public void sortByStudentName(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }

    @Override
    public String toString() {
        return "Peaksoft{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mentors=" + Arrays.toString(mentors) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
