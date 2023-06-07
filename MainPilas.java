public class MainPilas {
    public static void main(String[] args) {
        Pilas<Integer> Pilas = new Pilas<>();

        //Metodo Push
        Pilas.push(1);
        Pilas.push(2);
        Pilas.push(3);
        Pilas.push(4);
        Pilas.push(5);

        //Metodo pop
        //while (!Pilas.isEmpty()) {    //eliminar todo
            System.out.println("Elemento eliminado: " + Pilas.pop());
       // }

        //Metodo peek
        System.out.println("Elemento superior: " + Pilas.peek());

        //Metodo empty
        System.out.println("La pila esta vacia ? " + Pilas.isEmpty());
        
        //Metodo size
        System.out.println("Tamaño de la pila: " + Pilas.size());
       
        //Metodo search
         System.out.println("Posición del elemento 2: " + Pilas.search(2));
    //     System.out.println("Posición del elemento 4: " + Pilas.search(4));
    }
}
