package by.it.penkrat.jd01_14;

import java.io.File;

public class Util {


    public static String getPath(Class<?> aClass, String fileName) {

        String root = System.getProperty(TaskA.USER_DIR);
        String name = aClass.getName();
        String replace = name
                .replace(aClass.getSimpleName(), "")
                .replace(".", File.separator);

        String fullPath = root + File.separator + "src" + File.separator + replace;
        return  fullPath + fileName;
    }
}
