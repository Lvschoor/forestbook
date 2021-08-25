package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.HashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {

// Creating instance myForestLog that deals with observed plants and animals
        ForestNotebook myForestLog = new ForestNotebook();

// Creating two Sets of plants that form the diet of Herbivores and Omnivores
        Set<Plant> plantDiet1 = new HashSet<>();
        Set<Plant> plantDiet2 = new HashSet<>();

// Creating some observed plants and adding their properties
        Tree observedPlant1 = new Tree("Oak", 6.3);
        observedPlant1.setLeafType(LeafType.NEEDLE);

        Tree observedPlant2 = new Tree("Walnut", 12.4);
        observedPlant2.setLeafType(LeafType.HAND);

        Flower observedPlant3 = new Flower("Bluebell", 0.28);
        observedPlant3.setSmell(Scent.SWEET);

        Weed observedPlant4 = new Weed("Dandelion", 0.12);
        observedPlant4.setArea(4.2);

        Bush observedPlant5 = new Bush("Elderberry", 2.35);
        observedPlant5.setFruit("berries");
        observedPlant5.setLeafType(LeafType.HART);

// Adding the observed plants to myForestLog
        myForestLog.addPlant(observedPlant1);
        myForestLog.addPlant(observedPlant2);
        myForestLog.addPlant(observedPlant3);
        myForestLog.addPlant(observedPlant4);
        myForestLog.addPlant(observedPlant5);

// Adding some plants to the Sets of plantDiets
        plantDiet1.add(observedPlant4);
        plantDiet1.add(observedPlant3);
        plantDiet1.add(observedPlant1);
        plantDiet2.add(observedPlant2);
        plantDiet2.add(observedPlant3);

// Creating some observed animals and adding their properties
        Carnivore observedAnimal1 = new Carnivore("Lynx", 13.5, 58.5, 101.5);
        observedAnimal1.setMaxFoodSize(15);

        Carnivore observedAnimal2 = new Carnivore("Bear", 405, 100, 200);
        observedAnimal2.setMaxFoodSize(70);

        Carnivore observedAnimal3 = new Carnivore("Wolf", 60, 80, 120);
        observedAnimal3.setMaxFoodSize(20);

        Omnivore observedAnimal4 = new Omnivore("Raccoon", 7, 25, 50);
        observedAnimal4.setMaxFoodSize(10);
        observedAnimal4.setPlantDiet(plantDiet1);

        Omnivore observedAnimal5 = new Omnivore("Opossum", 5, 15, 25);
        observedAnimal5.setMaxFoodSize(7);
        observedAnimal5.setPlantDiet(plantDiet2);

        Omnivore observedAnimal6 = new Omnivore("Red Fox", 11, 22, 80);
        observedAnimal6.setMaxFoodSize(7);
        observedAnimal6.setPlantDiet(plantDiet1);

        Herbivore observedAnimal7 = new Herbivore("Squirrel", 0.3, 9, 35);
        observedAnimal7.setPlantDiet(plantDiet2);

        Herbivore observedAnimal8 = new Herbivore("Rabbit", 4.3, 20, 50);
        observedAnimal8.setPlantDiet(plantDiet1);

        Herbivore observedAnimal9 = new Herbivore("Deer", 50, 140, 150);
        observedAnimal9.setPlantDiet(plantDiet1);

// Adding the observed animals to myForestLog
        myForestLog.addAnimal(observedAnimal1);
        myForestLog.addAnimal(observedAnimal2);
        myForestLog.addAnimal(observedAnimal3);
        myForestLog.addAnimal(observedAnimal4);
        myForestLog.addAnimal(observedAnimal5);
        myForestLog.addAnimal(observedAnimal6);
        myForestLog.addAnimal(observedAnimal7);
        myForestLog.addAnimal(observedAnimal8);
        myForestLog.addAnimal(observedAnimal9);

// Print number of observed plants and animals to console
        System.out.println();
        System.out.println("Number of plants observed: " + myForestLog.getPlantCount());
        System.out.println("Number of animals observed: " + myForestLog.getAnimalCount());

// Print list of observed plants and animals to console
        System.out.println();
        System.out.println("List of observed plants and animals:");
        myForestLog.printNotebook();

// Print only the observed carnivores to console (names only)
        System.out.println();
        System.out.println("All carnivores observed:");
        for (Animal animal : myForestLog.getCarnivores()) {
            System.out.println(animal.getName());
        }

// Print only the observed omnivores to console (names only)
        System.out.println("All omnivores observed:");
        for (Animal animal : myForestLog.getOmnivores()) {
            System.out.println(animal.getName());
        }

// Print only the observed herbivores to console (names only)
        System.out.println("All herbivores observed:");
        for (Animal animal : myForestLog.getHerbivores()) {
            System.out.println(animal.getName());
        }

// Sort the respectively the animals and plants by name and print the sorted lists to the console
        myForestLog.sortAnimalsByName();
        myForestLog.sortPlantsByName();
        System.out.println();
        System.out.println("List of observed plants and animals, sorted by name:");
        myForestLog.printNotebook();

// Sort the respectively the animals and plants by height and print the sorted lists to the console
        myForestLog.sortAnimalsByHeight();
        myForestLog.sortPlantsByHeight();
        System.out.println();
        System.out.println("List of observed plants and animals, sorted by height:");
        myForestLog.printNotebook();

// Printing the diet of a herbivore to the console
        System.out.println();
        System.out.println("The plants that are  a part of the diet of " + observedAnimal8);
        observedAnimal8.printDiet();

// Adding a plant to the diet of a herbivore and printing the new diet to the console
        observedAnimal8.addPlantToDiet(observedPlant2);
        System.out.println("The new plant-diet of " + observedAnimal8 + " after adding an extra plant:");
        observedAnimal8.printDiet();
    }
}
