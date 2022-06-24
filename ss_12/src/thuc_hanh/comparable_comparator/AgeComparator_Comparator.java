package thuc_hanh.comparable_comparator;

import java.util.Comparator;

public class AgeComparator_Comparator implements Comparator<Student_Comparable> {

    @Override
    public int compare(Student_Comparable o1, Student_Comparable o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
    }
