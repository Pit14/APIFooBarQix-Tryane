package com.thomas.edgar.controller;

import com.thomas.edgar.Constants;
import com.thomas.edgar.foobarqix.FooBarQix;
import com.thomas.edgar.model.FooBarQixDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for the FooBarQix object.
 * Here we map the API url
 */
@CrossOrigin(origins = Constants.origins)
@RestController
public class FooBarQixController {

    /**
     * To get the FooBarQix of a given input
     * @param input the number you want to compute with the FooBarQix
     * @return The result of FooBarQix implementation
     */
    @GetMapping("/foobarqix/{input}")
    public FooBarQixDto getFooBarQix(@PathVariable(value = "input") String input){
        return new FooBarQixDto(input,FooBarQix.compute(input));
    }

}
