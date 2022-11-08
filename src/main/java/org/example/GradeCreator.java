package org.example;

public class GradeCreator {
    public String convert(int score){
        if(score >= 90){
            return "GOOD";
        }else if(score >= 60){
            return "OK";
        }else if(score >= 0){
            return "GG";
        }else{
            return "inValid";
        }
    }
}

