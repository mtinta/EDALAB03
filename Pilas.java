public class Pilas<E> {
    //campos de la clase Pilas
    private Node<E> root;    //Ultimo elemento de la pila  
    private int size;        //tamaño de la pila

    public Pilas() {
        root = null;
        size = 0;
    }
    //constructores
    private static class Node<E> {
        private E data;     //Datos que se usaran para los metodos
        private Node<E> next;   //Next que se usara como en las listas enlazadas

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
//Metodos
//Metodo Push
    public void push(E item) {
        Node<E> newNode = new Node<>(item); //Se crea un nuevo Objeto tipo node
        newNode.next = root;                //Se asigna este nuevo objeto como el nuevo root
        root = newNode;
        size++;                         //se aumenta el tamaño de la pila
    }
//Metodo pop
    public E pop() {
        if (isEmpty()) {                //comprobar si esta vacio
            
        }
        E item = root.data; //Objeto a eliminar
        root = root.next;   //"Recorremos el root"
        size--;             //se disminuye el tamaño de l pila
        return item;
    }
//Metodo peek
    public E peek() {
        if (isEmpty()) {    //comprobar si esta vacio
            System.out.println("La pila esta vacia");
        }
        return root.data;   //Se devuelve el ultimo valor
    }
//Metodo empty
    public boolean isEmpty() {
        return root == null;    //Si el ultimo valor es null isEmpty es verdadero
    }

//Metodo size
    public int size() {
        return size;    //Devuelve el tamaño
    }

//Metodo search
    public int search(Object o) {
        int position = 1;       //se inicia un indice en el ultimo elemento es decir el elemento root
        Node<E> current = root; //Nodo que se usara para recorrer

        while (current != null) {
            if (current.data.equals(o)) {   //si los datos del nodo actual son iguales al parametro
                return position;            //se devuelve la posicion del nodo
            }
            current = current.next; //Se busca el siguiente nodo
            position++;     //Se mueve el indice
        }

        return -1; // El elemento no se encontró en la pila
    }
    
}
