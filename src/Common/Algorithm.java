package Common;

import java.util.ArrayList;
import java.util.Hashtable;

import Model.Fruit;

public class Algorithm {
    public static Boolean isTrue(String question, String ans1, String ans2) {
        String isNext;
        do {
            isNext = Library.validString(question);
        } while (!isNext.equalsIgnoreCase(ans1) && !isNext.equalsIgnoreCase(ans2));
        return isNext.equalsIgnoreCase(ans1);
    }

    public static void orders(ArrayList<Fruit> dataFruit, Hashtable<String, ArrayList<Fruit>> customerOrder) {
        int chooseFruit;
        ArrayList<Fruit> listFrust = new ArrayList<Fruit>();
        do {
            Fruit fruit = new Fruit();
            System.out.println(dataFruit.toString());
            chooseFruit = Library.getInt("To order, customer selects Item", 1, dataFruit.size());
            chooseFruit -= 1;
            fruit = dataFruit.get(chooseFruit);
            System.out.println("You selected :" + dataFruit.get(chooseFruit).getFruitName());
            fruit.setQuality(Library.getInt("Please input quantity", 1, 10000));
            System.out.println(fruit);
            listFrust.add(fruit);
            System.out.println(listFrust);
            for (Fruit fruit2 : listFrust) {
                System.out.println(fruit2.getFruitName()+" "+ );
            }
        } while (isTrue("Do you want to order more (Y/N)?", "Y", "N"));
        if (isTrue("Do you want to order now (Y/N)", "Y", "N")) {
            System.out.println("Product Quantity Price Amount");
            int allAmount = 0;
            for (Fruit fruit : listFrust) {
                System.out.println(fruit.getFruitName() + " " + fruit.getQuality() + " " + fruit.getPrice()
                        + " " + (fruit.getPrice() * fruit.getQuality()));
                allAmount += fruit.getPrice() * fruit.getQuality();
            }
            System.out.println("Total: " + allAmount);
            String nameCustomer = capitalizeFirstLetter(Library.validString("Input your name"));
            customerOrder.put(nameCustomer, listFrust);
        }
    }

    public static void viewOrder(Hashtable<String, ArrayList<Fruit>> customerOrder) {
        for (String customer : customerOrder.keySet()) {
            System.out.println("Customer: " + customer);
            System.out.println(customerOrder.get(customer));
            int allAmount = 0;
            for (Fruit lisFruit : customerOrder.get(customer)) {
                allAmount += lisFruit.getPrice() * lisFruit.getQuality();
                System.out.println(
                        (lisFruit.getFruitId() + 1) + "." + lisFruit.getFruitName() + " " + lisFruit.getQuality() + " "
                                + lisFruit.getPrice() + " " + (lisFruit.getPrice() * lisFruit.getQuality()));
            }
            System.out.println("Total: " + allAmount);
        }
    }

    public static String capitalizeFirstLetter(String str) {
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char firstLetter = Character.toUpperCase(word.charAt(0));
            sb.append(firstLetter).append(word.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }

}
