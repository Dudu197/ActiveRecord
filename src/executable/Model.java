/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executable;

import br.com.dudollar.ActiveRecord;
import br.com.dudollar.annotations.BeforeSave;

/**
 *
 * @author 201500106
 */
public class Model extends ActiveRecord{
    
    public String teste = "Teste";
    
    public Model() {
        this.PLURARIZE = false;
    }
    
    @Override
    public Model getThis(){
        return this;
    }
    
    @BeforeSave
    public boolean verificaSalvador(Model m){
        System.out.println("Model");
        return true;
    }
    
    
}
