package com.zxg.maple.dao.gen;

import com.zxg.maple.dao.gen.entity.MArea;
import com.zxg.maple.dao.gen.entity.MAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int countByExample(MAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int deleteByExample(MAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int insert(MArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int insertSelective(MArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    List<MArea> selectByExample(MAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int updateByExampleSelective(@Param("record") MArea record, @Param("example") MAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_area
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int updateByExample(@Param("record") MArea record, @Param("example") MAreaExample example);
}