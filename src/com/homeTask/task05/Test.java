package com.homeTask.task05;
/**
 * Created by Olaf on 07.11.2014.
 */
public class Test {
    public static void main (String[] args){
        Teacher mat = new Teacher();
                //("Duke Java", 34, "M", 50000, "Computer Science");
        Student first = new Student();
                //("Lunne Brooke", 16, "F", "HS95129", 3.5);
        CollegeStudent second = new CollegeStudent();
                //("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        Person[] people = new Person[4];
        people[0] = mat;
        people[1] = first;
        people[2] = second;
        people[3] = new Person();
                //("Coach Bob", 27, "M");
        mat.setName("Duke Java");
        mat.setAge(34);
        mat.setGender("M");
        mat.setSalary(50000);
        mat.setSubject("Computer Science");
        first.setName("Lunne Brooke");
        first.setAge(16);
        first.setGender("F");
        first.setIdNumber("HS95129");
        first.setGpa(3.5);
        second.setName("Ima Frosh");
        second.setAge(18);
        second.setGender("F");
        second.setIdNumber("UCB123");
        second.setGpa(4.0);
        second.setYear(1);
        second.setMajor("English");
        people[3].setName("Coach Bob");
        people[3].setAge(27);
        people[3].setGender("M");
        for (Person p : people){
            System.out.println(p.toString());
        }
    }
}
