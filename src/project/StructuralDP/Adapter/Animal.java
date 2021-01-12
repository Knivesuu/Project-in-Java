package project.StructuralDP.Adapter;

public class Animal {
    private String animalname;
    private String kingdombelong;
    private String organismtype;

    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public String getKingdombelong() {
        return kingdombelong;
    }

    public void setKingdombelong(String kingdombelong) {
        this.kingdombelong = kingdombelong;
    }

    public String getOrganismtype() {
        return organismtype;
    }

    public void setOrganismtype(String organismtype) {
        this.organismtype = organismtype;
    }





    @Override
    public String toString() {
        return "Animal{" +
                "animalname='" + animalname + '\'' +
                ", kingdombelong='" + kingdombelong + '\'' +
                ", organismtype='" + organismtype + '\'' +
                '}';
    }
}
