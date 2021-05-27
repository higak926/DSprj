package kajitool.dao.mapper;

import java.util.List;
import kajitool.dao.model.MaterialEntity;
import kajitool.dao.model.MaterialEntityExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MaterialEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @SelectProvider(type=MaterialEntitySqlProvider.class, method="countByExample")
    long countByExample(MaterialEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @DeleteProvider(type=MaterialEntitySqlProvider.class, method="deleteByExample")
    int deleteByExample(MaterialEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @Delete({
        "delete from public.material",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @Insert({
        "insert into public.material (id, name)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR})"
    })
    int insert(MaterialEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @InsertProvider(type=MaterialEntitySqlProvider.class, method="insertSelective")
    int insertSelective(MaterialEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @SelectProvider(type=MaterialEntitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<MaterialEntity> selectByExample(MaterialEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name",
        "from public.material",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    MaterialEntity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MaterialEntitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MaterialEntity record, @Param("example") MaterialEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MaterialEntitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MaterialEntity record, @Param("example") MaterialEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @UpdateProvider(type=MaterialEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MaterialEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.material
     *
     * @mbg.generated
     */
    @Update({
        "update public.material",
        "set name = #{name,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MaterialEntity record);
}