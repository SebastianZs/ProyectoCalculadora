/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralab1;

/**
 *
 * @author Sebas
 */
public class Operaciones {
    //Atributos
    public String numero; 
    public double resultado;
    public boolean suma;
    public boolean resta;
    public boolean multiplicacion;
    public boolean division;
    public boolean raiz;
    public boolean potencia;
    public boolean iva;
    
    

//Constructor
public Operaciones(){
numero="";
resultado=0;
suma=false;
resta=false;
multiplicacion=false;
division=false;
raiz=false;
potencia=false;
iva=false;
}

//Getter y Setter

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
   

//Metodos y funciones
    
    public void guardarNumero(int num){
        setNumero(numero+num);      
    }

    public void Suma(String num){
        this.resultado= Double.parseDouble(num);
        suma=true;
        setNumero("");
    }
    
    public void Resta(String num){
        this.resultado= Double.parseDouble(num);
        resta=true;
        setNumero("");
    }
    
    public void Multiplicacion(String num){
        this.resultado= Double.parseDouble(num);
        multiplicacion=true;
        setNumero("");
    }
    
    public void Division(String num){
        this.resultado= Double.parseDouble(num); 
        division=true;
        setNumero(""); 
    }
    
    public void Potencia(String num){
        this.resultado= Double.parseDouble(num);
        potencia=true;
        setNumero("");
    }
    
    public void Raiz(String num){
        this.resultado= Double.parseDouble(num);
        raiz=true;
        setNumero("");
    }
    
    public void Iva(String num){
        this.resultado= Double.parseDouble(num);
        iva=true;
        setNumero("");
    }
    
    public double Resultado(String num){
        
       if(suma == true){
           resultado = resultado + Double.parseDouble(num);          
       } 
       
       if(resta == true){
           resultado = resultado - Double.parseDouble(num);          
       } 
       
       if(multiplicacion == true){
           resultado *= Double.parseDouble(num);          
       } 
       
       if(division == true){   
      
           resultado /= Double.parseDouble(num);          
       } 
       
       if(potencia == true){
           resultado = Math.pow(resultado,Double.parseDouble(num));         
       }
       
       if(raiz == true){
            if(resultado<0 && Double.parseDouble(num)%2==1)
            resultado = (-1*(Math.pow(Math.abs(resultado),1.0/Double.parseDouble((num)))));  
            else 
            resultado = ((Math.pow(resultado,1.0/Double.parseDouble((num)))));
       }
       
       if(iva == true){
           resultado = resultado*0.19;        
       }
        
       
       //Resetar operaciones
       suma=false;
       resta=false;
       multiplicacion=false;
       division=false;
       raiz=false;
       potencia=false;
       iva=false;
       
       return resultado;   
       
    }
}