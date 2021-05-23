package Covid19project.model.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "auth_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_role_id")
    private int auth_role_id;

    @Column(name = "role_name")
    private String role_name;


    public int getRoleId() {
        return auth_role_id;
    }

    public void setRoleId(int roleId) {
        this.auth_role_id = roleId;
    }

    public String getRoleName() {
        return role_name;
    }

    public void setRoleName(String roleName) {
        this.role_name = roleName;
    }






}
