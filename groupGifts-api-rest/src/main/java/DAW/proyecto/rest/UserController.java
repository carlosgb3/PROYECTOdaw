package DAW.proyecto.rest;

import DAW.proyecto.groupGifts.dto.UserDto;
import DAW.proyecto.groupGifts.rest.UserApi;
import DAW.proyecto.mapper.UserRestMapper;
import DAW.proyecto.service.UserService;
import DAW.proyecto.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRestMapper userRestMapper;

    @Override
    public ResponseEntity<UserDto> getUser(Long id) {
        Optional<UserTo> optionalUserTo = userService.getUser(id);
        if(optionalUserTo.isPresent()){
            return new ResponseEntity<>(userRestMapper.toUserDto(optionalUserTo.get()), HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(new UserDto(), HttpStatus.NOT_FOUND);
        }
    }
}
