package com.company;

public class Main {

    public static void main(String[] args) {

            // create arrays of Integer, Double and Character
            Integer[] integerArray = {1, 2, 3, 4, 5};
            Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
            Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
            String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

            System.out.printf("Array integerArray contains:%n");
            printArray(integerArray); // pass an Integer array
            System.out.printf("%nArray doubleArray contains:%n");
            printArray(doubleArray); // pass a Double array
            System.out.printf("%nArray characterArray contains:%n");
            printArray(characterArray); // pass a Character array


            System.out.println("\nUsing overloded method printArray:\n");
            try{
                printArray(integerArray, 3, 5);
            }catch (InvalidSibscriptException i){
                System.out.println(i.getMessage());
            }

            try{
                printArray(doubleArray, -1, 2);
            }catch (InvalidSibscriptException i){
                //System.out.println(i.getMessage());
            }

            try{
                printArray(characterArray, 2, 10);
            }catch (InvalidSibscriptException i){
                //System.out.println(i.getMessage());
            }

            printArray(stringArray);
        }


    // generic method printArray
    public static <T> void printArray(T[] inputArray)
    {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }
    // overloaded generic function
    public static <T> int printArray(T[] inputArray,
                                     int lowSubscript, int highSubscript) throws InvalidSibscriptException {
        int counter = 0;
        if(highSubscript > inputArray.length || lowSubscript < 0){
            throw new InvalidSibscriptException
                    (String.format("subscript must be between %d and %d%n", 0, inputArray.length - 1));
        } else{
            for(int i = lowSubscript; i < highSubscript; i++){
                System.out.printf("%s ", inputArray[i]);
                counter++;
            }
            System.out.println();
        }
        return counter;
    }

    // overloaded function
    public static void printArray(String[] inputArray){
        System.out.println("Inside printArray String : ");
        int counter = 1;
        for(String element : inputArray){
            System.out.printf("%-8s", element);
            if (counter % 4 == 0)
                System.out.println();
            counter++;
        }
        System.out.println();
    }

}
