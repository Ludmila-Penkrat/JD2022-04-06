package by.it.penkrat.jd01_13;

public class Util {

    static void showDetails(Class<?> aClass, RuntimeException e) {
        Class<? extends RuntimeException> exeptionClass = e.getClass();
        String name = exeptionClass.getName();
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            if(className.equals(aClass.getName())){
                int lineNumber = stackTraceElement.getLineNumber();
                System.out.printf("""
                         name: %s
                        class: %s
                         line: %d
                        """,name, className, lineNumber);
                break;
            }
        }
    }
}
