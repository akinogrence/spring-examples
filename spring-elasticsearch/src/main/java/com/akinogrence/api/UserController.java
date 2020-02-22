package com.akinogrence.api;
import com.akinogrence.entity.User;
import com.akinogrence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;


@RequiredArgsConstructor //--> Constructor Yapılandırması Yapar!(Lombok)
@RestController
@RequestMapping("/user")
public class UserController {



    private final UserRepository userRepository;

    @PostConstruct
    public void init()
    {
        User user =new User();
        user.setName("Akin");
        user.setLastName("Ogrence");
        user.setAdress("TEST-ADRES-TURKEY");
        user.setBirthday(Calendar.getInstance().getTime());
        user.setId("k001");
        userRepository.save(user);

    }

    @GetMapping("/{searchParameter}")
    public ResponseEntity<List<User>> getUsers(@PathVariable String searchParameter) {
        List<User> users = userRepository.findByNameLikeOrLastNameLike(searchParameter,searchParameter);
        return ResponseEntity.ok(users);
    }


}
