package Covid19project.Repository.TestCenterRepositiry;

import Covid19project.model.Data.TestCenter;
import Covid19project.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestCenterRepoImpl implements ITestCenterRepo{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public TestCenter addTestCenter(TestCenter testCenter) {
        return null;
    }

    @Override
    public List<TestCenter> fetchAllCenters() {
        String sql = "SELECT * FROM test_center";
        RowMapper<TestCenter> rowMapper = new BeanPropertyRowMapper<>(TestCenter.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public TestCenter findTestCenterById(int testCenterId) {
        return null;
    }

    @Override
    public TestCenter findTestCenterByName(String name) {
        return null;
    }

    @Override
    public User updateTestCenter(int testCenterId, TestCenter testCenter) {
        return null;
    }

    @Override
    public Boolean deleteTestCenter(int testCenterId) {
        return null;
    }
}
