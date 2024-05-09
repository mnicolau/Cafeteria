
package excafeteria;

import java.io.Serializable;

/**
 *
 * @author Marc
 */
public class TassaCafe implements Serializable {
    
    private int tempCafe;
    private Tassa tassa;

    public TassaCafe(int tempCafe) {
        this.tempCafe = tempCafe;
    }

    public int getTempCafe() {
        return tempCafe;
    }
    
    
}
