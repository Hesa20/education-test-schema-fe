/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.soal.pkg1_var.data.pkg1.java;

/**
 *
 * @author HESA
 */
public class TestSoal1_VarData1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Data = {"1","1","1","2","2","4","1","1"};
        
        int counter1 = 0;
        
            for(int i=0;i < Data.length;i++){
                if(Data[i].equals("1")){
                    counter1++;
            }
        }
        
        System.out.println("jumlah angka 1 adalah "+counter1);
    }
    
}
