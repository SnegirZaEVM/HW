import java.awt.*;

public class HomeWorkApp {

    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers(13,6);
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 6;
        int b = -13;
        int c = (a+b);

        if (c>0)
            System.out.println(c + " is over 0");
        else
            System.out.println(c + " is below 0");
    }
    public static void printColor(){
        int value = 100;

        if (value <= 0)
            System.out.println("Red");
        else if (value>0 && value <=100)
            System.out.println("Yellow");
        else
            System.out.println("Green");
    }
    public static void compareNumbers(int firstArg, int secondArg){
        if (firstArg >= secondArg)
            System.out.println("a ("+firstArg+ ") >= b ("+secondArg+ ")");
        else
            System.out.println("a ("+firstArg+ ") < b ("+secondArg+ ")");
    }
}
