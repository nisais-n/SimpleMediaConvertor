/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemediaconvertor;

/**
 *
 * @author User
 */
class GetPlanFactory{  
      
   //use getPlan method to get object of type Plan   
       public ConversionType getType(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("A" )) {  
                 return new mp4Tomp3() {};  
               }   
           else if(planType.equalsIgnoreCase("B")){  
                //return new mp4Toflv();  
            }   
          else if(planType.equalsIgnoreCase("C")) {  
               // return new mp4Tomkv();  
          }  
      return null;  
   }  
}
