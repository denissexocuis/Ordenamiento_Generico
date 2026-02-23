package org.example;

public class Main {
    static void main() {
        Integer [] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };

        Imprimir(intVector);

        Integer [] resultInt = Utils.ordena (intVector, 0, intVector.length-1);

        Imprimir(resultInt);


        Float [] floatVector = {19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f };

        Imprimir(floatVector);

        Float [] resultFloat = Utils.ordena(floatVector, 0, floatVector.length-1);

        Imprimir (resultFloat);

        //fallar con esto
        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        //String [] resultStr = Utils.ordena(strVector, 0, strVector.length-1);
    }


    public static void Imprimir(Number [] array)
    {
        System.out.println(" ");
        for(int i=array.length-1; i >=0; i--)
        {
            System.out.printf("%s ", array[i]);
        }
    }
}
