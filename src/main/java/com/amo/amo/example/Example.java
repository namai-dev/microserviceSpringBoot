package com.amo.amo.example;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class Example {
    private final List<DataExample>examples;

    @RequestMapping(path = "/index")
    public ModelAndView modelAndView(){
       ModelAndView view = new ModelAndView("index");
       DataExample example = new DataExample(1, "james");
        DataExample example2 = new DataExample(2, "james4");
       examples.add(example);
       examples.add(example2);
       view.addObject("something", examples);
        return view;
    }





}
