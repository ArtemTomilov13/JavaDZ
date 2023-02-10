package Homework6;

public class NoteBook {
    String hdd;
    String ram;
    int id;
    String manufacture;
    String model;
    String processor;

    @Override
    public String toString() {
        return String.format("%s %s %s %s", manufacture, model, ram, processor);
    }

    public String getModel() {
        return model;
    }
}

