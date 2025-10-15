package arrays_excercises;

import utils.Utility;
import javax.swing.*;

public class Excercise2 {
    public static void excercise2() {
        int size = Utility.readInteger("Ingrese el tamaño del arreglo");
        int[] array = Utility.readIntegerArray("Ingrese los datos", size);
        int[] prime = new int[size];
        int primeNumber = Utility.mayorPrimo (array);
        for (int i = 0; i < size; i++) {
            if (array[i] == primeNumber) {
                prime[i] = array[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El numero primo es: " + primeNumber);
    }
}
