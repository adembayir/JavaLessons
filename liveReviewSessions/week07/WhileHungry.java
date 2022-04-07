package week07;

public class WhileHungry {

    public static void main(String[] args) {

        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while (isHungry){
            bananas++;
            System.out.println("Eating a banana: "+bananas);
            if (bananas == countToFull)
            isHungry = false;
        }

        System.out.println("Had enough bananas, let's get back to study.");
        System.out.println("bananas = " + bananas);
    }
}
