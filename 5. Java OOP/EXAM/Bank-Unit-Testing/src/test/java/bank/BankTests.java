package bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTests {

    private Bank bank;
    private Client client;

    @Before
    public void setUp() {
        bank = new Bank("testBank", 1);
        client = new Client("Gesha");
    }

    @Test (expected = NullPointerException.class)
    public void whenBankNameIsNullThenException() {
        Bank newBank = new Bank(null, 1);
    }

    @Test (expected = NullPointerException.class)
    public void whenBankNameIsWhitespaceThenException() {
        Bank newBank = new Bank("   ", 1);
    }
    @Test (expected = NullPointerException.class)
    public void whenBankNameIsWhitespaceThenException1() {
        Bank newBank = new Bank(" ", 1);
    }
    @Test (expected = NullPointerException.class)
    public void whenBankNameIsWhitespaceThenException2() {
        Bank newBank = new Bank("", 1);
    }

    @Test
    public void returnsCorrectCapacity() {
        Assert.assertEquals(1, bank.getCapacity());
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenCapacityToBeSetIsLessThanZeroThrowsException() {
        Bank newBank = new Bank("DKB", -1);
    }

    @Test
    public void capacityCanBeZero() {
        Bank newBank = new Bank("DSK", 0);
    }

    @Test
    public void returnsCorrectSizeFromClientsList() {
        bank.addClient(client);
        Assert.assertEquals(1, bank.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenCapacityIsFullThrowsException() {
        bank.addClient(client);
        Client secondClient = new Client("Peter");
        bank.addClient(secondClient);
    }
// TODO maybe check if the correct client is added
    @Test
    public void addsClientToTheListSuccessfully() {
        Assert.assertEquals(0, bank.getCount());
        bank.addClient(client);
        Assert.assertEquals(1, bank.getCount());


    }

    @Test
    public void ifNameMatchesRemovesClient() {
        Assert.assertEquals(0, bank.getCount());
        bank.addClient(client);
        Assert.assertEquals(1, bank.getCount());
        bank.removeClient("Gesha");
        Assert.assertEquals(0, bank.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenClientToBeRemovedNotExistThrowsException() {
        bank.addClient(client);
        bank.removeClient("Napoleon");
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenClientDoesNotExistForLoanWithdrawThrowsException() {
        bank.addClient(client);
        bank.loanWithdrawal("Bonaparte");
    }

    @Test
    public void returnsClientIfExists() {
        bank.addClient(client);
       Client currentClient = bank.loanWithdrawal("Gesha");

       Assert.assertEquals(currentClient, client);
    }

    @Test
    public void returnsTheCorrectStatistics() {
       Bank dkb = new Bank("DKB", 5);
       Client client2 = new Client("Peter");
       Client client3 = new Client("Robert");
       dkb.addClient(client);
       dkb.addClient(client2);
       dkb.addClient(client3);

       String expected = "The client Gesha, Peter, Robert is at the DKB bank!";
       String result = dkb.statistics();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnsTheCorrectStatistics1() {
        bank.addClient(client);

        String expected = "The client Gesha is at the testBank bank!";
        String result = bank.statistics();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void returnsBankName () {
        String name = bank.getName();
        Assert.assertEquals("testBank", name);
    }


}
