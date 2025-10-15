package arrays_excercises;

import utils.Utility;
import javax.swing.*;


public class Excercise4 {
    public static void excercise4() {
        int size = Utility.readInteger("Ingrese el tamaño del arreglo");
        int[] array = Utility.readIntegerArray("Ingrese los datos", size);
        int[] four = new int[size];
        for (int i = 0; i < size; i++) {
            four[i] = Utility.numeroCuatro(array);
        }
        JOptionPane.showMessageDialog(null,
                "Los numeros terminados en 4 son:" + Utility.showArrayInteger(array));
    }
}
