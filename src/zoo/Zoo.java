package zoo;

import zoo.radio.Radio;
import zoo.radio.Sayable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Animal> animals, Sayable sayableObj) {
        this.radio = sayableObj;
        animalList.addAll(animals);

    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void addAnimal(List<Animal> animals) {
        animalList.addAll(animals);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            sayableList.add(animal);
        }
        sayableList.add(this.radio);
        return sayableList;
    }


    public List<SwimmingSpeed> getSwimmingList() {
        List<SwimmingSpeed> swimmingSpeedList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof SwimmingSpeed) {
                swimmingSpeedList.add((SwimmingSpeed) animal);
            }
        }
        return swimmingSpeedList;
    }


    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public Animal getRunChampion() {
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners) {
            if (champion.getSpeedRun() < r.getSpeedRun()) {
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlightChampion() {
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable r : flyers) {
            if (champion.getSpeedFlyable() < r.getSpeedFlyable()) {
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getSwimmingChampion() {
        List<SwimmingSpeed> swimming = getSwimmingList();
        SwimmingSpeed champion = swimming.get(0);
        for (SwimmingSpeed r : swimming) {
            if (champion.getSpeedSwimming() < r.getSpeedSwimming()) {
                champion = r;
            }
        }
        return (Animal) champion;


    }
}



