package OOP_HomeWork4.shields;

public class Armor implements  Shield{

    @Override
    public int damage() {
        return 10;
    }
    @Override
    public  int protection() {
        return 70;
    }

}
