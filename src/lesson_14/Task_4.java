package lesson_14;

public class Task_4 {
    public static void main(String[] args) {

      String string="P";
        String str=substringToUpperCase(string);
        System.out.println(str);

    }
    public static String substringToUpperCase(String string){
        if (string==null)return "";
        String result="";
        if (string.length()>1){
            char char2=string.charAt(1);
            result+=char2;

        }

        return result;

      //  if (string.length()>2) {
         //   char char3=string.charAt(2);
           // result+=char3;

        }
       // result==result.isEmpty()?:result;
      //  return result.toLowerCase();
    }


