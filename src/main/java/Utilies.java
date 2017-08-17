/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Utilies {
    

    public static void main(String[] args) {
        System.out.println(getResume("Estamos m"));
        String texto = "prueba  del segundo mmmmmmmm m      etodo";
        System.out.println(capitalizar(texto));
        System.out.print(contarCoincidencias("java esta escrito en java xD java", "java"));
        
        
        

    }

    public static String getResume(String texto) {
        
        String salida= "";
        int contador = texto.length();
        
        if(contador>30){
            salida=texto.substring(0, 30);
        }else{
            salida=texto;
        }

        return salida; 
    }

    public static String capitalizar(String texto) {
        char[] caracteres = texto.toCharArray();
        String salida="";
        for (int i = 0; i < texto.length(); i++) {
            if(caracteres[i]==' '){
                if(caracteres[i+1]==' '){
                    
                }else{
                    salida=salida+String.valueOf(caracteres[i]);
                }
            }else{
                salida=salida+String.valueOf(caracteres[i]);
            }
        }
        char[] caracteres2 = salida.toCharArray();
        
        for (int i = 0; i < salida.length(); i++) {
            caracteres2[0] = Character.toUpperCase(caracteres2[0]);
            if (caracteres2[i] == ' ') { 
                caracteres2[i + 1] = Character.toUpperCase(caracteres2[i + 1]);
            }
        }
        salida = String.valueOf(caracteres2);

        return salida;
    }

    public static int contarCoincidencias(String frase, String texto) { 
        int contador = 0;

        while (frase.indexOf(texto) > -1) { 
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length()); 
            contador++;
        }
        return contador;
    }
}



