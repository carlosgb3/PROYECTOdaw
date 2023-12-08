package DAW.proyecto.service;

import DAW.proyecto.mapper.UserModelMapper;
import DAW.proyecto.model.User;
import DAW.proyecto.repository.UserRepository;
import DAW.proyecto.to.UserTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserModelMapper userModelMapper;

    @Autowired
    private  UserRepository userRepository;

    @Override
    public Optional<UserTo> getUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (!userOptional.isPresent()) { return Optional.empty(); }
        else {
            return Optional.ofNullable(userModelMapper.toUserTo(userOptional.get()));
        }
    }
}
