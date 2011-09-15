/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.utils;

import airdynasty.AirCraft;
import airdynasty.CmpCurAfhrs;
import airdynasty.CompRemLife;
import airdynasty.Components;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author A187252
 */
public class AirFrameLogic {
    
    public static void setCurrentAFHrs(AirCraft acObj, Double afHrs)
    {
        Collection<Components> cmps = acObj.getComponentsCollection();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
            
            Collection<CmpCurAfhrs> caObj = cmp.getCmpCurAfhrsCollection();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CmpCurAfhrs cca = (CmpCurAfhrs) it.next();
                
                cca.setCmpCurAfhrsHrs(afHrs);
                
            }
            
            
        }
    }
    
    public static void setRemAFHrs(AirCraft acObj, Double afHrs)    {
        
        Collection<Components> cmps = acObj.getComponentsCollection();
        
        for(Iterator itr = cmps.iterator(); itr.hasNext();)  {
            Components cmp = (Components)itr.next();
        
            Collection<CompRemLife> caObj = cmp.getCompRemLifeCollection();
            
            for(Iterator it = caObj.iterator(); it.hasNext();)  {
                
                CompRemLife cca = (CompRemLife) it.next();
                
                Double prevHrs = cca.getCrlHrs();
                
                cca.setCrlHrs(prevHrs - afHrs);
            
        }
        
    }
    }
}
