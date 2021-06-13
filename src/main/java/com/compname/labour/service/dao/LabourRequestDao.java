package com.compname.labour.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.compname.labour.service.entity.LabourRequestEntity;

public interface LabourRequestDao extends JpaRepository<LabourRequestEntity, Integer>{

}
