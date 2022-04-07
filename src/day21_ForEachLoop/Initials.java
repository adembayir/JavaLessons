package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] classMates = {"Korhan Vapur", "Samet Kara", "Savaş Altun", "Yasin Değer", "Yusuf Batur", "Abdullah Yılmaz",
        "Kemal Aslan", "Yahya Tarih", "Alperen Gürel", "Erhan Feyzullah"};

        for (String each : classMates){
            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}
