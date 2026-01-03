import java.util.Scanner;
static int saciedad=10;
static int energia=10;
static int diversion=10
        ;
static Scanner lector = new Scanner(System.in);
public static void main(String[] args) {

    boolean outMenu = false;

    do{
        int opcion = menuPrincipal();

        switch(opcion){
            case 1:
                mostrarEstado();
                break;
            case 2:
                Comer();
                break;
            case 3:
                Jugar();
                break;
            case 4:
                Dormir();
                break;
            case 5:
                Evo();
                break;
            case 0:
                outMenu = true;
                System.out.println("HAS SALIDO DEL MENÚ");
                break;
        }

    }while(!outMenu);
}

static String menu=("1. Estado\n" +
        "2. Comer\n" +
        "3. Jugar\n" +
        "4. Dormir\n" +
        "5. Evolucionar\n" +
        "----------------\n" +
        "0. Salir\n" +
        "Seleccione una opcion del menu:");


private static int menuPrincipal(){
    int opcion;

    do{
        System.out.println(menu);
        opcion = lector.nextInt();

        if(opcion < 0 || opcion > 5){
            System.out.println("NO VALIDO PRUEBA DE NUEVO ");
        }

    }while(opcion < 0 || opcion > 5);

    return opcion;
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
       diversion=diversion+1;
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

public static void Dormir(){
    if (energia<10){
        energia=energia+2;
        if (energia>10){
            energia=10;
        }else{
            System.out.println("NO TENGO SUEÑO");
        }
    }
    if (diversion>=1){
        diversion=diversion-1;
    }
    if (saciedad>=1){
        saciedad=saciedad-1;
    }
    System.out.println("LA ENERGÍA ES " + energia +" LA DIVERSION ES " +diversion+ " LA SACIEDAD HA DISMINUIDO A "+saciedad);
}
public static void Evo(){
    int seleccEvo;
    if (energia==10&&diversion==10&&saciedad==10) {

        System.out.println("TU TAMAGOTCHI PUEDE EVOLUCIONAR.¿DESEAS EVOLUCIONARLO?\n" +
                "1.SI\n" +
                "2.NO");
        seleccEvo=lector.nextInt();
        if (seleccEvo==1){
            System.out.println("TU TAMAGOTCHI HA EVOLUCIONADO\n" +
                    "  __\n" +
                    " (oo)\n" +
                    " /||\\\n" +
                    "  ||\n" +
                    "  /\\\n");
        }else if(seleccEvo==2){
            System.out.println("TU TAMAGOTCHI NO HA EVOLUCIONADO");
        }

    }else{
        System.out.println("NO CUMPLES LOS REQUISITOS");
    }
}

