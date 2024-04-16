package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TimeNeededToBuyTicketsTest {

    private TimeNeededToBuyTickets solution = new TimeNeededToBuyTickets();

    @Test
    void timeRequiredToBuy() {
        assertEquals(6, solution.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
    }

    @Test
    void timeRequiredToBuy2() {
        assertEquals(8, solution.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));
    }

    @Test
    void timeRequiredToBuy3() {
        assertEquals(154, solution.timeRequiredToBuy(new int[]{84, 49, 5, 24, 70, 77, 87, 8}, 3));
    }
}