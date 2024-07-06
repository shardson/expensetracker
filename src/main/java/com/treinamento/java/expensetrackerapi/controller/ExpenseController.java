package com.treinamento.java.expensetrackerapi.controller;

import com.treinamento.java.expensetrackerapi.entity.Expense;
import com.treinamento.java.expensetrackerapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;
    @GetMapping(value = "/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }
}
