package project.StructuralDP.Adapter;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    void ClassifyKingdom() {
        String nameofAnimal = "Dog";
        Animal animal = new Animal();
        animal.setAnimalname(nameofAnimal);
        assertEquals("Dog", nameofAnimal);
        assertTrue(animal.getAnimalname().equals(nameofAnimal));
    }
}