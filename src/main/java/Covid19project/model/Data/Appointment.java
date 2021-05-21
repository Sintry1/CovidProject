package Covid19project.model.Data;

import javax.persistence.*;
import java.util.Date;

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private User cpr;
    private Date time;
    private Date date;

    @ManyToOne
    @JoinColumn(name="testCenterName", insertable = false, updatable = false)
    private TestCenter location;
    private String testCenterName;  // foreign key in table Appointments


    public Appointment() {
    }


    public Appointment(int id, Date time, Date date, TestCenter location, User cpr) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.location = location;
        this.cpr = cpr;
    }

    public User getCpr() {
        return cpr;
    }

    public void setCpr(User cpr) {
        this.cpr = cpr;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TestCenter getLocation() {
        return location;
    }

    public void setLocation(TestCenter location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "time=" + time +
                ", date=" + date +
                ", location=" + location +
                '}';
    }


}
