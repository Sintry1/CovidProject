package Covid19project.model.Data;

import java.util.Date;

public class Appointment {

    private int appointmentId;
    private Date time;
    private Date date;
    private TestCenter location;

    public Appointment(Date time, Date date, TestCenter location) {
        this.time = time;
        this.date = date;
        this.location = location;
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

    public Appointment() {
    }
}
