package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Saúl");
        list.add("David");
        list.add("Gerardo");
        for (String listar: list) {
            if (listar.equals("Saúl")){
                System.out.println("Encotré a Saúl");
            }
        }
    }
}
