package com.compname.labour.service.assembler;

import com.compname.labour.service.dto.LabourDTO;
import com.compname.labour.service.entity.LabourEntity;

public class LabourAssembler {

	public LabourDTO entityToDTO(LabourEntity labourEntity)
	{
		
		
		LabourDTO labourDTO = new LabourDTO();
		labourDTO.setFirstName(labourEntity.getFirstName());
		labourDTO.setLastName(labourEntity.getLastName());
		labourDTO.setMobileNumber(labourEntity.getMobileNumber());
		labourDTO.setSalary(labourEntity.getSalary());
		labourDTO.setCurrentAddress(labourEntity.getCurrentAddress());
		labourDTO.setPermanateAddress(labourEntity.getPermanateAddress());
		labourDTO.setBloodGroup(labourEntity.getBloodGroup());
		return labourDTO;
	}
	
	public LabourEntity dtoToEntity(LabourDTO labourDTO)
	{
		LabourEntity labourEntity = new LabourEntity();
		labourEntity.setFirstName(labourDTO.getFirstName());
		labourEntity.setLastName(labourDTO.getLastName());
		labourEntity.setMobileNumber(labourDTO.getMobileNumber());
		labourEntity.setSalary(labourDTO.getSalary());
		labourEntity.setCurrentAddress(labourDTO.getCurrentAddress());
		labourEntity.setPermanateAddress(labourDTO.getPermanateAddress());
		labourEntity.setBloodGroup(labourDTO.getBloodGroup());
		return labourEntity;
	}
	}
