package com.aman.expense_tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aman.expense_tracker.Model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

    
} 
