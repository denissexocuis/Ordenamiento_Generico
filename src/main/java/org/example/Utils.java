package org.example;

public class Utils{

    // metodo generico estatico
    public static <T extends Number> T[] ordena (T[] array, int begin, int end)
    {
        // el 'ordena' es quicksort
        // no puse otra función aparte por legibilidad del codigo, por eso agregué otros parametros a al metodo 'ordena'
        if (begin < end)
        {
            int centro = partition(array, begin, end);

            ordena(array, begin, centro-1);
            ordena(array, centro+1, end);
        }

        return array;
    }

    // guiandome desde:
    // https://www.baeldung.com/java-quicksort
    private static <T extends Number> int partition(T[] arr, int begin, int end) {
        double pivot = arr[end].doubleValue(); // double es mas preciso, solo queremos el valor en esa posicion para comparar
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            // aqui lo puse para que ordene de menor a mayor
            if (arr[j].doubleValue() >= pivot) {
                i++;

                // haciendo un swap, el valor es tipo T
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
