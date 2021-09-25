package com.person;

public abstract class AbstractPerson implements HumanInterface{
    protected String name;
    protected String th;

    protected AbstractPerson() {
    }

    public String setName () {
        return name;
    }

    public abstract String think ();

    AbstractPerson(String name)
    {
        this.name = name;
    }
}
