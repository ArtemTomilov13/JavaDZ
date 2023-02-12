package OOP_HomeWork1;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(2023, 1, 25)));

        machine.addProduct(new Chocolate("Alpen Gold", 99, new Date(2022, 6, 26)));
        machine.addProduct(new Chocolate("Ritter Sport", 150, new Date(2022, 8, 12)));
        machine.addProduct(new Chocolate("Merci", 130, new Date(2022, 3, 19)));

        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);
    }
}