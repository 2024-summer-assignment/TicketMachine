



import java.util.*;
import java.util.ArrayList;
import java.util.List;

import java.io.*;



public class main {



  public static void main(String[] args) {

    List<Item> items = new ArrayList<Item>();

    items.add(new Item(1, "特製ラーメン", 1000));

    items.add(new Item(2, "醤油ラーメン", 780));

    items.add(new Item(3, "しおラーメン", 880));

    items.add(new Item(4, "ごはん", 150));

    for (Item item : items) {
      System.out.println(item.getId() + item.getName() + item.getPrice());
  }

  }
}
