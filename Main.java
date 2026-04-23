public class Main {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[4];

        empregados[0] = new EmpregadoComissionado(1, "Miguel", 100.0, 110);
        empregados[1] = new EmpregadoComissionado(2, "ana", 1000, 20);
        empregados[2] = new EmpregadoHorista(3, "Juliana", 120, 21);
        empregados[3] = new EmpregadoHorista(14, "joao", 2200, 100);

        for (int i=0; i< empregados.length; i++){
            System.out.println(empregados[i].matricula);
            System.out.println(empregados[i].nome);
            System.out.println();
        }

        //for generico
        for (Empregado e : empregados) {
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }
    }
}
