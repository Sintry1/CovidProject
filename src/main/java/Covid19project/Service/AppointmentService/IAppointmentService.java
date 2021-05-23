package Covid19project.Service.AppointmentService;

import Covid19project.model.Data.Appointment;

import java.util.List;

public interface IAppointmentService {
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
