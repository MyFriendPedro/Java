
package ejercicios_array_parte_2;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios_Array_Parte_2 {

    public static void main(String[] args) {
        Random g=new Random();
        Scanner t=new Scanner(System.in);
        
        
        //EJERCICIO 1:
        
//        String[] nombres={"Juan","Maria","Antonio","Sara"};
//        
//        int posicion;
//        
//        String[] copia=new String[nombres.length];
//        
//        for(int i=0;i<nombres.length;i++){
//            do{
//                posicion=g.nextInt(nombres.length);
//                
//            }while(copia[posicion]!=null);
//            
//            copia[posicion]=nombres[i];
//            
//        }
//        
//        for(int i=0;i<copia.length;i++){
//            System.out.print(copia[i] + " ");
//        }
//        
//        System.out.println();

        //EJERCICIO 2:
//        int[] datos_teclado;
//        int tamaño,numero;
//        
//        
//        do{
//        System.out.print("Tamaño para el Array: ");
//        tamaño=t.nextInt();
//        }while(tamaño<=0);
//        
//        datos_teclado=new int[tamaño];
//        
//        for(int i=0;i<datos_teclado.length;i++){
//            
//            do{
//            System.out.print("Escribe posicion " + i + ": ");
//            datos_teclado[i]=t.nextInt();
//            }while(datos_teclado[i]<0 || datos_teclado[i]>10);
//        }
//        System.out.println("");
//        System.out.println("Array:");
//        
//        for(int i=0;i<datos_teclado.length;i++){
//            System.out.print(datos_teclado[i] + " | ");
//        }
//        
//        System.out.println();

          //EJERCICIO 3
          
//          int[] array1={10,20,30,40};
//          int[] array2={10,20,30,40};
//          
//          boolean iguales=true;
//          
//          if(array1.length==array2.length){
//              for(int i=0;i<array1.length;i++){
//                  if(array1[i]!=array2[i]){
//                      iguales=false;
//                  }
//              }
//          }else{
//              iguales=false;
//          }
//          
//          System.out.println("¿Iguales?: " + iguales);

        //EJERCICIO 5
        
//        int[] array={5,4,2,9,8};
//        
//        boolean contiene=false;
//        
//        int numero,i=0;
//        
//        System.out.print("Introduce el numero para buscar: ");
//        numero=t.nextInt();
//        
//        
//            
//        while(i<array.length && contiene==false){
//            if(array[i]==numero){
//                contiene=true;
//            }
//            i++;
//        }
//          
//        if(contiene){
//            System.out.println("El numero " + numero + " si esta en el array");
//        }else{
//            System.out.println("El numero " + numero + " no esta en el array");
//        }

          //EJERCICIO 6
          
//        int[] array={5,4,2,9,8};
//        
//        boolean contiene=false;
//        
//        int numero,i=0,posicion=-1;
//        
//        System.out.print("Introduce el numero para buscar: ");
//        numero=t.nextInt();
//        
//        
//            
//        while(i<array.length && posicion==-1){
//            if(array[i]==numero){
//                posicion=i + 1;
//            }
//            i++;
//        }
//        
//        if(posicion!=-1){
//            System.out.println("Esta en la posicion: " + posicion);
//        }else{
//            System.out.println("No esta");
//        }
          
        
          //EJERCICIO 7
          
//        int[] array={5,4,2,9,8};
//        
//        boolean contiene=false;
//        
//        int numero,i=0,posicion=-1;
//        
//        System.out.print("Introduce el numero para buscar: ");
//        numero=t.nextInt();
//        
//        
//            
//        while(i<array.length && posicion==-1){
//            if(array[i]==numero){
//                posicion=i + 1;
//            }
//            i++;
//        }
//        
//        if(posicion!=-1){
//            System.out.println("Esta en la posicion: " + posicion);
//        }else{
//            System.out.println("No esta");
//        }

          
          //EJERCICIO 11
          
//          String[] nombre={"Juan","Ana","Marcos","Pablo","Laura"};
//          int[] edades={12,21,27,14,21};
//          
//          //Apartado 1
//          for(int i=0;i<nombre.length;i++){
//              if(edades[i]>=18){
//                  System.out.println(nombre[i]);
//              }
//          }
//          
//          //Apartado 2
//          int mayor=0;
//          
//          for(int i=1;i<edades.length;i++){
//              if(edades[mayor]<edades[i])
//                  mayor=i;
//          }
//          
//          System.out.println("El mayor es: " + nombre[mayor]);
//          
//          //Apartado 3
//          
//          String nombre_buscar;
//          
//          System.out.println("Introduce el nombre a buscar: ");
//          nombre_buscar=t.nextLine();
//          
//          int i,posicion;
//          
//          i=0;
//          posicion=-1;
//          
//          while(i>nombre.length && posicion==-1){
//              if(nombre_buscar.equals(nombre[i])){
//                  posicion=i;
//              }
//              i++;
//          }
//          
//          if(posicion==-1){
//              System.out.println("No esta esa persona");
//          }else{
//              System.out.println("Su edad es " + edades[posicion]);
//          }
          
            

            //EJERCICIO 12
            
//            int[] puntos={2,5,8,9,1};
//            
//            String[] equipos={"Real Madrid","FC Barcelona","Granada","At.Madrid"
//                             ,"Sevilla"};
//            
//            for(int i=0;i<equipos.length;i++){
//                System.out.print("Equipo " + i + ": ");
//                for(int j=0;j<=puntos[i];j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
            
            
            //EJERCICIO 13
            
//            int[] puntos={2,5,8,9,1};
////            
//            String[] equipos={"Real Madrid","FC Barcelona","Granada","At.Madrid"
//                             ,"Sevilla"};
//            
//            for(int i=0;i<equipos.length;i++){
//                System.out.print(equipos[i] + ":  n");
//                for(int j=0;j<=puntos[i];j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
          
    

              //EJERCICIO 14
              
//              String[] preguntas={"¿Dos mas dos es igual a?",
//                                  "¿Capital de Portugal?",
//                                  " Java es un lenguaje de tipo...",
//                                  "Colon descubrio America el año",
//                                  "¿Cuando empezo la primera guerra mundial?"};
//              
//              String[] respuestas={"cuatro","Lisboa","semi interpretado","1492","1914"};
//              
//              
//              int[] puntuaciones={4,2,7,9,6};
//              
//              
//              int total=0;
//              
//              String resp;
//              
//              for(int i=0;i<preguntas.length;i++){
//                  System.out.print(preguntas[i] + ": ");
//                  resp=t.nextLine();
//                  if(resp.equals(respuestas[i])){
//                      System.out.println("Puntuacion obtenida: " + puntuaciones[i]);
//                      total+=puntuaciones[i];
//                  }
//              }
//              
//              System.out.println("Has obtenido: " + total + " puntos");

                
                
                //EJERCICIO 15
                
//                char[] letras={'A','B','C','D','F','G','H','I','J','K',
//                                'L','M','N','Ñ','O','P','Q','R','S','T',
//                                'U','V','W','X','Y','Z'};
//                
//               
//                
//                int[] frase={22,11,7,10};
//                
//                
//                
//                
//                for(int i=0;i<frase.length;i++){
//                    System.out.print(letras[frase[i]]-1);
//                }
//                
//                System.out.println();


                //EJERCICIO 18
                
//                double[] km={10,25,60,40,20};
//                double km_recorridos=0,km_totales=0;
//                
//                for(int i=0;i<km.length;i++){
//                    km_recorridos+=km[i];
//                    
//                    
//                }
//                
//                km_totales=km_recorridos/km.length;
//                
//                if(km_totales<0 || km_totales<=10){
//                    System.out.println("El corredor es novato");
//                }else if(km_totales>10 && km_totales<=30){
//                    System.out.println("El corredor es iniciado");
//                }else if(km_totales>30 && km_totales<=40){
//                    System.out.println("El corredor es experto");
//                }else if(km_totales>=50){
//                    System.out.println("El corredor esta en el nivel dios");
//                }


                  //EJERCICIO 19
                  
//                  int[] datos={6,5,4,8,6,5,6,8,9};
//                  int[] aux=new int[10];
//                  
//                  for(int i=0;i<datos.length;i++){
//                      aux[datos[i]]++;
//                  }
//                  
//                  //altura del dibujo
//                  int altura=aux[0];
//                  for(int i=0;i<aux.length;i++){
//                      if(aux[i]>altura){
//                          altura=aux[i];
//                      }
//                  }
//                  int aux_altura=altura;
//                  for(int i=0;i<altura;i++){
//                      for(int j=0;j<aux.length;j++){
//                          if(aux[j]>=aux_altura){
//                              System.out.print(" *");
//                          }else{
//                              System.out.print("  ");
//                          }
//                      }
//                      System.out.println();  
//                      aux_altura--;
//                  }
//                  
//                  System.out.print(" ");
//                  for(int i=0;i<aux.length;i++){
//                      System.out.print(i+ " ");
//                  }
//                
//                  System.out.println();


                    //EJERCICIO 20
                    
//                    int[] datos=new int[30];
//                    datos[0]=65;
//                    
//                    int i=0;
//                    
//                    boolean cero=true;
//                    
//                    while(i<datos.length && cero){
//                        if(datos[i]!=0){
//                            cero=false;
//                        }
//                        i++;
//                    }
//                    
//                    System.out.println(cero);


                    //EJERCICIO 21
                    
//                    int[] numeros=new int[20];
//                    numeros[0]=9;
//                    
//                    boolean booleano=true;
//                    
//                    int i=0;
//                    
//                    while(i<numeros.length && booleano){
//                        if(numeros[i]<=0){
//                            booleano=false;
//                        }
//                        i++;
//                    }
//                    
//                    System.out.println(booleano);
            
          
          
          
          
        
        
          
          
        }
        
        
       
        
    
    
}
