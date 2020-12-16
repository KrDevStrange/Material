package com.project.web.controller.restApi;

import com.project.web.entity.userInfoDto;
import com.project.web.repository.UserSelectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
@RestController
@RequestMapping(path = "/api")
public class userLogin {
    //차후 service 분리, proxy패턴 적용, DTO분리
    @Autowired
    private UserSelectRepository userSelectRepository;

    public userLogin( UserSelectRepository userSelectRepository ) {
        this.userSelectRepository = userSelectRepository;
    }

    @PostMapping(path = "/singIn")
    public userInfoDto listAll() {
        Optional<userInfoDto> test = userSelectRepository.findAll().stream().findFirst();
        return test.isPresent() ? null : test.get();
    }
}
