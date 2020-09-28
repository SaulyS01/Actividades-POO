package data;

import entities.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonCRUD {
    List<Person> list = new ArrayList<Person>();

    public void create (Person p) {
        list.add(p);
    }
    public List<Person> list(String n) {
        return list;
    }
    public Person get(int id) {
        int index=0;
        for (Person d : list) {
            if (d.getId() == id ) {
                return list.get(index);
            }
            index++;
        }
        return null;
    }
    public void update(Person p, int id) {

    }
    public void delete(int id) {
        list.remove(id);
    }

    public static void main(String[] args) {
        PersonCRUD personCRUD = new PersonCRUD();
        Person person = new Person();
        person.setName("Saul");
        person.setAge(16);
        person.setId(100);
        personCRUD.create(person);
        personCRUD.get(100);
        Person d = personCRUD.get(100);
        if (d != null) {
            System.out.println("El id es: " + person.getId());
            System.out.println("El nombre es: " + person.getName());
        }else {
            System.out.println("El id no existe intente nuevamente");
        }
    }
}

