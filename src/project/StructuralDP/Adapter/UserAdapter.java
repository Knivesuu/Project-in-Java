package project.StructuralDP.Adapter;

public class UserAdapter extends UserInput implements User{
    private Animal animal;
    public UserAdapter(Animal animal){
        this.animal=animal;
        this.adaptData();
    }
    private void adaptData(){
        this.setAnimalname(animal.getAnimalname());
        this.setKingdombelong(animal.getKingdombelong());
        this.setOrganismtype(animal.getOrganismtype());

    }
}
