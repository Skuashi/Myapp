package Objetos;

public class Productos {


    private int[] id;
    private String[] Insumos = {"AA", "BB", "CC"};
    private int[] precios = {1500, 2500, 3500};


    public Productos(){}

    public Productos(int[] id, String[] insumos) {
        this.id = id;
        Insumos = insumos;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public String[] getInsumos() {
        return Insumos;
    }

    public void setInsumos(String[] insumos) {
        Insumos = insumos;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    //reglas de negocios
    public int anadirAdicional(int valor, int adicional)
    {
        return valor + adicional;
    }

}
