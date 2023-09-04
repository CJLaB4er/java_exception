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
}