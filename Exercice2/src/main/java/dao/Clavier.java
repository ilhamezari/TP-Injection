package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Primary
public class Clavier implements USB {

    @Override
    public int read() {

            System.out.println("Clavier :");

            return (int) (Math.random()*10);

    }
}
