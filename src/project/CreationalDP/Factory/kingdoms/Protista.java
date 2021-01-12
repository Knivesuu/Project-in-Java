package project.CreationalDP.Factory.kingdoms;
import project.CreationalDP.Factory.Kingdoms;

public class Protista extends Kingdoms {
    private String origin;
    private String organism;
    private String reprod;

    public Protista(String originType, String organismKinds, String reprodType){
        this.origin=originType;
        this.organism=organismKinds;
        this.reprod=reprodType;
    }
    @Override
    public String getDetails(){
        return "Protista: " + "Origin is " +this.origin+ " and Kinds of Organism are "+ this.organism +" and Reproduction Type/s: " + this.reprod;
    }

}
