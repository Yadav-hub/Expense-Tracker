package Model;

import java.time.LocalDate;

import Model.CategoryType.Category;




public class Expense {

    private int id;
    private double amount;
    
    private LocalDate date;
    private String description;
    private Category category;
    

    public Expense()
    {

    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    
    public void setCategory(Category category)
    {
        this.category = category;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getId()
    {
        return this.id;
    }
    public double getAmount()
    {
        return this.amount;
    }

    public Category getCategory()
    {
        return this.category;
    }
    
    public LocalDate getDate()
    {
        return this.date;
    }

    public String getDescription()
    {
        return this.description;
    }
    
}
