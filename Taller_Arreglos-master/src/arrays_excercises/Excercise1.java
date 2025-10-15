package arrays_excercises;

import utils.Utility;
import javax.swing.*;

public class Excercise1 {
    public static void excercise1() {
        int size = Utility.readInteger("Ingrese el tamaño del arreglo");
        int[] array = Utility.readIntegerArray("Ingrese los datos ", size);
        int[] mayor = new int[size];
        for (int i = 0; i < size; i++) {
            mayor[i] = Utility.numeroMayor(array);
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es: " + Utility.numeroMayor(array));
    }
}
