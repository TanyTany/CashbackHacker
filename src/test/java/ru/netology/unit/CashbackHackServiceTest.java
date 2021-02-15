package ru.netology.unit;



import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldTestIfAmountMore1000() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(1500);
        int expected=500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestIfAmount1000() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(1000);
        int expected=0;
        assertEquals(actual, expected);
    }

}