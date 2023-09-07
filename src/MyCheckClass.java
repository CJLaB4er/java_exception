public class MyCheckClass {

    public static int checkCountData(String[] data) {
        if (data.length < 4) return -1;
        return data.length == 4 ? 1 : 0;
    }

    public static void checkPhone(String phone) throws MyExceptionPhone {
        try {
            Integer.parseInt(phone);
            System.out.println("����� �������� ���������.");
        } catch (Exception e) {
            throw new MyExceptionPhone("����� �������� �������� ������������ �������, ������ ���� ������ �����.");
        }
    }

    public static void checkName(String name) throws MyExceptionNameFormat {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                throw new MyExceptionNameFormat("������������ ������ ", name, name.charAt(i), i);
            }
        }


    }


    public static boolean checkCodeError(String[] data) {
        switch (MyCheckClass.checkCountData(data)) {
            case (-1):
                System.out.println("������� ������������ ������");
                return false;
            case (0):
                System.out.println("���������� ������ ������, ��� �����");
                return false;
            case (1):
                System.out.println("���������� ������ ���������");
                return true;
            default:
                System.out.println("������ ���������� ����������");
                return false;
        }
    }


}
