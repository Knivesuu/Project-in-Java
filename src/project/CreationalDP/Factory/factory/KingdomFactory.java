package project.CreationalDP.Factory.factory;
import project.CreationalDP.Factory.kingdoms.*;
import project.CreationalDP.Factory.Kingdoms;


public class KingdomFactory {
    public static Kingdoms getKingdom(kingdomType kingdomType){

        switch (kingdomType){
            case ANIMALIA:
                return new Animalia("Eukarya","Mammals, Amphibians, Sponges, Worms, Insects","Sexual");
            case PLANTAE:
                return new Plantae("Eukarya","Thallophyta, Bryophyta, Pteridophyta, Gymnosperms, Angiosperms","Sexual or Asexual");
            case FUNGI:
                return new Fungi("Eukarya","Molds, Mushrooms, and Yeast","Sexual or Asexual through spore formation");
            case PROTISTA:
                return new Fungi("Eukarya","Amoeba, Algae, Euglena, and Slime molds","Asexual");
            case EUBACTERIA:
                return new Fungi("Bacteria","Bacteria, Cynobacteria, and Actinobacteria","Asexual");
            case ARCHAEBACTERIA:
                return new Fungi("Archaea","Methanogens, Halophiles, Thermophiles, and Psychrophiles","Asexual by Binary Fusion,budding, or fragmentation");

            default:
                break;
        }
        return null;
    }
}
