package finalJavaBasico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Franco Tallei
 */
public class Seccion09 {

    public static String reverse(String text) {

        char arrayChar[] = new char[text.length()];
        char wordFinal[] = new char[text.length()];
        int j = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = text.charAt(i);
        }
        for (int i = (arrayChar.length - 1); i >= 0; i--) {
            wordFinal[j] = arrayChar[i];
            j += 1;
        }

        String wordReverse = String.valueOf(wordFinal);

        return wordReverse;
    }

    public static int dividePorCero(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {

        String palabra = reverse("estoyprogramando");
        System.out.println(palabra);

//1.Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String arrayPrueba[] = {"hola", "mundo", "crack"};
        for (String word : arrayPrueba) {
            System.out.println(word);
        }

//2.Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int arrayBi[][] = new int[3][3];
        arrayBi[0][0] = 0;
        arrayBi[0][1] = 1;
        arrayBi[0][2] = 1;
        arrayBi[1][0] = 1;
        arrayBi[1][1] = 0;
        arrayBi[1][2] = 1;
        arrayBi[2][0] = 1;
        arrayBi[2][1] = 1;
        arrayBi[2][2] = 0;

        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi.length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arrayBi[i][j]);
            }
        }

//3.Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> vector = new Vector(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(1);
        System.out.println(vector.toString());

//4.Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        /*
Respuesta: Los vectores por defecto tienen una capacidad de 10 valores si tuvieramos que añadir 1000 elementos tendria que hacer el resize 100 veces
por debajo el programa lo cual conlleva una gran carga computacional sin sentido.
         */
//5.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("River");
        arrayList.add("Boca");
        arrayList.add("Racing");
        arrayList.add("Independiente");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        linkedList.forEach(lista1 -> {
            System.out.println(lista1);
        });

        arrayList.forEach(lista2 -> {
            System.out.println(lista2);
        });

//6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, 
//recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes 
//hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> listInt = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
            } else {
                listInt.add(i);
            }
        }
        listInt.forEach(elemento -> {
            System.out.println(elemento);
        });
//7.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
//que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el 
//mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".  

        try {
            dividePorCero(2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

    }
}
