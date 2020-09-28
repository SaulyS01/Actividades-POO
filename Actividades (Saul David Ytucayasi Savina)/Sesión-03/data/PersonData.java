package data;

import entities.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonData {

    List<Person> listP = new ArrayList<Person>();
    int id = 1;
    public void create(Person person) {
        person.setId(id++);
        listP.add(person);
    }
    public void getList(){
        for (Person person: listP) {
            System.out.println(person.getId() + "\t"  + person.getAge() + "\t" + person.getName());
        }
    }
    public void getListElement(int id) {
        for (Person person: listP) {
            if (person.getId() == id) {
                System.out.println(person.getId() + "\t"  + person.getAge() + "\t" + person.getName());
            }
        }
    }
    public void remove(int id) {
        Iterator<Person> iterator = listP.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
            }
        }
    }
    public void update(int id, String name, int age) {
        for (Person person: listP) {
            if (person.getId() == id) {
                System.out.println("Ya se cambió");
            }else {
                System.out.println("No se cambió correctamente");
            }
        }
    }
}
