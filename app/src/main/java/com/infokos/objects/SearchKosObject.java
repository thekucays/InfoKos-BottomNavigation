/*
 * Copyright (c) 2018. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package com.infokos.objects;

/**
 * Created by Luki R on 2/10/2018.
 */

public class SearchKosObject {

    public int idKos;
    public String judul;
    public String deskripsi;
    public String harga;

//    public SearchKosObject(){}

    public int getIdKos() {
        return idKos;
    }

    public void setIdKos(int idKos) {
        this.idKos = idKos;
    }

    public SearchKosObject(int idKos, String judul, String deskripsi, String harga) {
        this.idKos = idKos;
        this.judul = judul;
        this.deskripsi = deskripsi;

        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
