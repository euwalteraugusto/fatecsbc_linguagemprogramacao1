import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double Soma = numero1 + numero2;
        double Subtracao = numero1 - numero2;
        double Divisao = numero1 / numero2;
        double Multiplicacao = numero1 * numero2;

        System.out.println("Os operadores podem ser: +, -, /, *");
        System.out.println("Digite o operador: ");
        
        char operador = scanner.next().charAt(0);

        double resultado;
        if (resultado == '+' ) {
            System.out.println(numero1 + numero2);
        } else if (operador == '-') {
            System.out.println(numero1 - numero2);
        } else if (operador == '/') {
            System.out.println(numero1 / numero2);
        } else if (operador == '*') {
            System.out.println(numero1 * numero2);
        } else {
            System.out.println("Operador inválido.");
        }

        return 0;

    }
}

/*#include <iostream>
using namespace std;

// Calculadora em C++

int main(){

int numero1;
cout << "Digite o primeiro número: "; // imprime na tela
cin >> numero1; // Armazena o valor da variável

int numero2;
cout << "Digite o segundo número: "; // imprime na tela
cin >> numero2; // Armazena o valor da variável

int Soma = numero1 + numero2;
int Subtracao = numero1 - numero2;
int Divisao = numero1 / numero2;
int Multiplicacao = numero1 * numero2;

std::cout << "Os operadores podem ser: +,-,/,*" << std::endl;
char operador;
cout << "Digite o operador: ";
cin >> operador; // Armazena o valor da variável 'operador'

if (operador == '+' ) {
    cout << Soma << endl;
} else if (operador == '-') {
    cout << Subtracao << endl;
    } else if (operador == '/') {
        cout << Divisao << endl;
    } else if (operador == '*') {
        cout << Multiplicacao << endl;
    } else {
        cout << "Operador inválido." << endl;
    }

    return 0;
}
*/