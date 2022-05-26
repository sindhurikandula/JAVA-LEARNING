package com.sbi.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sbi.demo.entity.*;
import com.sbi.demo.services.*;

@CrossOrigin
@RestController
@RequestMapping("/payee")
public class AccountPayeeController {

	
	@Autowired
	AccountPayeeService aps;

	@RequestMapping("/{accno}")                                    
	public List<Payee> getPayeesOfSingleAcct(@PathVariable("accno") int x)   //http://localhost:8080/payee/101
	{
		return aps.viewPayeesOfThisAccountNUmber(x);
	}
	
	@PostMapping("/addPayee")
	public String insertPayee(@RequestBody AnyObject any)
	{
		
		aps.insertPayeeIntoThisAccountNumber(any.getAccNum(),any.getPayeeObj());
		
		return "Payee Inserted sucessfully";
		
	}
	
	@PutMapping("/updatePayee/{x}/{y}/{z}")
	public String updatePayee(@PathVariable("x") int accno,@PathVariable("y") int pid,@PathVariable("z") int newLimit)
	{
		aps.upgradeTransferLimitOfAPayee(accno, pid, newLimit);
		
		return"Payee Updated Successfully";
	}
	
	@DeleteMapping("/deletePayee/{x}/{y}")
	public String deletePayee(@PathVariable("x") int accFromwhichPayeeToBeDeleted,@PathVariable("y") int payeeToBeDeleted)
	{
	    aps.deletePayeeOfThisAccountNumber(accFromwhichPayeeToBeDeleted, payeeToBeDeleted);
	    
	    return "Payee deleted Successfully";
	}
}
