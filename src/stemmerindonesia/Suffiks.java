/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stemmerindonesia;

import java.util.List;

/**
 *
 * @author PUTRI
 */
public class Suffiks {

    private final List dictionaries;

    public Suffiks(List dictionaries) {
        this.dictionaries = dictionaries;
    }

    public String remove(String keyword) {
        return this.removeSuffixes(keyword);
    }

    private String removeSuffixes(String keyword) {
        /*
         * Pertama cari kata yang akan diistem dalam kamus kata dasar. 
         * Jika ditemukan maka diasumsikan kata adalah root keyword. 
         * Maka algoritma berhenti.
         */
        if (!this.dictionaries.contains(keyword)) {
            keyword = this.removePossesive(keyword);
        }
        if (!this.dictionaries.contains(keyword)) {
            keyword = this.removeDerivation(keyword);
        }
        return keyword;
    }

    private String removeDerivation(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String removePossesive(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}