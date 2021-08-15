package Covid19project.Repository.AppointmentRepository;

import Covid19project.Model.Data.Appointment;

import java.util.List;

public interface IAppointmentRepo {

    //Create
    Appointment addAppointment(Appointment appointment);

    //READ
    List<Appointment> fetchAllAppts();

    Appointment findAppointmentById(int apptID);

    Appointment findAppointmentByCpr(Long cpr);

    //Update
    Appointment updateAppointment(int apptID, Appointment appointment);

    //Delete
    Boolean deleteAppointment(int apptID);



}
