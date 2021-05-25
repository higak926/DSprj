package com.DSprj.DSprj002.kajitool.service.recipelist;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DSprj.DSprj002.kajitool.domain.model.RecipeListView;

@Service
@Transactional
public class RecipeListViewService {
  public List<RecipeListView> findAll() {
	return Collections.emptyList();
  }

}
