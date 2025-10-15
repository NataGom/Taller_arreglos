package arrays_excercises;

import utils.Utility;
import javax.swing.*;

public class Excercise7 {
    public static void excercise7() {
        int size = Utility.readInteger("Ingrese el tamaño del arreglo");
        int[] array = Utility.readIntegerArray("Ingrese los datos", size);
        int[] digitPlus = new int[size];
        for (int i = 0; i < size; i++) {
            digitPlus[i] = Utility.sumarDigito(array[i]);
        }
        JOptionPane.showMessageDialog(null, "La suma de los digitos es: " + Utility.showArrayInteger(digitPlus));
    }
}
