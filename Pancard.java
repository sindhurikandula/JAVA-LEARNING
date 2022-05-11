package One2One;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Pancard {
	
	@Id
	private String pannumber;
	
	private LocalDate dob;
	
	@Column(length=30)
	private String fatherName;
	
	
	@OneToOne
	private BankApplicant bankapplicant;


	public String getPannumber() {
		return pannumber;
	}


	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public BankApplicant getBankapplicant() {
		return bankapplicant;
	}


	public void setBankapplicant(BankApplicant bankapplicant) {
		this.bankapplicant = bankapplicant;
	}
	

	
}
