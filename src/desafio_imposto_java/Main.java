package desafio_imposto_java;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioAnual, salarioMensal, servicos, ganhoCapital, gastosMedicos, gastosEduc;
		double impostoSalario = 0;
		double impostoServicos = 0;
		double impostoCapital = 0;
		double maximoDedutivel = 0;
		double gastosDedutiveis = 0;
		double impostoBruto = 0;
		double abatimento = 0;
		double impostoDevido = 0;
		
		System.out.println("Renda anual com salário: ");
		salarioAnual = sc.nextDouble();
		
		System.out.println("Renda anual com prestação de serviço: ");
		servicos = sc.nextDouble();
		
		System.out.println("Renda anual com ganho de capital: ");
		ganhoCapital = sc.nextDouble();
		
		System.out.println("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		
		System.out.println("Gastos educacionais: ");
		gastosEduc = sc.nextDouble();
		
		salarioMensal = salarioAnual / 12;
		
		if(salarioMensal >= 3000 & salarioMensal <= 5000) {
			impostoSalario = salarioAnual * 0.1;
		}
		else {
			if(salarioMensal > 5000) {
				impostoSalario = salarioAnual * 0.2;
			}
		}
		
		if(servicos > 0) {
			impostoServicos = servicos * 0.15;
		}
		
		if(ganhoCapital > 0) {
			impostoCapital = ganhoCapital * 0.2;
		}
		
		impostoBruto = impostoSalario + impostoServicos + impostoCapital;
		maximoDedutivel = impostoBruto * 0.3;
		gastosDedutiveis = gastosMedicos + gastosEduc;
		
		if(gastosDedutiveis * 0.3 < maximoDedutivel) {
			abatimento = gastosDedutiveis;
		}
		else {
			abatimento = maximoDedutivel;
		}
		
		impostoDevido = impostoBruto - abatimento;
		
		System.out.println("");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA:");
		System.out.println("");
		
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
		System.out.println("");

		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
		System.out.println("");
		
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
		sc.close();
	}

}