package com.sda.programowanieI;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Krzysiek", "Rzuchowski", 29);
        User user2 = new User("Marcin", "Bury", 54);
        User user3 = new User("Ola","Mc",28);

        List<User> user = new ArrayList<>();
        user.add(user1);
        user.add(user2);
        user.add(user3);

        for (User urzytkownicy: user){
            System.out.println("imie: " + urzytkownicy.getName()+ " lastName: " + urzytkownicy.getLastname() + " wiek: " + urzytkownicy.getAge());
        }

    }

}
