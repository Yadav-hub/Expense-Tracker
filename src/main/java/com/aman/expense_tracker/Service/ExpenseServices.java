package com.aman.expense_tracker.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aman.expense_tracker.Model.Expense;
import com.aman.expense_tracker.Repository.ExpenseRepository;

@Service
public class ExpenseServices {

    
    

    private ExpenseRepository expenseRepository;

    public ExpenseServices(ExpenseRepository expenseRepository)
    {
        this.expenseRepository = expenseRepository;
    }
    
    public String addExpenses(Expense expense) {
        
        if(expense != null)
        {
            expenseRepository.save(expense);
            return "Expense Added";
        }

        return "Error in values";

    }

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll() ;

    }

    public String updateExpense(int id, Expense updatedExpense) {
        
        Optional<Expense> exp = expenseRepository.findById(id);
        if(exp.isPresent())
        {
            Expense expense = exp.get();
            if(updatedExpense.getAmount()!=null)
            {
                expense.setAmount(updatedExpense.getAmount());
            }
            if(updatedExpense.getCategory()!= null)
            {
                expense.setCategory(updatedExpense.getCategory());
            }
            if(updatedExpense.getDate()!=null)
            {
                expense.setDate(updatedExpense.getDate());
            }
            if(updatedExpense.getDescription()!=null)
            {
                expense.setDescription(updatedExpense.getDescription());
            }
            expenseRepository.save(expense);
            return "Expense Updated";
        }
        else
        {
            return "Error in input";
        }

    }

    public String deleteExpense(int id) {
        if(expenseRepository.existsById(id))
        {
            expenseRepository.deleteById(id);
            return "Deleted";
        }
        else
        {
            return "Id not valid";
        }
        
    }
        

}
