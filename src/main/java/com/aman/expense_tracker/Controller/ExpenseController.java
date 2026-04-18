package com.aman.expense_tracker.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.aman.expense_tracker.Service.ExpenseServices;

import Model.Expense;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
public class ExpenseController {

    private ExpenseServices expenseServices;

    public ExpenseController(ExpenseServices expenseServices)
    {
        this.expenseServices = expenseServices;
    }
    
    @GetMapping("/expenses")
    public Map<Integer, Expense> getMethodName() {
        return expenseServices.getAllExpense();
    }

    @PostMapping("/expense")
    public String addExpense(@RequestBody Expense expense) {
        //TODO: process POST request
        
        return expenseServices.addExpenses(expense);
    }

    @PatchMapping("expensesUpdate")
    public String patchExpense(@RequestBody Expense expense) {
        //TODO: process PUT request
        
        return expenseServices.updateExpense(expense);
    }

    @DeleteMapping("/expensesDel/{id}")
    public String deleteExpense(@PathVariable int id)     
    {
        return expenseServices.deleteExpense(id);
    }

    
    
}
