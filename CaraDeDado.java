/**
 *
 * @author comp-08i
 */
public class CaraDeDado {
    
    
   private int lugar;
   private int valor;
   DibujaDados dibuja = new DibujaDados();
   
   public CaraDeDado(int lugar, int valor){ //creamos una condicion 
   if(lugar>0 && lugar < 7){//creo este if para poner un filtro para saber si los numeros que ingresamos son entre el 1 y el 6
        this.lugar = lugar;
    }
       if(valor>0 && valor < 7){//creo este if para poner un filtro para saber si los numeros que ingresamos son entre el 1 y el 6
   this.valor = valor;
   }
   
   if(this.lugar == lugar && this.valor == valor){//este condicion la puse para dibujar el dado si los valores son correctamente ingresados 
   dibuja.aparecerDado(lugar, valor);
}
   }

    public int getLugar() { //retorna el lugar del lado 
        return lugar;
    }

    public void setLugar(int lugar) {//con este modifico el lugar del lado y abajo con una condicion para que los valores que sean ingresados sean correctos.
         if(lugar>0 && lugar < 7){
             this.lugar = lugar;
       if(valor>0 && valor < 7){
        
   dibuja.aparecerDado(lugar, valor);}}
        
    }

    public int getValor() {//retornamos el valor 
        return valor;
    }

    public void setValor(int valor) { //con este modifico el valor del dado con una condicion que tenga un filtro para saber si los valores ingresados son correctos entre los limites dados. 
        if(valor>0 && valor < 7){     
        this.valor = valor;
        if(lugar>0 && lugar < 7){
        dibuja.aparecerDado(lugar, valor);}}
   
    }
   
 
    
}
