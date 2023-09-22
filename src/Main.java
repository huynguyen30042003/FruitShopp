import java.util.ArrayList;

import Controller.FruitManage;
import Model.Fruit;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> dataFruit = new ArrayList<Fruit>();
        new FruitManage(dataFruit).run();
    }
}
