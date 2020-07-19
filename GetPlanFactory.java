
package simplemediaconvertor;
public class GetPlanFactory{  
      
   
       public ConversionType getType(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("A" )) {  
                 return new mp4Tomp3();  
               }   
           else if(planType.equalsIgnoreCase("B")){  
                
            }   
          else if(planType.equalsIgnoreCase("C")) {  
              
          }  
      return null;  
   }  
}
