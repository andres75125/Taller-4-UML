package modelos;

import java.util.ArrayList;
import java.util.List;

public class PersonalAcademico extends Usuario {
    protected List<Incidente> incidentesIngresados = new ArrayList<>();
    public void reportarError(String email, String contenido) {    
    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido) {   
    }
    public void comentarEnForo(Foro foro, String comentario) {  
    }
}
