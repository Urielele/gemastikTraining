package gemastiktraining;

import java.util.LinkedList;
import java.util.Scanner;

public class mainSoal2 {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int n, x, y;
        
        //input banyak pohon (n), posisi pak blangkon(x,y)
        n = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        posisiNode blangkon = new posisiNode(x,y);
        
        posisiNode pohon[] = new posisiNode[n];
        
        //input posisi pohon
        for(int i = 0; i < pohon.length; i++){
            x = input.nextInt();
            y = input.nextInt();
            pohon[i] = new posisiNode(x, y, blangkon);
        }
        
        LinkedList<posisiNode> lPohon = new LinkedList<posisiNode>();
        
        for(int i = 0; i < pohon.length; i++){
            
            if(lPohon.isEmpty()){
                lPohon.add(pohon[i]);
                
            }else{   
                boolean sama = false;
                
                for(posisiNode mPohon : lPohon){
                    if(pohon[i].m == mPohon.m && pohon[i].kiri == mPohon.kiri){
                        sama = true;
                        break;
                    }
                }
 
                if(!sama){
                    lPohon.add(pohon[i]);
                }
                
            }
        }

        System.out.println(lPohon.size());
    }
}
