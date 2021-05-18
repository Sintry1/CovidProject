package Covid19project.model.Data;

public class TestCenter {

    private String name;
    private Address adderss;

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
