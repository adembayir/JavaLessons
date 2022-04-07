package week10;

public class R02_DifferenceBetween {

    public static void main(String[] args) {

        int[] arr = { 12, 65, 112, 78, 54};

        System.out.println(differenceBetween(arr));
    }

    public static int differenceBetween(int[] arr){

        int max = arr[0];
        for (int each : arr) {
            if(each > max){
                max = each;
            }
        }

        int min = arr[0];
        for (int each : arr) {
            if(each < min){
                min = each;
            }
        }
        return max-min;
    }
}
