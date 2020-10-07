package net.javier;


public class MyRoutines {

    public static int[] quickSort(int[] intArray, int low, int high) {

        if (low < high) {
            int pi = partition(intArray, low, high);

            quickSort(intArray, low, pi - 1);  // Before pi
            quickSort(intArray, pi + 1, high); // After pi
        }

        return intArray;

    }

    private static int partition(int[] intArray, int low, int high) {

        // pivot (Element to be placed at right position)
        int pivot = intArray[high];

        int i = (low - 1);  // Index of smaller element

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (intArray[j] < pivot) {
                i++;    // increment index of smaller element
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        int temp = intArray[high];
        intArray[high] = intArray[i + 1];
        intArray[i + 1] = temp;

        System.out.println(MyRoutines.array2String(intArray));

        return (i + 1);
    }

    public static String array2String(int[] intArray) {
        StringBuilder result = new StringBuilder();
        result.append("Result: ");

        for (int x = 0; x < intArray.length; x++) {
            result.append(x);
            result.append(":");
            result.append(intArray[x]);
            if (x < intArray.length - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}
