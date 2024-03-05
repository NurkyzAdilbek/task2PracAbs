import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String name;
    Student [] students;
    private  int count;

    public Group(String name, Student[] students,int count) {
        this.name = name;
        this.students = students;
        this.count=count;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public Student[] getAllStudents(String name){
        if (name.equals(getName())){
            return students;
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
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", count=" + count +
                '}';
    }
}


