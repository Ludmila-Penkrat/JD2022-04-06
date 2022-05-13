package by.it.penkrat.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    private static String[] words = {};
    private static char[] vowels = {'у','е','ы','а','о','э','я','и','ю','ё','У','Е','Ы','А','О','Э','Я','И','Ю','Ё'};
    private static char[] consonants = {'й','ц','к','н','г','ш','щ','з','х','ф','в','п','р','л','д','ж','ч','с','м','т','б','Й','Ц','К','Н','Г','Ш','Щ','З','Х','Ф','В','П','Р','Л','Д','Ж','Ч','С','М','Т','Б'};

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()){
            String word = matcher.group();
            checkCondition(word);
            printWords();

        }

    }

    private static void checkCondition(String word) {
        for (int i = 0; i < words.length; i++) {
            if ((word.charAt(0)==vowels[i]) && (word.charAt(word.length()-1) == consonants[i])){
                words = Arrays.copyOf(words, words.length+1);
                words[words.length]=word;
            }
        }
        }

    private static void printWords() {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s\n", words[i]);
        }

    }


}
