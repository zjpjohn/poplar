package com.dempe.poplar.example.anno;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2015/4/13
 * Time: 20:06
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    public static void main(String[] args) {
        Controller controller = new IndexController().getClass().getAnnotation(Controller.class);

    }
}