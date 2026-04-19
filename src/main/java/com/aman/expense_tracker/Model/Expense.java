package com.aman.expense_tracker.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Double amount;
    
    private LocalDate date;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;
    

    public Expense()
    {

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
    public Double getAmount()
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
