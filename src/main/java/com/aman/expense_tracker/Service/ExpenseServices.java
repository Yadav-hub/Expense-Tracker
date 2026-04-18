package com.aman.expense_tracker.Service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import Model.Expense;

@Service
public class ExpenseServices {

    
    private Map<Integer, Expense> expenseData = new HashMap<>();

    
    public String addExpenses(Expense expense) {
        if (expenseData.containsKey(expense.getId())) {
            return "Expense Id is already present";
        } else {
            expenseData.put(expense.getId(), expense);
            return "Expense Added";
        }

    }

    public Map<Integer, Expense> getAllExpense() {
        return expenseData;

    }

    public String updateExpense(Expense updatedExpense) {
        if (expenseData.containsKey(updatedExpense.getId())) {

            Expense exp = expenseData.get(updatedExpense.getId());
            if (updatedExpense.getAmount() < 0) {
                return "Wrong amount";
            } else {
                if(updatedExpense.getAmount() > 0.0)
                {
                    exp.setAmount(updatedExpense.getAmount());
                }
                else if(updatedExpense.getCategory()!=null)
                {
                    exp.setCategory(updatedExpense.getCategory());
                }
                else if(updatedExpense.getDescription()!=null)
                {   
                    exp.setDescription(updatedExpense.getDescription());
                }
                else if(updatedExpense.getDate()!= null) 
                {
                    exp.setDate(updatedExpense.getDate());
                }             
                
                
                return "Expense Updated";
            }

        }
        return "No id found";
    }

    public String deleteExpense(int id) {

        if (expenseData.containsKey(id)) {
            expenseData.remove(id);
            return "Expense Deleted";
        }
        return "Id not found";
    }

}
