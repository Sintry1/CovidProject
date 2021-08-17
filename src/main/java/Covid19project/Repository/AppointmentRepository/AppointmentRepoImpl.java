package Covid19project.Repository.AppointmentRepository;

import Covid19project.Model.Data.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AppointmentRepoImpl implements IAppointmentRepo{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Appointment addAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointment(testCenterId, cprOfUser, time, date) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, appointment.getTestCenterId(), appointment.getCprOfUser(), appointment.getTime(), appointment.getDate());
        return null;
    }

    @Override
    public List<Appointment> fetchAllAppts() {
        String sql = "SELECT * FROM appointment";
        RowMapper<Appointment> rm = new BeanPropertyRowMapper<>(Appointment.class);
        return jdbcTemplate.query(sql, rm);
    }

    @Override
    public Appointment findAppointmentById(int apptID) {
        String sql = "SELECT * FROM appointment WHERE apptID=?";
        RowMapper<Appointment> rowMapper = new BeanPropertyRowMapper<>(Appointment.class);
        Appointment myAppointment = jdbcTemplate.queryForObject(sql, rowMapper, apptID);
        return myAppointment;
    }

    @Override
    public List<Appointment> findAppointmentByCpr(Long cpr) {
        String sql = "SELECT * FROM appointment WHERE cprOfUser=?";
        RowMapper<Appointment> rowMapper = new BeanPropertyRowMapper<>(Appointment.class);
        List<Appointment> myAppointment = jdbcTemplate.query(sql, rowMapper, cpr);
        return myAppointment;
    }



    @Override
    public Appointment updateAppointment(int apptID, Appointment appointment) {
        String sql = "UPDATE appointment SET apptID=?, testCenterId=?, cprOfUser=?, time=?, date=? WHERE apptID=?";
        jdbcTemplate.update(sql, appointment.getApptId() ,appointment.getTestCenterId(), appointment.getCprOfUser() ,appointment.getTime(), appointment.getDate(), apptID);

        return null;
    }

    @Override
    public Boolean deleteAppointment(int apptID) {
        String sql = "DELETE FROM appointment WHERE apptID=?";
        return jdbcTemplate.update(sql,apptID) >= 0;
    }
}
