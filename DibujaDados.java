

public class DibujaDados
{
    // instance variables - 
    //declaracion de atributos 
    private int x;
    private Circle[] circulos1;
    private Circle[] circulos2;
    private Circle[] circulos3;
    private Circle[] circulos4;
    private Circle[] circulos5;
    private Circle[] circulos6;
    private Square[] cuadros;
    
    
  
    /**
     * Constructor for objects of class DibujaDados
     */
    public DibujaDados()
    {
        // inicializo los atributos
        x = 0;
        circulos1 = new Circle[6];
        circulos2 = new Circle[6];
        circulos3 = new Circle[6];
        circulos4 = new Circle[6];
        circulos5 = new Circle[6];
        circulos6 = new Circle[6];
        //inicializo cada circulo 
        circulos1[0] = new Circle();
        circulos1[1] = new Circle();
        circulos1[2] = new Circle();
        circulos1[3] = new Circle();
        circulos1[4] = new Circle();
        circulos1[5] = new Circle();
        
        circulos2[0] = new Circle();
        circulos2[1] = new Circle();
        circulos2[2] = new Circle();
        circulos2[3] = new Circle();
        circulos2[4] = new Circle();
        circulos2[5] = new Circle();
        
        circulos3[0] = new Circle();
        circulos3[1] = new Circle();
        circulos3[2] = new Circle();
        circulos3[3] = new Circle();
        circulos3[4] = new Circle();
        circulos3[5] = new Circle();
        
        circulos4[0] = new Circle();
        circulos4[1] = new Circle();
        circulos4[2] = new Circle();
        circulos4[3] = new Circle();
        circulos4[4] = new Circle();
        circulos4[5] = new Circle();
        
        circulos5[0] = new Circle();
        circulos5[1] = new Circle();
        circulos5[2] = new Circle();
        circulos5[3] = new Circle();
        circulos5[4] = new Circle();
        circulos5[5] = new Circle();
        
        circulos6[0] = new Circle();
        circulos6[1] = new Circle();
        circulos6[2] = new Circle();
        circulos6[3] = new Circle();
        circulos6[4] = new Circle();
        circulos6[5] = new Circle();
        
        cuadros      = new Square[6];
        cuadros[0]   = new Square();
        cuadros[1]   = new Square();
        cuadros[2]   = new Square();
        cuadros[3]   = new Square();
        cuadros[4]   = new Square();
        cuadros[5]   = new Square();
    
        
        
        //se le da un tamaño de 15 para cada circulo 
        for (int i = 0; i < 6; i++){
        circulos1[i].changeSize(15);
        
        }
        
        for (int i = 0; i < 6; i++){
        circulos2[i].changeSize(15);
        
        }
        for (int i = 0; i < 6; i++){
        circulos3[i].changeSize(15);
        
        }
        for (int i = 0; i < 6; i++){
        circulos4[i].changeSize(15);
        
        }
        for (int i = 0; i < 6; i++){
        circulos5[i].changeSize(15);
        
        }
        for (int i = 0; i < 6; i++){
        circulos6[i].changeSize(15);
        
        }
     
    }

    
        public void aparecerDado(int lugar, int valor){//con este metodo recibe por parametros un lugar y un valor e imprime graficamente en pantalla en dado con dicha posicion con dicho valor 
            int cuadroX= 10;
            //filtro para que el usuario de valores correctos entre el 1 y el 6 
            if(lugar == 1){
                cuadroX= 0;
            } else if(lugar == 2){
                cuadroX= 80;
            } else if(lugar == 3){
                cuadroX= 160;
            } else if(lugar == 4){
                cuadroX= 240;
            } else if(lugar == 5){
                cuadroX= 320;
            } else if(lugar == 6){
                cuadroX= 400;
            } else {
                System.out.println("Esa posicion no existe solo rango de 1-6");
            }
    
    switch(valor){
    case 1: 
     
         circulos1[0].makeInvisible();
         circulos1[1].makeInvisible();
         circulos1[2].makeInvisible();
         circulos1[3].makeInvisible();
         circulos1[4].makeInvisible();
         circulos1[5].makeInvisible();
         cuadros[0].makeInvisible();
         
         
        
        cuadros[0].makeVisible();
        cuadros[0].moverA(cuadroX+10,10);
        cuadros[0].changeSize(70);
        cuadros[0].changeColor("black");
        
        circulos1[0].moverA(cuadroX+37, 37);
        circulos1[0].makeVisible();
    break;
    case 2:
    //posicion 2
        
        circulos2[0].makeInvisible();
        circulos2[1].makeInvisible();
        circulos2[2].makeInvisible();
        circulos2[3].makeInvisible();
        circulos2[4].makeInvisible();
        circulos2[5].makeInvisible();
        cuadros[1].makeInvisible();
         
        cuadros[1].makeVisible();
        cuadros[1].moverA( cuadroX+10,10);
        cuadros[1].changeSize(70);
        cuadros[1].changeColor("black");
        
        circulos2[0].moverA(cuadroX + 27, 25);
        circulos2[1].moverA(cuadroX + 45, 47);
        circulos2[0].makeVisible();
        circulos2[1].makeVisible();
        
    break;
    case 3:
        
        circulos3[0].makeInvisible();
        circulos3[1].makeInvisible();
        circulos3[2].makeInvisible();
        circulos3[3].makeInvisible();
        circulos3[4].makeInvisible();
        circulos3[5].makeInvisible();
        cuadros[2].makeInvisible();
         
    
        //posicion 3
        cuadros[2].makeVisible();
        cuadros[2].moverA(cuadroX+10,10);
        cuadros[2].changeSize(70);
        cuadros[2].changeColor("black");
        
        circulos3[0].moverA(cuadroX +19, 21);
        circulos3[1].moverA(cuadroX +39, 39);
        circulos3[2].moverA(cuadroX +59, 59);
        circulos3[0].makeVisible();
        circulos3[1].makeVisible();
        circulos3[2].makeVisible();
        
    break;
    case 4:
    
        
        //posicion 4
        
        circulos4[0].makeInvisible();
        circulos4[1].makeInvisible();
        circulos4[2].makeInvisible();
        circulos4[3].makeInvisible();
        circulos4[4].makeInvisible();
        circulos4[5].makeInvisible();
        cuadros[3].makeInvisible();
         
        cuadros[3].makeVisible();
        cuadros[3].moverA(cuadroX+10,10);
        cuadros[3].changeSize(70);
        cuadros[3].changeColor("black");
        
        circulos4[0].moverA(cuadroX +25, 25);
        circulos4[1].moverA(cuadroX +48, 25);
        circulos4[2].moverA(cuadroX +48,48 );
        circulos4[3].moverA(cuadroX +25, 48);
        circulos4[0].makeVisible();
        circulos4[1].makeVisible();
        circulos4[2].makeVisible();
        circulos4[3].makeVisible();
        
        break;
        case 5:
    
        //posicion 5.
        
        circulos5[0].makeInvisible();
        circulos5[1].makeInvisible();
        circulos5[2].makeInvisible();
        circulos5[3].makeInvisible();
        circulos5[4].makeInvisible();
        circulos5[5].makeInvisible();
        cuadros[4].makeInvisible();
         
        cuadros[4].makeVisible();
        cuadros[4].moverA(cuadroX+10,10);
        cuadros[4].changeSize(70);
        cuadros[4].changeColor("black");
        
        circulos5[0].moverA(cuadroX +18, 18);
        circulos5[1].moverA(cuadroX +55, 18);
        circulos5[2].moverA(cuadroX +55,55 );
        circulos5[3].moverA(cuadroX +18, 55);
        circulos5[4].moverA(cuadroX +37, 37);
        circulos5[0].makeVisible();
        circulos5[1].makeVisible();
        circulos5[2].makeVisible();
        circulos5[3].makeVisible();
        circulos5[4].makeVisible();
        
    break;
    case 6:
    
        //posicion6 
        circulos6[0].makeInvisible();
        circulos6[1].makeInvisible();
        circulos6[2].makeInvisible();
        circulos6[3].makeInvisible();
        circulos6[4].makeInvisible();
        circulos6[5].makeInvisible();
        cuadros[5].makeInvisible();
        
        cuadros[5].makeVisible();
        cuadros[5].moverA(cuadroX+10,10);
        cuadros[5].changeSize(70);
        cuadros[5].changeColor("black");
        
        circulos6[0].moverA(cuadroX +25, 16);
        circulos6[1].moverA(cuadroX +25, 36);
        circulos6[2].moverA(cuadroX +25, 57);
        circulos6[3].moverA(cuadroX +48, 16);
        circulos6[4].moverA(cuadroX +48,36);
        circulos6[5].moverA(cuadroX +48, 57);
        circulos6[0].makeVisible();
        circulos6[1].makeVisible();
        circulos6[2].makeVisible();
        circulos6[3].makeVisible();
        circulos6[4].makeVisible();
        circulos6[5].makeVisible();
        
        break;
    
    }
    
    
    
    }
   
}
