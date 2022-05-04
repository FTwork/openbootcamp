
package POO;

/**
 *
 * @author Franco Tallei
 */
public class SmartWatch extends SmartDevice {
    
boolean controlVoz;
boolean appStore;

    public SmartWatch() {
    }

    public SmartWatch(boolean controlVoz, boolean appStore, int capacidadBateria, double tamanio, String color) {
        super(capacidadBateria, tamanio, color);
        this.controlVoz = controlVoz;
        this.appStore = appStore;
    }







}
