/*
 Este programa calcula e mostra uma lista com os numeros
 primos de 0 a 100
 */
class NumPrim {
    public static void main (String array[]) {

        int modulo, contador, divisor, quantidades_de_numeros_primos;
        contador = divisor = 1;
	modulo = quantidades_de_numeros_primos = 0;

	System.out.println(" ");
	System.out.println("            \t\t num \t div \t mod");

        for (contador = 1; contador < 100; contador++) {

            for (divisor = 1; divisor <= contador; divisor++) {

                modulo = contador % divisor;

		if ((modulo == 0) & (divisor != 1)) { 
			break;
		}

            }

	    if (contador == divisor) {

				quantidades_de_numeros_primos++;
				System.out.println();
				System.out.println("Numero primo ->  \t" + contador + "\t" + divisor + "     \t" + modulo);
				System.out.println();

	    } else {

				System.out.println("Nao primo -> \t\t" + contador + "\t" + divisor + "     \t" + modulo);
	    }


	}

	System.out.println ("\n\n");
        System.out.println ("Quantidade de numeros primos ->" + quantidades_de_numeros_primos++);
	System.out.println ("\n\n");

    }

}