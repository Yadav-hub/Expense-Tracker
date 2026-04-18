package Model;


public class User {

    private String name;
    private int age;

    //if we define a parameterized constructor then we need to create a default constructor to pass the object by jackson , it is a way of inject the dependency.

    

    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
}
