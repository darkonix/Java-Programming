package com.person;

public class Person implements HumanInterface {
    public  String  name;
    public  int age;
    public  int height;

    public Person(){}

    public  String getName(){
        return name;
    }

    public  boolean setName(String name){
        if(name == ""){
            try {
                throw new PersonException("Name not entered");
            } catch (PersonException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public  int getHeight(){
        return height;
    }

    public  boolean setHeight(int height){
        if (height > 250 || height <= 45)
            try {
                throw new PersonException("Height is incorrect");
            } catch (PersonException e) {
                e.printStackTrace();
            }
        return true;
    }

    public  int getAge(){
        return age;
    }

    public  boolean setAge(int age){
        if (age > 160 || age <=0)
            try {
                throw new PersonException("Age is incorrect");
            } catch (PersonException e) {
                e.printStackTrace();
            }
        return true;
    }

    public void setPerson() {
        System.out.println("Введите имя: ");
        name = in.nextLine();
        setName(name);
        System.out.println("Введите рост: ");
        height = in.nextInt();
        setHeight(height);
        System.out.println("Введите возраст: ");
        age = in.nextInt();
        setAge(age);

        if (age <= 0) {
            System.out.println("Неправильный возраст");
        }
        else
        {
            System.out.println("Ваше имя: " + name);
            System.out.println("Ваш возраст: " + age);
            System.out.println("Ваш рост: " + height);
        }
    }

    @Override
    public String think() {
        return null;
    }

    @Override
    public String getName(int n) {
        return null;
    }

    public enum Gender {
        Male(1, "Мужчина"),
        Female(2, "Женщина"),
        Helicopter(8, "Вертолетик");

        private int value;
        private String strvalue;

        private Gender(int value, String strvalue) {
            this.value = value;
            this.strvalue = strvalue;
        }
        int getValue() {
            return value;
        }

        String getStrvalue() {
            return strvalue;
        }
    }
}
