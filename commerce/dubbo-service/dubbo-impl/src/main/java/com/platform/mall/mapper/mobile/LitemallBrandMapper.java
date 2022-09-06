package com.platform.mall.mapper.mobile;

import java.util.List;

import com.platform.mall.entity.mobile.LitemallBrand;
import com.platform.mall.entity.mobile.LitemallBrandExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    long countByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int insert(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int insertSelective(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    LitemallBrand selectOneByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    LitemallBrand selectOneByExampleSelective(@Param("example") LitemallBrandExample example, @Param("selective") LitemallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    List<LitemallBrand> selectByExampleSelective(@Param("example") LitemallBrandExample example, @Param("selective") LitemallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    List<LitemallBrand> selectByExample(LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    LitemallBrand selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallBrand.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    LitemallBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    LitemallBrand selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallBrand record, @Param("example") LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallBrand record, @Param("example") LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_brand
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
