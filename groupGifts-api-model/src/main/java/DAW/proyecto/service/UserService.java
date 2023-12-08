package DAW.proyecto.service;

import DAW.proyecto.to.UserTo;

import java.util.Optional;

public interface UserService {

    public  Optional<UserTo> getUser(Long id);


}
