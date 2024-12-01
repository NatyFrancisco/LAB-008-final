/**
 * Autor: 100209167 Luis Fernando Ventura Concepcion
 * Descripción: Representa un autor en la base de datos.
 * Campos: author_id, name, etc.
 */
public class Authors {
    private String authorId;
    private String name;

    // Constructor
    public Authors(String authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    // Getters y Setters
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Otros métodos funcionales
}
