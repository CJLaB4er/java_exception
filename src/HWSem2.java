import java.util.Scanner;

public class HWSem2 {


    public static void main(String[] args) {
//        task1();

//        task2();

//        task3();

//        task4();


    }

    public static void task1() {

        /*
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение.Ввод текста вместо числа не должно приводить к падению приложения,
        вместо этого, необходимо повторно запросить у пользователя ввод данных.
         */

        try {
            float numb = MyInputClass.inputFloat();
            System.out.printf("Введённое вами значение = %.2f\nПрограмма завершена.\n", numb);
        } catch (MyExceptionFloat e) {
            System.out.println(e.getMessage() + "\nПовторите попытку.");
            task1();
        }
    }


    public static void task2() {
        try {
            int d = 0;
            double[] catchedRes1 = new double[8 / d];
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 237);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { //Throwable как класс-родитель должен отлавливаться последним
            System.out.println("Что-то пошло не так...");
        }

    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    public static void task4() {
        /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */

        try {
            System.out.println("Вы ввели: \"" + MyInputClass.inputString() + "\"");

        } catch (MyExceptionEmptyString e) {
            System.out.println(e.getMessage());
        }
    }

}