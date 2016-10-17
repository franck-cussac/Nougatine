package models.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.AdresseEJB;
import models.entities.CompteArgentEJB;
import models.entities.IdentiteeEJB;
import models.entities.ParisEJB;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T16:59:53")
@StaticMetamodel(UsersEJB.class)
public class UsersEJB_ { 

    public static volatile SingularAttribute<UsersEJB, String> password;
    public static volatile SingularAttribute<UsersEJB, AdresseEJB> idAdresse;
    public static volatile SingularAttribute<UsersEJB, CompteArgentEJB> idCompteArgent;
    public static volatile SingularAttribute<UsersEJB, IdentiteeEJB> idIdentitee;
    public static volatile ListAttribute<UsersEJB, ParisEJB> parisEJBList;
    public static volatile SingularAttribute<UsersEJB, Integer> id;
    public static volatile SingularAttribute<UsersEJB, String> pseudo;
    public static volatile SingularAttribute<UsersEJB, String> email;

}