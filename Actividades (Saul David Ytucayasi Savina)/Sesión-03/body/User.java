package body;

import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        list.add("saul");
        list.add("david");
        list.add("fernando");
        int size = list.size();
        System.out.println(size);
        Person p = new Person();
        System.out.println("Ingresa un objeto: ");

    }
}
