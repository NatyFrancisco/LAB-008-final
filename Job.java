/**
 * Autor: 100209167 Luis Fernando Ventura Concepcion
 * Descripción: Representa un trabajo de un empleado en la base de datos.
 * Campos: job_id, description
 */
public class Job {
    private String jobId;
    private String description;

    // Constructor
    public Job(String jobId, String description) {
        this.jobId = jobId;
        this.description = description;
    }

    // Getters y Setters
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Otros métodos funcionales
}
