package Covid19project.model.Data;



import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    @Id
    private int cpr;
    private String firstName;
    private String surname;
    private String email;
    private String password;
    private Date dateOfBirth;
    private String status;

    @ManyToOne
    @JoinColumn(name="addressid", insertable = false, updatable = false)
    private Address address;
    private int addressid; // foreign key in table User

    public User(int cpr, String firstName, String surname, String email, String password, Date dateOfBirth, String status, Address address, int addressid) {
        this.cpr = cpr;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.address = address;
        this.addressid = addressid;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", CPR=" + cpr +
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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
        return cpr;
    }
    public void setCPR(int CPR) {
        this.cpr = CPR;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    private List<Role> roles;

}