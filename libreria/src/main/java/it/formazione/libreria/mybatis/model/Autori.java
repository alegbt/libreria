package it.formazione.libreria.mybatis.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Autori {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autori.id
     *
     * @mbg.generated Tue Nov 07 17:49:16 CET 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column autori.nome_autore
     *
     * @mbg.generated Tue Nov 07 17:49:16 CET 2023
     */
    private String nomeAutore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autori.id
     *
     * @return the value of autori.id
     *
     * @mbg.generated Tue Nov 07 17:49:16 CET 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autori.id
     *
     * @param id the value for autori.id
     *
     * @mbg.generated Tue Nov 07 17:49:16 CET 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column autori.nome_autore
     *
     * @return the value of autori.nome_autore
     *
     * @mbg.generated Tue Nov 07 17:49:16 CET 2023
     */
    public String getNomeAutore() {
        return nomeAutore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column autori.nome_autore
     *
     * @param nomeAutore the value for autori.nome_autore
     *
     * @mbg.generated Tue Nov 07 17:49:16 CET 2023
     */
    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }
}