package by.it.penkrat.jd01_13;

import java.util.Scanner;

public class TaskB {

    public static final String COMMAND_END = "END";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            String element = scanner.nextLine();

            if (element.equalsIgnoreCase(COMMAND_END)) {
                break;
            }
            try {
                double number = Double.parseDouble(element);
                sum +=number;
                double sqrt = Math.sqrt(sum);
                if(Double.isNaN(sqrt))
                    throw new ArithmeticException();

                    System.out.println(sum + " sqrt = " + sqrt);

            } catch (NumberFormatException | ArithmeticException e) {
                Util.showDetails(TaskB.class, e);
            }
        }
    }
}

