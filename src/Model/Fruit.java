package Model;

import java.util.ArrayList;

import Common.Algorithm;
import Common.Library;

public class Fruit {
    private int fruitId;
    private String fruitName;
    private int price;
    private int quality;
    private String origin;

    public Fruit() {
    }

    public Fruit(int fruitId, String fruitName, int price, int quality, String origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.quality = quality;
        this.origin = origin;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return (fruitId + 1) + " " + fruitName + " " + origin + " " + price;
    }

    public void input(ArrayList<Fruit> dataFruit) {
        setFruitId(dataFruit.size());
        setFruitName(Algorithm.capitalizeFirstLetter(Library.validString("Enter valid fruit name")));
        setPrice(Library.getInt("Enter valid price", 1000, 1000000));
        setOrigin(Algorithm.capitalizeFirstLetter(Library.validString("Enter valid origin")));
    }
}
