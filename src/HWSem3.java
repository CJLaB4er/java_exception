import java.io.FileWriter;
import java.io.IOException;

public class HWSem3 {
    /*
        �������� ����������, ������� ����� ����������� � ������������ ��������� ������, ����������� ��������:
    ������� ��� �������� �������������

    ������� ������:
    �������, ���, �������� - ������
    ������������� - ����� ����������� ����� ��� ��������������

    ���� ���� ��������� ����� ������

    ���������� ������ ��������� ��������� ������ �� ����������. ���� ���������� �� ��������� � ���������,
    ������� ��� ������, ���������� ��� � �������� ������������ ���������,
    ��� �� ���� ������ � ������ ������, ��� ���������.

    ���������� ������ ���������� ���������� ���������� �������� � �������� �� ��� ��������� ���������.
    ���� ������� ������ �� ���������, ����� ������� ����������, ��������������� ���� ��������.
    ����� ������������ ���������� ���� java � ������� ����. ���������� ������ ���� ��������� ����������,
    ������������ �������� ��������� � �����������, ��� ������ �������.

    ���� �� ������� � ���������� �����, ������ ��������� ���� � ���������, ������ �������,
    � ���� � ���� ������ ������ ���������� ���������� ������, ����

    <�������><���><��������><�����_��������>

    ������������ ������ ���������� � ���� � ��� �� ����, � ��������� ������.

    �� �������� ������� ���������� � ������.

    ��� ������������� �������� � �������-������� � ����, ���������� ������ ���� ��������� ����������,
    ������������ ������ ������� ��������� ������.
     */

    public static void main(String[] args) {
        System.out.println("������� ������ � ���� ������:<���><�������><��������><����� ��������>");
        String stringPersonData = MyInputClass.inputString();
        String[] personData = ParsData(stringPersonData);

        if (MyCheckClass.checkCodeError(personData)) {
            try {
                MyCheckClass.checkPhone(personData[3]);
                for (int i = 0; i < personData.length - 1; i++) {
                    MyCheckClass.checkName(personData[i]);
                }
                System.out.println("��������� ��� ���������.");
                writeToFile(personData);

            } catch (MyExceptionPhone e) {
                System.out.println(e.getMessage());
            } catch (MyExceptionNameFormat e) {
                System.out.println(e.getMessage() + "\"" + e.getCh() + "\" � ����� \""
                        + e.getName() + "\", � ������� ��� ������� " + e.getIndex() + ".");
            }
        }
        System.out.println("��������� ���������.");


    }

    public static String[] ParsData(String data) {
        return data.split(" ");
    }

    public static void writeToFile(String[] data) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : data) {
            stringBuilder.append("<");
            stringBuilder.append(str);
            stringBuilder.append(">");
        }

        stringBuilder.append("\n");
        String filename = data[0] + ".txt";

        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            fileWriter.write(stringBuilder.toString());
            System.out.println("������ ������� ��������� � ���� " + filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("�������� � ������� / ������� � ���� " + filename);
        }
    }
}

