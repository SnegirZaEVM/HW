import java.util.*;

public class Phonebook {

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    private Map<String, List<String>> phonebook;
    private List<String> surnameList;

    public void add (String surname, String number){
        if (phonebook.containsKey(surname)){
            surnameList = phonebook.get(surname);
        }
        else{
            surnameList = new ArrayList<>();
        }
        surnameList.add(number);
        phonebook.put(surname,surnameList);
    }

    public List<String> get(String surname) {
        return phonebook.get(surname);
    }
}
