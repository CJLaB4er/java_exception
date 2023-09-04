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
        ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float),
        � ���������� ��������� ��������.���� ������ ������ ����� �� ������ ��������� � ������� ����������,
        ������ �����, ���������� �������� ��������� � ������������ ���� ������.
         */

        try {
            float numb = MyInputClass.inputFloat();
            System.out.printf("�������� ���� �������� = %.2f\n��������� ���������.\n", numb);
        } catch (MyExceptionFloat e) {
            System.out.println(e.getMessage() + "\n��������� �������.");
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
            System.out.println("��������� �� ����� ��������� �� null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        } catch (Throwable ex) { //Throwable ��� �����-�������� ������ ������������� ���������
            System.out.println("���-�� ����� �� ���...");
        }

    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    public static void task4() {
        /*
        ������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������.
        ������������ ������ ���������� ���������, ��� ������ ������ ������� ������.
         */

        try {
            System.out.println("�� �����: \"" + MyInputClass.inputString() + "\"");

        } catch (MyExceptionEmptyString e) {
            System.out.println(e.getMessage());
        }
    }

}