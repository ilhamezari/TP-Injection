package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Souris implements USB{
    @Override
    public int read() {
        System.out.println("Souris :");

        return (int) (Math.random()*10);
    }
}
