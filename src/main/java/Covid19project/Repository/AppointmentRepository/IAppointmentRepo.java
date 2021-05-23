package Covid19project.Repository.AppointmentRepository;

import Covid19project.model.Data.Appointment;
import Covid19project.model.Data.User;

import java.util.List;

public interface IAppointmentRepo {

    //Create
    Appointment addAppointment(Appointment appointment);

    //READ
    List<Appointment> fetchAll();
    Appointment findAppointmentById(int apptId);

    Appointment findAppointmentByCpr(int cpr);

    //Update
    Appointment updateAppointment(int apptId, Appointment appointment);

    //Delete
    Boolean deleteAppointment(int apptId);



}
