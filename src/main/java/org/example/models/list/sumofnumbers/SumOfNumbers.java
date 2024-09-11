package org.example.models.list.sumofnumbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {

    List<Integer> numberList;

    public SumOfNumbers() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number){
        Integer integer = number;
        numberList.add(integer);
    }

    public void calculateSum(){
        if(!numberList.isEmpty()){
            int amount = 0;
            for(Integer i: numberList){
                amount = amount + i;
            }
            System.out.println("Soma de todos os números: " + amount);
        }

    }

    public Integer findLargestNumber(){
        int largestNumber = 0;
        if(!numberList.isEmpty()){
            for(Integer i: numberList){
                if(i > largestNumber){
                    largestNumber = i;
                }
            }
            return largestNumber;
        }

        return null;
    }

    public Integer findSmallestNumber(){
        int smallestNumber = 0;
        if (!numberList.isEmpty()){
            for(Integer i: numberList){
                if(smallestNumber == 0 || smallestNumber > i){
                    smallestNumber = i;
                }
            }
            return smallestNumber;
        }

        return null;
    }

    public void showNumbers(){
        if(!numberList.isEmpty()){
            System.out.println("Aqui está a lista de números");
            for(Integer i: numberList){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();

        sumOfNumbers.addNumber(100);
        sumOfNumbers.addNumber(200);
        sumOfNumbers.addNumber(300);
        sumOfNumbers.addNumber(400);
        sumOfNumbers.addNumber(500);

        sumOfNumbers.calculateSum();
        System.out.println(sumOfNumbers.findLargestNumber());
        System.out.println(sumOfNumbers.findSmallestNumber());
        sumOfNumbers.showNumbers();

    }
}
