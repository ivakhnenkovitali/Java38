package _java38.standard_compose;

import java.io.*;
import java.util.List;


public class Main {
    public static  final String PATH_TO_OUTPUT = "src/resources/output.txt";
    public static void main(String[] args) {
        StandardCat vaska = new StandardCat("Vaska",
                new StandardBox(List.of("Ball", "Mouse")));


        try (FileOutputStream os = new FileOutputStream(PATH_TO_OUTPUT);
             ObjectOutputStream oos = new ObjectOutputStream(os);
             FileInputStream is = new FileInputStream(PATH_TO_OUTPUT);
             ObjectInputStream ois = new ObjectInputStream(is)) {

            oos.writeObject(vaska);

            StandardCat.staticField = "New Value";

            StandardCat catFromFile = (StandardCat) ois.readObject();

            System.out.println(catFromFile);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
