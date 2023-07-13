package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially(){
        //GIVEN
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of());
        //WHEN
        List<String> actual= guestList.getGuests();
        //THEN
        assertEquals(List.of(), actual);
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore(){
        //GIVEN
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Karl", "Ute"));
        //WHEN
        List<String> actual= guestList.getGuests();
        //THEN
        assertEquals(List.of("Karl", "Ute"), actual);
    }

    @Test
    void getGuestByName(){
        //GIVEN
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Karl", "Ute"));
        //WHEN//THEN
        try {
            guestList.getGuestByName("Stephan");
            fail();
        }catch (GuestNotFoundException e){
            assertTrue(true);
        }

    }

    @Test
    void addGuest(){
        //GIVEN
        GuestList guestList = new GuestList();
        //WHEN
        boolean actual = guestList.addGuest("Stephan");
        //THEN
        assertTrue(actual);
        assertEquals(List.of("Stephan"), guestList.getGuests());
    }
}