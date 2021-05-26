package defenders;

import behaviours.IDefend;

public class Ogre implements IDefend {

    private int defendValue;

    public Ogre() {
        this.defendValue = 10;
    }

    public int defend(){
        return defendValue;
    }
}
