package DAW.proyecto.mapper;

import DAW.proyecto.groupGifts.dto.UserDto;
import DAW.proyecto.to.UserTo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRestMapper {

    UserTo toUserTo(UserDto userDto);

    UserDto toUserDto(UserTo userTo);
}
