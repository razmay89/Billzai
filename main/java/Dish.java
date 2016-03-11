import java.util.List;

/**
 * Created by Raz on 3/10/2016.
 */
public class Dish {
    private List<Person> persons;
    private int price;

    public List<Person> getPersons(){
        return persons;
    }

    public int getNumberOfPerson(){
        return persons.size();
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public void removePerson(Person person){
        persons.remove(person);
    }

    public int getPrice(){return price;}
}
