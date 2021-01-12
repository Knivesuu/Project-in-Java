package project;
import project.CreationalDP.Factory.Kingdoms;
import project.CreationalDP.Factory.factory.*;
import project.CreationalDP.Factory.factory.kingdomType;
import project.StructuralDP.Adapter.*;
import project.BehavioralDP.*;
import java.util.Scanner;

//APPLY factory-----> Adapter ------> Iterator

public class Main {

    public static void main(String[] args) {

        //INSTRUCTIONS FOR USER
        System.out.println("\r\nYou can record and view information of Kingdoms.\r\n" +
                        "Record in different organisms and classify them within their respective Kingdoms.\r\n");

        System.out.println("            Information about Kingdoms");
        System.out.println("            Record and classify an organism!");
        System.out.println("            Check out collection of organisms\r\n");
        System.out.println("1 for Information about Kingdoms");
        System.out.println("2 to record the organism");
        System.out.println("3 to see Collection of organism");

        //USER INPUT ---- SCANNER
        Scanner firstpass = new Scanner(System.in);
        System.out.println("Enter Number of your choice: ");
        int first = firstpass.nextInt();

        //Apply Factory Method here to show information of Specific Kingdom
        if (first == 1) {
            Kingdoms Plantae = KingdomFactory.getKingdom(kingdomType.PLANTAE);
            Kingdoms Animalia = KingdomFactory.getKingdom(kingdomType.ANIMALIA);
            Kingdoms Fungi = KingdomFactory.getKingdom(kingdomType.FUNGI);
            Kingdoms Protista = KingdomFactory.getKingdom(kingdomType.PROTISTA);
            Kingdoms Eubacteria = KingdomFactory.getKingdom(kingdomType.EUBACTERIA);
            Kingdoms Archaebacteria = KingdomFactory.getKingdom(kingdomType.ARCHAEBACTERIA);
            //ANIMALIA INFORMATION
            System.out.println(Animalia.getDetails());
            //PLANTAE INFORMATION
            System.out.println(Plantae.getDetails());
            //FUNGI INFORMATION
            System.out.println(Fungi.getDetails());
            //PROTISTA INFORMATION
            System.out.println(Protista.getDetails());
            //EUBACTERIA INFORMATION
            System.out.println(Eubacteria.getDetails());
            //ARCHAEBACTERIA INFORMATION
            System.out.println(Archaebacteria.getDetails());

            System.exit(0);

        }
        // Apply Adapter DP here to let user input animal to kingdom
        if (first == 2) {
            Animal animal = new Animal();
            System.out.println("What organism? \r\n");
            Scanner user_animal = new Scanner(System.in);
            String OrganismtoRegister = user_animal.nextLine();
            animal.setAnimalname(OrganismtoRegister);

            System.out.println("Which Kingdom do you want to classify it to?\r\n");
            Scanner user_kingdom = new Scanner(System.in);
            String kingdom = user_kingdom.nextLine();
            animal.setKingdombelong(kingdom);
            System.out.println("What type?");
            Scanner user_type = new Scanner(System.in);
            String organismtype = user_type.nextLine();
            animal.setOrganismtype(organismtype);

            User user = new UserAdapter(animal);
            System.out.printf("Animal: " + user.getAnimalname() + "\r\n");
            System.out.printf("Kingdom: " + user.getKingdombelong() + "\r\n");
            System.out.print("Type of Organism: " + user.getOrganismtype() + "\r\n");
            System.out.println(user.getAnimalname() + " has been added to the list.");
            System.exit(0);
        }
        if (first == 3) {
            CollectionImpl collectionImpl = new CollectionImpl();
            Iterator iterator = collectionImpl.getIterator();
            System.out.println("Animals: ");
            while (iterator.hasNext()) {
                Object object = iterator.next();
                String name = (String) object;

                System.out.println(name);
            }
        }
        else {
            System.out.println("Please choose from the options.");
        }
        System.exit(0);


    }
}