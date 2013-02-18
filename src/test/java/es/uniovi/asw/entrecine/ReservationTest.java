package es.uniovi.asw.entrecine;

import org.junit.*;

import static org.fest.assertions.Assertions.*;

public class ReservationTest {

    @Test 
    public void priceSingleCheck() {
        Reservation r = new Reservation(1, 2);
        assertThat(r.price()).isEqualTo(2);
    }

    @Test 
    public void priceTwoCheck() {
        Reservation r = new Reservation(2, 2.5);
        assertThat(r.price()).isEqualTo(5);
    }

}
