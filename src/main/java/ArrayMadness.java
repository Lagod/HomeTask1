package arraypackage;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayMadness {
    public static void main(String[] agrs) {
        array();
        swapValues();
        printAvg();
        printRandomValues();
        printRandomValues();
        stringsInput();

    }

    private static Integer[] array() {
        Integer[] oddNumbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("OddNumbersArray: " + Arrays.toString(oddNumbers));
        return oddNumbers;
    }

    private static Integer[] swapValues() {
        Integer[] oddNumbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("OriginalArray: " + Arrays.toString(oddNumbers));
        int maxValue = Collections.max(Arrays.asList(oddNumbers));

        int minValue = Collections.min(Arrays.asList(oddNumbers));
        for (int i = 0; i < oddNumbers.length; i++) {
            if (oddNumbers[i] == maxValue) {
                oddNumbers[i] = minValue;
            } else if (oddNumbers[i] == minValue) {
                oddNumbers[i] = maxValue;
            }
        }
        System.out.println("SwappedArray: " + Arrays.toString(oddNumbers));
        return oddNumbers;
    }

    private static Integer printAvg() {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int sum = 0;
        int avgValue = 0;
        for (int value : array) {
            sum += value;
        }

        avgValue = sum / array.length;
        System.out.println("avgValue = " + avgValue);
        return avgValue;
    }

    private static Integer[] printRandomValues() {
        int minR = -1;
        int medR = 0;
        int maxR = 2;
        int firstValue = 0;
        int secondValue = 0;
        int lastValue = 0;
        Integer[] randomArray = new Integer[13];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ThreadLocalRandom.current().nextInt(minR, maxR);
            if (randomArray[i] == minR) {
                firstValue++;
            }
            if (randomArray[i] == secondValue) {
                secondValue++;
            }
            if (randomArray[i] == lastValue) {
                lastValue++;
            }
        }
        List<Integer> returnedValues = new ArrayList<>();
        returnedValues.add(firstValue);
        returnedValues.add(secondValue);
        returnedValues.add(lastValue);

        int mostOftenReturnedValue = Collections.max(returnedValues);
        int returnedArrValues = Arrays.asList(randomArray).indexOf(mostOftenReturnedValue);
        System.out.println("RandomArray: " + Arrays.toString(randomArray));
        System.out.println("most duplicated array value" + " " + returnedArrValues + " " + "returned" + " " + mostOftenReturnedValue + " " + "times");
        return randomArray;
    }
    private static String stringsInput(){
        Map<Integer, String> stringLength = new HashMap<>();
        System.out.println("Paste/enter five strings..");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exit when strings will be added...");
        int linesCheck = 0;
        while (linesCheck <= 5) {
            String input = scanner.nextLine();
            stringLength.put(input.length(), input);
            linesCheck++;
        }
        List<Integer> stringsLength = new ArrayList<>();
        stringsLength.addAll(stringLength.keySet());

        int stringSize = Collections.max(stringsLength);
        String topString = stringLength.get(stringSize);
        System.out.println('\n' + "" + "this is the longest string" + " " + topString);
        return topString;
    }
}





