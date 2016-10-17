package models.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.EJBMatch;
import models.entities.UsersEJB;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T16:59:53")
@StaticMetamodel(ParisEJB.class)
public class ParisEJB_ { 

    public static volatile SingularAttribute<ParisEJB, UsersEJB> idUser;
    public static volatile SingularAttribute<ParisEJB, EJBMatch> idMatch;
    public static volatile SingularAttribute<ParisEJB, String> montant;
    public static volatile SingularAttribute<ParisEJB, Integer> id;
    public static volatile SingularAttribute<ParisEJB, String> jeux;

}