



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

   // for(Item item : items) {
   //   System.out.println(item.getId() + "." + item.getName() + "  " + item.getPrice() + "円");
  //}

    TicketVendor tv = new TicketVendor(items);



    tv.showItems();

    while (true) {

      System.out.print("購入する商品番号(支払いに進む場合はc)>");



      String input = null;

      try {

        BufferedReader inputuser = new BufferedReader(

          new InputStreamReader(System.in)

        );

        input = inputuser.readLine();

      } catch (IOException e) {

        System.out.println("システムエラー");

        System.exit(0);

        return;

      }



      if (input == null) {

        System.out.println("商品番号またはcを指定してください。");

        continue;

      }



      if (input.equals("c") || input.equals("C")) {

        break;

      }



      int selectedId;

      try {

        selectedId = Integer.parseInt(input);

      } catch (NumberFormatException e) {

        System.out.println("商品番号またはcを指定してください。");

        continue;

      }



      boolean isExist = false;



      for(Item item : items) {

          if(item.getId() == selectedId) {

              isExist =  true;

          }

      }



      if(!isExist) {

        System.out.println("商品番号またはcを指定してください。");

        continue;

      }



      tv.addItemToCart(selectedId);

    }



    tv.showCartItems();

  }
}
