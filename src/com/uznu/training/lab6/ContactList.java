package com.uznu.training.lab6;

import java.util.*;

public class ContactList {
    public static void main(String[] args) {
        Map<String, Integer> nameWithPhone = new LinkedHashMap<>();
        nameWithPhone.put("Bobi", 108988794);
        nameWithPhone.put("Санчос", 1097913217);
        nameWithPhone.put("Колян", 208498497);
        nameWithPhone.put("Діма", 308984847);
        nameWithPhone.put("Макс", 508916884);
        nameWithPhone.put("Андрік", 608945777);
        nameWithPhone.put("Дюсі", 708999894);
        nameWithPhone.put("Іван", 80893546);
        nameWithPhone.put("Тибі", 908915987);
        nameWithPhone.put("Юра", 123456789);
        nameWithPhone.put("Jhonny", 1234564578);

        Set<Map.Entry<String, Integer>> entries = nameWithPhone.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Ім'я " + entry.getKey() + " мобільний телефон: " + entry.getValue());
        }




    }



}
