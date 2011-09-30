/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.utils;

import airdynasty.CmpCurAfhrs;
import airdynasty.CompDueoffAfhrsInst;
import airdynasty.CompRemLife;
import airdynasty.Components;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

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
            
            Integer crCnt = Integer.valueOf(curHrs);
            Integer afCnt = Integer.valueOf(acLndCnt);
            
            return String.valueOf(crCnt - afCnt);
        }
        return " ";
        }
        catch(Exception e)
        {
            return " ";
        }
        
    }
    
    
    public static void updateCompSet(Set<Components> cmpObjSet, String afHrs, String acLndCnt, String flDate) throws ParseException  {
        
        for (Iterator<Components> it = cmpObjSet.iterator(); it.hasNext();) {
            
            Components cmpObj = it.next();
            
            Set<CompRemLife> crlObjSet = cmpObj.getCompRemLifeSet();
            
            Set<CmpCurAfhrs> ccaObjSet = cmpObj.getCmpCurAfhrsSet();
            
            setCAHrs(ccaObjSet, afHrs, acLndCnt, flDate);
            
            updateRLHRS(crlObjSet, afHrs, acLndCnt, flDate);
            
        }
        
       
    }
    
    private static void updateRLHRS(Set<CompRemLife> crlObjSet,String afHrs, String acLndCnt, String flDate) throws ParseException   {
        
        for (Iterator<CompRemLife> it = crlObjSet.iterator(); it.hasNext();) {
            
            CompRemLife crlObj = it.next();
                
                Set<CompDueoffAfhrsInst> cmpDOAHSet = crlObj.getCrlCompId().getCompDueoffAfhrsInstSet();
                
                for (Iterator<CompDueoffAfhrsInst> it1 =  cmpDOAHSet.iterator(); it1.hasNext();) {
                    
                    CompDueoffAfhrsInst cdaObj = it1.next();
                    
                    if(cdaObj.getCdaHrsType().equals("H")) {
                    Double h1 = Double.valueOf(cdaObj.getCdaHrs());
                    Double h2 = Double.valueOf(afHrs);
                    String res = String.valueOf(AirFrameLogic.roundTwoDec(h1 - h2));
                    crlObj.setCrlHrs(res);
                    }
                    if(cdaObj.getCdaHrsType().equals("D")) {
                    SimpleDateFormat sdfObj = new SimpleDateFormat("dd-MM-yyyy");
                    Date d1 = sdfObj.parse(cdaObj.getCdaHrs());
                    Date d2 = sdfObj.parse(flDate);
                    Long x = d1.getTime() - d2.getTime();
                    String res = String.valueOf(x / 86400000);
                    crlObj.setCrlHrs(res);
                    }
                    if(cdaObj.getCdaHrsType().equals("L")) {
                    Integer l1 = Integer.valueOf(cdaObj.getCdaHrs());
                    Integer l2 = Integer.valueOf(acLndCnt);
                    String res = String.valueOf(l1 - l2);
                    crlObj.setCrlHrs(res);
                    }   
                    
                }
                        
        }
        
    }
    
    private static void setCAHrs(Set<CmpCurAfhrs> ccaObjSet, String afHrs, String acLndCnt, String flDate) {
        
            for (Iterator<CmpCurAfhrs> it1 = ccaObjSet.iterator(); it1.hasNext();) {
                
                CmpCurAfhrs ccaObj = it1.next();
                
                if(ccaObj.getCmpCurAfhrsHrsType().equals("H")) {
                    
                    ccaObj.setCmpCurAfhrsHrs(afHrs);
                }
                else if(ccaObj.getCmpCurAfhrsHrsType().equals("D")) {
                    
                    ccaObj.setCmpCurAfhrsHrs(flDate);
                }
                else if(ccaObj.getCmpCurAfhrsHrsType().equals("L")) {
                    ccaObj.setCmpCurAfhrsHrs(acLndCnt);
                }
            }
        
    }
    
    public static void updateEngCompSet(Set<Components> cmpObjSet, String engHrs, String ngCycs, String npCycs, String engDate) throws ParseException {
        
        for (Iterator<Components> it = cmpObjSet.iterator(); it.hasNext();) {
            
            Components cmpObj = it.next();
            
            Set<CompRemLife> crlObjSet = cmpObj.getCompRemLifeSet();
            
            Set<CmpCurAfhrs> ccaObjSet = cmpObj.getCmpCurAfhrsSet();
            
            setEngCAHrs(ccaObjSet, engHrs, ngCycs, npCycs, engDate);
            
            updateEngRLHrs(crlObjSet, engHrs, ngCycs, npCycs, engDate);
            
        }
        
        
    }
    
    private static void updateEngRLHrs(Set<CompRemLife> crlObjSet, String engHrs, String ngCycs, String npCycs, String engDate) throws ParseException {
        
        for (Iterator<CompRemLife> it = crlObjSet.iterator(); it.hasNext();) {
            
            CompRemLife crlObj = it.next();
                
                Set<CompDueoffAfhrsInst> cmpDOAHSet = crlObj.getCrlCompId().getCompDueoffAfhrsInstSet();
                
                for (Iterator<CompDueoffAfhrsInst> it1 =  cmpDOAHSet.iterator(); it1.hasNext();) {
                    
                    CompDueoffAfhrsInst cdaObj = it1.next();
                    
                    if(cdaObj.getCdaHrsType().equals("H")) {
                    Double h1 = Double.valueOf(cdaObj.getCdaHrs());
                    Double h2 = Double.valueOf(engHrs);
                    String res = String.valueOf(AirFrameLogic.roundTwoDec(h1 - h2));
                    crlObj.setCrlHrs(res);
                    }
                    if(cdaObj.getCdaHrsType().equals("D")) {
                    SimpleDateFormat sdfObj = new SimpleDateFormat("dd-MM-yyyy");
                    Date d1 = sdfObj.parse(cdaObj.getCdaHrs());
                    Date d2 = sdfObj.parse(engDate);
                    Long x = d1.getTime() - d2.getTime();
                    String res = String.valueOf(x / 86400000);
                    crlObj.setCrlHrs(res);
                    }
                    if(cdaObj.getCdaHrsType().equals("G")) {
                    Integer l1 = Integer.valueOf(cdaObj.getCdaHrs());
                    Integer l2 = Integer.valueOf(ngCycs);
                    String res = String.valueOf(l1 - l2);
                    crlObj.setCrlHrs(res);
                    }   
                    if(cdaObj.getCdaHrsType().equals("P")) {
                    Integer l1 = Integer.valueOf(cdaObj.getCdaHrs());
                    Integer l2 = Integer.valueOf(npCycs);
                    String res = String.valueOf(l1 - l2);
                    crlObj.setCrlHrs(res);
                    }
                }
                        
        }
        
    } 
    
    private static void setEngCAHrs(Set<CmpCurAfhrs> ccaObjSet, String engHrs, String ngCycs, String npCycs, String engDate) {
        
        for (Iterator<CmpCurAfhrs> it1 = ccaObjSet.iterator(); it1.hasNext();) {
                
                CmpCurAfhrs ccaObj = it1.next();
                
                if(ccaObj.getCmpCurAfhrsHrsType().equals("H")) {
                    ccaObj.setCmpCurAfhrsHrs(engHrs);
                }
                else if(ccaObj.getCmpCurAfhrsHrsType().equals("D")) {
                    ccaObj.setCmpCurAfhrsHrs(engDate);
                }
                else if(ccaObj.getCmpCurAfhrsHrsType().equals("G")) {
                    ccaObj.setCmpCurAfhrsHrs(ngCycs);
                }
                else if(ccaObj.getCmpCurAfhrsHrsType().equals("P")) {
                    ccaObj.setCmpCurAfhrsHrs(npCycs);
                }
            }
        
    }
}
