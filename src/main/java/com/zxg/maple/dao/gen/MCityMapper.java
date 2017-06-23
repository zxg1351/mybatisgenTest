package com.zxg.maple.dao.gen;

import com.zxg.maple.dao.gen.entity.MCity;
import com.zxg.maple.dao.gen.entity.MCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int countByExample(MCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int deleteByExample(MCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int insert(MCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int insertSelective(MCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    List<MCity> selectByExample(MCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int updateByExampleSelective(@Param("record") MCity record, @Param("example") MCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_city
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int updateByExample(@Param("record") MCity record, @Param("example") MCityExample example);
}