package circulo;

public class PruebaCirculo {
    public static void main(String[] args){
        Punto p1 = new Punto();
        Punto p2 = new Punto (2);
        Punto p3 = new Punto (1,3);
        Punto p4 = new Punto (p3);
        System.out.println("Primer punto: " + p1.toString());
        System.out.println("Segundo punto: " + p2.toString());
        System.out.println("Tercer punto: " + p3.toString());
        System.out.println("Cuarto punto: " + p4.toString());

        if (p1.sonIguales(p2)) System.out.println("Los puntos p1 y p2 son iguales");
        else System.out.println("Los puntos p1 y p2 son distintos");
        if (p3.sonIguales(p4)) System.out.println("Los puntos p3 y p4 son iguales");
        else System.out.println("Los puntos p3 y p4 son distintos");
        p4.desplazarX(5);
        p4.desplazarY(4);
        p3.desplazarXY(2, 2);
        System.out.println("\nTercer punto: " + p3.toString());
        System.out.println("Cuarto punto: " + p4.toString());
    }
}
