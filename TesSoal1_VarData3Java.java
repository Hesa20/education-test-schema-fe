/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.soal.pkg1_var.data.pkg3.java;

/**
 *
 * @author HESA
 */
public class TesSoal1_VarData3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Data = {"3","3","3","3","2","4","1","1"};
        
        int counter3 = 0;
        
            for(int i=0;i < Data.length;i++){
                if(Data[i].equals("3")){
                    counter3++;
                }
            }
            
            System.out.println("jumlah angka 3 adalah "+counter3);
    }
    
}
