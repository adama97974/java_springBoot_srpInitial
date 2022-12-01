package az.alizeynalli.cashflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import az.alizeynalli.cashflow.entity.Expense;
import az.alizeynalli.cashflow.repository.ExpenseRepository;
//import sun.net.www.content.text.plain;

@SpringBootApplication
public class CashFlowApplication implements CommandLineRunner{
	@Autowired 
	private ExpenseRepository expenseRepository;

	public static void main(String[] args) {
		SpringApplication.run(CashFlowApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//ExpenseRepository.save(new Expense(2,"tt",200));
		//expenseRepository.save(new Expense(100,"creat to",null));
//		expenseRepository.findAll().forEach(p->{
//			System.out.println(p.getId)
//		});
		Expense expense=expenseRepository.findById(1L).get();
		System.out.println(expense.getDescription());
		
	}

}
