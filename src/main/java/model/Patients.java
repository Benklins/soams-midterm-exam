package model;

public class Patients {

    private String firstname;

    private String lastname;

    private String contactPhone;

    private String email;

    private String dateOfBirth;

    public Patients(String firstname, String lastname, String contactPhone, String email, String dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactPhone = contactPhone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}
