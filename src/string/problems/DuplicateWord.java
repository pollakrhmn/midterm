package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count = 0;

        st = st.toLowerCase();

        String words[] = st.split(" ");

        System.out.println("Duplicate Words: ");

        for (int i = 0; i < words.length; i++) {

            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";


                }


            }


            if (count > 1 && words[i] != "0")
                System.out.print(words[i] + ", ");

        }


        for (int i = 0; i < words.length; i++) {

            if (words.equals(words[i]))
                count++;


        }
        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] word = str.split(" ");
        Map<String, Integer> num = new HashMap<>();
        for(String w : word) {
            if(num.get(w) == null)
                num.put(w,1);
            else
                num.put(w, num.get(w)+1);

        }
        System.out.println("\n\nNumber of occurences: ");
        System.out.println(num);

    }
}

