package presentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
//@Controller
public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("DAO","Metier");
        Imetier imetier = context.getBean(Imetier.class);
        System.out.println("RES="+imetier.calcul());
    }
}
