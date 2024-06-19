package Lmain;

import Lmain.Materia.Controllers.ArbolBinario;
/*
 * 
 * 
 * 
 */
import Lmain.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbol=new ArbolBinario();
        Node nodeRoot=new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));
        
        nodeRoot.getRight().setRight(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node (7));
        nodeRoot.getLeft().getLeft().setRight(new Node (8));

       System.out.println("Pre Ordenloop");
       arbol.preOrdenloop(nodeRoot);
       System.out.println("");
       System.out.println("Pre Orden Recursivo");
       arbol.preOrdenRecursivo(nodeRoot);
       System.out.println();
       System.out.println("Post Orderloop");
       arbol.postOrderloop(nodeRoot);
       System.out.println();
       System.out.println("Post Orden Recursivo");
       arbol.postOrdenRecursivo(nodeRoot);
       System.out.println();
       System.out.println("In Orden Recursivo");
       arbol.inOrdenRecursivo(nodeRoot);


    }
}
