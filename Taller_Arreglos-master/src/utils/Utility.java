package utils;

import javax.swing.*;

public class Utility {
    public static int readInteger(String message) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(message));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Dato Incorrecto");

        }
        return 0;
    }

    public static int[] readIntegerArray(String message, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = readInteger(message + (i + 1));
        }
        return array;
    }

    public static int numeroMayor (int[] array){
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
    public static int numeroCuatro(int[] array){
        int four = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 10 == 4) {
                four++;
            }
        }
        return four;
    }

    /** solucion con cascade al ejercicio 4
     * public static void showNumbersEndingWithFour(int[] array) {
     *     StringBuilder result = new StringBuilder("Números terminados en 4:\n");
     *     for (int i = 0; i < array.length; i++) {
     *         if (Math.abs(array[i] % 10) == 4) {  // Using abs() to handle negative numbers
     *             result.append(array[i]).append(" ");
     *         }
     *     }
     *     JOptionPane.showMessageDialog(null, result.toString().trim());
     * }**/

    public static int numberRepetitions(int[] array){
        int repetitions = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroMayor (array)) {
                repetitions++;
            }
        }
        return repetitions;
    }

    public static int mayorPrimo(int[] array){
        int maxPrime = -1;
        for (int num : array) {
            if (esPrimo(num) && num > maxPrime) {
                maxPrime = num;
            }
        }
        return maxPrime;
    }
    
    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double promedio(int[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static int sumarDigito(int number) {
            int sum = 0;
            int temp = Math.abs(number);
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            return sum;
    }

    public static long calcularFactorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int[] numeros (int n) {
        if (n <= 0) {
            return new int[0];
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static String showArrayInteger(int[] array){
        String  result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i] + " \n";
        }
        return result;
    }

    public static String showArrayLongs(long[] array){
        String  result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i] + " \n";
        }
        return result;
    }

}