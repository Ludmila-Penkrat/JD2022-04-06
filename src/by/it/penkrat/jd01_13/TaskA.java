package by.it.penkrat.jd01_13;

import java.util.HashMap;

public class TaskA {

    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        }catch (NumberFormatException | NullPointerException e){
            Util.showDetails(TaskA.class,e);
        }
    }
}
