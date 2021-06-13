package com.compname.labour.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compname.labour.service.dao.LabourRequestDao;
import com.compname.labour.service.entity.LabourRequestEntity;

@RestController
@RequestMapping("/labourrequesstcontroller")
public class LabourRequestController {

	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}
	
	@Autowired
	LabourRequestDao labourrequestRepository;
	

	@GetMapping("/showrequest")
	public List<LabourRequestEntity> getlabour1() 
	{
		return (List<LabourRequestEntity>) labourrequestRepository.findAll();
	}

	@PostMapping("/saverequest")
	public String insertrequest(@RequestBody LabourRequestEntity Labour_request) {
		labourrequestRepository.save(Labour_request);
		return "One Labour saved successfully!";

	}
	@PostMapping("/saverequests")
	public String insertrequest(@RequestBody List<LabourRequestEntity> Labour_request) {
		labourrequestRepository.saveAll(Labour_request);
		return "Labour's saved successfully!";

	}
	@PutMapping("/updaterequest")
	public LabourRequestEntity updaterequest(@RequestBody LabourRequestEntity Labour_request) {
		return labourrequestRepository.save(Labour_request); 
	}
	
	@PutMapping("/updaterequests")
	public List<LabourRequestEntity> updaterequest(@RequestBody List<LabourRequestEntity> Labour_request) {
		return labourrequestRepository.saveAll(Labour_request); 
	}
	
	@DeleteMapping("/deleterequest")
	public String delete (@RequestBody LabourRequestEntity Labour_request) {
		labourrequestRepository.deleteById(Labour_request.getLabouRequestId());
		return "Record deleted successfully !" ;
	}

		
}
