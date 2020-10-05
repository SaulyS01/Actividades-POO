package main;

import data.PersonData;
import entities.Person;
import java.util.Scanner;

public class Main {
    /*public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        PersonData personData = new PersonData();
        String option = "";
        boolean bool = true;
        do {
            System.out.println("\n1.- Agregar a lista\n" +
                    "2.- Obtener elemento de lista\n" +
                    "3.- Listar la lista\n" +
                    "4.- Eliminar elemento de la lista\n" +
                    "5.- Update\n" +
                    "6.- Salir");
            System.out.print("Ingrese: ");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    person = new Person();
                    System.out.print("Ingrese el nombre: ");
                    person.setName(sc.nextLine());
                    try {
                        System.out.print("Ingrese su edad: ");
                        int ageVar = sc.nextInt();
                        person.setAge(ageVar);
                    }catch (Exception e) {
                        System.out.println("\nEl año por defecto se convirtió en 0");
                    }
                    personData.create(person);
                    sc.nextLine();
                    break;
                case "2":
                    System.out.print("Ingrese el id del objeto: ");
                    try {
                        int idVar = sc.nextInt();
                        Person person3 = personData.getListElement(idVar);
                        System.out.println(person3.getId() + "\t"  + person3.getAge() + "\t" + person3.getName());
                        sc.nextLine();
                    }catch (Exception e) {
                        System.out.println("Ingrese un número entero");
                    }
                    break;
                case "3":
                    for (Person person1:personData.getList()) {
                        System.out.println(person1.getId() + "\t"  + person1.getAge() + "\t" + person1.getName());
                    }
                    break;
                case "4":
                    System.out.print("Ingrese el id: ");
                    try {
                        personData.remove(sc.nextInt());
                    }catch (Exception e) {
                        System.out.println("Ingrese un número entero");
                    }
                    sc.nextLine();
                    break;
                case "5":
                    System.out.print("Ingresa el id: ");
                    Person person1 = null;
                    try {
                        int idVar = sc.nextInt();
                        person1 = personData.getListElement(idVar);
                    }catch (Exception e) {
                        System.out.println("Ingresa un número entero");
                    }
                    sc.nextLine();
                    if (person1 != null) {
                        System.out.print("Ingresa el nombre: ");
                        person1.setName(sc.nextLine());
                        System.out.print("Ingresa la edad: ");
                        try {
                            person1.setAge(sc.nextInt());
                        }catch (Exception e) {
                            System.out.println("Ingresa un número entero");
                        }
                            personData.update(person1);
                        sc.nextLine();
                    }else {
                        System.out.println("El objeto no existe");
                    }
                    break;
                case "6":
                    bool = false;
                    break;
            }
        }while (bool);
    }*/
}
