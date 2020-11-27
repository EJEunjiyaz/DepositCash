package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DepositCashTest {

    @Test
    void deposit_Less_Than_30000_Result_Should_Be_True() {
        float depositCash = 5000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertTrue(actualResult);
    }

    @Test
    void deposit_30000_Result_Should_Be_True() {
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertTrue(actualResult);
    }

    @Test
    void deposit_Greater_Than_30000_Result_Should_Be_False() {
        float depositCash = 35000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertFalse(actualResult);
    }

    @Test
    void deposit_Two_Times_Less_Than_50000_Result_Should_Be_True() {
        float depositCash1 = 20000.00f;
        float depositCash2 = 15000.00f;
        Agent agent = new Agent();

        agent.deposit(depositCash1);
        agent.deposit(depositCash2);
        boolean lessThanOrEqual30000depositCash1 = agent.checkDepositPerTransaction(depositCash1);
        boolean lessThanOrEqual30000depositCash2 = agent.checkDepositPerTransaction(depositCash2);
        boolean lessThanOrEqual50000depositCashEachDay = agent.checkDepositPerDay();

        assertTrue(lessThanOrEqual30000depositCash1);
        assertTrue(lessThanOrEqual30000depositCash2);
        assertTrue(lessThanOrEqual50000depositCashEachDay);
    }

    @Test
    void deposit_Two_Times_Less_Than_50000_Result_Should_Be_False() {
        float depositCash1 = 1000.00f;
        float depositCash2 = 30001.00f;
        Agent agent = new Agent();

        agent.deposit(depositCash1);
        agent.deposit(depositCash2);
        boolean lessThanOrEqual30000depositCash1 = agent.checkDepositPerTransaction(depositCash1);
        boolean lessThanOrEqual30000depositCash2 = agent.checkDepositPerTransaction(depositCash2);
        boolean lessThanOrEqual50000depositCashEachDay = agent.checkDepositPerDay();

        assertTrue(lessThanOrEqual30000depositCash1);
        assertFalse(lessThanOrEqual30000depositCash2);
        assertTrue(lessThanOrEqual50000depositCashEachDay);
    }

    @Test
    void deposit_Two_Times_50000_Result_Should_Be_True() {
        float depositCash1 = 20000.00f;
        float depositCash2 = 30000.00f;
        Agent agent = new Agent();

        agent.deposit(depositCash1);
        agent.deposit(depositCash2);
        boolean lessThanOrEqual30000depositCash1 = agent.checkDepositPerTransaction(depositCash1);
        boolean lessThanOrEqual30000depositCash2 = agent.checkDepositPerTransaction(depositCash2);
        boolean lessThanOrEqual50000depositCashEachDay = agent.checkDepositPerDay();

        assertTrue(lessThanOrEqual30000depositCash1);
        assertTrue(lessThanOrEqual30000depositCash2);
        assertTrue(lessThanOrEqual50000depositCashEachDay);
    }

    @Test
    void deposit_Two_Times_Greater_Than_50000_Result_Should_Be_False() {
        float depositCash1 = 27000.00f;
        float depositCash2 = 28000.00f;
        Agent agent = new Agent();

        agent.deposit(depositCash1);
        agent.deposit(depositCash2);
        boolean lessThanOrEqual30000depositCash1 = agent.checkDepositPerTransaction(depositCash1);
        boolean lessThanOrEqual30000depositCash2 = agent.checkDepositPerTransaction(depositCash2);
        boolean lessThanOrEqual50000depositCashEachDay = agent.checkDepositPerDay();

        assertTrue(lessThanOrEqual30000depositCash1);
        assertTrue(lessThanOrEqual30000depositCash2);
        assertFalse(lessThanOrEqual50000depositCashEachDay);
    }
}
