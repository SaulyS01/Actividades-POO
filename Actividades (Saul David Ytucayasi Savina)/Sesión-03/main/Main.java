package main;

import data.PersonData;
import entities.Person;
import java.util.Scanner;

public class Main {
    public static void main(String ... args) {
        PersonData personData = new PersonData();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\n1.- Agregar a lista\n" +
                    "2.- Obtener elemento de lista\n" +
                    "3.- Listar la lista\n" +
                    "4.- Eliminar elemento de la lista\n" +
                    "5.- Salir\n");
            System.out.print("Ingrese: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Person person = new Person();
                    personData.create(person);
                    Person person1 = new Person();
                    personData.create(person1);
                    break;
                case 2:
                    System.out.print("Ingrese el id del objeto: ");
                    personData.getListElement(sc.nextInt());
                    break;
                case 3:
                    personData.getList();
                    break;
                case 4:
                    System.out.print("Ingrese el id del objeto: ");
                    personData.remove(sc.nextInt());
                    break;
                default:
                    System.out.println("Gracias por todo!!");
                    break;
            }
        }while (option != 5);
    }
}
