package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://www.pri.run/AVATARS/1.gif"),
            new User("002", "Paul", "https://www.pri.run/AVATARS/2.gif"),
            new User("003", "Phil", "https://www.pri.run/AVATARS/3.gif"),
            new User("004", "Guillaume", "https://www.pri.run/AVATARS/4.gif"),
            new User("005", "Francis", "https://www.pri.run/AVATARS/5.gif"),
            new User("006", "George", "https://www.pri.run/AVATARS/6.gif"),
            new User("007", "Louis", "https://www.pri.run/AVATARS/7.gif"),
            new User("008", "Mateo", "https://www.pri.run/AVATARS/8.gif"),
            new User("009", "April", "https://www.pri.run/AVATARS/9.gif"),
            new User("010", "Louise", "https://www.pri.run/AVATARS/10.gif"),
            new User("011", "Elodie", "https://www.pri.run/AVATARS/11.gif"),
            new User("012", "Helene", "https://www.pri.run/AVATARS/12.gif"),
            new User("013", "Fanny", "https://www.pri.run/AVATARS/13.gif"),
            new User("014", "Laura", "https://www.pri.run/AVATARS/14.gif"),
            new User("015", "Gertrude", "https://www.pri.run/AVATARS/15.gif"),
            new User("016", "Chloé", "https://www.pri.run/AVATARS/16.gif"),
            new User("017", "April", "https://www.pri.run/AVATARS/17.gif"),
            new User("018", "Marie", "https://www.pri.run/AVATARS/18.gif"),
            new User("019", "Henri", "https://www.pri.run/AVATARS/19.gif"),
            new User("020", "Rémi", "https://www.pri.run/AVATARS/20.gif")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://www.pri.run/AVATARS/21.gif"),
            new User("022", "Geoffrey", "https://www.pri.run/AVATARS/22.gif"),
            new User("023", "Simon", "https://www.pri.run/AVATARS/23.gif"),
            new User("024", "André", "https://www.pri.run/AVATARS/24.gif"),
            new User("025", "Leopold", "https://www.pri.run/AVATARS/25.gif")
    );
}
