package InputData;

import java.util.ArrayList;

public class StringDivider {
    public ArrayList<String> divide(String userInput){
        ArrayList<String> result = new ArrayList<>();
        String[] list = userInput.split(" "); //фио др тел пол
        for(int i = 0; i < list.length; i++){
            result.add(list[i]);
        }
        return result;
    }
}
