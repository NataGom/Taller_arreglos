package arrays_excercises;

import utils.Utility;
import javax.swing.*;

public class Excercise5 {
    public static void excercise5() {
        int size = Utility.readInteger("Ingrese el tamaño del arreglo");
        int[] numbers = Utility.readIntegerArray("Ingrese los datos", size);

        int maxNumber = Utility.numeroMayor(numbers);
        int repetitions = 0;
        
        for (int num : numbers) {
            if (num == maxNumber) {
                repetitions++;
            }
        }

        JOptionPane.showMessageDialog(null,
            "El número " + maxNumber +
            " Se repite " + repetitions + " " + (repetitions == 1 ? "vez" : "veces"));
    }
}
