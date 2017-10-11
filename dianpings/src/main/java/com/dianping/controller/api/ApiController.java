package com.dianping.controller.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController
{
    @RequestMapping(value = "/homead",method = RequestMethod.GET)
    public List<Ad> homead(){

        ObjectMapper mapper = new ObjectMapper();

        return null;
    }
}
