/**
 * Autor: 100209167 Luis Fernando Ventura Concepcion
 * Descripción: Representa el libro en la base de datos.
 * Campos: title_id, title, price, etc.
 * Constructores, mutadores/setters, getters/accesores y métodos funcionales.
 */
public class Title {
    private String titleId;
    private String title;
    private double price;

    // Constructor
    public Title(String titleId, String title, double price) {
        this.titleId = titleId;
        this.title = title;
        this.price = price;
    }

    // Getters y Setters
    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Otros métodos funcionales
}
