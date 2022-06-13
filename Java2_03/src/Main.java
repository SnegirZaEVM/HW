import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static String[] arrayString = {"one", "two", "three"};
    static Integer[] arrayInteger = {1, 2, 3};
    static Double[] arrayDouble = {1.0d, 2.0d, 3.0d};

    public static void main(String[] args) {

    // Первое задание:
        System.out.println("-----First task-----\n");

        try {
            System.out.println("Integer array before "+ Arrays.deepToString(arrayInteger));
            replace(arrayInteger, 0,2);
            System.out.println("Integer array after "+ Arrays.deepToString(arrayInteger));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            System.out.println("String array before "+ Arrays.deepToString(arrayString));
            replace(arrayString, 0,2);
            System.out.println("String array after "+ Arrays.deepToString(arrayString));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        try {
            System.out.println("Double array before "+ Arrays.deepToString(arrayDouble));
            replace(arrayDouble, 0,2);
            System.out.println("Double array after "+ Arrays.deepToString(arrayDouble));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    // Второе задание:
        System.out.println("\n-----Second task-----\n");

    //Создание и заполнение первой коробки
        Box box1 = new Box();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println("The Box#1 weight is " + box1.getWeight()+ "kg. Yeap, our fruits are huge ;)");

    //Создание и заполнение второй коробки
        Box box2 = new Box();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println("The Box#2 weight is " + box2.getWeight()+ "kg. Just look at them!");

    //Сравнение двух коробок
        System.out.println("Is this true that Box#1 and Box#2 have the same weight? The answer is: "+ box1.compare(box2)+".");

    //Проверка что находится в первой коробке
        System.out.println("The Box#1 contains " + box1.getBox().get(0).getClass().getSimpleName()+"s.");

    //Создание третьей коробки
        Box box3 = new Box();
        box3.addFruit(new Apple());
        System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg. It contains "
                + box1.getBox().get(0).getClass().getSimpleName()+"s.");

    //Попытка переложить фрукты из первой коробки в третью
        System.out.println("Let's replace all fruits from Box#1 to Box#3.");
        try {
            box1.replaceOneFruit(box3);
        } catch (MyException ex){
            System.out.println(ex);
        }
        System.out.println("The Box#1 weight is " + box1.getWeight()+ "kg.");
        System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg. It contains "
                + box3.getBox().get(0).getClass().getSimpleName()+"s.");

    //Попытка переложить фрукты из второй коробки в третью
        System.out.println("Let's replace all fruits from Box#2 (Oranges) to Box#3 (Apples).");
        try {
            box2.replaceOneFruit(box3);
        } catch (MyException ex){
            System.out.println(ex);
        }
        System.out.println("The Box#2 weight is " + box2.getWeight()+ "kg.");
        System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg.");

    //Попытка вручную добавить "не те фрукты в коробку"
        System.out.println("Let's try to add some oranges to the box with apples (Box#3).");

        try {
            box3.checkBeforeAddingOneFruit(new Orange());
            box3.addFruit(new Orange());
            box3.addFruit(new Orange());
            box3.addFruit(new Orange());
        } catch (MyException ex){
            System.out.println(ex);
        }
        System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg.");

    //Попытка вручную добавить одинаковые фрукты в коробку
        System.out.println("Let's try to add 3 apples to the box with apples (Box#3).");
        try {
            box3.checkBeforeAddingOneFruit(new Apple());
            box3.addFruit(new Apple());
            box3.addFruit(new Apple());
            box3.addFruit(new Apple());
        } catch (MyException ex){
            System.out.println(ex);
        }
        System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg.");

    //Подведение итогов. Хорошо бы как-то через цикл, но пока что имеем, что имеем. Благо всего 3 коробки.
        System.out.println("Wonderful. And now let's take a look at all our boxes last time.");

        if (box1.getWeight() > 0){
           System.out.println("The Box#1 weight is " + box1.getWeight()+ "kg. It contains "
                   + box1.getBox().get(0).getClass().getSimpleName()+"s.");
        }
        else{System.out.println("The Box#1 weight is " + box1.getWeight()+ "kg. It is empty (neither apples nor oranges).");
        }

        if (box2.getWeight() > 0){
           System.out.println("The Box#2 weight is " + box2.getWeight()+ "kg. It contains "
                   + box2.getBox().get(0).getClass().getSimpleName()+"s.");
        }
        else{System.out.println("The Box#2 weight is " + box2.getWeight()+ "kg. It is empty (neither apples nor oranges).");
        }

        if (box3.getWeight() > 0){
           System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg. It contains "
                   + box3.getBox().get(0).getClass().getSimpleName()+"s.");
        }
        else{System.out.println("The Box#3 weight is " + box3.getWeight()+ "kg. It is empty (neither apples nor oranges).");
        }

    } // Скобка метода main

    public static void replace(Object[] array, int index1, int index2) {
        Object tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }










}
