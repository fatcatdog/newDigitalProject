package com.payme.paymeApi.controller;

import com.payme.paymeApi.model.*;
import com.payme.paymeApi.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping(path="/api")
public class EditUserController {

    @Autowired
    private StorageService storageService;

//    public EditUserController(StorageService storageService) {
//        this.storageService = storageService;
//    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/changePhoto", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> changePhoto(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            storageService.store(file);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/changeShortBio")
    public ResponseEntity<?> changeShortBio(@RequestBody ShortBio shortBio){
        try {
            System.out.println("short bio: " + shortBio.getContent());
            return new ResponseEntity<>(new ApiResponse("changeShortBio", 200), HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/changeLongBio")
    public ResponseEntity<?> changeLongBio(@RequestBody LongBio longBio){
        try {
            System.out.println("short bio: " + longBio.getContent());
            return new ResponseEntity<>(new ApiResponse("changeLongBio", 200), HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/changeMediumsPrices")
    public ResponseEntity<?> changeMediumsPrices(@RequestBody MediumsEnabledPrices mediumsEnabledPrices){
        try {
            System.out.println(mediumsEnabledPrices.toString());
            return new ResponseEntity<>(new ApiResponse("changeMediumsPrices", 200), HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/changeDaysTimes")
    public ResponseEntity<?> changeDaysTimes(@RequestBody DayTimes dayTimes){
        try {
            System.out.println(dayTimes.toString());
            return new ResponseEntity<>(new ApiResponse("changeDaysTimes", 200), HttpStatus.OK);
        } catch(Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }




}
