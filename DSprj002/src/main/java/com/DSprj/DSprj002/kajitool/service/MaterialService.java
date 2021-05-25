package com.DSprj.DSprj002.kajitool.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DSprj.DSprj002.kajitool.domain.model.Material;

@Service
@Transactional
public class MaterialService {

  private static final List<Material> materials = Arrays.asList(
	  new Material() {{setId(1L);setName("どうのこうせき");}},
	  new Material() {{setId(2L);setName("てっこうせき");}},
	  new Material() {{setId(3L);setName("ぎんのこうせき");}}
  );

  public List<Material> findAll() {
	return materials;
  }
}
