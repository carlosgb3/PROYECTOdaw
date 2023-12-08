package DAW.proyecto.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> pass;
	public static volatile SingularAttribute<User, String> surname;
	public static volatile SingularAttribute<User, String> nick_name;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Long> id;
	public static volatile SingularAttribute<User, String> email;

	public static final String PASS = "pass";
	public static final String SURNAME = "surname";
	public static final String NICK_NAME = "nick_name";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

