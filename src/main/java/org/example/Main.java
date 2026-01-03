import java.util.Scanner;
static int saciedad=6;
static int energia=6;
static int diversion=6;
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

    Scanner lector = new Scanner(System.in);
    int opcion;
    do{
        System.out.println(menu);
         opcion=lector.nextInt();
         switch(opcion){
             case 1:mostrarEstado();
             case 2: Comer();
             case 3: Jugar();
         }


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

private static void  Comer(){
    if (energia<10){
        energia=energia+3;
            if (energia>10){
                energia=10;
            }

    }else{
        System.out.println("NO TENGO HAMBRE");
    }

    if (diversion>=1){
        diversion=diversion-1;
    }
    System.out.println("LA ENERGIA ES " +energia +" LA DIVERSION HA DISMINUIDO A "+diversion);
}
private static void Jugar(){

    if (diversion<10){
       diversion=diversion+3;
        if (diversion>10){
            diversion=10;
        }
    }else {
        System.out.println("AHORA NO ME APETEE JUGAR");
    }
    if (saciedad>=1){
        saciedad=saciedad-1;
    }
    if (energia>=1){
        energia=energia-1;
    }
    System.out.println("LA DIVERSIÓN ES " + diversion +" LA ENERGIA ES " +energia+ " LA SACIEDAD HA DISMINUIDO A "+saciedad);
}