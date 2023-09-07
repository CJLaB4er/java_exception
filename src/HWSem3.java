import java.io.FileWriter;
import java.io.IOException;

public class HWSem3 {
    /*
        Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
    Фамилия Имя Отчество номертелефона

    Форматы данных:
    фамилия, имя, отчество - строки
    номертелефона - целое беззнаковое число без форматирования

    Ввод всех элементов через пробел

    Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
    вернуть код ошибки, обработать его и показать пользователю сообщение,
    что он ввел меньше и больше данных, чем требуется.

    Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
    Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
    Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
    пользователю выведено сообщение с информацией, что именно неверно.

    Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
    в него в одну строку должны записаться полученные данные, вида

    <Фамилия><Имя><Отчество><номер_телефона>

    Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

    Не забудьте закрыть соединение с файлом.

    При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
    пользователь должен увидеть стектрейс ошибки.
     */

    public static void main(String[] args) {
        System.out.println("Введите данные в одну строку:<Имя><Фамилия><Отчество><номер телефона>");
        String stringPersonData = MyInputClass.inputString();
        String[] personData = ParsData(stringPersonData);

        if (MyCheckClass.checkCodeError(personData)) {
            try {
                MyCheckClass.checkPhone(personData[3]);
                for (int i = 0; i < personData.length - 1; i++) {
                    MyCheckClass.checkName(personData[i]);
                }
                System.out.println("Введенные ФИО корректны.");
                writeToFile(personData);

            } catch (MyExceptionPhone e) {
                System.out.println(e.getMessage());
            } catch (MyExceptionNameFormat e) {
                System.out.println(e.getMessage() + "\"" + e.getCh() + "\" в слове \""
                        + e.getName() + "\", в индексе под номером " + e.getIndex() + ".");
            }
        }
        System.out.println("Программа завершена.");


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
            System.out.println("Данные успешно добавлены в файл " + filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Проблема с чтением / записью в файл " + filename);
        }
    }
}

