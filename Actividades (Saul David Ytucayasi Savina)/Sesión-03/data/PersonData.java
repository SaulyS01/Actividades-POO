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
    public List<Person> getList(){
        return listP;
    }
    public Person getListElement(int id) {
        Iterator<Person> iterator = listP.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                return listP.get(index);
            }
            index++;
        }
        return null;
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
    public void update(Person d) {
        int index = 0;
        for (Person person: listP) {
            if (person.getId() == d.getId()) {
                listP.set(index, d);
                System.out.println("Correcto");
            }
            index++;
        }
    }
}
