package main;

import data.PersonData;
import entities.Person;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String ... args) {
        Scanner sc = new Scanner(in);
        Person person = new Person();
        PersonData personData = new PersonData();
        int option = 0;
        do {
            out.println("\n1.- Agregar a lista\n" +
                    "2.- Obtener elemento de lista\n" +
                    "3.- Listar la lista\n" +
                    "4.- Eliminar elemento de la lista\n" +
                    "5.- Update\n" +
                    "6.- Salir");
            out.print("Ingrese: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc = new Scanner(in);
                    person = new Person();
                    out.print("Ingrese el nombre: ");
                    person.setName(sc.nextLine());
                    out.print("Ingrese su edad: ");
                    person.setAge(sc.nextInt());
                    personData.create(person);
                    break;
                case 2:
                    out.print("Ingrese el id del objeto: ");
                    personData.getListElement(sc.nextInt());
                    break;
                case 3:
                    personData.getList();
                    break;
                case 4:
                    out.print("Ingrese el id del objeto: ");
                    personData.remove(sc.nextInt());
                    break;
                case 5:
                    out.println("Ingresa el id: ");
                    int id = sc.nextInt();
                    out.println("Ingresa el nombre: ");
                    String name = sc.next();
                    out.println("Ingresa la edad: ");
                    int age = sc.nextInt();
                    personData.update(id, name, age);
                    break;
                default:
                    out.println("Gracias por todo!!");
                    break;
            }
        }while (option != 6);
    }
}
