import java.util.Arrays;

// Задача 1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих 
// массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Zadacha_1 {
    public static void main(String[] args) {
        int[] array1 = new int[] { 2, 2, 5, 3, 2, 1 };
        int[] array2 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] array3 = arr(array1, array2);

        System.out.println(Arrays.toString(array3));
    }

    public static int[] arr(int[] array1, int[] array2) {
        int[] new_array = new int[array1.length];
        if (array1.length == 0 || array2.length == 0) {
            throw new RuntimeException("Массив с нулевой длиной");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException(
                    String.format("Массив длиной %d не равен массиву длиной %d", array1.length, array2.length));
        }
        for (int i = 0; i < array2.length; i++) {
            new_array[i] = array1[i] - array2[i];
        }
        return new_array;
    }
}
