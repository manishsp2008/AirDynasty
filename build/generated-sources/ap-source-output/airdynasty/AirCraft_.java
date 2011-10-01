package airdynasty;

import airdynasty.AfEngInsp;
import airdynasty.Components;
import airdynasty.OafChangeInt;
import airdynasty.OutPhaseMnt;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-10-01T21:08:05")
@StaticMetamodel(AirCraft.class)
public class AirCraft_ { 

    public static volatile SingularAttribute<AirCraft, String> acAfhrs;
    public static volatile SingularAttribute<AirCraft, String> acSerialnum;
    public static volatile SingularAttribute<AirCraft, String> acNpcycs;
    public static volatile SingularAttribute<AirCraft, String> acFormnum;
    public static volatile SetAttribute<AirCraft, Components> componentsSet;
    public static volatile SetAttribute<AirCraft, AfEngInsp> afEngInspSet;
    public static volatile SingularAttribute<AirCraft, Integer> acId;
    public static volatile SingularAttribute<AirCraft, String> acStartcount;
    public static volatile SingularAttribute<AirCraft, String> acLandingcount;
    public static volatile SingularAttribute<AirCraft, String> acName;
    public static volatile SingularAttribute<AirCraft, String> acEngngcycs;
    public static volatile SingularAttribute<AirCraft, String> acEnghrs;
    public static volatile SetAttribute<AirCraft, OutPhaseMnt> outPhaseMntSet;
    public static volatile SetAttribute<AirCraft, OafChangeInt> oafChangeIntSet;

}