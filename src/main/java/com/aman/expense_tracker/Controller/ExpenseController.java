package com.aman.expense_tracker.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.aman.expense_tracker.DTO.ExpenseDTO;
import com.aman.expense_tracker.Model.Expense;
import com.aman.expense_tracker.Service.ExpenseServices;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Expense>> getMethodName() {
            
        return ResponseEntity.ok(expenseServices.getAllExpense());
        
        
    }

    @PostMapping("/expenses")
    public ResponseEntity<String> addExpense(@Valid @RequestBody ExpenseDTO expenseDTO) {
        //TODO: process POST request
        Expense expense = new Expense();
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDate(expenseDTO.getDate());
        expense.setDescription(expenseDTO.getDescription());

        String result = expenseServices.addExpenses(expense);
        if(result.equals("Expense Added"))
        {
            return ResponseEntity.ok(result);
        }
        else
        {
            return ResponseEntity.badRequest().body("Error while adding");
        }
        

        
        
    }

    @PatchMapping("/expenses/{id}")
    public ResponseEntity<String> patchExpense(@PathVariable int id,@Valid @RequestBody ExpenseDTO expenseDTO) {

        Expense expense = new Expense();
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDate(expenseDTO.getDate());
        expense.setDescription(expenseDTO.getDescription());
        //TODO: process PUT request
        String result = expenseServices.updateExpense(id,expense);
        if(result.equals("Error in input"))
        {
            return ResponseEntity.status(404).body("Expense NOT FOUND");
        }
        else
        {
            return ResponseEntity.ok(result);
        }
        
    }

    @DeleteMapping("/expenses/{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable int id)     
    {
        String result = expenseServices.deleteExpense(id);
        if(result.equals("Deleted"))
        {
            return ResponseEntity.ok(result);
        }
        else
        {
            return ResponseEntity.status(404).body("Expense Not Found");
        }
    }

    
    
}
