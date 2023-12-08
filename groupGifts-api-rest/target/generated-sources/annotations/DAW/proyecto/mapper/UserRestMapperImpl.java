package DAW.proyecto.mapper;

import DAW.proyecto.groupGifts.dto.UserDto;
import DAW.proyecto.to.UserTo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-11T20:19:41+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class UserRestMapperImpl implements UserRestMapper {

    @Override
    public UserTo toUserTo(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserTo userTo = new UserTo();

        userTo.setId( userDto.getId() );
        userTo.setName( userDto.getName() );
        userTo.setPass( userDto.getPass() );
        userTo.setEmail( userDto.getEmail() );

        return userTo;
    }

    @Override
    public UserDto toUserDto(UserTo userTo) {
        if ( userTo == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( userTo.getId() );
        userDto.setName( userTo.getName() );
        userDto.setPass( userTo.getPass() );
        userDto.setEmail( userTo.getEmail() );

        return userDto;
    }
}
