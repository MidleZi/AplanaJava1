package main.java.ru.zaychikovam.aplana.java1;

import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        //Задача №3
//        task3();
//        //Задача №4
//        task4();
//        //Задача №5
//        task5();
//        //Задача №6
//        task6();
//        //Задача №7
//        task7();
//        //Задача №8
//        task8();
//        //Задача №9
//        task9();
//        //Задача №10
//        task10();
//        //Задача №11
//        task11();
//        //Задача №12
//        task12();
//        //Задача №13
//        task13();
//        //Задача №14
//        task14();
//        //Задача №15
//        task15();
//        //Задача №16
//        task16();
//        //Задача №17
//        task17();
//        // Задача №18
 //       task18();
        // Итоговая задача №2
        taskResult2();

//        // Итоговая задача №3
//        taskResult3();

    }

    /**
     * Задача №3
     * *Перенесите скрипт в ваш файл программы и запустите созданную программу
     */
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
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[0][i] * 3 + ";");
        }
        System.out.println("\nУказаны числа с коэф *3");
    }

    /**
     * Задача №11
     * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
     */
    public static void task11() {
        System.out.println("Введите текст");
        String str = readFromConsole();
        System.out.println(str);
    }

    /**
     * Задача №12
     * Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
     */
    public static void task12() {
        System.out.println("Введите текст");
        String str = readFromConsole();
        System.out.println(str.replace(" ", ""));
    }

    /**
     * Задача№13
     * Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
     * Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
     */
    public static void task13() {
        System.out.println("Введите 2 строки");
        String str1 = readFromConsole();
        System.out.println("Введена первая строка");
        String str2 = readFromConsole();
        System.out.println("Введена вторая строка");

        if (str1.length() > str2.length()) {
            System.out.print("Первая строка длинее: ");
            System.out.println(str1);
        } else if (str1.length() < str2.length()) {
            System.out.print("Вторая строка длинее: ");
            System.out.println(str2);
        } else {
            System.out.println("Введенные строки равной длинны");
        }
    }

    /**
     * Задача №14
     * Необходимо написать программу, которая будет реализовывать следующие действия:
     * 1. Ввод числа с клавиатуры и запись его в строковую переменную S
     * 2. Конвертация строковой переменной S в числовую переменную X типа int
     * 3. Конвертация числа X типа int в число Y типа double
     * Все три числа разных типов необходимо в столбик вывести на экран
     */
    public static void task14() {
        System.out.println("Введитет число");
        String str = null;
        boolean isNumeric = false;
        int x = 0;
        double y = 0;
        while (!isNumeric) {
            try {
                str = readFromConsole();
                x = Integer.parseInt(str);
                isNumeric = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число, попробуйте еще раз");
            }
        }
        y = (double) x;
        System.out.println("Введеная строка в типе String: " + str);
        System.out.println("Введеная строка в типе int: " + x);
        System.out.println("Введеная строка в типе double: " + y);
    }

    /** Задача №15
     * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
     * Использовать пузырьковый метод сортировки.
     */
    public static void task15() {
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

        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    /** Задача №16
     * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
     */
    public static void task16() {
        String path = "src/main/resources/read.txt";
        try{
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    /** Задача №17
     * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
     * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
     * Пользователь при тестировании программы по правилу черного ящика должен понимать,
     * какой принцип остановки записи в файл он должен подать.
     */
    public static void task17() {
        String path = "src/main/resources/write.txt";
        String strLine = null;
        System.out.println("Чтобы остановить запись в файл, введите \"@stop\"");
        System.out.println("Чтобы записать в файл, введите текст");
        try (FileWriter fw = new FileWriter(path)){
            do {
                strLine = readFromConsole();
                if(strLine.equals("@stop")) { break; }
                strLine = strLine+"\r\n";
                fw.write(strLine);
                System.out.println(strLine);
            }
            while (strLine != null);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Запись остановлена");
    }

    /** Задача №18
     * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
     * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
     * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
     */

    public static void task18() {
        String path = "src/main/resources/read-write.txt";
        int strCount = 0;
        String strLine;
        try {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            System.out.println("Содержимое фала: \n");
            while ((strLine = br.readLine()) != null){
                System.out.println(strLine);
                strCount++;
            }
            br.close();
            FileOutputStream fos = new FileOutputStream(path);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            System.out.println("Чтобы записать в файл "  + strCount + " раз(а), введите текст");
            int count = strCount;
            for (int i = 0; i < strCount; i++) {
                strLine = readFromConsole();
                System.out.println("Вы ввели: " + strLine + "\nПишем в файл, осталось " + (count -1) + " строк");
                bw.write(strLine + "\r\n");
                count--;
            }
            bw.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    /** Итоговая задача №1
     * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
     * Необходимо использовать циклы, нельзя использования готовые методы языка Java,
     * для перевода числа из одной системы счисления в другую.
     */

    public static void taskResult1() {
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
    }

    /** Итоговая задача №2
     * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
     * Пользователь программы должен задавать размер массива и наполнять его числами.
     * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
     */
    public static void taskResult2() {
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

        int i, j, step;
        int tmp;
        for (step = array.length / 2; step > 0; step /= 2)
            for (i = step; i < array.length; i++)  {
                tmp = array[i];
                for (j = i; j >= step; j -= step)  {
                    if (tmp < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
             array[j] = tmp;
        }

        for (int c = 0; c < array.length; c++) {
            System.out.print(array[c] + "; " );
        }

    }

    /** Итоговая задача №3
     * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
     * Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
     * (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
     */
    public static void taskResult3() {
        System.out.println("Введите сумму в рублях");
        double courseRubOfDollars = 67.55;
        double dollars = 0;
        boolean isNumeric = false;
        while(!isNumeric) {
            try {
                String str = readFromConsole();
                double rubles = Double.parseDouble(str);
                dollars = rubles/courseRubOfDollars;
                isNumeric = true;
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели неправильную сумму, попробуйте еще раз");
            }

        }
        System.out.printf("%.2f", dollars);
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





