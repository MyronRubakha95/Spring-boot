package com.example.demo.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UUIDController {
    private UUIDService uuidService;

    @Autowired
    public UUIDController(UUIDService uuidService) {
        this.uuidService = uuidService;
    }

    @GetMapping("/uuid")
    public List<UUID> getUuidsList(@RequestParam("number") int size) {
        return uuidService.getUUID(size);
    }

}