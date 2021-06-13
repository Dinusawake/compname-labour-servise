package com.compname.labour.service.assembler;

import com.compname.labour.service.dto.LabourRequestDTO;
import com.compname.labour.service.entity.LabourRequestEntity;

public class LabourRequestAssembler {

	public LabourRequestDTO entityToDTO(LabourRequestEntity labourRequestEntity)
	{
		
		
		LabourRequestDTO labourRequestDTO = new LabourRequestDTO();
		labourRequestDTO.setRequestFromBuilder(labourRequestEntity.getRequestFromBuilder());
		labourRequestDTO.setNoOfLaborRequired(labourRequestEntity.getNoOfLaborRequired());
		labourRequestDTO.setFromDate(labourRequestEntity.getFromDate());
		labourRequestDTO.setToDate(labourRequestEntity.getToDate());
		labourRequestDTO.setNoOfWorkingHours(labourRequestEntity.getNoOfWorkingHours());
		labourRequestDTO.setCommentFromBuilder(labourRequestEntity.getCommentFromBuilder());
		
		return labourRequestDTO;
	}
	
	public LabourRequestEntity dtoToEntity(LabourRequestDTO labourRequestDTO)
	{
		LabourRequestEntity labourRequestEntity = new LabourRequestEntity();
		labourRequestEntity.setCommentFromBuilder(labourRequestDTO.getCommentFromBuilder());
		labourRequestEntity.setNoOfLaborRequired(labourRequestDTO.getNoOfLaborRequired());
		labourRequestEntity.setFromDate(labourRequestDTO.getFromDate());
		labourRequestEntity.setToDate(labourRequestDTO.getToDate());
		labourRequestEntity.setNoOfWorkingHours(labourRequestDTO.getNoOfWorkingHours());
		labourRequestEntity.setCommentFromBuilder(labourRequestDTO.getCommentFromBuilder());
		
		return labourRequestEntity;
	}
}
