package day19_LoopPractices;

public class IndexOfFDC {

    public static void main(String[] args) {

        String str = "cfmartdygafsdcrbmat";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if ( ch == str.charAt(j))
                    count++;
            }
            if (count > 1) {
                result = str.indexOf(ch);
                break;
            }
        }

        System.out.println(result);

        System.out.println("--------------------------------------");
        String result2 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }

            if (result2.contains(""+ch)){
                continue;
            }

            if (count == 2){
                result2 += ""+ch;
            }
        }

        System.out.println(result2);

        System.out.println("--------------------------------------");

        int result3 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if ( count == 1) {
                result3 = str.indexOf(ch);
                break;
            }
        }
        System.out.println(result3);

    }
}
/*
2. Write a program that can return the index number of the first duplicated
character from a string
3. Write a program that can display all the characters that appeared twice
in the string.
4. Write a program that can return the index number of the first unique character.
 */