package Presentation;

import Metier.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres_Spring_XML {
    public static void main(String[] args) {
        ApplicationContext springcontext = new ClassPathXmlApplicationContext("config.xml");
        UniteCentrale uc = springcontext.getBean(UniteCentrale.class);
        uc.PrintData("Start with XML version");
        System.out.println(uc.ReadData());
    }
}
