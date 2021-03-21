package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfAmountLessThanBoundary() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfAmountBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfAmountMoreThanBoundary() {
        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfAmountZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}