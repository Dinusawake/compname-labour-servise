package com.compname.labour.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compname.labour.service.dao.LabourDao;
import com.compname.labour.service.entity.LabourEntity;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/labourcontroller")
public class LabourController {

	@Autowired
	LabourDao labourRepository;
	

	@GetMapping("/showlabours")
	public List<LabourEntity> getlabour1() 
	{
		return (List<LabourEntity>) labourRepository.findAll();
	}

	@PostMapping("/savelabour")
	public String insertlabour(@RequestBody LabourEntity Labours) {
		labourRepository.save(Labours);
		return "One Labour saved successfully!";

	}
	@PostMapping("/savelabours")
	public String insertLabour(@RequestBody List<LabourEntity> Labours) {
		labourRepository.saveAll(Labours);
		return "Labour's saved successfully!";

	}
	@PutMapping("/updatelabour")
	public LabourEntity updatelabour(@RequestBody LabourEntity Labours) {
		return labourRepository.save(Labours); 
	}
	
	@PutMapping("/updatelabours")
	public List<LabourEntity> updatelabours(@RequestBody List<LabourEntity> Labours) {
		return labourRepository.saveAll(Labours); 
	}
	
	@DeleteMapping("/deletelabour")
	public String delete (@RequestBody LabourEntity Labours) {
		labourRepository.deleteById(Labours.getId());
		return "Record deleted successfully !" ;
	}


	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}

	@GetMapping("/getalllabours")
	public List<LabourEntity> getAllLabours()
	{
//		LabourEntity labourEntity1 = new LabourEntity(1,"DINESH", "SAWAKE", 965747, 25000,"KHARADI", "WASHIM",12345,101, "O POSITIVE","dineshsawake@gmail.com");
//		LabourEntity labourEntity2 = new LabourEntity(2,"SHREE", "WANKHEDE", 965747, 100000,"AMENORA TOWN", "WASHIM",12345,101, "O POSITIVE","shreewankhede@gmail.com");
//		LabourEntity labourEntity3 = new LabourEntity(3,"GANESH", "KANE", 965747, 100000,"PUNE", "WASHIM",12345,101, "AB POSITIVE","kaneganesh@gmail.com");
//		LabourEntity labourEntity4 = new LabourEntity(4,"ATUL", "MANE", 965747, 100000,"NASHIK", "WASHIM",12345,101, "B ","atulmane@gmail.com");
//		LabourEntity labourEntity5 = new LabourEntity(5,"GAJUBHAU", "WANKHEDE", 965747, 100000,"AMENORA TOWN", "WASHIM",12345,101, "O POSITIVE","shreewankhede@gmail.com");
//		LabourEntity labourEntity6 = new LabourEntity(6,"CHEETAN", "VAIDYA", 965747, 100000,"AMRAVATI CITY", "WADALI NAKA",12345,101, "O POSITIVE","shreewankhede@gmail.com");

		List<LabourEntity> labourEntityList = new ArrayList<>();
		//	List<LabourEntity> labourEntityListNew1 = new ArrayList<>();  
//
//		labourEntityList.add(labourEntity1);
//		labourEntityList.add(labourEntity2);
//		labourEntityList.add(labourEntity3);
//		labourEntityList.add(labourEntity4);
//		labourEntityList.add(labourEntity5);
//		labourEntityList.add(labourEntity6);
		//
		//		for(int i=0;i<labourEntityList.size();i++)
		//		{
		//			if(labourEntityList.get(i).getLastName().equals("Shinde"))
		//			{
		//				labourEntityListNew1.add(labourEntityList.get(i));
		//			}
		//		}

//		
//		for(int i=0;i<labourEntityList.size();i++)
//					{
//						if(labourEntityList.get(i).getId().equals(1))
//						{
//							labourEntityList.add(labourEntityList.get(i));
//						}
//				

		//		for(int i=0;i<labourEntityList.size();i++)
		//
		//		{	
		//
		//			if(labourEntityList.get(i).getSalary() >= 20000)
		//			{
		//				labourEntityListNew1.add(labourEntityList.get(i));
		//			}
		//
		//		}

		return labourEntityList;
	}

	@GetMapping("/getsum")
	public double getSum()
	{

		LabourEntity labourEntity1 = new LabourEntity(1,"DINESH", "SAWAKE", 965747, 25000,"KHARADI", "WASHIM",12345,101, "O POSITIVE","dineshsawake@gmail.com");
		LabourEntity labourEntity2 = new LabourEntity(2,"SHREE", "WANKHEDE", 965747, 100000,"AMENORA TOWN", "WASHIM",12345,101, "O POSITIVE","shreewankhede@gmail.com");
		LabourEntity labourEntity3 = new LabourEntity(3,"GANESH", "KANE", 965747, 100000,"PUNE", "WASHIM",12345,101, "AB POSITIVE","kaneganesh@gmail.com");
		LabourEntity labourEntity4 = new LabourEntity(4,"ATUL", "MANE", 965747, 100000,"NASHIK", "WASHIM",12345,101, "B ","atulmane@gmail.com");
		LabourEntity labourEntity5 = new LabourEntity(5,"GAJUBHAU", "WANKHEDE", 965747, 100000,"AMENORA TOWN", "WASHIM",12345,101, "O POSITIVE","shreewankhede@gmail.com");


		List<LabourEntity> labourEntityList = new ArrayList<>();
		//List<LabourEntity> labourEntityListNew1 = new ArrayList<>();  

		labourEntityList.add(labourEntity1);
		labourEntityList.add(labourEntity2);
		labourEntityList.add(labourEntity3);
		labourEntityList.add(labourEntity4);
		labourEntityList.add(labourEntity5);

		double sum=0.00;
		for(int i=0;i<labourEntityList.size();i++)

		{	
			sum=sum + labourEntityList.get(i).getSalary();

		}

		//		Stack<Integer> intStack = new Stack<>();
		//
		//		intStack.push(10);
		//		intStack.push(20);
		//
		//		System.out.println(intStack);

		return sum;
	}


	@GetMapping("/getsomespecificlabour")
	public List<LabourEntity> getsomespecificlabour()
	{
		LabourEntity labourEntity1 = new LabourEntity(1,"DINESH", "SAWAKE", 965747, 25000,"KHARADI", "WASHIM",12345,101, "O POSITIVE","dineshsawake@gmail.com");
		LabourEntity labourEntity2 = new LabourEntity(2,"SHREE", "WANKHEDE", 965747, 100000,"AMENORA TOWN", "WASHIM",12345,101, "O POSITIVE","shreewankhede@gmail.com");
		LabourEntity labourEntity3 = new LabourEntity(3,"GANESH", "KANE", 965747, 100000,"PUNE", "WASHIM",12345,101, "AB POSITIVE","kaneganesh@gmail.com");
		LabourEntity labourEntity4 = new LabourEntity(4,"ATUL", "MANE", 965747, 100000,"NASHIK", "WASHIM",12345,101, "B ","atulmane@gmail.com");
		LabourEntity labourEntity5 = new LabourEntity(5,"GAJUBHAU", "WANKHEDE", 965747, 100000,"AMENORA TOWN", "WASHIM",12345,101, "O POSITIVE","shreewankhede@gmail.com");


		List<LabourEntity> labourEntityList = new ArrayList<>();
		List<LabourEntity> labourEntityListNew1 = new ArrayList<>();  

		labourEntityList.add(labourEntity1);
		labourEntityList.add(labourEntity2);
		labourEntityList.add(labourEntity3);
		labourEntityList.add(labourEntity4);
		labourEntityList.add(labourEntity5);

		for(int i=0;i<labourEntityList.size();i++)
		{
			if(labourEntityList.get(i).getLastName().equals("Shinde"))
			{
				labourEntityListNew1.add(labourEntityList.get(i));
			}
		}
		return labourEntityListNew1;
	}
}
