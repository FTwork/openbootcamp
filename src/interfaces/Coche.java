
package interfaces;

/**
 *
 * @author Franco Tallei
 */
public class Coche {
    
String marca;
String modelo;
int cavallosFuerza;
String color;

public Coche(){
}

    public Coche(String marca, String modelo, int cavallosFuerza, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.cavallosFuerza = cavallosFuerza;
        this.color = color;
    }

}
