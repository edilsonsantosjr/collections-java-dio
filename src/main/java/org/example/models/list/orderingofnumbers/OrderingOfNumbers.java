package org.example.models.list.orderingofnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingOfNumbers {

    private List<Integer> listaNumbers;

    public OrderingOfNumbers() {
        this.listaNumbers = new ArrayList<>();
    }

    public List<Integer> getListaNumbers() {
        return listaNumbers;
    }

    @Override
    public String toString() {
        return "OrderingOfNumbers{" +
                "listaNumbers=" + listaNumbers +
                '}';
    }

    public void addNumber(int number){
        listaNumbers.add(number);
    }

    public void sortAscending(){
        Collections.sort(listaNumbers);
        System.out.println("Números em ordem crescente!");
        System.out.println(listaNumbers);
    }

    public void sortDescending(){
        Collections.sort(listaNumbers, Collections.reverseOrder());
        System.out.println("Números em ordem decrescente!");
        System.out.println(listaNumbers);
    }

    public static void main(String[] args) {
        OrderingOfNumbers orderingOfNumbers = new OrderingOfNumbers();
        orderingOfNumbers.addNumber(100);
        orderingOfNumbers.addNumber(400);
        orderingOfNumbers.addNumber(500);
        orderingOfNumbers.addNumber(300);
        orderingOfNumbers.addNumber(200);

        orderingOfNumbers.sortAscending();
        orderingOfNumbers.sortDescending();
    }
}
