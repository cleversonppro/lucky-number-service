package com.luckynumber.controller;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.luckynumber.generator.LuckyNumberGenerator;

@RestController
@RequestMapping(LuckyNumberController.LUCKY_NUMBER)
public class LuckyNumberController {
    protected static final String LUCKY_NUMBER = "/lucky-number";
    protected static final String GENERATOR_ENDPOINT = "/generator/{size}";

    @GetMapping(GENERATOR_ENDPOINT)
    @ResponseStatus(HttpStatus.OK)
    public Set<Integer> generator(@PathVariable final Integer size) {
        return LuckyNumberGenerator.generate(size);
    }

}
