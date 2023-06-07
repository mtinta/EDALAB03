public class MainColas {
    public static void main(String[] args) {
        Colas<Integer> Colas = new Colas<>();

        //Metodo add
        Colas.add(1);
        Colas.add(2);
        Colas.add(3);
        Colas.add(4);
        
        //metodo element
        System.out.println("Elemento que esta delante (element) es " + Colas.element());
        //metodo offer
        Colas.offer(5);
        Colas.offer(6);
        Colas.offer(6);

        //metodo peek
        System.out.println("Elemento que esta delante (peek) es " + Colas.peek());
        //metodo poll
        System.out.println("Elemento que se remueve(poll) es " + Colas.poll());
        System.out.println("El nuevo elemento cabeza es " + Colas.peek());
        //metodo remove

        System.out.println("Elemento que se remueve(remove) es " + Colas.remove());
        System.out.println("El nuevo elemento cabeza es " + Colas.peek());
    }
}
