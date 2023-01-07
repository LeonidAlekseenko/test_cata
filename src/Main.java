
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException{
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arrStr = text.split(" ");

        try {
            calc(arrStr, Integer.parseInt(arrStr[0]), Integer.parseInt(arrStr[2]));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недапустимое количество символов или отсутствует арифметический оператор");

        } catch (NumberFormatException e) {
            System.out.println("Формат ввода: цифра, пробел, цифра");
        }

    }

    public static void calc(String[] str, int a, int b) throws MyException {
        if (a < 10 && a > 1 || b < 10 && b > 1 ) {
            if (str[1].equals("+")) {
                System.out.println(a + b);
            } else if (str[1].equals("-")) {
                System.out.println(a - b);
            } else if (str[1].equals("*")) {
                System.out.println(a * b);
            } else if (str[1].equals("/")) {
                System.out.println((a - (a % b)) / b);
            } else {
                System.out.println("Повторите ввод");
            }
        } else {
            throw new MyException("Ввод только от 1 до 10");
        }
    }




}