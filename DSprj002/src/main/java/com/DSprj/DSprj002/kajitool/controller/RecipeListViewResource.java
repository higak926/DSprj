package com.DSprj.DSprj002.kajitool.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DSprj.DSprj002.kajitool.domain.model.RecipeListView;
import com.DSprj.DSprj002.kajitool.service.recipelist.RecipeListViewService;

@RestController
@RequestMapping("/v1/recipe_list_view")
public class RecipeListViewResource {
  private final RecipeListViewService service;

  public RecipeListViewResource(RecipeListViewService service) {
	this.service = service;
  }

  @GetMapping("")
  public ResponseEntity<List<RecipeListView>> getAll() {
	return ResponseEntity.ok(service.findAll());
  }
}
