/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dudollar;

/**
 *
 * @author 201500106
 */
public class ActiveRelation {
    
    private String whereQuery = "";
    
    public ActiveRelation where(String condition){
        if (whereQuery.equals("")){
            whereQuery = condition;
        }else{
            whereQuery += " and " + condition;
        }
        return this;
    }
    
}
