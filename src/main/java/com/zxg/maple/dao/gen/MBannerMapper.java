package com.zxg.maple.dao.gen;

import com.zxg.maple.dao.gen.entity.MBanner;
import com.zxg.maple.dao.gen.entity.MBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int countByExample(MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int deleteByExample(MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int insert(MBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int insertSelective(MBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    List<MBanner> selectByExample(MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int updateByExampleSelective(@Param("record") MBanner record, @Param("example") MBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_banner
     *
     * @mbggenerated Fri Jun 23 17:38:39 CST 2017
     */
    int updateByExample(@Param("record") MBanner record, @Param("example") MBannerExample example);
}