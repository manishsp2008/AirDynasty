package airdynasty;

import airdynasty.AirCraft;
import airdynasty.CmpAfhrsInst;
import airdynasty.CmpCurAfhrs;
import airdynasty.CmpDateInst;
import airdynasty.CmpFinitelife;
import airdynasty.CmpLiferemInst;
import airdynasty.CmpRemarks;
import airdynasty.CmpSerialNumber;
import airdynasty.CompDueoffAfhrsInst;
import airdynasty.CompRemLife;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-10-06T18:16:46")
@StaticMetamodel(Components.class)
public class Components_ { 

    public static volatile SingularAttribute<Components, Integer> compId;
    public static volatile SetAttribute<Components, CompDueoffAfhrsInst> compDueoffAfhrsInstSet;
    public static volatile SetAttribute<Components, CompRemLife> compRemLifeSet;
    public static volatile SetAttribute<Components, CmpCurAfhrs> cmpCurAfhrsSet;
    public static volatile SetAttribute<Components, CmpSerialNumber> cmpSerialNumberSet;
    public static volatile SetAttribute<Components, CmpLiferemInst> cmpLiferemInstSet;
    public static volatile SingularAttribute<Components, String> compPartnum;
    public static volatile SetAttribute<Components, CmpFinitelife> cmpFinitelifeSet;
    public static volatile SingularAttribute<Components, String> compPartname;
    public static volatile SetAttribute<Components, CmpRemarks> cmpRemarksSet;
    public static volatile SetAttribute<Components, CmpAfhrsInst> cmpAfhrsInstSet;
    public static volatile SetAttribute<Components, CmpDateInst> cmpDateInstSet;
    public static volatile SingularAttribute<Components, AirCraft> compAcId;

}