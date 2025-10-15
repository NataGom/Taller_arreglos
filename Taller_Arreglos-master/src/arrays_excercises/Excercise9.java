package arrays_excercises;

import utils.Utility;
import javax.swing.*;

public class Excercise9 {
    public static void excercise9() {
     int size = Utility.readInteger("Ingrese el tamaño del arreglo");
     int[] array = Utility.readIntegerArray("Ingrese los datos", size);

        for (int num : array) {
            int[] sequence = Utility.numeros(num);
            String result = "Números del 1 al " + num + ": ";
            for (int n : sequence) {
                result += n + " ";
            }
            JOptionPane.showMessageDialog(null, result);
        }
    }
}
