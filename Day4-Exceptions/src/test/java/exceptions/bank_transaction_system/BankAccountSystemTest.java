package exceptions.bank_transaction_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountSystemTest {

    BankAccountSystem bank = new BankAccountSystem(500);

    @Test
    void Test1(){
        assertThrows(InsufficientBalanceException.class, ()-> bank.withdraw(900));
    }

    @Test
    void Test2(){
        assertThrows(IllegalArgumentException.class, ()-> bank.deposit(-80));
    }

    @Test
    void Test3(){
        assertEquals(200, bank.withdraw(300));
    }
}
