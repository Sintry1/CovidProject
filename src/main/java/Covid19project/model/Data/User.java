package Covid19project.model.Data;



import javax.persistence.Id;
import java.util.Date;

public class User {

    @Id
    private int cpr;
    private String firstName;
    private String surname;
    private String email;
    private String password;
    private Date dateOfBirth;
    private Address address;

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




    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


}
