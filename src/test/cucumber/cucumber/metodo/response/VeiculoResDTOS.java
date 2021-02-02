package cucumber.metodo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VeiculoResDTOS {
    private String placa;
    private String imagemResDTOS;
    private List<DetalheResDTOS> detalheResDTOS = new ArrayList<>();
    private ProprietarioResDTO proprietarioResDTO;
}
