package bol10_02;

public class Bol10_02 {
    public static void main(String[] args) {    
        Metodos obx = new Metodos();
            int adivinar;
            int intentos = 25;
            int num = 0;

            obx.mensaje("En este juego tendrás que adivinar un número aleatorio");

            adivinar = obx.numAleatorio();
            if(adivinar == num) num=1;
            System.out.println("Número a adivinar: "+adivinar);

            int select = obx.selectOpciones("Selecciona el nivel de dificultad",
            "Fácil", "Normal", "Difícil");
            switch(select) {
                case 0:
                    intentos = 40;
                    break;
                case 1:
                    intentos = 25;
                    break;
                case 2:
                    intentos = 10;
                    break;
            }

            obx.mensaje("¡Que comienze el juego!");
            while(num != adivinar) {
                do {
                    num = obx.pedirDatos("Introduce un número");
                    if((num < 1) || (num > 50)) obx.mensajeError(
                    "El número tiene que estar comprendido entre 1 y 50"); 
                }while ((num < 1) || (num > 50));
                intentos--;

                int distancia;
                if(adivinar > num) distancia = (adivinar-num);
                else distancia = (num-adivinar);

                if(num != adivinar) {
                    if(distancia > 20)
                        obx.mensaje("¡Fallaste! El número está muy lejos\nIntentos restantes: "+intentos);
                    if((distancia >= 10) && (distancia <= 20))
                        obx.mensaje("¡Fallaste! El número está lejos\nIntentos restantes: "+intentos);
                    if((distancia > 5) && (distancia < 10))
                        obx.mensaje("¡Fallaste! El número está cerca\nIntentos restantes: "+intentos);
                    if(distancia <= 5)
                        obx.mensaje("¡Fallaste! El número está muy cerca\nIntentos restantes: "+intentos);
                    if(intentos == 0) {
                        obx.mensaje("Has perdido...");
                        System.exit(0);
                    }
                }
            }
            obx.mensaje("¡Has ganado! El número a adivinar era "+adivinar);
    }
}