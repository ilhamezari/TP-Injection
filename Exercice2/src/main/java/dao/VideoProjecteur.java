package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class VideoProjecteur implements VGA{
    @Override
    public void print(String message) {
        System.out.println("Vidéo projecteur :" +message);

    }
}
