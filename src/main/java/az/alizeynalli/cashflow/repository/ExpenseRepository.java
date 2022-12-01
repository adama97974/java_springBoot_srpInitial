package az.alizeynalli.cashflow.repository;

import az.alizeynalli.cashflow.entity.Expense;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	public List<Expense> findByamountContains(BigDecimal amount);
}
