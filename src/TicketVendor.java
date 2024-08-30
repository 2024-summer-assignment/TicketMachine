import java.util.*;
import java.util.ArrayList;
import java.util.List;

import java.io.*;



public class TicketVendor {

    private List<Item> items;

    private Cart cart;



    public TicketVendor(List<Item> items) {

        this.items = items;

        this.cart = new Cart();

    }



    public void showItems() {

        System.out.println("商品          金額");



        for(Item item : items) {

            System.out.println(item.getId() + "." + item.getName() + "     " + item.getPrice() + "円");

        }

    }



    public void addItemToCart(int itemId) {

        for(Item item :items) {

            if(item.getId() == itemId) {

                cart.addItem(item);

                return;

            }

        }



        //エラー処理

        

    }



    public void showCartItems() {

        System.out.println("商品          数量");



        List<CartItem> cartItems = cart.getCartItems();



        for(CartItem cattItem : cartItems) {

            System.out.println(cattItem.getId() + "." + cattItem.getName() + "     " + cattItem.getQuantity());

        }



        

        System.out.println("合計:" + cart.getTotalPrice() + "円");

    }}