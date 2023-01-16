import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
    // 1).
        Integer[] numbers = {2,34,6,7,98,34};
        List<Integer> list = toList(numbers);
        System.out.println(list);

    //  2).
        Box<Apple> boxApple = new Box<>();
        Apple appleRed = new Apple("Red", 20, 0.3);

        //2.4.
        boxApple.putFruit(appleRed);
        //2.5.
        boxApple.putFruit(new Apple("Gold", 10, 0.2),
                new Apple("Semerenko", 10, 0.4));
        //2.6
        System.out.printf("Apple box weight : %6.2f kg \n", boxApple.getWeight());

        Box<Orange> boxOrange = new Box<>();
        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange("Turkish", 10, 0.3));
        oranges.add(new Orange("Spain", 20, 0.4));
        boxOrange.putFruit(oranges);
        System.out.printf("Oranges box weight : %6.2f kg \n", boxOrange.getWeight());

        //2.7
        System.out.println("The weight of the boxes is equal? " + boxApple.compare(boxOrange));

        //2.8
        System.out.println("----------------------------------");
        Box<Apple> newBoxApple = new Box<>();
        newBoxApple.putFruit(new Apple("Red Prince", 15, 0.25));
        System.out.printf("Apple box (boxApple) weight : %6.2f kg \n", boxApple.getWeight());
        System.out.printf("Apple box (newBoxApple) weight : %6.2f kg \n", newBoxApple.getWeight());
        System.out.println("+++ merge +++");
        boxApple.merge(newBoxApple);
        System.out.printf("Apple box (boxApple) weight : %6.2f kg \n", boxApple.getWeight());
        System.out.printf("Apple box (newBoxApple) weight : %6.2f kg \n", newBoxApple.getWeight());


    }



    public static <T> List<T> toList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}
