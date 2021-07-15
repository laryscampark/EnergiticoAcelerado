import java.util.Scanner;

public class Calculando {
    public static void main(String[] args) {
        String nome,nome2;
        double n,x,
                totalm,totalm2,totalimposto2,total2,totalMercadorias,
                totalimposto1,total1, totalimposto, total;
        double icms,ipi,pis,cofins,icms2,ipi2,pis2,cofins2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = ler.next();

        System.out.println("Informe a quantidade para a primeira empresa: ");
        n = ler.nextFloat();

        System.out.println("Informe o seu nome: ");
        nome2 = ler.next();

        System.out.println("Informe a quantidade para a segunda empresa: ");
        x = ler.nextFloat();


        totalm = n*4.50;
        totalm2 = x*4.50;

        totalMercadorias = totalm + totalm2;
        icms = totalm*0.18;
        ipi = totalm*0.04;
        pis = totalm*0.0186;
        cofins = totalm*0.0854;

        icms2 = totalm2*0.18;
        ipi2 = totalm2*0.04;
        pis2= totalm2*0.0186;
        cofins2 = totalm2*0.0854;


        totalimposto1 = icms+ipi+pis+cofins;
        total1 = totalm2+totalimposto1;
        System.out.println("Cliente da Empresa 1: "+nome);
        System.out.println("ICMS Empresa 1: "+icms);
        System.out.println("IPI Empresa 1: "+ipi);
        System.out.println("PIS: Empresa 1"+pis);
        System.out.println("COFINS Empresa 1: "+cofins);
        System.out.println("Total Empresa 1: "+ total1);

        totalimposto2 = icms2+ipi2+pis2+cofins2;
        total2 = totalm2+totalimposto2;

        System.out.println();

        System.out.println("Cliente da Empresa 2: "+nome2);
        System.out.println("ICMS Empresa 2: "+icms2);
        System.out.println("IPI Empresa 2: "+ipi2);
        System.out.println("PIS Empresa 2: "+pis2);
        System.out.println("COFINS Empresa 2: "+cofins2);
        System.out.println("Total Empresa 2: "+ total2);

        System.out.println();

        totalimposto = icms+ipi+pis+cofins+icms2+ipi2+pis2+cofins2;
        total = total1+total2;
        System.out.println("Total de Imposto: "+totalimposto);
        System.out.println("Total de Mercadorias: "+totalMercadorias);
        System.out.println("Total Geral: "+total);
    }
}
