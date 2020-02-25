package com.akinogrence.controller;

import com.akinogrence.entity.SampleObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/SampleApi")
@Api(value = "SampleApi")
public class SampleController {



    private List<SampleObject> sampleObjectList = new ArrayList<>();

  /*  @PostConstruct
    public void init()
    {
        SampleObject mySampleObject = new SampleObject();
        mySampleObject.setId(1L);
        mySampleObject.setObjectName("My Sample Object");
        mySampleObject.setObjectDescription("This Object is example Because Of SWAGGER2 Impl.");
        mySampleObject.setIsAlive(false);
        sampleObjectList.add(mySampleObject);
    }
   */

  @ApiOperation(value = "saveMethod" , notes ="For Save Object")
    @PostMapping
    public @ApiResponse(code =200,message = "returned the saved object.") ResponseEntity<SampleObject> save(@RequestBody @ApiParam(value = "This is Post Api's Parameter") SampleObject sampleObject) {

        sampleObjectList.add(sampleObject);
        return ResponseEntity.ok(sampleObject);
    }

    @ApiOperation(value = "showAllMethod" , notes ="For Show All Object")
    @GetMapping
    public @ApiResponse(code =200,message = "returned the all object.") ResponseEntity<List<SampleObject>> showAll() {

        return  ResponseEntity.ok(sampleObjectList);
    }


}
