package day21_ForEachLoop;

public class ReversedNames {

    public static void main(String[] args) {

        String[] classMates = {"Korhan Vapur", "Samet Kara", "Savaş Altun", "Yasin Değer", "Yusuf Batur", "Abdullah Yılmaz",
        "Kemal Aslan", "Yahya Tarih", "Alperen Gürel", "Erhan Feyzullah"};

        for (String each : classMates) {
            String reversed ="";

            for (int i = each.length()-1; i >= 0; i--) {
                reversed += each.charAt(i);

            }
            System.out.println(reversed);
        }
    }
}
