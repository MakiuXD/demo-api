package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/")
    public String home() {
        return "Fin de la practica";
    }

    @GetMapping("/api/estado")
    public Map<String, String> estado() {
        Map<String, String> m = new HashMap<>();
        m.put("estado", "OK");
        m.put("mensaje", "Funciona");
        return m;
    }
}
