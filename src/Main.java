
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Пример ввода: 1 + 2 (Цифра, пробел, арифметический оператор, пробел, цифра)");
        System.out.print("Введите выражение: ");
        String str = sc.nextLine();
        try {
            String[] strings = str.split(" ");
            int num1 = Integer.parseInt(strings[0]);
            int num2 = Integer.parseInt(strings[2]);
            calc(num1, num2, str);
        }catch (NumberFormatException e){
            System.out.println("Проблемы с вводом, повторите ввод!");
        }

    }

public static void calc(int num1, int num2, String str){
            boolean b1 = num1 <= 10 && num1 >= 1;
            boolean b2 = num2 <= 10 && num2 >= 1;
            if (b1 && b2) {
                if (str.indexOf('+') >= 0) {
                    System.out.println(num1 + num2);
                }
                if (str.indexOf('-') >= 0) {
                    System.out.println(num1 - num2);
                }
                if (str.indexOf('*') >= 0) {
                    System.out.println(num1 * num2);
                }
                if (str.indexOf('/') >= 0) {
                    System.out.println((num1 - (num1 % num2)) / num2);
                }
            } else {
                System.out.println("Проблемы с вводом, повторите ввод!");
            }
    }





}