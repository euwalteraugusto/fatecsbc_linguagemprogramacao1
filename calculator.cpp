#include <iostream>
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
