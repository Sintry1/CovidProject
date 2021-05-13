package Covid19project;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        BCryptPasswordEncoder encoder2 = new BCryptPasswordEncoder();
        String myPass = "2222";
        String encodePassword2 = encoder2.encode(myPass);
        System.out.println(encodePassword2);

    }


}
