package com.example.proj.pathern;

public class PersonVisitorJson implements Visitor {

    public String dispay(Person person) {
        return person.accept(this);
    };

    @Override
    public String dispayMedic(Medic medic) {
        return String.format(
                "{\n\"Medic\":{\n\"name\":\"%s\",\n\"specialization\":\"%s\"\n}\n}",
                medic.getName(),
                medic.getSpecialization()
        );
    }


    @Override
    public String dispayPacient(Pacient pacient) {
        return String.format(
                "{\"Pacient\":{\"name\":\"%s\",\"age\":%d,\"disease\":\"%s\",\"gender\":\"%s\"}}",
                pacient.getName(),
                pacient.getAge(),
                pacient.getGender(),
                pacient.getDiagnostic()
        );
    }



}


