package excafeteria;

/**
 *
 * @author Marc
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servirClient(new TassaCafe(77), new Client());
    }

    static void servirClient(TassaCafe tassa, Client client) {
        try { 
            client.beureCafe(tassa);
        } catch (TemperaturaException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
