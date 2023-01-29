package phonebook;

import java.util.ArrayList;
import java.util.logging.*;


public class Phonebook {
    public ArrayList<Persona> pb;

    public Phonebook(){
        this.pb = new ArrayList<>();
        LoggerClass.logger.log(Level.INFO, "A new phone book has been created");
    }

    public void AddPersons(){
        pb.add(new Persona("Иванов Иван Иванович", "800-987-65-54", "Москва"));
        pb.add(new Persona("Сидоров Сидор Сидорович", "800-918-85-52", "Казань"));
        LoggerClass.logger.log(Level.INFO, "New persons have been added to the phone book");
    }

    public void showAddressBook(){
        for(Persona i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
        LoggerClass.logger.log(Level.INFO, "The phone book is printed in the console");
    }
}
