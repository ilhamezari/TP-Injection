package Metier;

import dao.USB;
import dao.VGA;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UniteCentrale {

    private VGA vga;
    private USB usb;

    public UniteCentrale(VGA vga, USB usb) {
        this.vga = vga;
        this.usb = usb;
    }

    public int ReadData(){

        return usb.read();
    }

    public void PrintData(String data){
        vga.print(data);
    }
}
