package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {
    @RequestMapping("")
    public void basic(){ log.info("basic.........."); }

    @RequestMapping(value="/basic", method = { RequestMethod.GET, RequestMethod.POST})
    public void basicGet(){ log.info("basic GET.........."); }

    @GetMapping("/basicOnlyGet")
    public void basicGet2() {
        log.info("basic....get only get....");}

    @PostMapping("/basicOnlyPost")
    public void basicPost() { log.info("b,asic....get only post....");}

//    @GetMapping("/ex01")
//    public String ex01(SampleDTO dto) { log.info(dto); return "ex01"}

    // 예시 URL:  http://localhost:8060/sample/ex02?data1=안녕&data2=13
    @GetMapping("/ex02")
    public void ex02(@RequestParam("data1") String name, @RequestParam("data2") int age){
        log.info("name: "+name);
        log.info("age: "+age);
    }


}
