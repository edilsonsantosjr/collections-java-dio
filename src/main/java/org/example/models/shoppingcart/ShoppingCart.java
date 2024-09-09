package org.example.models.shoppingcart;

import org.example.models.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int amount){
        itemList.add(new Item(name, price, amount));
    }

    public void removerItem(String name){
        List<Item> taskForRemoving = new ArrayList<>();
        for(Item item: itemList){
            if(item.getName().equalsIgnoreCase(name)){
                taskForRemoving.add(item);
                System.out.println("Produto removido: " + item.getName());
            }
        }

        itemList.removeAll(taskForRemoving);
    }

    public void calcularValorTotal(){
        double priceTotal = 0;
        for(Item item: itemList){
            priceTotal = priceTotal + (item.getPrice() * item.getAmount());
        }

        System.out.println("Valor total dos produtos: R$" + priceTotal);
    }

    public void exibirItens(){
        System.out.println(itemList);
    }
}
