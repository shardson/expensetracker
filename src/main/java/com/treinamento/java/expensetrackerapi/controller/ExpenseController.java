package com.treinamento.java.expensetrackerapi.controller;

import com.treinamento.java.expensetrackerapi.entity.Expense;
import com.treinamento.java.expensetrackerapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;
    @GetMapping(value = "/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @GetMapping(value = "/expenses/{id}")
    public Expense getExpenseById(@PathVariable("id") Long id){
        return expenseService.getExpenseById(id);
    }

    @DeleteMapping(value = "/expenses")
    public void deleteExpenseById(@RequestParam("id") Long id){

        expenseService.deleteById(id);

    }

    @PostMapping(value = "/expenses")
    public Expense saveExpense(@RequestBody Expense expense){
        return expenseService.saveExpenseDetails(expense);
    }

    @PutMapping(value = "/expenses/{id}")
    public Expense updateExpense(@PathVariable("id") Long id, @RequestBody Expense expense){
        return expenseService.updateExpense(id, expense);
    }
}
