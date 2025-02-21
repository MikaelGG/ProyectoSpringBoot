package org.examplejava.AccessModifiers;

public class AccessLevel {

    private int age;
    protected String name;
    public String password;
    int CC;

    public void addAccess(String name,String password,int age,int CC) {
        System.out.println(age + name + password + CC);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }
}
