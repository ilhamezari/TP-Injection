package presentation;

import Metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpring {
    public static void main(String[] args) {
        ApplicationContext springcontext = new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = springcontext.getBean(Imetier.class);
        System.out.println("RES = "+metier.calcul());
    }
}
