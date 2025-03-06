package edu.miu.midterm;

import model.Patients;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println(List.of(new Patients("Patient1", "Lastname", "(641)-321-657", "email123@gmail.com", "15-04-1921"),
                new Patients("Patient2", "Lastname", "(641)-321-654", "email1233@gmail.com", "15-04-1921")));

    }
}