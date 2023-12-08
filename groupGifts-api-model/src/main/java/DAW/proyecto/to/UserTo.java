package DAW.proyecto.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTo {

    private Long id;

    private String name;

    private String surname;

    private String nick_name;

    private String pass;

    private String email;

}
