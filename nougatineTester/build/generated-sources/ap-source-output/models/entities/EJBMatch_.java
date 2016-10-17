package models.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.ParisEJB;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T16:59:53")
@StaticMetamodel(EJBMatch.class)
public class EJBMatch_ { 

    public static volatile SingularAttribute<EJBMatch, Date> dateHeure;
    public static volatile SingularAttribute<EJBMatch, Float> cote;
    public static volatile SingularAttribute<EJBMatch, String> equipe2;
    public static volatile SingularAttribute<EJBMatch, String> equipe1;
    public static volatile ListAttribute<EJBMatch, ParisEJB> parisEJBList;
    public static volatile SingularAttribute<EJBMatch, Integer> id;

}