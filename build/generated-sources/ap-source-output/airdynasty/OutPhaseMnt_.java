package airdynasty;

import airdynasty.AirCraft;
import airdynasty.OpmInterval;
import airdynasty.OpmRemarks;
import airdynasty.OpmTimeRem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-10-20T20:31:05")
@StaticMetamodel(OutPhaseMnt.class)
public class OutPhaseMnt_ { 

    public static volatile SingularAttribute<OutPhaseMnt, Integer> opmId;
    public static volatile SetAttribute<OutPhaseMnt, OpmInterval> opmIntervalSet;
    public static volatile SingularAttribute<OutPhaseMnt, String> opmDueHrs;
    public static volatile SingularAttribute<OutPhaseMnt, String> opmNomenclature;
    public static volatile SingularAttribute<OutPhaseMnt, Date> opmCalDueDate;
    public static volatile SetAttribute<OutPhaseMnt, OpmRemarks> opmRemarksSet;
    public static volatile SetAttribute<OutPhaseMnt, OpmTimeRem> opmTimeRemSet;
    public static volatile SingularAttribute<OutPhaseMnt, String> opmDueAt;
    public static volatile SingularAttribute<OutPhaseMnt, AirCraft> opmAcId;
    public static volatile SingularAttribute<OutPhaseMnt, String> opmDueHrsType;

}