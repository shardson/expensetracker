package com.treinamento.java.expensetrackerapi.service;

import com.treinamento.java.expensetrackerapi.entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ExpenseService {

    public Page<Expense> getAllExpenses(Pageable page);

    public Expense getExpenseById(Long id);

    public void deleteById(Long id);

    public Expense saveExpenseDetails(Expense expense);

    public Expense updateExpense(Long id, Expense expense);
}
