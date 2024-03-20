package com.scaler.onotoonemapping;

import com.scaler.onotoonemapping.entity.Gender;
import com.scaler.onotoonemapping.entity.User;
import com.scaler.onotoonemapping.entity.UserProfile;
import com.scaler.onotoonemapping.repository.UserProfileRepository;
import com.scaler.onotoonemapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class OnetoOneMappingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OnetoOneMappingApplication.class, args);
    }
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;
    @Override
    public void run(String... args) throws Exception {
        //user Oject
        User user =new User();
        user.setName("Ramesh");
        user.setEmail("ramesh@gmail.com");

        UserProfile userProfile =new UserProfile();
        userProfile.setAddress("Delhi");
        userProfile.setGender(Gender.MALE);
        userProfile.setPhoneNumber("48516844712");
        userProfile.setBirthOfDate(LocalDate.of(1995,10,05));

        user.setUserProfile(userProfile);
      //  userProfile.setUser(user);

        userRepository.save(user);
    }
}
