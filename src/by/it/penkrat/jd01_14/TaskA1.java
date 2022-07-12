package by.it.penkrat.jd01_14;

import java.io.*;

public class TaskA1 {

    private static String dir (Class<?> cl){
        String path = System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        String clDir = cl.getName().replace(cl.getSimpleName(), "").replace(".", File.separator);
        return path+clDir;
    }

    public static void main(String[] args) {

        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dir(TaskA1.class)+ "dataTaskA.bin")));
            for (int i = 0; i<20; i++){
                dos.writeInt((int)((Math.random())*25));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (dos != null){
                try {
                    dos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(dir(TaskA1.class)+ "dataTaskA.bin")));
             PrintWriter out1 = new PrintWriter(new FileWriter(dir(TaskA1.class)+ "resultTaskA.txt"))
        ){

            double sum = 0;
            double counter =0;
            while (input.available()>0){
                int i = input.readInt();
                System.out.print(i + " ");
                out1.print(i + " ");
                sum=sum+i;
                counter++;
            }
            System.out.println("\navg = " + sum/counter);
            out1.println("\navg = " + sum/counter);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
