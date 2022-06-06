public class Main {

    static String[][] arraySizeException = {{"1", "1", "1"}, {"2", "2","2"}, {"3", "3", "3"}, {"4", "4", "4"}};
    static String[][] arrayDataException = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"U", "S", "S", "R"}};
    static String[][] arrayValid = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
    static int dimensionSize = 4;


    public static void main(String[] args) {

// Корректный
        try {
            System.out.println("The sum is " + sum(arrayValid));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

// Ошибка размера массива
        try {
            System.out.println("Sum: " + sum(arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

// Ошибка ... наполнения массива
        try {
            System.out.println("Sum: " + sum(arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

    } // триклятая скобка метода main

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Wrong array size error");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }

    static void compareArrayDimentions(String[][] array) throws MyArraySizeException{
        if(array.length!=dimensionSize || array[0].length!=dimensionSize)
        {
            throw new MyArraySizeException();
        }
    }

    static Integer sum(String[][] array) throws MyArraySizeException, MyArrayDataException{
        compareArrayDimentions(array);
        Integer result = 0;
        int i = 0;
        int j = 0;

        try {
            for(i = 0; i< array.length; i++){
                for(j = 0; j< array.length; j++){
                    result += Integer.parseInt(array[i][j]); // "parseInt" подсмотрел в "готовой домашке". Каюсь.
                }
            }
        }
        catch (NumberFormatException ex){
            throw new MyArrayDataException("There is an error at ["+i+":"+j+"] cell");
        }
        return result;
    }

}
