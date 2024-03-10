import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  24);
        Student s7 = new Student("Маша",  22);
        Student s8 = new Student("Катя",  21);
        Student s9 = new Student("Роман",  20);
        Student s10 = new Student("Павел",  21);
        Student s11 = new Student("Александр",  24);

        List<Student> firstGroup = new ArrayList<Student>();
        firstGroup.add(s1);
        firstGroup.add(s2);

        List<Student> secondGroup = new ArrayList<Student>();
        secondGroup.add(s5);
        secondGroup.add(s6);

        List<Student> thirdGroup = new ArrayList<Student>();
        thirdGroup.add(s3);
        thirdGroup.add(s4);
        thirdGroup.add(s9);

        List<Student> fourthGroup = new ArrayList<Student>();
        fourthGroup.add(s7);
        fourthGroup.add(s8);

        List<Student> fifthGroup = new ArrayList<Student>();
        fifthGroup.add(s10);
        fifthGroup.add(s11);

        StudentGroup group5830 = new StudentGroup(firstGroup, 5830);

        StudentGroup group5831 = new StudentGroup(secondGroup, 5831);

        StudentGroup group5832 = new StudentGroup(thirdGroup, 5832);

        StudentGroup group5833 = new StudentGroup(fourthGroup, 5833);

        StudentGroup group5834 = new StudentGroup(fifthGroup, 5833);

        List<StudentGroup> stream1 = new ArrayList<StudentGroup>();
        stream1.add(group5830);
        stream1.add(group5832);
        stream1.add(group5834);

        List<StudentGroup> stream2 = new ArrayList<StudentGroup>();
        stream2.add(group5831);
        stream2.add(group5833);

        StudentStream studStream1 = new StudentStream(stream1, 1);

        StudentStream studStream2 = new StudentStream(stream2, 2);

        System.out.println(studStream2);

        System.out.println("=========================================================");

        for(StudentGroup studGroup : studStream1)
        {
            System.out.println(studGroup);
        }

        System.out.println("=========================================================");

        Collections.sort(studStream1.getStudentsStream());

        for(StudentGroup studGroup : studStream1.getStudentsStream())
        {
            System.out.println(studGroup);
        }
    }
}
