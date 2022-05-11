package one2many;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
	
	
    @Id
    @Column(name="CUSTID",length=6)
	private Integer customerid;
    
    @Column(name="NAME",length=45)
	private String customerName;
    
    @Column(name="ADDRESS",length=40)
	private String address;
    
    @Column(name="CITY",length=30)
	private String city;
    
    @Column(name="STATE",length=2)
	private String state;
    
    @Column(name="ZIP",length=9)
	private String zip;
	
    @Column(name="AREA",length=3)
	private Integer area;
    
    @Column(name="PHONE",length=9)
	private String phone;
    
    
    @ManyToOne
	@JoinColumn(name="REPID")
	private Employee employee;
    
	
    @Column(name="CREDITLIMIT")
	private Double creditLimit;
	
    @Column(name="COMMENTS")
	private Long comments;

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Long getComments() {
		return comments;
	}

	public void setComments(Long comments) {
		this.comments = comments;
	}
	
    
}
