package com.example.proj.pathern;

public class PersonVisitorCSV implements Visitor {

    public String getCSV(Person person) {
        return person.accept(this);
    }

    @Override
    public String dispayMedic(Medic medic) {
        return "Medic: " + medic.getName() + ", " + medic.getSpecialization();
    }

    @Override
    public String dispayPacient(Pacient pacient) {
        return "Pacient: " + pacient.getName() + ", " + pacient.getAge() + ", " + pacient.getGender() + ", " + pacient.getDiagnostic();
    }
  
}
