package models;

import java.util.List;

public abstract class Animal {

    private final String idAnimal;
    private String speciesName;
    private String animalName;
    private float weight;
    private float height;
    private float width;
    private List<String> characteristics;

    public Animal(String idAnimal, String speciesName, String animalName, float weight, float height, float width, List<String> characteristics) {
        this.idAnimal = idAnimal;
        this.speciesName = speciesName;
        this.animalName = animalName;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.characteristics = characteristics;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public List<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
    }
}
