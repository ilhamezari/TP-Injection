package Presentation;

import Metier.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres_Spring_Annotation {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","Metier");
        UniteCentrale uc = context.getBean(UniteCentrale.class);
        uc.PrintData("Start with annotaion version");
        System.out.println(uc.ReadData());
    }
}
