
public class ChangesAdapterImpl implements ChangesAdapter {
    private Changes exchangesMoney;

    public ChangesAdapterImpl(Changes exchangesMoney) {
        this.exchangesMoney = exchangesMoney;
    }

    @Override
    public double getDollar(int nilai) {
        Double money = exchangesMoney.getDollar();
        return convertMoneyDollar(money, nilai);
    }

    @Override
    public double getRinggit(int nilai) {
        Double money = exchangesMoney.getRinggit();
        return convertMoneyRinggit(money, nilai);
    }

    @Override
    public double getEuro(int nilai) {
        Double money = exchangesMoney.getEuro();
        return convertMoneyEuro(money, nilai);
    }

    private double convertMoneyDollar(double money, int nilai) {
        return nilai / money;
    }

    private double convertMoneyRinggit(double money, int nilai) {
        return nilai / money;
    }

    private double convertMoneyEuro(double money, int nilai) {
        return nilai / money;
    }
}
