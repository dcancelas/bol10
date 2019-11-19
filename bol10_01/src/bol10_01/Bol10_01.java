package bol10_01;

public class Bol10_01 {
    public static void main(String[] args) {    
        Metodos obx = new Metodos();
            int adivinar;
            int intentos;
            int num = 0;

            obx.mensaje("En este juego tú eliges un número y otra persona tiene que esforzarse para adivinarlo");

            adivinar = obx.pedirDatos("Introduce el número a adivinar");
            if(adivinar == num) num=1;
            do {
                intentos = obx.pedirDatos("Introduce el número de intentos");
                if((intentos < 1) || (intentos > 50)) obx.mensajeError(
                "El número de intentos tiene que estar comprendido entre 1 y 50"); 
            }while ((intentos < 1) || (intentos > 50));

            obx.mensaje("¡Que comienze el juego!");
            while(num != adivinar) {
                num = obx.pedirDatos("Introduce un número");
                if(num < adivinar) obx.mensaje("¡Fallaste! El número es mayor\nIntentos restantes: "+intentos);
                if(num > adivinar) obx.mensaje("¡Fallaste! El número es menor\nIntentos restantes: "+intentos);
                if(intentos == 0) obx.mensaje("Has perdido...");
                intentos--;
            }
            obx.mensaje("¡Has ganado! El número a adivinar era "+adivinar);
    }
}