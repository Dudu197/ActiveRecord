/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dudollar.annotations;

/**
 *
 * @author 201500458
 */
public @interface BeforeSave {
    
    public String ifChanged() default "";
    
}
