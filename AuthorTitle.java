/**
 * Autor: 100209167 Luis Fernando Ventura Concepcion
 * Descripción: Relaciona autores con los libros que han escrito.
 * Campos: author_id, title_id
 */
public class AuthorTitle {
    private String authorId;
    private String titleId;

    // Constructor
    public AuthorTitle(String authorId, String titleId) {
        this.authorId = authorId;
        this.titleId = titleId;
    }

    // Getters y Setters
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    // Otros métodos funcionales
}
