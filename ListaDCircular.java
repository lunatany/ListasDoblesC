/*
 * LISTA DOBLE CIRCULAR
 */
package informe4;

/**
 * 
 * @author Tany Pinto
 */
public class ListaDCircular {
    private NodoC p;
    ListaDCircular()
    {
        p=null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }
    
    //PRIMITIVAS
    int nroNodos()
    {
        NodoC r=new NodoC();
        int c;
        if (getP()==null)
            return 0;
        r=getP();
        c=1;
        while (r.getSig()!=getP())
        {
            r=r.getSig();
            c=c+1;
        }
        return c;
    }
    void adiprincipio(libro x){
        NodoC nue=new NodoC();
        nue.setL(x);
        if (getP()==null){
            setP(nue);
            nue.setSig(getP()); //nue.setSig(nue);
            nue.setAnt(getP());
            //getP().setAnt(getP())
        }
        else{
            NodoC u=getP().getAnt();
            nue.setSig(getP());
            nue.setAnt(u);
            getP().setAnt(nue);
            setP(nue);
            u.setSig(getP()); //u.setSig(nue)
        }
    }
    
    void adifinal(libro x)
    {
        NodoC nue=new NodoC();
        NodoC z=new NodoC();
        nue.setL(x);
        if (getP()==null){
            setP(nue);
            nue.setSig(nue);
            nue.setAnt(nue);}
    
        else{
            z=getP().getAnt();
            z.setSig(nue);
            nue.setAnt(z);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }
    //quitar principio
    NodoC eliprincipio()
    {
        NodoC r= new NodoC();
        NodoC q= new NodoC();
        NodoC x = getP();
        if (x.getSig()==getP())
        {
            setP(null);
            x.setSig(null);
            x.setAnt(null);
        }else{
            r=x.getSig();
            q=x.getAnt();
            setP(r);
            r.setAnt(q);
            q.setSig(r);
            x.setSig(null);
            x.setAnt(null);
        }
        return x;
    }
    //quitar final
    NodoC elifinal(){
        //NodoC r= new NodoC();
        NodoC q= new NodoC();
        NodoC x = getP();
        NodoC r = getP();
        if (r.getSig() == getP())
        {   setP(null);
            x.setAnt(null);
            x.setSig(null);
        }
        else{
            x=r.getAnt();
            q=x.getAnt();
            r.setAnt(q);
            q.setSig(r);
            x.setAnt(null);
            x.setSig(null);
        }
        return (x);
        
    }
    //leer
    void leer(int n){
        for(int i=1;i<=n;i++){
            System.out.println("Ingrese un libro: ");
            libro z=new libro();
            z.leer();
            adifinal(z);
        }

    }
    void mostrar()
    {
        System.out.println("\n LISTA CIRCULAR DE LIBROS ");
        NodoC r=getP(); int cant=1;
        while (r.getSig()!=getP())
        {
            System.out.printf(" -%d ",cant);cant++;
            r.getL().mostrar();
            r=r.getSig();
        }
        r.getL().mostrar();
        System.out.println();
    }

}
