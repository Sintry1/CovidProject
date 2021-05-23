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
    private int center_addressid;


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

    public int getTestCenterId() {
        return testCenterId;
    }

    public void setTestCenterId(int testCenterId) {
        this.testCenterId = testCenterId;
    }

    public int getCenterAddressid() {
        return center_addressid;
    }

    public void setCenterAddressid(int addressid) {
        this.center_addressid = addressid;
    }

    public TestCenter() {
    }

    public TestCenter(String name, Address adderss) {
        this.name = name;
        this.adderss = adderss;
    }
}
