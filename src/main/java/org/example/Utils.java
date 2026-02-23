package org.example;

public class Utils{

    // metodo generico estatico
    public static <T extends Number> T[] ordena (T[] array, int begin, int end)
    {
        // quicksort
        if (begin < end)
        {
            int centro = partition(array, begin, end);

            ordena(array, begin, centro-1);
            ordena(array, centro+1, end);
        }

        return array;
    }

    private static <T extends Number> int partition(T[] arr, int begin, int end) {
        double pivot = arr[end].doubleValue();
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].doubleValue() >= pivot) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }


}
