package One2One;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class BankApplicant {
    
	@Id
	@GeneratedValue
	private int applicantNumber; 
	
	@Column(length=30)
	private String applicantName; 
	
	@Column(length=30)
	private String emailAddress; 
	
	@Column(length=10)
	private String mobile; 
	
	@Column(length=30)
	private String appliedFor;
	
	@Column(length=30)
	private String applicationStatus;
	
	@Column(length=30)
	private String address; 
	
	private LocalDate birthdate; 
	
	@OneToOne(mappedBy="bankapplicant")
	private Pancard pancard;

	public int getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(int applicantNumber) {
		this.applicantNumber = applicantNumber;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAppliedFor() {
		return appliedFor;
	}

	public void setAppliedFor(String appliedFor) {
		this.appliedFor = appliedFor;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	
	
}
