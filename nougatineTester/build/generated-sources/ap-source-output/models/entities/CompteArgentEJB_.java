package models.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.UsersEJB;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T16:59:53")
@StaticMetamodel(CompteArgentEJB.class)
public class CompteArgentEJB_ { 

    public static volatile ListAttribute<CompteArgentEJB, UsersEJB> usersEJBList;
    public static volatile SingularAttribute<CompteArgentEJB, Float> argent;
    public static volatile SingularAttribute<CompteArgentEJB, Integer> id;
    public static volatile SingularAttribute<CompteArgentEJB, String> infoBancaire;

}