import java.util.Scanner;
static int saciedad=6;
static int energia=6;
static int diversion=6;
public static void main(String[] args) {

    System.out.println("HOLA GIT");
    menuPrincipal();
    mostrarEstado();

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

private static void mostrarEstado() {
    //1 el caso del game over para que se cumplanm los demas
if(saciedad==0||energia==0||diversion==0){
        System.out.println("(x_x) :( Game Over ):\n" +
                "/|_|\\\n" +
                "| |");

}else if(saciedad>5&&energia>5&&diversion>5){
    System.out.println("(•‿•) ¡Estoy feliz!\n" +
            "/|_|\\\n" +
            "| |");
}else if(diversion<=4){
    System.out.println("(-︵-) Estoy aburrido\n" +
            "/|_|\\ ¡Juega conmigo!\n" +
            "/ \\");
}else if(energia<=4){
    System.out.println("(-_-) Zzz\n" +
            "/|_|\\\n" +
            "| |");
}else if(saciedad<=4){
    System.out.println("(••︵) ¡ Tengo hambre!\uD83C\uDF57\n" +
            "/|x|\\\n" +
            "| |");
}
}
