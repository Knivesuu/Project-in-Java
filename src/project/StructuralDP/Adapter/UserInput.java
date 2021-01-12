package project.StructuralDP.Adapter;

public class UserInput implements User{
    private String animalname;
    private String kingdombelong;
    private String organismtype;

    @Override
    public String getAnimalname() {
        return animalname;
    }
    public void setAnimalname(String animalname){
        this.animalname = animalname;
    }

    @Override
    public String getKingdombelong() {

        return kingdombelong;
    }
    public void setKingdombelong(String kingdombelong){

        this.kingdombelong = kingdombelong;
    }

    @Override
    public String getOrganismtype() {

        return organismtype;
    }
    public void setOrganismtype(String organismtype){

        this.organismtype = organismtype;
    }

}
