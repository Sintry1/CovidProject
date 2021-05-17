package Covid19project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class User {

        @Id
        //private int id;   // Not sure if we need ID , maybe cpr is enough
        @Column(name = "cpr")
        private int cpr;
        @Column(name = "userName")
        private String userName;
        @Column(name = "password")
        private int password;

        public User(){}

        public User(int cpr, String userName, int password){
            this.cpr = cpr;
            this.userName = userName;
            this.password = password;
        }


        /*public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
*/
        @javax.persistence.Id
        public int getCpr(){
            return cpr;
        }
        public void setCpr(int cpr){
            this.cpr = cpr;
        }

        public String getName(){  return userName; }
        public void setName(String userName){
            this.userName = userName;
        }

        public int getPassword(){
            return password;
        }
        public void setPassword(int password){
            this.password = password;
        }

    }


