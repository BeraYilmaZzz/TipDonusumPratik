import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int value;
        double newvalue;

        System.out.print("1. Değeri giriniz = ");
        value = inp.nextInt();

        System.out.print("2. Değeri giriniz = ");
        newvalue = inp.nextDouble();

        int newvalue1 = (int) newvalue; // double'ı int'e dönüştür
        double newdouble = value ;
        System.out.println("1. Deper (double): "+ newdouble);
        System.out.println("1. Değer (int): " + value);
        System.out.println("2. Değer (double): " + newvalue);
        System.out.println("2. Değer (int): " + newvalue1);
    }
}