package zoo;

import zoo.radio.Sayable;

public class Dolphin extends  Marine_mammals implements SwimmingSpeed, Sayable {

    private  int swimmingSpeed = 50;


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public int getSpeedSwimming() {
        return this.swimmingSpeed;
    }

    @Override
    public String feed() {
        return "fish";
    }

    @Override
    public String say() {
        return null;
    }
}
