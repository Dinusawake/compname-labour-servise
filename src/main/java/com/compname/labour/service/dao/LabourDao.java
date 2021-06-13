package com.compname.labour.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compname.labour.service.entity.LabourEntity;

public interface LabourDao extends JpaRepository<LabourEntity, Integer> {

}
