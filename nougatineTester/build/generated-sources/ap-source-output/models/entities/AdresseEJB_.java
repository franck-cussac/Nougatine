package models.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.UsersEJB;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T16:59:53")
@StaticMetamodel(AdresseEJB.class)
public class AdresseEJB_ { 

    public static volatile SingularAttribute<AdresseEJB, String> ville;
    public static volatile ListAttribute<AdresseEJB, UsersEJB> usersEJBList;
    public static volatile SingularAttribute<AdresseEJB, String> adresse;
    public static volatile SingularAttribute<AdresseEJB, Integer> id;
    public static volatile SingularAttribute<AdresseEJB, String> codePostal;

}