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

    public static String[] ParsData() {
        String[] data = inputString().split(" ");
        if (checkCountData(data) == 1) return data;
        if (checkCountData(data) == -1) {
            System.out.println("�������� ������ ������������");
        }
        if (checkCountData(data) == 0){
            System.out.println("������� ������ ������");
        }
        return null;

    }

    public static int checkCountData(String[] data) {
        if (data.length < 4) return -1;
        return data.length == 4 ? 1 : 0;
    }
}