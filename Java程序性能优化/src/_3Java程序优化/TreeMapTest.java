package _3Java程序优化;

import java.lang.reflect.Parameter;
import java.util.Date;
import java.util.TreeMap;

/**
 * Created by sharp on 2017/7/5 - 16:19
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student, StudentDetailInfo> map = new TreeMap<>();
        Student s1 = new Student("sharp1", 70);
        Student s2 = new Student("sharp2", 85);
        Student s3 = new Student("sharp3", 92);
        Student s4 = new Student("sharp4", 68);
        Student s5 = new Student("sharp5", 91);
        
        map.put(s1, new StudentDetailInfo(s1));
        map.put(s2, new StudentDetailInfo(s2));
        map.put(s3, new StudentDetailInfo(s3));
        map.put(s4, new StudentDetailInfo(s4));
        map.put(s5, new StudentDetailInfo(s5));
     
    }
    
}

class StudentDetailInfo {
    Student student;
    
    public StudentDetailInfo(Student student) {
        this.student = student;
    }
    
    @Override
    public String toString() {
        return "StudentDetailInfo{" +
                "student=" + student +
                '}';
    }
}

class Student implements Comparable<Student> {
    String name;
    int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
    
    @Override
    public int compareTo(Student o) {
        if (o.score < this.score) {
            return 1;
        } else if (o.score > this.score) {
            return -1;
        }
        return 0;
    }
}