package excafeteria;

/**
 *
 * @author Marc
 */
public class Client {

    public void beureCafe(TassaCafe tassa) throws TemperaturaException {
        if (tassa.getTempCafe() == 70) {
            throw new TemperaturaPerfectaException("Està perfecte!!");
        } else if (tassa.getTempCafe() <= 60) {
            throw new TemperaturaMassaFredException("Massa fred!!");
        } else if (tassa.getTempCafe() >= 85) {
            throw new TemperaturaMassaCalentException("Massa calent!!");
        }
        System.out.println("El cafè és molt bo!");
    }
}
