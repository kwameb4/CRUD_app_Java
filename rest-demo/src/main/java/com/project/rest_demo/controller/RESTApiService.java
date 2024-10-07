package com.project.rest_demo.controller;

import com.project.rest_demo.model.RestAPI;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restAPI")
public class RESTApiService {

    RestAPI obj1;


    @GetMapping("{vendorID}")
    public RestAPI getRESTAPIDetails(String vendorID)
    {
        return obj1;
        //return new RestAPI("v1","Google","1575 Thieriot", "233444");

    }
    @PostMapping
    public String createRestAPIdetails(@RequestBody RestAPI obj1){
        this.obj1 = obj1;
        return "successfully created";
    }

    @PutMapping
    public String updateRestAPIdetails(@RequestBody RestAPI obj1){
        this.obj1 = obj1;
        return "successfully updated";
    }

    @DeleteMapping("{vendorID}")
    public String deleteRestAPIdetails(String vendorID){
        this.obj1 = null;
        return "successfully deleted";
    }

}
