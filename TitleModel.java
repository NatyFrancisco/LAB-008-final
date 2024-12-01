
/**
 * Autor: 100209167 Luis Fernando Ventura Concepcion
 * Descripción: Clase para manejar el CRUD de Title.
 */
public class TitleModel {
    private ArrayList<Title> titles;
    private HashMap<String, Title> titleMap;

    // Constructor
    public TitleModel() {
        titles = new ArrayList<>();
        titleMap = new HashMap<>();
    }

    // Agregar un libro
    public void addTitle(Title title) {
        titles.add(title);
        titleMap.put(title.getTitleId(), title);
    }

    // Obtener un libro por ID
    public Title getTitleById(String titleId) {
        return titleMap.get(titleId);
    }

    // Otros métodos CRUD (actualizar, eliminar, etc.)
}
