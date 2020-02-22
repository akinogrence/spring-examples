package com.akinogrence.controller;

import java.util.List;
import javax.validation.Valid;

import com.akinogrence.dto.UserDto;
import com.akinogrence.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@Valid @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.save(userDto));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> showAll() {
        System.out.println("test");
        return ResponseEntity.ok(userService.getAll());
    }
}