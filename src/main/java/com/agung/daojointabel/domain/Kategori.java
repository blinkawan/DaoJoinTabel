/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.daojointabel.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agung Setiawan
 */
public class Kategori {
    private Long id;
    private String nama;
    List<Buku> daftarBuku=new ArrayList<Buku>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void setDaftarBuku(List<Buku> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }
    
}
