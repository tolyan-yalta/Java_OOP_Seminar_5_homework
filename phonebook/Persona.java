package phonebook;

import java.util.logging.*;

public class Persona {
    String Name;
    String Phone;
    String City;

    public Persona(String name, String phone, String city){
        this.Name = name;
        this.Phone = phone;
        this.City = city;
        LoggerClass.logger.log(Level.INFO, "A new person has been created");
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }
    public String getCity() {
        return City;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    public void setCity(String city) {
        City = city;
    }

}
