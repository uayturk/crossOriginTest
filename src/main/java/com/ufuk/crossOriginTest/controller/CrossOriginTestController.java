package com.ufuk.crossOriginTest.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrossOriginTestController {

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String summary(ModelMap modelMap) throws IOException {
    return "crossOriginTest";

  }


}
