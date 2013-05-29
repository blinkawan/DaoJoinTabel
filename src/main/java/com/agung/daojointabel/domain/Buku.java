/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.daojointabel.domain;

/**
 *
 * @author Agung Setiawan
 */
public class Buku {
    private Long id;
    private String judul;
    private String penulis;
    private Kategori kategori;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
    
}

