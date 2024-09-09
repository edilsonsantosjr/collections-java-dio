package org.example;

import org.example.models.shoppingcart.ShoppingCart;

public class Main {
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