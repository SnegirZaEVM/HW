import java.util.ArrayList;
import java.util.Arrays;

    public class Box<T extends Fruit> {

    ArrayList<T> box = new ArrayList();

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            weight += box.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> someBox) {
        return this.getWeight() == someBox.getWeight();
    }

    public boolean areDifferent(Box someBox) {
        return box.get(0).getClass() != someBox.getBox().get(0).getClass();
    }

    public boolean areDifferentForOneFruitAdd(Fruit fruit) {
        return box.get(0).getClass() != fruit.getClass();
    }

    public void replaceOneFruit(Box newBox) throws MyException {
        if (areDifferent(newBox)) {
            throw new MyException("Body, you can't mix different fruits!");
        }
        for (int i = box.size() - 1; i >= 0; i--) {
            newBox.getBox().add(box.get(i));
            box.remove(i);
        }
    }

    // Без этой проверки будут добавляться любые фрукты куда угодно (если их именно добавлять, а не перемещать)
    // Выглядит как костыль. Им и являтся.
    public void checkBeforeAddingOneFruit (Fruit fruit) throws MyException {
        if (areDifferentForOneFruitAdd(fruit)) {
            throw new MyException("Body, you can't mix different fruits!");
        }
    }





}
