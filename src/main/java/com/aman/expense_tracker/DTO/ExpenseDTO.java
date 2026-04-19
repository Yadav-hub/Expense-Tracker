package com.aman.expense_tracker.DTO;

import java.time.LocalDate;

import com.aman.expense_tracker.Model.Category;

import jakarta.validation.constraints.Positive;



public class ExpenseDTO {

    @Positive(message ="Amount must be positive")
    private Double amount;
    
    private LocalDate date;
    private String description;
    private Category category;
    

    

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
