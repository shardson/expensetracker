package com.treinamento.java.expensetrackerapi.service;

import com.treinamento.java.expensetrackerapi.entity.Expense;

import java.util.List;

public interface ExpenseService {

    public List<Expense> getAllExpenses();

    public Expense getExpenseById(Long id);

    public void deleteById(Long id);

    public Expense saveExpenseDetails(Expense expense);

    public Expense updateExpense(Long id, Expense expense);
}
