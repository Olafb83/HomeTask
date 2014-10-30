package com.homeTask.task03.test01.test04;

public class Clock {
    public static void main(String[] args) {
        int s = 0;
        for (int hour = 0; hour < 24; hour++){
            for (int min = 0; min < 60; min++){
                if ((hour/10 == min%10) && (hour%10 == min/10)){
                    s++;
                    System.out.println(hour + ":" + min);
                }
            }
        }
        System.out.println("Симметричных комбинаций " + s);

    }
}
