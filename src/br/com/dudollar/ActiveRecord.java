/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dudollar;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benjamin Aholla
 */
public class ActiveRecord {
    
    public boolean PLURARIZE = true;
    protected Object clazz = null;
    protected boolean isCanceled = false;
    private final HashMap<String, Field> varsName = new HashMap<>();
    private final HashMap<String, String> sqlNames = new HashMap<>();
    private final HashMap<String, String> javaNames = new HashMap<>();
    
    public ActiveRecord(){
        this.clazz = getThis();
    }
        
    public void cancel(){
        isCanceled = true;
    }
    
    public final void save(){
        try {
            Method method = clazz.getClass().getDeclaredMethod("beforeSave", clazz.getClass());
            method.invoke(clazz, clazz);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ActiveRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object getThis(){
        throw new UnsupportedOperationException("Implement getThis on your class.");
    }
    
    public Object getClazz(){
        return clazz;
    }
    
    public boolean isPlurarize(){
        return PLURARIZE;
    }

    public String getClassName(){
        return clazz.getClass().getName();
    }
    
    public Field[] getFields(){
        Field[] f =  clazz.getClass().getFields();
        try {
            Field field = clazz.getClass().getDeclaredField("teste");
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException ex) {
            Logger.getLogger(ActiveRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
}
