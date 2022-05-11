import java.time.LocalDate;

import javax.persistence.*;

import org.junit.jupiter.api.Test;

import One2One.BankApplicant;
import One2One.Pancard;



public class TestOneToOne2 {

	EntityManagerFactory emf =Persistence.createEntityManagerFactory("MyJPA");	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	@Test
	public void assignNewPancardToNewBankApplicantTests() {
		et.begin();
		BankApplicant ba=new BankApplicant();
		ba.setApplicantName("Shanvi");
		ba.setEmailAddress("shanvi@gmail.com");
		ba.setMobile("9876543210");
		ba.setAddress("Seawoods");
		ba.setApplicationStatus("Applied");
		ba.setAppliedFor("Savings");
		ba.setBirthdate(LocalDate.of(1991, 12, 11));
		
		Pancard p=new Pancard();
		p.setPannumber("DLGPS4521F");
		p.setDob(LocalDate.of(1991, 12, 11));
		p.setFatherName("Vardhan");
		
		p.setBankapplicant(ba);
		
		System.out.println("trying to persist....");			
		em.persist(ba);
		em.persist(p);				
	    System.out.println("Persisted....");
        et.commit();
		
	
	}
	
	@Test
	public void findBankApplicantBasedOnPancardTest() {
		
	Pancard p=em.find(Pancard.class ,"DLGPS4521F");	
	System.out.println("DOB:" +p.getDob());
	System.out.println("Father Name:" +p.getFatherName());
	
	BankApplicant ba=p.getBankapplicant();
	
	System.out.println("Name:" +ba.getApplicantName());
	System.out.println("Email:" +ba.getEmailAddress());
	System.out.println("Mobile:" +ba.getMobile());	
	System.out.println("Address:" +ba.getAddress());	
	
		
	}
	
	
	@Test
	public void addBankApplicantWithoutPancard() {
		et.begin();
		BankApplicant ba=new BankApplicant();
		ba.setApplicantName("Aashri");
		ba.setEmailAddress("aashri@gmail.com");
		ba.setMobile("9876543211");
		ba.setAddress("Belapur");
		ba.setApplicationStatus("Applied");
		ba.setAppliedFor("Savings");
		ba.setBirthdate(LocalDate.of(2001, 12, 11));
		
		System.out.println("trying to persist....");			
		em.persist(ba);				
	    System.out.println("Persisted....");
        et.commit();
		
	}
	
	@Test
	public void addPancardWithoutBankApplicant() {
		et.begin();
		Pancard p=new Pancard();
		p.setPannumber("ABCDA8524G");
		p.setDob(LocalDate.of(2001, 12, 11));
		p.setFatherName("Vijay");
		

		System.out.println("trying to persist....");			
		em.persist(p);				
	    System.out.println("Persisted....");
        et.commit();
	}

	@Test 
	public void assignExistingPancardToBankApplicant()
	{
		et.begin();
		Pancard p=em.find(Pancard.class ,"ABCDA8524G");	
		BankApplicant ba=em.find(BankApplicant.class,21);
		p.setBankapplicant(ba);
		em.merge(p);
	    et.commit();
		
	}
}


	
	
	
