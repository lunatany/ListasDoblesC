/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informe4;

/**
 *
 * @author Tany Pinto
 */
public class NodoC {
    private libro l;
    private NodoC ant,sig;
    
    NodoC()
    {
        ant=sig=null;
    }

    public libro getL() {
        return l;
    }

    public void setL(libro l) {
        this.l = l;
    }

    public NodoC getAnt() {
        return ant;
    }

    public void setAnt(NodoC ant) {
        this.ant = ant;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
    
    

}
