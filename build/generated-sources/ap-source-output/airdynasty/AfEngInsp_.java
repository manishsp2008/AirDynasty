package airdynasty;

import airdynasty.AirCraft;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-09-20T18:50:49")
@StaticMetamodel(AfEngInsp.class)
public class AfEngInsp_ { 

    public static volatile SingularAttribute<AfEngInsp, String> aesNomenclature;
    public static volatile SingularAttribute<AfEngInsp, String> aesDueTime;
    public static volatile SingularAttribute<AfEngInsp, AirCraft> aesAcId;
    public static volatile SingularAttribute<AfEngInsp, String> aesDueEngHrs;
    public static volatile SingularAttribute<AfEngInsp, String> aesRemarks;
    public static volatile SingularAttribute<AfEngInsp, Integer> aesId;
    public static volatile SingularAttribute<AfEngInsp, Date> aesCalDueDate;
    public static volatile SingularAttribute<AfEngInsp, String> aesDueAfHrs;

}