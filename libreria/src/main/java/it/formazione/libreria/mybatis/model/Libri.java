package it.formazione.libreria.mybatis.model;

public class Libri {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column libri.id
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column libri.nome
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    private String nome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column libri.prezzo
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    private Integer prezzo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column libri.autore_id
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    private Integer autoreId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column libri.id
     *
     * @return the value of libri.id
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column libri.id
     *
     * @param id the value for libri.id
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column libri.nome
     *
     * @return the value of libri.nome
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public String getNome() {
        return nome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column libri.nome
     *
     * @param nome the value for libri.nome
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column libri.prezzo
     *
     * @return the value of libri.prezzo
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public Integer getPrezzo() {
        return prezzo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column libri.prezzo
     *
     * @param prezzo the value for libri.prezzo
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column libri.autore_id
     *
     * @return the value of libri.autore_id
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public Integer getAutoreId() {
        return autoreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column libri.autore_id
     *
     * @param autoreId the value for libri.autore_id
     *
     * @mbg.generated Mon Nov 06 15:27:41 CET 2023
     */
    public void setAutoreId(Integer autoreId) {
        this.autoreId = autoreId;
    }
}