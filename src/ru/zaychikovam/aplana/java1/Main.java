package ru.zaychikovam.aplana.java1;

import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задача №3
        task3();
        //Задача №4
        task4();
        //Задача №5
        task5();
        //Задача №6
        task6();
        //Задача №7
        task7();
        //Задача №8
        task8();
        //Задача №9
        task9();
        //Задача №10
        task10();
    }

    /**Задача №3
     **Перенесите скрипт в ваш файл программы и запустите созданную программу*/
    public static void task3() {
        System.out.println("Hello, world!");
    }

    /**
     * Задача №4
     * *Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
     */
    public static void task4() {
        boolean isBinary = false;
        String read = null;
        System.out.println("Введите бинарное число");
        while (!isBinary) {
            try {
                read = readFromConsole();
                char[] readChar = read.toCharArray();
                for (int i = 0; i < readChar.length; i++) {
                    if ((readChar[i] == '0') || (readChar[i] == '1')) {
                        isBinary = true;
                    } else {
                        isBinary = false;
                    }
                }
                if (isBinary) {
                    System.out.println("Вы ввели бинарное число");
                } else {
                    System.out.println("Можно ввести только 0 и 1, ну бинарное же число все таки");
                }
            } catch (NumberFormatException e) {
                System.out.println("Можно ввести только 0 и 1, ну бинарное же число все таки");
            }
        }
        int result = Integer.parseInt(read, 2);
        System.out.println(result);
    }

    /**
     * Задача №5
     * *Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
     */
    public static void task5() {
        boolean isNumeric = false;
        int result = 0;
        NumberFormat f = NumberFormat.getInstance(new Locale("ru", "RU"));
        System.out.println("Введите число");
        while (!isNumeric) {
            try {
                result = Integer.parseInt(readFromConsole());
                isNumeric = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число, попробуйте еще раз");
                isNumeric = false;
            }
            if (isNumeric) {
                System.out.println("Число " + result + " умноженое на 1 равно: " + f.format(result * 1));
                System.out.println("Число " + result + " умноженое на 2 равно: " + f.format(result * 2));
                System.out.println("Число " + result + " умноженое на 3 равно: " + f.format(result * 3));
                System.out.println("Число " + result + " умноженое на 4 равно: " + f.format(result * 4));
                System.out.println("Число " + result + " умноженое на 5 равно: " + f.format(result * 5));
                System.out.println("Число " + result + " умноженое на 6 равно: " + f.format(result * 6));
                System.out.println("Число " + result + " умноженое на 7 равно: " + f.format(result * 7));
                System.out.println("Число " + result + " умноженое на 8 равно: " + f.format(result * 8));
                System.out.println("Число " + result + " умноженое на 9 равно: " + f.format(result * 9));
                System.out.println("Число " + result + " умноженое на 10 равно: " + f.format(result * 10));
            }
        }
    }

    /**
     * Задача №6
     * *Написать программу, которая будет выполнять следующие действия:
     * *1. Ввод трех чисел с клавиатуры x, y, z
     * *2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
     * *3. Деление среднего арифметического на 2 без остатка
     * *4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
     */
    public static void task6() {
        int x = 0, y = 0, z = 0;
        System.out.println("Введите 3 числа друг за другом");
        try {
            x = Integer.parseInt(readFromConsole());
            y = Integer.parseInt(readFromConsole());
            z = Integer.parseInt(readFromConsole());
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
        }
        int sum = x + y + z;
        double average = (double) sum / 3;
        System.out.println(average / 2);
        System.out.println("Среднее арифметическое введеных чисел равно " + average);
        if ((average / 2) > 3) {
            System.out.println("Программа отработала корректно");
        }

    }

    /**
     * Задача №7
     * *Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
     * * В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры со значением констант
     * * и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
     * * Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
     */
    public static void task7() {
        final int x = 2, y = 3, z = 10;
        int number = 0;
        System.out.println("Введите число");
        try {
            number = Integer.parseInt(readFromConsole());
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
        }
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }

    /**
     * Задача №8
     * *Необходимо с помощью цикла вывести на экран числа от 1 до 50.
     */
    public static void task8() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + 1);
        }
    }

    /**
     * Задача №9
     * *Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
     * * Размер массива задается пользователем.
     */
    public static void task9() {
        int x = 0;
        int array[];
        boolean isArrayCreate = false;
        System.out.println("Введите необходимое кол-во элементов массива");
        while (!isArrayCreate) {
            try {
                x = Integer.parseInt(readFromConsole());
                isArrayCreate = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }
        }
        array = new int[x];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение элемента №" + (i + 1));
            try {
                array[i] = Integer.parseInt(readFromConsole());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
                i--;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * 2);
        }
    }

    /**
     * Задача №10
     * *Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
     * *Размерность матрицы задается пользователем.
     */
    public static void task10() {
        int x = 0, y = 0;
        int array[][];
        boolean isArrayCreate = false;
        while (!isArrayCreate) {
            try {
                System.out.println("Введите необходимое кол-во строк массива");
                x = Integer.parseInt(readFromConsole());
                System.out.println("Введите необходимое кол-во столбцов массива");
                y = Integer.parseInt(readFromConsole());
                isArrayCreate = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }
        }
        array = new int[x][y];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Введите значение для ячейки " + (i + 1) + "-" + (j + 1));
                try {
                    array[i][j] = Integer.parseInt(readFromConsole());
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число");
                    j--;
                }
            }
        }
        System.out.println("В первой строке массива содержаться: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][0] * 3 + ";");
        }
        System.out.println("\nУказаны числа с коэф *3");
    }

    public static String readFromConsole() {
        String result = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            result = bufferedReader.readLine();
        } catch (IOException | NullPointerException e) {
            System.out.println(e);
        }
        return result;
    }
}





