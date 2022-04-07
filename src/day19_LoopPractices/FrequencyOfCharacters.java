package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    freq++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += freq;

        }
        System.out.println(result);
    }
}
