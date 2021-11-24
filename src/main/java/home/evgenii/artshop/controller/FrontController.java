package home.evgenii.artshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frontController")
public class FrontController {
    @GetMapping("/hello")
    public ResponseEntity<String> getString() {
        return new ResponseEntity<String>("String", HttpStatus.OK);
    }
 }
