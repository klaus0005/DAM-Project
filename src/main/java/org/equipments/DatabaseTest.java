package org.equipments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.equipments.classes.Equipment;

@Component
public class DatabaseTest implements CommandLineRunner {

    @Autowired
    private equipment equipment;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Număr de utilizatori în baza de date: " + user.count());
    }
}
