
package POO;

/**
 *
 * @author Franco Tallei
 */
public class SmartPhone extends SmartDevice {
    
String tipoPantalla;
boolean auriculares;

    public SmartPhone() {
    }

    public SmartPhone(String tipoPantalla, boolean auriculares, int capacidadBateria, double tamanio, String color) {
        super(capacidadBateria, tamanio, color);
        this.tipoPantalla = tipoPantalla;
        this.auriculares = auriculares;
    }





}
