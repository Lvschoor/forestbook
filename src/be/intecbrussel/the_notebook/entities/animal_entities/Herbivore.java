package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.HashSet;
import java.util.Set;

// Herbivore class built according given UML
public class Herbivore extends Animal{

    private Set<Plant> plantDiet=new HashSet<>();

// Unused constructor but in line with given UML
    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

// getPlantDiet returns a Set with the names of the plants that form the diet
    public Set<String> getPlantDiet() {
        Set<String> dietSet = new HashSet<>();
        for(Plant p : plantDiet){
            dietSet.add(p.getName());
        }
        return dietSet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);

    }

    public void printDiet(){
        plantDiet.forEach(plant -> System.out.println(plant.getName()));

    }

    @Override
    public String toString() {
        return "Animal: "+ getName() +" (height: "+getHeight()
                +"cm; length: "+getLength()+"cm; weight: "+getWeight()
                +"kg) of type herbivore with plant diet "+getPlantDiet() ;
    }
}
