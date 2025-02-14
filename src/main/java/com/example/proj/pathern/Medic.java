package com.example.proj.pathern;

public class Medic implements Person {

    private String name;
    private String specialization;

    public Medic(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Medic() {
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.dispayMedic(this);
    }
    
}
