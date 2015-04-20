package com.dempe.poplar.core.example;



import com.dempe.poplar.core.support.Controller;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2015/4/10
 * Time: 21:45
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DemoController {

    @Inject
    private DemoService demoService;

    public void greet() {
        demoService.greet();

    }

    public static void main(String[] args) {
        new DemoController().greet();
    }
}
