import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задача №3
        System.out.println("Hello, world!");
        //Задача №4
        System.out.println(binarRead());
        //Задача №5
        multiplicationTable();
    }


    public static int binarRead() {
        boolean isBinary = false;
        String read = null;
        System.out.println("Введите бинарное число");
        while (!isBinary) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                read = bufferedReader.readLine();
                char[] readChar = read.toCharArray();
                for (int i = 0; i < readChar.length; i++) {
                    if ((readChar[i] == '0') || (readChar[i] == '1')) {
                        isBinary = true;
                    }
                }
                if (isBinary) {
                    System.out.println("Вы ввели бинарное число");
                    isBinary = true;
                } else {
                    System.out.println("Можно ввести только 0 и 1, ну бинарное же число все таки");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int result = Integer.parseInt(read, 2);
        return result;
    }

    public static void multiplicationTable() {
        boolean isNumeric = false;
        String read = null;
        int result =0;
        NumberFormat f = NumberFormat.getInstance(new Locale("ru", "RU"));
        System.out.println("Введите число");
        while (!isNumeric) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                result = Integer.parseInt(bufferedReader.readLine());
                isNumeric = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Вы ввели не число, попробуйте еще раз");
                isNumeric = false;
            }
            if(isNumeric) {
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
}



