import java.util.Scanner;
import java.text.DecimalFormat;

public class AdapterPatternMoney {
        private static DecimalFormat decimalFormatter = new DecimalFormat("#.##");

        public static void main(String[] args) {
                // init money object
                int nilai;
                // 1 masukkan input
                Scanner input = new Scanner(System.in);
                System.out.println("Masukan jumlah mata uang dalam bentuk rupiah:");
                nilai = input.nextInt();
                input.close();
                System.out.println("Jumlah mata uang Rp. " + nilai);

                // 1 dolar sama dengan 14.319 rupiah
                Changes dollarMoney = new Country();
                ChangesAdapter dollarAdapter = new ChangesAdapterImpl(dollarMoney);
                System.out.println("Harga dari Rp." + nilai + " Menjadi Dollar : USD. "
                                + decimalFormatter.format(dollarAdapter.getDollar(nilai)));

                // 1 ringgit same dengan 3,446 rupiah
                Changes ringgitMoney = new Country();
                ChangesAdapter ringgitAdapter = new ChangesAdapterImpl(ringgitMoney);
                System.out.println("Harga dari Rp." + nilai + " Menjadi Ringgit : RM. "
                                + decimalFormatter.format(ringgitAdapter.getRinggit(nilai)));

                // 1 euro same dengan 16,507 rupiah
                Changes euroMoney = new Country();
                ChangesAdapter euroAdapter = new ChangesAdapterImpl(euroMoney);
                System.out.println("Harga dari Rp." + nilai + " Menjadi Euro : EUR. "
                                + decimalFormatter.format(euroAdapter.getEuro(nilai)));
        }

}
