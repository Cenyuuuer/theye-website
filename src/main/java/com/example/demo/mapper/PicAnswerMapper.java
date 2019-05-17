package com.example.demo.mapper;

import com.example.demo.dao.PicAnswer;
import com.example.demo.dao.PicAppMes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PicAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_answer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer picId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_answer
     *
     * @mbg.generated
     */
    int insert(PicAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_answer
     *
     * @mbg.generated
     */
    PicAnswer selectByPrimaryKey(Integer picId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_answer
     *
     * @mbg.generated
     */
    List<PicAnswer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_answer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PicAnswer record);
    List<PicAnswer> chachong(String userId, Integer picappId);
    List<PicAnswer> selectAnswerByUserId(String userId);
    int selectSumByAppId(int picId);
    List<PicAnswer> selectByPicAppId(int picAppId);

}