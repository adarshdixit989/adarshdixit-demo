package com.bankease.controller;
import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RestController; import java.util.Map;
@RestController public class HomeController {
 @GetMapping("/") public Map<String,String> home(){return Map.of("application","BankEase","status","UP","message","Banking Management System API is running","swagger","/swagger-ui/index.html","health","/actuator/health");}
}