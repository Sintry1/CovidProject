package Covid19project.Service.TestCenterService;

import Covid19project.Repository.TestCenterRepositiry.ITestCenterRepo;
import Covid19project.model.Data.TestCenter;
import Covid19project.model.Data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCenterServiceImpl implements ITestCenterService{
    @Autowired
    ITestCenterRepo iTestCenterRepo;

    @Override
    public TestCenter addTestCenter(TestCenter testCenter) {
        return null;
    }

    @Override
    public List<TestCenter> fetchAllCenters() {
        return iTestCenterRepo.fetchAllCenters();
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
