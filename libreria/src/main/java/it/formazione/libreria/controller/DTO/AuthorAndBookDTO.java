package it.formazione.libreria.controller.DTO;

public class AuthorAndBookDTO {

    private String bookName;
    private Integer prezzo;
    private Integer autoreId;
    private String nomeAutore;


    public AuthorAndBookDTO(String bookName, Integer prezzo, Integer autoreId, String nomeAutore) {
        this.bookName = bookName;
        this.prezzo = prezzo;
        this.autoreId = autoreId;
        this.nomeAutore = nomeAutore;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getAutoreId() {
        return autoreId;
    }

    public void setAutoreId(Integer autoreId) {
        this.autoreId = autoreId;
    }


    public String getNomeAutore() {
        return nomeAutore;
    }

    public void setNomeAutore(String nomeAutore) {
        this.nomeAutore = nomeAutore;
    }
}
