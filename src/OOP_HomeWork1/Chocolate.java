package OOP_HomeWork1;

import java.util.Date;

public class Chocolate extends Product {
    private Date expireDate = new Date();

    public Chocolate(String name, double cost, Date expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }
    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" годен до %s", expireDate.toString()));
        return localString.toString();
    }
}
