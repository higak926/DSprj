package com.DSprj.DSprj002.kajitool.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DSprj.DSprj002.kajitool.domain.model.Material;
import com.DSprj.DSprj002.kajitool.service.MaterialService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/material")
public class MaterialResource {

  private final MaterialService service;

  public MaterialResource(final MaterialService service) {
	this.service = service;
  }

  @GetMapping("/")
  @ApiOperation(value="素材を返します。", nickname="material_getAll")
  public ResponseEntity<List<Material>> getAll() {
	return ResponseEntity.ok(service.findAll());
  }
}
