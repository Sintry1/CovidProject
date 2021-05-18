package Covid19project.model.Lists;

import Covid19project.model.Data.TestCenter;

import java.beans.Statement;
import java.util.ArrayList;

public class CenterList {

    private ArrayList<TestCenter> centerList = new ArrayList<>();

    public CenterList(Statement statement) {

    }

    @Override
    public String toString() {
        return "CenterList{" +
                "centerList=" + centerList +
                '}';
    }

    public ArrayList<TestCenter> getCenterList() {
        return centerList;
    }
}
