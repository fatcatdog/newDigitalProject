package com.payme.paymeApi.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

@Service
public class StorageService {

    public void store(MultipartFile file) {
        System.out.println("Saved file successfully.... but not really....");
    }
}
