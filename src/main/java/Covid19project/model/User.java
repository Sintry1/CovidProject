package Covid19project.model;

public class User {

        private int id;   // Not sure if we need ID , maybe cpr is enough
        private int cpr;
        private String name;
        private int phone;

        public User(){}

        public User(int id, int cpr, String name, int phone){
            this.id = id;
            this.cpr = cpr;
            this.name = name;
            this.phone = phone;
        }

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }

        public int getCpr(){
            return cpr;
        }
        public void setCpr(int cpr){
            this.cpr = cpr;
        }

        public String getName(){  return name; }
        public void setName(String name){
            this.name = name;
        }

        public int getPhone(){
            return phone;
        }
        public void setPhone(int phone){
            this.phone = phone;
        }

    }


