package com.example.lmc.controller;

import com.example.lmc.exception.CustomException;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * @author lmc
 * @date 2020/7/31 23:48
 */
@RestController()
@RequestMapping("/test")
public class TestController {
    @GetMapping("/throwException")
    public void throwException() throws Exception {
        System.out.println("throwException");
        throw new Exception();
    }

    @GetMapping("/throwCustomException")
    public void throwCustomException() throws CustomException {
        throw new CustomException();
    }


    @GetMapping("/testParams")
    public void testParams(HttpServletRequest httpServletRequest) {
        Map map2 =  httpServletRequest.getParameterMap();

        Object obj = map2.get("kk");
        String[] aa = (String[])obj;
        System.out.println(aa[0]);

        Object obj2= map2.get("kkk");
        System.out.println(obj2);
        String[] bb = (String[])obj2;
        System.out.println(bb[0]);



    }


}
