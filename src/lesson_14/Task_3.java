package lesson_14;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        String[] strings={"fds","hhh",null,"hjjg","jggdd"};
        int idx =searchString(strings,"fd");
        System.out.println(idx);
        if ((idx>0))strings[idx]="New ";
        System.out.println(Arrays.toString(strings));
    }

   public static int searchString(String[] strings,String findMe){
       if (strings==null||findMe==null)return -1;
       for (int i=0;i<strings.length;i++){
          // if(strings[i]!=null&& strings[i].equals(findMe))return  i;
           if(strings[i]!=null&& strings[i].equalsIgnoreCase(findMe))return  i;

       }
       return -1;
   }

}
