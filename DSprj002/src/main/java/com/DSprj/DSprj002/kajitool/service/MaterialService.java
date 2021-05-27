package com.DSprj.DSprj002.kajitool.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DSprj.DSprj002.kajitool.domain.model.Material;
import com.DSprj.DSprj002.kajitool.domain.repository.MaterialRepository;

@Service
@Transactional
public class MaterialService {

  private final MaterialRepository repository;

  public MaterialService(final MaterialRepository repository) {
	this.repository = repository;
  }

  public List<Material> findAll() {
	return repository.selectAll();
  }
}
