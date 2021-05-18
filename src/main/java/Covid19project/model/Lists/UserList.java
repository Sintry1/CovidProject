package Covid19project.model.Lists;

import Covid19project.model.Data.User;

import java.beans.Statement;
import java.util.ArrayList;

public class UserList {

    private ArrayList<User> userList = new ArrayList<>();

    @Override
    public String toString() {
        return "UserList{" +
                "userList=" + userList +
                '}';
    }

    public UserList(Statement statement) {

    }

    public ArrayList<User> getUserList() {
        return userList;
    }
}
