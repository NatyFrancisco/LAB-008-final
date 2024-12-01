// Total de ventas por tienda
public double totalVentasPorTienda(String storeId) {
    double total = 0;
    for (Sales sale : salesList) {
        if (sale.getStoreId().equals(storeId)) {
            total += sale.getAmount();
        }
    }
    return total;
}

// Promedio de ventas
public double ventasPromedio() {
    double total = 0;
    for (Sales sale : salesList) {
        total += sale.getAmount();
    }
    return total / salesList.size();
}
