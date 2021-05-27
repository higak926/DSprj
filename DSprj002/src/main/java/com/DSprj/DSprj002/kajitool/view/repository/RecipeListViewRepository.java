package com.DSprj.DSprj002.kajitool.view.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.DSprj.DSprj002.kajitool.domain.model.RecipeListView;
import com.DSprj.DSprj002.kajitool.view.mapper.RecipeListViewMapper;

@Repository
public class RecipeListViewRepository {

  private final RecipeListViewMapper recipeListViewMapper;

  public RecipeListViewRepository(final RecipeListViewMapper recipeListViewMapper) {
	this.recipeListViewMapper = recipeListViewMapper;
  }

  public List<RecipeListView> selectAll() {
	return recipeListViewMapper.selectAll();
  }

}
