package cucumber.metodo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrigemDado {
    private Integer idOrigemDado;
    private String descricaoOrigemDado;
    private String codigoUsuarioOrigemDado;
    private String dataAlteracaoOrigemDado;
}
