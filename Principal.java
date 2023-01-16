/*
 *principal, informe 4
 */
package informe4;

public class Principal {
    public static int menu(){
        int opc=-1;
        do{
            System.out.printf("\n%s", "1.LEER");
            System.out.printf("\n%s", "2.MOSTRAR");
            System.out.printf("\n%s", "3.AGREGAR ELEMENTO POSICION I-ESIMA");
            
            System.out.printf("\n%s", "0.Salir");
            System.out.printf("\n%s", "Elija opcion: ");
            opc = entrada.entero();
        } while (opc<0 || opc>4);
        return opc;
    }
    public static void AgregarElem(ListaDCircular A, int i){
        
        if (i<=A.nroNodos())
        {
            NodoC r=A.getP();
            for (int j=1;j<=A.nroNodos();j++){
                if (j==i)
                {
                    NodoC q=r.getSig();
                    NodoC nue=new NodoC();
                    libro lx=new libro();
                    lx.leer();
                    nue.setL(lx);
                    r.setSig(nue);
                    nue.setAnt(r);
                    nue.setSig(q);
                    q.setAnt(nue);
                }
                r=r.getSig();
            }
        }
    }
    
    public static void main(String[] args) {
        ListaDCircular A = new ListaDCircular();
            int opc=-1;
            do{
                opc = menu();
                switch ( opc ) {
                    case 1: 
                        System.out.println("----------------------------");
                        System.out.println("Ingrese tamaño de la lista: ");
                        int n=entrada.entero();
                        A.leer(n);
                        
                        break;
                    case 2: 
                        System.out.println("------------2)--------------");
                        A.mostrar();
                        
                        break;
                    case 3:
                        System.out.println("------------3)---------------");
                        System.out.println("Ingrese posición en donde agregar elem.: ");
                        int k=entrada.entero();
                        k=k-1;
                        AgregarElem(A,k);
                        break;
                    
                    
                }
            } while (opc!=0);
        
       
    }
    
   
}

    

