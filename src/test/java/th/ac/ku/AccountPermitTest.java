package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountPermitTest {

    @Test
    void account_Permit_Status_Should_Be_True() {
        Account account = new Account(true);

        assertTrue(account.isAccountPermitStatus());
    }

    @Test
    void account_Permit_Status_Should_Be_False() {
        Account account = new Account(false);

        assertFalse(account.isAccountPermitStatus());
    }
}
