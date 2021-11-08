import java.util.Scanner;
import java.text.DecimalFormat;

public class AdapterPatternMoney {
    public int value;
    private static DecimalFormat decimalFormatter = new DecimalFormat("#.##");

    public static void main(String[] args) {
        // init money object
        int nilai;
        // sesssion 1 masukkan input
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah mata uang dalam bentuk rupiah:");
        nilai = input.nextInt();
        input.close();
        System.out.println("Jumlah mata uang Rp. " + nilai);

        // session2 1 dolar sama dengan 14.319 rupiah
        Movable dollarMoney = new Country();
        MovableAdapter dollarAdapter = new MovableAdapterImpl(dollarMoney);
        System.out.println("Harga dari Rp." + nilai + " Menjadi Dollar : USD. "
                + decimalFormatter.format(dollarAdapter.getDollar(nilai)));

        // session3 1 ringgit same dengan 3,446 rupiah
        Movable ringgitMoney = new Country();
        MovableAdapter ringgitAdapter = new MovableAdapterImpl(ringgitMoney);
        System.out.println("Harga dari Rp." + nilai + " Menjadi Ringgit : RM. "
                + decimalFormatter.format(ringgitAdapter.getRinggit(nilai)));

        // session4 1 euro same dengan 16,507 rupiah
        Movable euroMoney = new Country();
        MovableAdapter euroAdapter = new MovableAdapterImpl(euroMoney);
        System.out.println("Harga dari Rp." + nilai + " Menjadi Euro : EUR. "
                + decimalFormatter.format(euroAdapter.getEuro(nilai)));
    }

}
