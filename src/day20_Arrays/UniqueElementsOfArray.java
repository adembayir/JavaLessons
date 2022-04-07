package day20_Arrays;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Python", "C#", "Java", "Python", "C#", "Adem", "Eda"};
        // String uniqueElements = "";

        for (int i = 0; i < words.length; i++) {

            String element = words[i];
            int frequency = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[j].equals(element)){
                    frequency++;
                }

            }

            if (frequency == 2){
                System.out.println(element);// uniqueElements += element+", ";
            }

        }

    }
}
