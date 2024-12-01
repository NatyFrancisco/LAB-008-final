/**
 * Autor: Luis Fernando Ventura Concepcion
 * Descripción: Representa un empleado en la base de datos.
 * Campos: employee_id, name, job_id, etc.
 */
public class Employee {
    private String employeeId;
    private String name;
    private String jobId;

    // Constructor
    public Employee(String employeeId, String name, String jobId) {
        this.employeeId = employeeId;
        this.name = name;
        this.jobId = jobId;
    }

    // Getters y Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    // Otros métodos funcionales
}
