/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemediaconvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Convertor {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
         public String MpathSave;
         public String Mpath;

    public static void main(String args[])throws IOException{  
      GetPlanFactory planFactory = new GetPlanFactory();  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
      System.out.print("Enter the Conversion Type: \n\n \t \t A - MP4 to MP3 \n\n \t\t B - MP4 to MKV \n\n\t\t C - MP4 to FLV \n\n ");  
      String planType=br.readLine();  
     // System.out.print("Enter the file path: ");
     // String Mpath=br.readLine(); 
      System.out.print("Enter the file saving path: ");
      //String MpathSave=br.readLine(); 
      
  
      ConversionType Con = planFactory.getType(planType); 
     // Con.FileSavePath = Mpath;
    //  Con.FileSourcePath = MpathSave;
  
       //System.out.print("Converting of  "+Mpath+" Done  to "+planType+" Success: ");  
          Con.getType();    
         // Con.convertToMP3();
            }  
    }

