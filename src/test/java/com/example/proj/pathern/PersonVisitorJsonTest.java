package com.example.proj.pathern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonVisitorJsonTest {
    

    @Test
    public void testDisplayMedic() {
        Medic medic = new Medic("Dr. House", "Diagnostician");
        PersonVisitorJson visitor = new PersonVisitorJson();
        String result = visitor.dispayMedic(medic);
        assertEquals("{\n\"Medic\":{\n\"name\":\"Dr. House\",\n\"specialization\":\"Diagnostician\"\n}\n}", result);
    }

    @Test
    public void testDisplayPacient(){
        Pacient pacient = new Pacient("John Doe", 30, "M", "Covid-19");
        PersonVisitorJson visitor = new PersonVisitorJson();
        String result = visitor.dispayPacient(pacient);
        assertEquals("{\"Pacient\":{\"name\":\"John Doe\",\"age\":30,\"disease\":\"Covid-19\",\"gender\":\"M\"}}", result);
    }
}
