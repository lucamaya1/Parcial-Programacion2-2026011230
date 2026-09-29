public class Main {
    public static void main(String[] args) {
        EstrategiaComision estrategiaInicial = new ComisionPersonalizada();
<<<<<<< HEAD
        Vendedor vendedor = new Vendedor("Lucas Amaya", 2000.0, estrategiaInicial);
=======
        Vendedor vendedor = new Vendedor("Lucas Amaya", 1000.0, estrategiaInicial);
>>>>>>> feature/comision-personalizada
        
        vendedor.mostrarDetalle();
    }
}