/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.arearetangulo;

/**
 *
 * @author morta
 */import java.util.Scanner;
public class ProgramaAreaRetangulo_Lucas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double base;
double altura;
double area;
Scanner leitor = new Scanner(System.in);
System.out.println("Digite o valor da base do retângulo.");
base = leitor.nextDouble();
System.out.println("Agora digite a altura do mesmo.");
altura = leitor.nextDouble();
area = (altura*base);
System.out.println("A área do retângulo é" + area);
    }


}