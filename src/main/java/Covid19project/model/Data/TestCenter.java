package Covid19project.model.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TestCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int testCenterId;
    private String name;
    private Address adderss;
    private int addressid;


    @Override
    public String toString() {
        return "TestCenter{" +
                "name='" + name + '\'' +
                ", adderss=" + adderss +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdderss() {
        return adderss;
    }

    public void setAdderss(Address adderss) {
        this.adderss = adderss;
    }

    public TestCenter() {
    }

    public TestCenter(String name, Address adderss) {
        this.name = name;
        this.adderss = adderss;
    }
}
