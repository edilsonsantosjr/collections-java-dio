package org.example.models.list.shoppingcart;

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

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.adicionarItem("Sabonete", 5.45, 2);
        shoppingCart.adicionarItem("Pasta de dente", 2.37, 2);
        shoppingCart.adicionarItem("Detergente", 3.26, 2);
        shoppingCart.adicionarItem("Papel higiênico", 4.78, 2);
        shoppingCart.calcularValorTotal();
        shoppingCart.exibirItens();
        shoppingCart.removerItem("Pasta de dente");
        shoppingCart.calcularValorTotal();
        shoppingCart.exibirItens();
    }
}
