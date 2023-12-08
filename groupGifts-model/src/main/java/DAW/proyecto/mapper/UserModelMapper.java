package DAW.proyecto.mapper;

import DAW.proyecto.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import DAW.proyecto.to.UserTo;

@Mapper(componentModel = "spring")
public interface UserModelMapper {

    UserTo toUserTo(User user);


}
