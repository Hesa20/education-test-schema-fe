/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.soal.pkg1_var.data.pkg2.java;

/**
 *
 * @author HESA
 */
public class TesSoal1_VarData2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Data  = {"2","1","2","2","2","8","1","1"};
        
        int counter2 = 0;
        
            
            for(int i=0;i < Data.length;i++){
                if(Data[i].equals("2")){
                    counter2++;
                }
            }
            
            System.out.println("jumlah angka 2 adalah "+counter2);
    }
    
}
