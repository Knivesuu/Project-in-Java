package project.StructuralDP.Adapter;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetOrganismTest {
    @Test
    void CreateandReturnOrganism(){
        String OrganismType = "Mammal";
        Animal animal = new Animal();
        animal.setOrganismtype(OrganismType);
        assertEquals("Mammal",OrganismType);

        assertTrue(animal.getOrganismtype().equals(OrganismType));
    }

}