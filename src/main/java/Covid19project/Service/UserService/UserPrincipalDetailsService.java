/*
package Covid19project.Service;

import Covid19project.Repository.UserRepository.UserRepository;
import Covid19project.model.Data.User;
import Covid19project.springSecurity.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class UserPrincipalDetailsService implements UserDetailsService {


    private UserRepository userRepository;

    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String firstName) throws UsernameNotFoundException {
        User user = userRepository.getUserByName(firstName);
        if(user == null){
            throw new UsernameNotFoundException("Could not find user with than name");
        }


        return new UserPrincipal(user);
    }
}
*/
