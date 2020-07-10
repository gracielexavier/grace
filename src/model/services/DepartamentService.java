/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import java.util.ArrayList;
import java.util.List;
import model.entities.Departament;

/**
 *
 * @author 55819
 */
public class DepartamentService {
    public List<Departament> findAll(){
        List<Departament> list = new ArrayList<>(); //mockando os dados
        list.add(new Departament (1, "Book"));
        list.add(new Departament (2, "Redes de Computadores"));
        list.add(new Departament (3, "Telecomunicações"));
        
        return list;
        
    }
}
