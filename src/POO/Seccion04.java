package POO;

/**
 *
 * @author Franco Tallei
 */
public class Seccion04 {

    public static void main(String[] args) {
        System.out.println("Caracteristicas de un SmartDevice:");
        SmartDevice smartDevice = new SmartDevice(5000, 32, "negro");
        System.out.println(smartDevice.capacidadBateria);
        System.out.println(smartDevice.color);
        System.out.println(smartDevice.tamanio);
        System.out.println("Caracteristicas de un SmartPhone:");
        SmartPhone smartDevice2 = new SmartPhone("OLED", false, 5000, 6, "blanco");
        System.out.println(smartDevice2.capacidadBateria);
        System.out.println(smartDevice2.auriculares);
        System.out.println(smartDevice2.color);
        System.out.println(smartDevice2.tamanio);
        System.out.println(smartDevice2.tipoPantalla);
        System.out.println("Caracteristicas de un SmartWatch:");
        SmartWatch smartDevice3 = new SmartWatch(true, true, 10000, 56.5, "negro");
        System.out.println(smartDevice3.appStore);
        System.out.println(smartDevice3.capacidadBateria);
        System.out.println(smartDevice3.controlVoz);
        System.out.println(smartDevice3.color);
        System.out.println(smartDevice3.tamanio);

    }

}
