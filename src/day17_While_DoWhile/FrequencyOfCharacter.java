package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBCAASDAJGHFSDADIWEFDASJA";
        char ch = 'A';
        int frequency =0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='A')
                frequency++;
        }
        System.out.println(frequency);

    }
}
