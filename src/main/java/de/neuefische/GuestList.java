package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class GuestList {

    private List<String> guests = new ArrayList<>();

    public List<String> getGuests() {
        return guests;
    }

    public void setGuests(List<String> guests) {
        this.guests = guests;
    }

    public String getGuestByName(String name) throws GuestNotFoundException {
        for (String g : guests) {
            if (g.equals(name)) {
                return g;
            }
        }
        throw new GuestNotFoundException("There is no Guest with the name: " + name);
    }


    public boolean addGuest(String name) {
        return guests.add(name);
    }
}
