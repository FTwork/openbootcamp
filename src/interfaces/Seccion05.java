package interfaces;

/**
 *
 * @author Franco Tallei
 */
public class Seccion05 {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {
        Coche auto = new Coche();
        cocheCrud.save(new Coche());
        cocheCrud.findAll();
        cocheCrud.delete(auto);
    }

}
