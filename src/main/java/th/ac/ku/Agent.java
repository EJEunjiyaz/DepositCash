package th.ac.ku;

public class Agent {

    private final float limitedTransaction;
    private final float limitedDepositPerDay;
    private final float minimumDepositPerTransaction;
    private float totalDepositCash = 0;

    public Agent() {
        limitedTransaction = 30000;
        limitedDepositPerDay = 50000;
        minimumDepositPerTransaction = 100;
    }

    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= limitedTransaction;
    }

    public void deposit(float depositCash) {
        totalDepositCash += depositCash;
    }

    public boolean checkDepositPerDay() {
        return totalDepositCash <= limitedDepositPerDay;
    }

    public boolean checkMinimumDepositPerTransaction(float depositCash) {
        return depositCash >= minimumDepositPerTransaction;
    }
}
