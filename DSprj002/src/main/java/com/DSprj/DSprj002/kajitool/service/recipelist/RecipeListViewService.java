package com.DSprj.DSprj002.kajitool.service.recipelist;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DSprj.DSprj002.kajitool.domain.model.RecipeListView;
import com.DSprj.DSprj002.kajitool.view.repository.RecipeListViewRepository;

@Service
@Transactional
public class RecipeListViewService {

  private final RecipeListViewRepository recipeListViewRepository;

  public RecipeListViewService(final RecipeListViewRepository recipeListViewRepository) {
	this.recipeListViewRepository = recipeListViewRepository;
  }

  public List<RecipeListView> findAll() {
	return recipeListViewRepository.selectAll();
  }

}
