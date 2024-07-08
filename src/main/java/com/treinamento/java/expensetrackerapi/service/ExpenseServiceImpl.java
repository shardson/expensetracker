package com.treinamento.java.expensetrackerapi.service;

import com.treinamento.java.expensetrackerapi.entity.Expense;
import com.treinamento.java.expensetrackerapi.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepository;
    @Override
    public Page<Expense> getAllExpenses(Pageable page) {
        return expenseRepository.findAll(page);
    }

    @Override
    public Expense getExpenseById(Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()) {
            return expense.get();
        }
        throw new RuntimeException("Expense not found " + id);
    }

    @Override
    public void deleteById(Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()) {
            expenseRepository.deleteById(id);
        }
        throw new RuntimeException("Expense not found to delete" + id);
    }

    @Override
    public Expense saveExpenseDetails(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense updateExpense(Long id, Expense expense) {
        Expense expenseToUpdate = getExpenseById(id);
        expenseToUpdate.setName(expense.getName() != null ? expense.getName() : expenseToUpdate.getName());
        expenseToUpdate.setDescription(expense.getDescription() != null ? expense.getDescription() : expenseToUpdate.getDescription());
        expenseToUpdate.setAmount(expense.getAmount() != null ? expense.getAmount() : expenseToUpdate.getAmount());
        expenseToUpdate.setDate(expense.getDate() != null ? expense.getDate() : expenseToUpdate.getDate());
        expenseToUpdate.setCategory(expense.getCategory() != null ? expense.getCategory() : expenseToUpdate.getCategory());
        return expenseRepository.save(expenseToUpdate);
    }
}
