package com.example.proj.pathern;

public class Pacient implements Person {

    private String name;
    private int age;
    private String diagnostic;
    private String gender;

    public Pacient(String name, int age, String diagnostic, String gender) {
        this.name = name;
        this.age = age;
        this.diagnostic = diagnostic;
        this.gender = gender;
    }

    public Pacient() {
    }


    @Override
    public String accept(Visitor visitor) {
        return visitor.dispayPacient(this);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
