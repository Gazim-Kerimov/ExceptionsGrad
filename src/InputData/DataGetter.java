package InputData;

import ExportData.FileManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataGetter {
    private static DataGetter instance = null;
    private BufferedReader bufferedReader;
    private StringDivider stringDivider;
    private DataCheck checker;
    private DataGetter(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        stringDivider = new StringDivider();
        checker = new DataCheck();
    }

    public static DataGetter getInstance() {
        if(instance == null) instance = new DataGetter();
        return instance;
    }

    public void start() throws IOException {
        System.out.println("Введите через пробел следующие данные:" +
                "\nФамилия Имя Отчетство\nДата рождения в формате дд.мм.гггг." +
                "\nНомер телефона без знаков\nПол в формате m - мужской, f - женский\n" +
                "Для выхода из программы введите слово \"Выход\": ");
        String userIn;
        while (true) {
            userIn = bufferedReader.readLine();
            if(userIn.equalsIgnoreCase("выход"))break;
            if(checker.fullCheck(userIn.split(" "))){
                ArrayList<String> userData = stringDivider.divide(userIn);
                FileManager.getInstance().exportData(userData);
                System.out.println("Данные успешно записаны в файл!");
                continue;
            }
            else System.out.println("Введите данные в полном объеме снова:");
        }

    }

}
