package com.DSprj.DSprj002.kajitool.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DSprj.DSprj002.kajitool.domain.model.Material;
import com.DSprj.DSprj002.kajitool.service.MaterialService;

@RestController
@RequestMapping("/v1/material")
public class MaterialResource {

  private final MaterialService service;

  public MaterialResource(final MaterialService service) {
	this.service = service;
  }

  @GetMapping("/")
  public ResponseEntity<List<Material>> getAll() {
	return ResponseEntity.ok(service.findAll());
  }
}
