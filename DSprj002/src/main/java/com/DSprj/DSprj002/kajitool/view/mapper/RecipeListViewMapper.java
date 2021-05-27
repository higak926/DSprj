package com.DSprj.DSprj002.kajitool.view.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.DSprj.DSprj002.kajitool.domain.model.RecipeListView;

public interface RecipeListViewMapper {

  @Select(" SELECT " +
  "   ID as id, " +
  "   NAME as name, " +
  "   select count(*) from RECIPE_DETAIL as D where D.RECIPE_ID = RECIPE.ID as materialCount " +
  " from RECIPE "
	  )
  List<RecipeListView> selectAll();

}
