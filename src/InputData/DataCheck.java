package InputData;

public class DataCheck {
    public boolean fullCheck(String[] inputList){
        if(checkSize(inputList)
           && checkDateFormat(inputList[3])
           && checkPhoneNumber(inputList[4])
           && checkSexFormat(inputList[5])){
            return true;
        }
        else return false;
    }

    private boolean checkSize(String[] inputList) {

        if (inputList.length == 6) return true;
        else {
            System.out.println("Количество введенных данных не соответствует требованиям");
            return false;
        }
    }
    private  boolean checkDateFormat(String date){
        String[] perm = date.split("\\.");
        if(perm.length == 3){
            if(perm[0].length() == 2 && perm[1].length() == 2 && perm[2].length() == 4){
                return true;
            }
            else {
                System.out.println("Введенная дата не соответствует формату дд.мм.гггг");
                return false;
            }
        }
        else {
            System.out.println("Введенно менее/более трех значений в дате");
            return false;
        }
    }
    private boolean checkPhoneNumber(String phoneNum){
        if(!phoneNum.contains("+") && !phoneNum.contains("-")){
            return true;
        }
        else {
            System.out.println("Введенный номер не должен содержать знаков + или -");
            return false;
        }
    }
    private boolean checkSexFormat(String sex){
        if(sex.equalsIgnoreCase("f") || sex.equalsIgnoreCase("m")){
            return true;
        }
        else{
            System.out.println("Ошибка в формате введенных данных относительно пола");
            return false;
        }
    }

}
