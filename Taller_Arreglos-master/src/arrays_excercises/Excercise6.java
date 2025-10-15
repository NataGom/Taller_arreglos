package arrays_excercises;

import utils.Utility;
import javax.swing.*;

public class Excercise6 {
    public static void excercise6() {
        int size = Utility.readInteger("Ingrese el tamaño del arreglo");
        int[] array = Utility.readIntegerArray("Ingrese el dato ", size);
        double average = Utility.promedio(array);
        JOptionPane.showMessageDialog(null, 
            String.format("El promedio de los números es: %.2f", average));
    }
}
