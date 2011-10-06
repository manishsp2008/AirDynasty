package airdynasty;

import airdynasty.AirCraft;
import airdynasty.OafciDueAtHrs;
import airdynasty.OafciDueHrs;
import airdynasty.OafciInterval;
import airdynasty.OafciRemarks;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-10-06T18:16:46")
@StaticMetamodel(OafChangeInt.class)
public class OafChangeInt_ { 

    public static volatile SingularAttribute<OafChangeInt, String> oafciNomenclature;
    public static volatile SetAttribute<OafChangeInt, OafciInterval> oafciIntervalSet;
    public static volatile SetAttribute<OafChangeInt, OafciDueAtHrs> oafciDueAtHrsSet;
    public static volatile SingularAttribute<OafChangeInt, Integer> oafciId;
    public static volatile SetAttribute<OafChangeInt, OafciDueHrs> oafciDueHrsSet;
    public static volatile SetAttribute<OafChangeInt, OafciRemarks> oafciRemarksSet;
    public static volatile SingularAttribute<OafChangeInt, AirCraft> oafciAcId;
    public static volatile SingularAttribute<OafChangeInt, String> oafciSpecs;

}