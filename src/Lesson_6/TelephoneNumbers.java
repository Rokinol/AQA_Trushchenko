package Lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneNumbers {
    protected final Map<String, List<String>> entries = new HashMap<>();

    //метод для добавления телефона к указанной фамилии
    public void add(String lastName, String phoneNumber) {
        //проверка на наличие такого имени
        //имя есть
        if (entries.containsKey(lastName)){
            List<String> phones = entries.get(lastName);
            phones.add(phoneNumber);
        //имени нет
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            entries.put(lastName, phones);
        }
    }

    public List<String> get(String name){
        return entries.getOrDefault(name, new ArrayList<>());
    }
}
