import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("AN","Female","an123");
        Student student1=new Student("AK","Female","ak45");
        Student student2=new Student("AV","Male", "aws32");
        Student student3=new Student("AD","Female","sgfd32");
        Student [] students={student,student1};
        Student[]students1={ student2,student3};


        Group group1=new Group("Java13",students,12);
        Group group2=new Group("JS13", students1,13);
        Mentor mentor=new Mentor("A","Female","sfdg123",group1);
        Mentor mentor1=new Mentor("B","Male","adfs4",group2);
        Mentor mentor2=new Mentor("C","Female","efvw23",group1);
        Mentor mentor3=new Mentor("D","Male","adsdw23",group2);

        Mentor []mentors={ mentor,mentor1};
        Mentor[]mentors1={mentor2,mentor3};

        Peaksoft peaksoft=new Peaksoft("Peaksoft","Bischkek",mentors,students);
        Peaksoft peaksoft1=new Peaksoft("Peaksoft Kids"," Bischkek",mentors1,students1);

    //   System.out.println(Arrays.toString(peaksoft.getAllMentor("Peaksoft")));
       // System.out.println(Arrays.toString(peaksoft1.getAllMentor("Peaksoft Kids")));
        //System.out.println(Arrays.toString(group1.getAllStudents("Java13")));
      //  System.out.println(student.searchByStudentName("AN"));
        //System.out.println(mentor.searchByMentorEmail("sfdg123"));

     //   System.out.println(Arrays.toString(student.sortByStudentName(students)));

       // System.out.println(mentor.getAllStudentsOfMentor("A"));
      group2.sortByStudentName(students);
        for (Student s : students) {
            System.out.println("Name: " + s.getName()  );
        }
peaksoft1.sortByStudentName(students);
        for (Student s : students) {
            System.out.println("Name: " + s.getName()  );
        }

        Student[] filteredStudents = Student.onlyFemaleOrMaleGenders(students, "Female");
        for (Student s : filteredStudents) {
            System.out.println(s.getName());
        }

    }


}
