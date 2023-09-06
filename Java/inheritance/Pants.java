package inheritance;

/**
 * Pants
 */
public class Pants extends Product {
    private int waist;
    private int length;

    public int getWaist() {
        return this.waist;
    }
    public int getLength() {
        return this.length;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }
    public void setLength(int length) {
        this.length = length;
    }
}