package arrays_excercises;

import utils.Utility;

import javax.swing.*;

public class Excercise8 {
    public static void excercise8() {
        int size = Utility.readInteger("Ingrese la cantidad de números");
        int[] numeros = Utility.readIntegerArray("Ingrese número ",size);
        ///  la parte del factorial
        long[] factorials = new long[size];
        for(int i=0; i<size; i++) {
            factorials[i] = Utility.calcularFactorial(numeros[i]);
        }
        JOptionPane.showMessageDialog(null,
                Utility.showArrayLongs(factorials));
    }
}
