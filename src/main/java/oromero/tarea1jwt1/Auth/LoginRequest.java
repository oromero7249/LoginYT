package oromero.tarea1jwt1.Auth;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//crear getter y setter de forma automatica
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    //Se va a pedir las credenciales.
    String username;
    String password;
}
