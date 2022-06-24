package thuc_hanh.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student_Comparable student = new Student_Comparable("Kien", 30, "HT");
        Student_Comparable student1 = new Student_Comparable("Nam", 26, "HN");
        Student_Comparable student2 = new Student_Comparable("Anh", 38, "HT");
        Student_Comparable student3 = new Student_Comparable("Tung", 38, "HT");

        List<Student_Comparable> lists = new ArrayList<Student_Comparable>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student_Comparable st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator_Comparator ageComparator = new AgeComparator_Comparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student_Comparable st : lists) {
            System.out.println(st.toString());
        }
    }
}
