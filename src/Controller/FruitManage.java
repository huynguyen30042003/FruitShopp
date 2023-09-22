package Controller;

import java.util.ArrayList;
import java.util.Hashtable;

import Common.Algorithm;
import Model.Fruit;
import View.Menu;

public class FruitManage extends Menu<String> {
    static String[] options = { "Create Fruit", "View Orders", "Shopping", "Exit" };
    ArrayList<Fruit> dataFruit = new ArrayList<Fruit>();
    Hashtable<String, ArrayList<Fruit>> customerOrder = new Hashtable<>();

    public FruitManage(ArrayList<Fruit> dataFruit) {
        super("FRUIT SHOP SYSTEM", options);
        this.dataFruit = dataFruit;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                do {
                    Fruit fruit = new Fruit();
                    fruit.input(dataFruit);
                    dataFruit.add(fruit);
                } while (Algorithm.isTrue("Do you want to continue (Y/N)?", "Y", "N"));
                break;
            case 2:
                Algorithm.viewOrder(customerOrder);
                break;
            case 3:
                Algorithm.orders(dataFruit, customerOrder);
                break;
            case 4:
                System.exit(0);
                break;
        }

    }

}
