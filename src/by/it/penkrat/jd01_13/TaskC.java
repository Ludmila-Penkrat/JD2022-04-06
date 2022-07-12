package by.it.penkrat.jd01_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskC {

    static List<Double> list = new ArrayList<>();
    static Scanner scanner;
    static int errorCount = 0;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try {
            readData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void readData() throws InterruptedException {

        while (scanner.hasNext()) {
            String element = scanner.nextLine();
            try {
                double number = Double.parseDouble(element);
                list.add(number);


            } catch (NumberFormatException e) {

                if(errorCount < 4) {
                    Thread.sleep(100);
                    Util.showDetails(TaskC.class, e);
                    errorCount++;
                }else {
                    Collections.reverse(list);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + " ");

                    }
                    throw new InterruptedException();
                }
            }
        }
    }
}
