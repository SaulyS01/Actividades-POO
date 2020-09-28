package main;

import data.PersonData;
import entities.Person;
import java.util.Scanner;

public class Main {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        Person person;
        PersonData personData = new PersonData();
        int option = 0;
        do {
            System.out.println("\n1.- Agregar a lista\n" +
                    "2.- Obtener elemento de lista\n" +
                    "3.- Listar la lista\n" +
                    "4.- Eliminar elemento de la lista\n" +
                    "5.- Update\n" +
                    "6.- Salir");
            System.out.print("Ingrese: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    person = new Person();
                    System.out.print("Ingrese el nombre: ");
                    person.setName(sc.nextLine());
                    System.out.print("Ingrese su edad: ");
                    person.setAge(sc.nextInt());
                    personData.create(person);
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
                case 5:
                    sc = new Scanner(System.in);
                    person = new Person();
                    System.out.print("Ingrese el id del objeto: ");
                    Person var = personData.update(sc.nextInt());
                    System.out.print("Ingrese el nombre: ");
                    var.setName(sc.nextLine());
                    System.out.print("Ingrese la edad: ");
                    var.setAge(sc.nextInt());
                    break;
                default:
                    System.out.println("Gracias por todo!!");
                    break;
            }
        }while (option != 6);
    }
}
