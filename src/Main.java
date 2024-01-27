//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea()
// che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo
// che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
public class Main {
    public static void main(String[] args) {
        Forma shape1 = new Forma();
        shape1.setAltezza(4);
        shape1.setBase(20);
        Rettangolo rectangle1 = new Rettangolo();
        rectangle1.setBase(shape1.getBase());
        rectangle1.setAltezza(shape1.getAltezza());
        System.out.println("L'area della forma è ");
        System.out.println(shape1.calcolaArea(shape1.getBase(), shape1.getAltezza()));
        System.out.println("L'area del rettangolo è ");
        System.out.println(rectangle1.calcolaArea(rectangle1.getBase(), rectangle1.getAltezza()));
    }
}