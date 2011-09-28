/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author A187252
 */
public class AirFrameLogic {
    
    public static Double roundTwoDec(Double num)   {
        
        DecimalFormat dfObj = new DecimalFormat("#.##");
        return Double.valueOf(dfObj.format(num));
    }
    
    public static String doSubtraction(String curHrs,String afHrs, String acLndCnt, String flDate,String hrsType)  {
        
        try {
        if(hrsType.equals("H")) {
            
            Double crHrs = Double.valueOf(curHrs);
            Double subHrs = Double.valueOf(afHrs);
            
            return String.valueOf(roundTwoDec(crHrs - subHrs));
        }
        else if(hrsType.equals("D"))   {
            
            SimpleDateFormat sdfObj = new SimpleDateFormat("dd-MM-yyyy");
            Date d = sdfObj.parse(curHrs);
            Date subDate = sdfObj.parse(flDate);
            
            long temp = d.getTime() - subDate.getTime();
            Date finalDate = new Date(temp);
            
            return sdfObj.format(finalDate);
            
        }
        else if(hrsType.equals("L"))   {
            
            Long crCnt = Long.valueOf(curHrs);
            Long afCnt = Long.valueOf(acLndCnt);
            
            return String.valueOf(crCnt - afCnt);
        }
        return "";
        }
        catch(Exception e)
        {
            return "";
        }
        
    }
    
}
