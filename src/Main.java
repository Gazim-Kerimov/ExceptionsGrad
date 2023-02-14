import ExportData.FileManager;
import InputData.DataGetter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataGetter.getInstance().start();
    }
}
