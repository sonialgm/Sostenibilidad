public class Vivienda implements Comparable<Vivienda>{
    private String codigo;
    private String territorio;
    private int valor;

    public Vivienda(String codigo, String territorio, int valor) { //Constructor
        this.codigo = codigo;
        this.territorio = territorio;
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getTerritorio() {
        return territorio;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() { //Formato en el que se imprimirá
        return "Territorio: "+this.territorio + " | Código: " + this.codigo + " | Valor: " + this.valor;
    }

    @Override
    public int compareTo(Vivienda otra) { //Ordenar de manera descendiente según el valor
        return otra.getValor() - this.valor;
    }

   
}
