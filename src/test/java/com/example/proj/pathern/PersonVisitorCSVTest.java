package com.example.proj.pathern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonVisitorCSVTest {

    @Test
    public void testDisplayMedic() {
        Medic medic = new Medic("Dr. House", "Diagnostician");
        PersonVisitorCSV visitor = new PersonVisitorCSV();
        String result = visitor.dispayMedic(medic);
        assertEquals("Medic: Dr. House, Diagnostician", result);
    }

    @Test
    public void testDisplayPacient(){
        Pacient pacient = new Pacient("John Doe", 30, "M", "Covid-19");
        PersonVisitorCSV visitor = new PersonVisitorCSV();
        String result = visitor.dispayPacient(pacient);
        assertEquals("Pacient: John Doe, 30, Covid-19, M", result);
    }
    
}
