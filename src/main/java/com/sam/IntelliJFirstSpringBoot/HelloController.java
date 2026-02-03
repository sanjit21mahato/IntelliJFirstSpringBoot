package com.sam.IntelliJFirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;
    int aa =1;
    List<String> stringList = new ArrayList<String>(Arrays.asList("Sanjit", "Mahato", "Sam"));

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    @GetMapping ("/h")
    public String hello() {
        aa = 2;
        HelloManual.checkLengthAndPrint(stringList);
        String response = helloService.helloCall(String.valueOf(aa));
                aa = aa + 1;
        return response;
    }



    private static void checkLengthAndPrint(List<String> stringList) {
        if(stringList != null) {
            stringList.forEach(s -> {
                var length = s.length();
                if(length >10){
                   System.out.println(s);
               } else if (length >5){
                   System.out.println(s);
               } else {
                   System.out.println(s);
               }
            });
        }
    }


}
