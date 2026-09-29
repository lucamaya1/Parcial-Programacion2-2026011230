public class Main {
    public static void main(String[] args) {
        EstrategiaComision estrategiaInicial = new ComisionPersonalizada();
        Vendedor vendedor = new Vendedor("Lucas Amaya", 2000.0, estrategiaInicial);
        
        vendedor.mostrarDetalle();
    }
}