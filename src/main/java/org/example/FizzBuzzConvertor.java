package org.example;

public class FizzBuzzConvertor {

    public String convert(int number){
        if(number%3==0 && number%15!=0){
            return "Fizz";
        }
        if(number%5==0 && number%15!=0){
            return "Buzz";
        }
        if(number%15==0){
            return "FizzBuzz";
        }
        else{
            return String.valueOf(number);
        }
    }
    
}
