import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<E extends Fruit> {
    private List<E> fruitBox;

    public Box() {
        fruitBox = new ArrayList<>();
    }
    public Box(E... fruits) {
        fruitBox = new ArrayList<>(Arrays.asList(fruits));
    }


    public void putFruit(E fruit) {
        fruitBox.add(fruit);
    }
    public void putFruit(List<E> fruits) {
        this.fruitBox.addAll(fruits);
    }
    public void putFruit(E... fruits) {fruitBox.addAll(Arrays.asList(fruits));}


    public double getWeight() {
        if (fruitBox.size() == 0) {
            return 0.0;
        }
        double weight = 0.0;
        for (E fruit: fruitBox) {
            weight += fruit.weight;
        }
        return weight;
    }

    public boolean compare(Box<?> o) {
        if (Math.abs(this.getWeight() - o.getWeight()) < 0.001) return true;
        return false;
    }

    public void merge(Box<E> anotherFruitBox) {
        this.putFruit(anotherFruitBox.getFruitBox());
        anotherFruitBox.getFruitBox().clear();
    }

    public List<E> getFruitBox() {
        return fruitBox;
    }

}
