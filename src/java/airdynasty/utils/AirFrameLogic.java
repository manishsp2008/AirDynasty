/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airdynasty.utils;

import airdynasty.AirCraft;
import airdynasty.CmpCurAfhrs;
import airdynasty.CompRemLife;
import airdynasty.Components;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author A187252
 */
public class AirFrameLogic {
    
    public static Double roundTwoDec(Double num)   {
        
        DecimalFormat dfObj = new DecimalFormat("#.##");
        return Double.valueOf(dfObj.format(num));
    }
    
}
