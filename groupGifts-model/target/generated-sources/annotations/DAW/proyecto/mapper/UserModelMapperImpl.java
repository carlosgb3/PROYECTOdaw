package DAW.proyecto.mapper;

import DAW.proyecto.model.User;
import DAW.proyecto.to.UserTo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-11T20:19:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class UserModelMapperImpl implements UserModelMapper {

    @Override
    public UserTo toUserTo(User user) {
        if ( user == null ) {
            return null;
        }

        UserTo userTo = new UserTo();

        userTo.setId( user.getId() );
        userTo.setName( user.getName() );
        userTo.setSurname( user.getSurname() );
        userTo.setNick_name( user.getNick_name() );
        userTo.setPass( user.getPass() );
        userTo.setEmail( user.getEmail() );

        return userTo;
    }
}
