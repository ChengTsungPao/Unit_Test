package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        GradeCreator gradeCreator = new GradeCreator();

        for(int i = 0; i < 10; i++){
            System.out.println(gradeCreator.convert(i));
        }
    }
}