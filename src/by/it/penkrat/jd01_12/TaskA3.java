package by.it.penkrat.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {

    public static void main(String[] args) {

        String values = "99 -2 8 0 -4 1 -6 100 0 78077";
        //[1 2 5 7 8 0 0 -2 -4 -6]

        Scanner scanner = new Scanner(values);
        ArrayList<Integer> list = new ArrayList<>();
        int pozZero = 0;
        while (scanner.hasNext()){
            String value = scanner.next();
            if(!value.equals("end")){
                int i = Integer.parseInt(value);
                if(i<0){
                    list.add(i);
                }else if (i==0){
                    list.add(pozZero, i);
                } else {
                    list.add(pozZero++, i);
                }
            }else {
                break;
            }
        }
        System.out.println(list);
    }
}
