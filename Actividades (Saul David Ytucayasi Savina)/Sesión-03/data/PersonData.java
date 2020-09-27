package data;

import entities.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonData {

    List<Person> listP = new ArrayList<Person>();

    public void create(Person person) {
        Scanner sc = new Scanner(System.in);
        PersonData personData = new PersonData();
        System.out.print("Ingrese el nombre: ");
        person.setName(sc.nextLine());
        System.out.print("Ingrese su edad: ");
        person.setAge(sc.nextInt());
        System.out.print("Ingrese si id: ");
        person.setId(sc.nextInt());
        listP.add(person);
        System.out.println();
    }
    public void getList(){
        for (Person person: listP) {
            System.out.println("El nombre es: " + person.getName() + "\t" + "La edad es: " + person.getAge() + "\t" +
                    "El id es: " + person.getId());
        }
    }
    public void getListElement(int id) {
        for (Person person: listP) {
            if (person.getId() == id) {
                System.out.println("El nombre es: " + person.getName() + "\t" + "La edad es: " + person.getAge() + "\t" +
                        "El id es: " + person.getId());
            }
        }
    }
    public void remove(int id) {
        Iterator<Person> iterator = listP.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
                System.out.println("Se eliminó el elemento");
            }
        }
    }
}