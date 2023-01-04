
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = num1(str, index(str));
        int num1 = num2(str, index(str));
        System.out.println(num);
        System.out.println(num1);
    }

    public static int index(String str){
        if(str.indexOf('+') >= 0){
            return 0;
        }
        if(str.indexOf('-') >= 0){
            return 1;
        }
        if(str.indexOf('*') >= 0){
            return 2;
        }
        if(str.indexOf('/') >= 0){
            return 3;
        }
        return -1;
    }

    public static int num1(String str, int index){
        char[] a = {'+', '-', '*', '/'};    //npe index -1 при отсутствии символа
        return Integer.parseInt(str.substring(0, str.indexOf(a[index])));
    }

    public static int num2(String str, int index){
        char[] a = {'+', '-', '*', '/'};    //npe index -1 при отсутствии символа
        return Integer.parseInt(str.substring(str.indexOf(a[index]), str.length()));
    }
}