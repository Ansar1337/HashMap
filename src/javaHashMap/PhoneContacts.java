package javaHashMap;

import javaHashMap.Contact;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneContacts {
    private Map<String, List<Contact>> contacts;

    public PhoneContacts() {
        contacts = new HashMap<>();
    }

    public void addGroup(String groupName) {
        contacts.put(groupName, null);
    }

    public List<Contact> getAllContactByGroup(String groupName) {
        return contacts.get(groupName);
    }
}