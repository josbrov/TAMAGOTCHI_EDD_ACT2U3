import java.util.Scanner;

public static void main(String[] args) {

    System.out.println("HOLA GIT");
    menuPrincipal();

}
static String menu=("1. Estado\n" +
        "2. Comer\n" +
        "3. Jugar\n" +
        "4. Dormir\n" +
        "----------------\n" +
        "0. Salir\n" +
        "Seleccione una opcion del menu:");


private static int menuPrincipal(){
    System.out.println(menu);
    Scanner lector = new Scanner(System.in);
    int opcion=lector.nextInt();
    do{
        System.out.println(menu);
       while(opcion<0||opcion>4){
           System.out.println("NO VALIDO PRUEBA DE NUEVO ");
           System.out.println(menu);
           opcion=lector.nextInt();
       }
       return opcion;
    }while (opcion>=0&&opcion<5);

}