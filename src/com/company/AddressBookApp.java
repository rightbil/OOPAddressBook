package com.company;

public class AddressBookApp {

    public static void main(String[] args) {
        // write your code here
        AddressBook b = new AddressBook();
        b.setName("Bililign Gebru");
        b.setAddress("113345 My Dream Street");
        b.setCity("The Bill City");
        b.setState("MD");
        b.setZip("20904");
        b.setPhone("4254993245");
        b.setEmail("myemail@gmail.com");

        System.out.println(b.toString());
    }
}
