package impl;

import model.Cricketer;
import model.PlainCricketer;

import java.io.*;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        try {
            serialize();
            deSerialize();
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Cricketer createCricketer() {
        Cricketer cricketer = new Cricketer();
        cricketer.setCountry("India");
        cricketer.setName("Rahul Dravid");
        cricketer.setDebut(LocalDate.of(1996, 6, 20));
        cricketer.setJerseyNumber(19);
        cricketer.setOtherTeams(Stream.of("Karnataka", "Royal Challengers Banglore", "Rajasthan Royals",
                        "Rest Of the World", "ASIA XI", "Kent", "Marylebone Cricket Club")
                .collect(Collectors.toList()));
        return cricketer;
    }

    public static PlainCricketer createPlainCricketer() {
        PlainCricketer plainCricketer = new PlainCricketer();
        plainCricketer.setCountry("India");
        plainCricketer.setAge(36);
        plainCricketer.setName("Rahul Dravid");
        return plainCricketer;
    }

    public static void serialize() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Dravid.txt"));
        oos.writeObject(createCricketer());
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("Rahul.txt"));
        oos1.writeObject(createPlainCricketer());
    }
    public static void deSerialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Dravid.txt"));
        Cricketer dravid = (Cricketer)ois.readObject();
        dravid.printDetails();
        ObjectInputStream oos1 = new ObjectInputStream(new FileInputStream("Rahul.txt"));
        PlainCricketer rahul = (PlainCricketer)oos1.readObject();
        rahul.printDetails();
    }

}
