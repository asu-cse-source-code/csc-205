/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Activity2;

/**
 *
 * @author austinspencer
 */
public class Fruit implements Comparable <Fruit> {
    public String fruitName;
    public String fruitDesc;
    public int fruitQty;
    
    public Fruit(){
        this.fruitName = "Random";
        this.fruitDesc = "Round";
        this.fruitQty = 1;
        
    }
    
    public Fruit(String fruitName, String fruitDesc, int fruitQty){
        
        this.fruitDesc = fruitDesc;
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
        
    }
    public String getFruitName() {
        return fruitName;
    }
    public String getFruitDesc() {
        return fruitDesc;
    }
    public int getFruitQty() {
        return fruitQty;
    }
    public void setFruitName() {
        this.fruitName = fruitName;
    }
    public void setFruitDesc() {
        this.fruitDesc = fruitDesc;
    }
    public void setFruitQty() {
        this.fruitQty = fruitQty;
    }
    public String toString() {
        return "Fruit [fruitName=" + getFruitName() + ", fruitDesc=" 
                + getFruitDesc() + ", fruitQty=" + getFruitQty() + "]" ;
    }

    @Override
    public int compareTo(Fruit obj) {
        if (this.fruitName.equals(obj.fruitName))
        {
            
            
            if (this.fruitQty > obj.fruitQty)
                return 3;
            if (this.fruitQty < obj.fruitQty)
                return 2;
            else
                return 1;
           
        }
        else if (this.fruitName.length() < obj.fruitName.length())
        {
            return 1;
        }
           
        else if (this.fruitName.length() > obj.fruitName.length())
        {
            return -1;
           
        }
        return 0;
        
    }
    
           
}
