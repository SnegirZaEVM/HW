import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] colors = new String[]{
                "white", "white", "black", "black", "black", "red",
                "orange", "yellow", "green", "blue", "purple", "pink"
        }; // 2 раза повторяется "white" и 3 раза "black".

        System.out.println("\n---- First task ----\n");

        List<String> colorsList = Arrays.asList(colors);
        System.out.println("Colors in the list: "+ colorsList);

        Set<String> colorsSet = new HashSet<>(colorsList);
        System.out.println("Unique colors in the list: "+colorsSet);

        for (String color : colorsSet) {
            int amount = Collections.frequency(colorsList, color); // метод был честно загуглен.
            if (amount == 1){
                System.out.println(color + ": " + amount +" time");
            }
            else {
                System.out.println(color + ": " + amount +" times");
            }
        }

        System.out.println("\n---- Second task ----\n");

        Phonebook phonebook = new Phonebook();

        phonebook.add("Black", "0001");
        System.out.println("Black has been added to the phonebook");

        phonebook.add("Black", "0002");
        System.out.println("Black has been added to the phonebook");

        phonebook.add("Pink", "0003");
        System.out.println("Pink has been added to the phonebook");

        phonebook.add("Pink", "0004");
        System.out.println("Pink has been added to the phonebook");

        phonebook.add("White", "0005");
        System.out.println("White has been added to the phonebook");

        System.out.println("---");

        System.out.println("All Blacks' numbers: "+phonebook.get("Black"));
        System.out.println("All Pinks' numbers: "+phonebook.get("Pink"));
        System.out.println("All Whites' numbers: "+phonebook.get("White"));

    } // скобка метода main
}
