package com.sourav.Interest_Calculator.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sourav.Interest_Calculator.inhertiance.BOI;
import com.sourav.Interest_Calculator.inhertiance.BOM;
import com.sourav.Interest_Calculator.inhertiance.Bank;
import com.sourav.Interest_Calculator.inhertiance.CentralBank;

public class CalculatorDAO {
	public EntityManager getEM() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculator_pu");
		EntityManager em = emf.createEntityManager();
		return em;
	}

	public boolean addBOI(BOI b) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		return true;
	}

	public boolean addBOM(BOM m) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		return true;
	}

	public boolean addCentralBank(CentralBank r) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();
		return true;

	}
	
	/*
	 * public boolean deleteCalculatorRecord(int SrNo) { EntityManager em = getEM();
	 * em.getTransaction().begin(); Calculator c = em.find(Calculator.class, SrNo);
	 * em.remove(c); em.getTransaction().commit(); return true; }
	 */

	public Bank getCalculatorRecord(String bank) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		Bank c = em.find(Bank.class, bank);
		em.getTransaction().commit();
		return c;
	}

}
