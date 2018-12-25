package module1week4;

import module1week4.StrategyGame.*;

public class StrategyGameAppMain {
    public static void main(String[] args) {

        Human human = new Human("Bobita", 50, 20, 2, 3);
        Monster monster = new Monster("Grinch", 50, 20, 4, 7);
        Animal animal = new Animal("Huston", 10, 5, 1);
        Animal anotherAnimal = new Animal("Grey", 10, 9, 9);  // testing too far logic

        Artifacts healthArtifact = Artifacts.HEALTH;
        healthArtifact.setLocation(1,1);
        Artifacts energyArtifact = Artifacts.ENERGY;
        energyArtifact.setLocation(1, 0);

        System.out.println("Let the hunt begin!");

        human.attack(animal);
        monster.attack(human);
        human.attack(monster);
        human.attack(anotherAnimal);                // testing too far logic
        human.attack(animal);                       // testing not enough health points logic
        human.attack(monster);
        human.attack(monster);
        human.attack(monster);                      // testing not enough energy points logic
        human.receivedArtifact(energyArtifact);
        human.attack(monster);
        monster.attack(human);
        human.receivedArtifact(healthArtifact);

        System.out.println(" ");

        human.displayInfo();
        monster.displayInfo();
        animal.displayInfo();
        anotherAnimal.displayInfo();

    }
}
