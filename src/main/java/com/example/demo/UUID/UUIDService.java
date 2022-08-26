package com.example.demo.UUID;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UUIDService {

    public List<UUID> uuids = new ArrayList<>();

    public List<UUID> getUUID(int uuid) {
        for (int i = 0; i < uuid; i++) {
            uuids.add(UUID.randomUUID());
        }
        return uuids;
    }
}