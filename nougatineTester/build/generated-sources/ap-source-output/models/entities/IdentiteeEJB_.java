package models.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.entities.UsersEJB;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-27T16:59:53")
@StaticMetamodel(IdentiteeEJB.class)
public class IdentiteeEJB_ { 

    public static volatile ListAttribute<IdentiteeEJB, UsersEJB> usersEJBList;
    public static volatile SingularAttribute<IdentiteeEJB, Date> birthdate;
    public static volatile SingularAttribute<IdentiteeEJB, String> genre;
    public static volatile SingularAttribute<IdentiteeEJB, Integer> id;
    public static volatile SingularAttribute<IdentiteeEJB, String> prenom;
    public static volatile SingularAttribute<IdentiteeEJB, String> nom;

}