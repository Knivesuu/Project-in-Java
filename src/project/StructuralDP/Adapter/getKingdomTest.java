package project.StructuralDP.Adapter;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class getKingdomTest {
    @Test
    void CreateandReturnOrganism(){
        String kingdom = "Animalia";
        Animal animal = new Animal();
        animal.setKingdombelong(kingdom);
        assertEquals("Animalia",kingdom);

        assertTrue(animal.getKingdombelong().equals(kingdom));
    }

}