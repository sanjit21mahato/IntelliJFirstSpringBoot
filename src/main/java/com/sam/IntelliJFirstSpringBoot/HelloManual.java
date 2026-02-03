package com.sam.IntelliJFirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloManual {

    @Autowired
    private  HelloService helloService;

    static void checkLengthAndPrint(List<String> stringList) {
        if(stringList != null) {
            stringList.forEach(s -> {
                var len = s.length();
                if(len >10){
                   System.out.println(s);
               } else if (len >5){
                   System.out.println(s);
               } else {
                   System.out.println(s);
               }
            });
        }
    }



    @GetMapping("/manual")
    public String helloManual() {

        String response = helloService.helloCall(String.valueOf("aa"));

        return response;
    }
}
