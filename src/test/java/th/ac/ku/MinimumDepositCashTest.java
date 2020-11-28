package th.ac.ku;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinimumDepositCashTest {

    private Agent agent;

    @BeforeEach
    void init() {
        this.agent = new Agent();
    }

    @Test
    void deposit_Less_Than_Minimum_Deposit_Result_Should_Be_False() {
        float depositCash = 50;

        boolean actualResult = agent.checkMinimumDepositPerTransaction(depositCash);

        assertFalse(actualResult);
    }

    @Test
    void deposit_Equal_To_Minimum_Deposit_Result_Should_Be_True() {
        float depositCash = 100;

        boolean actualResult = agent.checkMinimumDepositPerTransaction(depositCash);

        assertTrue(actualResult);
    }

    @Test
    void deposit_Greater_Than_Minimum_Deposit_Result_Should_Be_True() {
        float depositCash = 2000;

        boolean actualResult = agent.checkMinimumDepositPerTransaction(depositCash);

        assertTrue(actualResult);
    }
}
