package Lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class TelephoneNumbers {
    protected final Map<String, List<String>> entries = new HashMap<>();
    protected final Set<String> allPhoneNumbers = new HashSet<>();

    protected boolean add(String lastName, String phoneNumber) {
        if (allPhoneNumbers.contains(phoneNumber)) {
            return false;
        }

        List<String> phones = entries.computeIfAbsent(lastName, k -> new ArrayList<>());
        if (phones.contains(phoneNumber)) {
            return false;
        }

        phones.add(phoneNumber);
        allPhoneNumbers.add(phoneNumber);
        return true;
    }

    public List<String> get(String name) {
        return entries.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsNumber(String phoneNumber) {
        return allPhoneNumbers.contains(phoneNumber);
    }
}
