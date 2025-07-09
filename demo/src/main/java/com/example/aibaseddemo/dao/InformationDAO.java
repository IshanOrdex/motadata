package com.example.aibaseddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aibaseddemo.entity.Information;

@Repository
public interface InformationDAO extends JpaRepository<Information, Integer>{

}
