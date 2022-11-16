import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Switches mylight1 = new Switches();
        Switches mylight2 = new BlueLight();
        Switches mylight3 = new DimLight();
        Switches mylight4 = new BrightLight();
        mylight1.mode();
        mylight2.mode();
        mylight3.mode();
        mylight4.mode();
    }


}
