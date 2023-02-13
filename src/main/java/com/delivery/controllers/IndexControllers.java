package com.delivery.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IndexControllers {
    @RequestMapping(IndexController.PATH)
    @ResponseBody
    String getErrorPath();
}
