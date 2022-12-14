package metodi;
import java.util.Scanner;
public class Chislo {
 Scanner input = new Scanner (System.in);
 private int chislo=0;
 private int stoinost=0;
 
 public void setChislo(int chislo){
   if (chislo>=1 && chislo<=6){
       this.chislo = chislo;
   }//JJJJJJJJJJJJJJJJJJJJJJJJ
 }
 
 public int getChislo(){
     return chislo;
 }
 
  public void setStoinost(int stoinost){
   if (chislo>0){
       this.stoinost = stoinost;
   }
 }
 
   public int getStoinost(){
     return stoinost;
 }
   
 public void vuvezhdane(){
     System.out.println("1. Въвеждане на стойност");
     System.out.println("2. Намиране сумата на цифрите на въведеното число");
     System.out.println("3. Пресмятя факториела на въведеното число");
     System.out.println("4. Да извежда въведеното число, обърнато на обратно");
     System.out.println("5. Проверява дали въведеното число е съвършено");
     System.out.println("6. Изход");
     
        setChislo(input.nextInt());  
 }
    
public void izbor(){
    int suma=0;
    if (getChislo()==1){
    setStoinost(input.nextInt());
    }
        
    int stoin=getStoinost();
    
    if (getChislo()==2){
    while (stoin>0){
      suma = suma + stoin%10;
      stoin = stoin/10;
    }
    System.out.print(suma);
    }
    
    if (getChislo()==3){
        
    }
    
    if (getChislo()==4){
        
    }
        
    if (getChislo()==5){
        
    }
    if (getChislo()==6){
      System.exit(0);
    }
}    
}
