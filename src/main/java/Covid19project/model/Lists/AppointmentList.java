package Covid19project.model.Lists;

import Covid19project.model.Data.Appointment;

import java.beans.Statement;
import java.util.ArrayList;

public class AppointmentList {

    private ArrayList<Appointment> apptList = new ArrayList<>();

    @Override
    public String toString() {
        return "AppointmentList{" +
                "apptList=" + apptList +
                '}';
    }

    public AppointmentList(Statement statement) {

    }

    public ArrayList<Appointment> getApptList() {
        return apptList;
    }
}
