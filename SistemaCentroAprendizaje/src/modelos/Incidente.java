package modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<Object> logActualizaciones = new ArrayList<>();
    protected LocalDateTime fechaCerrado;
    protected String tipo;
    private Usuario responsable;
    private PersonalAcademico beneficiario;
}
