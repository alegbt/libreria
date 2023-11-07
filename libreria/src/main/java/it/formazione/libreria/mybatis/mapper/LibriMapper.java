package it.formazione.libreria.mybatis.mapper;

import it.formazione.libreria.mybatis.model.Libri;
import it.formazione.libreria.mybatis.model.LibriExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibriMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    long countByExample(LibriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int deleteByExample(LibriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int insert(Libri row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int insertSelective(Libri row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    List<Libri> selectByExample(LibriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    Libri selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int updateByExampleSelective(@Param("row") Libri row, @Param("example") LibriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int updateByExample(@Param("row") Libri row, @Param("example") LibriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int updateByPrimaryKeySelective(Libri row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table libri
     *
     * @mbg.generated Tue Nov 07 12:32:31 CET 2023
     */
    int updateByPrimaryKey(Libri row);
}