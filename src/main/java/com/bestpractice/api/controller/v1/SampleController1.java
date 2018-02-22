package com.bestpractice.api.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class SampleController1 {

    @ResponseBody
    @GetMapping(value="sample")
    public Map<String, String> sample1() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "sample1");
        return map;
    }
}