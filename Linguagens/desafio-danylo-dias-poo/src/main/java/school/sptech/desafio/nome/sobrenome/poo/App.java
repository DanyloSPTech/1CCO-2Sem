package school.sptech.desafio.nome.sobrenome.poo;

public class App {
    
    public static void main(String[]args){
        
        Colaborador marcos = new Colaborador("Marcos", "Dev Back-End Júnior", 2250.00);
        Colaborador douglas = new Colaborador("Douglas", "Dev C# Júnior", 2900.00);
        Colaborador david = new Colaborador("David", "Dev Web Pleno", 3580.00);
        Colaborador diogo = new Colaborador("Diogo", "Analista de Sistemas", 4800.00);
        
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println("=".repeat(20) + "Primeira Tomada de Testes" + "=".repeat(20));
        System.out.println(String.format("Colaborador: %s", marcos.getNome()));
        System.out.println(String.format("Cargo: %s", marcos.getCargo()));
        System.out.println(String.format("Salário: %.2f", marcos.getSalario()));
        System.out.println("=".repeat(70));
        System.out.println(String.format("Colaborador: %s", douglas.getNome()));
        System.out.println(String.format("Cargo: %s", douglas.getCargo()));
        System.out.println(String.format("Salário: %.2f", douglas.getSalario()));
        System.out.println("=".repeat(70));
        System.out.println(String.format("Colaborador: %s", david.getNome()));
        System.out.println(String.format("Cargo: %s", david.getCargo()));
        System.out.println(String.format("Salário: %.2f", david.getSalario()));
        System.out.println("=".repeat(70));
        System.out.println(String.format("Colaborador: %s", diogo.getNome()));
        System.out.println(String.format("Cargo: %s", diogo.getCargo()));
        System.out.println(String.format("Salário: %.2f", diogo.getSalario()));
        System.out.println("=".repeat(70));
        
        rh.reajustarSalario(marcos, 0.0);
        rh.reajustarSalario(douglas, 20.0);
        rh.promoverColaborador(david, "Dev Web Sênior", 3900.00);
        rh.promoverColaborador(diogo, "Dev Web Júnior", 1800.00);
        
        System.out.println("=".repeat(20) + "Segunda Tomada de Testes" + "=".repeat(20));
        System.out.println(String.format("Colaborador: %s", marcos.getNome()));
        System.out.println(String.format("Cargo: %s", marcos.getCargo()));
        System.out.println(String.format("Salário: %.2f", marcos.getSalario()));
        System.out.println("=".repeat(70));
        System.out.println(String.format("Colaborador: %s", douglas.getNome()));
        System.out.println(String.format("Cargo: %s", douglas.getCargo()));
        System.out.println(String.format("Salário: %.2f", douglas.getSalario()));
        System.out.println("=".repeat(70));
        System.out.println(String.format("Colaborador: %s", david.getNome()));
        System.out.println(String.format("Cargo: %s", david.getCargo()));
        System.out.println(String.format("Salário: %.2f", david.getSalario()));
        System.out.println("=".repeat(70));
        System.out.println(String.format("Colaborador: %s", diogo.getNome()));
        System.out.println(String.format("Cargo: %s", diogo.getCargo()));
        System.out.println(String.format("Salário: %.2f", diogo.getSalario()));
        System.out.println("=".repeat(70));
        
    }
    
}
