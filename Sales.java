/**
 * Autor: 100209167 Luis Fernando Ventura Concepcion
 * Descripción: Representa una venta en la base de datos.
 * Campos: sale_id, title_id, store_id, amount, etc.
 */
public class Sales {
    private String saleId;
    private String titleId;
    private String storeId;
    private double amount;

    // Constructor
    public Sales(String saleId, String titleId, String storeId, double amount) {
        this.saleId = saleId;
        this.titleId = titleId;
        this.storeId = storeId;
        this.amount = amount;
    }

    // Getters y Setters
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Otros métodos funcionales
}
