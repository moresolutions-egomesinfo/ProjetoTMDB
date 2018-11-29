package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/*
SerializedName
Uma anotação que indica que esse membro deve ser serializado para JSON
com o valor do nome fornecido como seu nome de campo.
Necessário Incluir no gradle app a implementação:
implementation 'com.google.code.gson:gson:2.6.2'
*/

public class Genre implements Serializable {

    @SerializedName("id")
    private Integer idGenre;
    @SerializedName("name")
    private String nameGenre;

    /**
     * Instantiates a new Genre.
     *
     * @param idGenre     the id
     * @param nameGenre   the name
     */

    public Genre(Integer idGenre, String nameGenre) {
        this.idGenre = idGenre;
        this.nameGenre = nameGenre;

    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getIdGenre() {
        return idGenre;
    }

    /**
     * Sets id.
     *
     * @param idGenre the id
     */
    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    /**
     * Gets name.
     *
     * @return the release date
     */
    public String getNameGenre() {
        return nameGenre;
    }

    /**
     * Sets name.
     *
     * @param nameGenre the name
     */
    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }


}

