package Covid19project.model.Data;

import org.graalvm.compiler.nodes.memory.Access;

import java.util.Date;

public class User {

    public enum AccessLevel{
        BASIC, SECRETARY, ADMIN
    }

    private String firstName;
    private String surname;
    private String email;
    private Date dateOfBirth;
    private int CPR;
    private AccessLevel accessLevel;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", CPR=" + CPR +
                ", accessLevel=" + accessLevel +
                ", address=" + address +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User() {
    }

    public User(String firstName, String surname, String email, Date dateOfBirth, int CPR, AccessLevel accessLevel, Address address) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.CPR = CPR;
        this.accessLevel = accessLevel;
        this.address = address;
    }
}
