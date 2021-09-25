package com.person;

public class ClientTest {
    public void clientTest(){
        PersonClient client = new PersonClient();
        System.out.println("Choose a service: ");
        System.out.println(client.service());
        System.out.println("The cost of the service: " + client.price() + "$");
        System.out.println("Test completed");
    }
}
