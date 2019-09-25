package com.infinera.nj.toyDbAgent.model;


import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="Age")
    private int age;

    public Person()
    {
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Person(String firstName, int age)
    {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + firstName + '\'' +
                ", Age=" + age +
                '}';
    }
}
