/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochilaenteradinamica;

import java.util.ArrayList;
import objetos.Item;

/**
 *
 * @author Roberto Cruz Leija
 */
public class SolucionDinamica {
    
    private ArrayList<Item> items;
    private int[][] mBeneficios;
    private int _W;

    public SolucionDinamica(ArrayList<Item> items, int _W) {
        this.items = items;
        this._W = _W;
        construirMatrizBeneficios();
    }

    private void construirMatrizBeneficios() {
        // construimos la matriz de beneficios 
        this.mBeneficios = new int[this.items.size()+1][this._W+1];
        // agregar en la primer columna puros ceros
        for (int x=0;x <= this.items.size();x++)
            this.mBeneficios[x][0] = 0;
        // agregar en la primer fila puros ceros
        
        for (int x=0;x <= this._W;x++)
            this.mBeneficios[0][x] = 0;
        
    }
    
    
//       // calculamos la matriz de beneficios
//       for (int i=1;i <= this.items.size();i++)
//           for(int w=0; w<= this.W;w++){
//           // verificamos si el item puede ser parte de la solucion
//               if  (this.items.get(i-1).getWeight()<= w){
//               
//                   if ((this.items.get(i-1).getBenefit()+
//                           this.matrizBeneficios[i-1][w-this.items.get(i-1).getWeight()])
//                           >this.matrizBeneficios[i-1][w]){
//                   
//                       this.matrizBeneficios[i][w] = this.items.get(i-1).getBenefit()+
//                               this.matrizBeneficios[i-1][w-this.items.get(i-1).getWeight()];
//                       
//                   }else{
//                   
//                        this.matrizBeneficios[i][w] = this.matrizBeneficios[i-1][w];
//                   
//                   }
//               
//               }else{
//               this.matrizBeneficios[i][w] = this.matrizBeneficios[i-1][w];
//               }
//           
//           }
//       this.maxBenefit = (int)matrizBeneficios[items.size()][W];
//
//    
    
    
}
