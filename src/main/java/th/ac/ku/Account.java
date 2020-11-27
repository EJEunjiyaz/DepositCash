package th.ac.ku;

public class Account {
    private final boolean accountPermitStatus;

    public Account(boolean accountPermitStatus) {
        this.accountPermitStatus = accountPermitStatus;
    }

    public boolean isAccountPermitStatus() {
        return accountPermitStatus;
    }
}
