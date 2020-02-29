package com.akinogrence;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/message")
public class MyController {

    Map<Integer,String> myMap = new HashMap<>();
    String messageText="start";
    @PostMapping
    public ResponseEntity<String> sentMessage(@RequestBody String messageText) {
         this.messageText=messageText;
        myMap.put(myMap.size()+1,messageText);
        return ResponseEntity.ok(messageText);
    }

    @GetMapping
    public ResponseEntity<Map<Integer,String>> showMessage() {
        return ResponseEntity.ok(myMap);
    }
}



