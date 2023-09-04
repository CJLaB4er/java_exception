import java.util.Scanner;

public class MyInputClass {
    public static Float inputFloat() throws MyExceptionFloat {
        System.out.println("\n������� ����� � ��������� ������ (������������ �������� �������)");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextFloat();
        } catch (Exception e) {
            throw new MyExceptionFloat("�������� �������� �� ����� ���� �������������� � ���� float");
        }
    }

    public static String inputString() throws MyExceptionEmptyString {
        System.out.println("������� ������");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty()) throw new MyExceptionEmptyString("�������� ������ ���� ������");
        return str;

    }
}