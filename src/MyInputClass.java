import java.util.Scanner;

public class MyInputClass {
    public static Float inputFloat() throws MyExceptionFloat {
        System.out.println("\n¬ведите число с плавающей точкой (разделителем €вл€етс€ зап€та€)");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextFloat();
        } catch (Exception e) {
            throw new MyExceptionFloat("¬ведЄнное значение не может быть преобразованно к типу float");
        }
    }

    public static String inputString() throws MyExceptionEmptyString {
        System.out.println("¬ведите сторку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.isEmpty()) throw new MyExceptionEmptyString("¬ведЄнна€ строка была пустой");
        return str;

    }

    public static String[] ParsData() {
        String[] data = inputString().split(" ");
        if (checkCountData(data) == 1) return data;
        if (checkCountData(data) == -1) {
            System.out.println("¬ведЄнных данных недостаточно");
        }
        if (checkCountData(data) == 0){
            System.out.println("¬ведены лишние данные");
        }
        return null;

    }

    public static int checkCountData(String[] data) {
        if (data.length < 4) return -1;
        return data.length == 4 ? 1 : 0;
    }
}