package com.treinamento.java.expensetrackerapi.repository;

import com.treinamento.java.expensetrackerapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
