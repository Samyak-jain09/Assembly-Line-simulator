package oop_project;
import java.util.*;

interface frame{
    default String printFit(){
       return"Frame fitted at car on Assembly Line ";
    }
}

interface wheel{
    default String printFit(){
       return"Wheel fitted at car on Assembly Line ";
    }
    
}
interface interior{
    default String printFit(){
       return"Interiors fitted at car on Assembly Line ";
    }
}
interface chasis{
    default String printFit(){
       return"chasis fitted at car on Assembly Line ";
    }
}
interface engine{
    default String printFit(){
       return "Engine fitted at car on Assembly Line ";
    }
    
}
interface color{
     default String printFit(){
       return"color fitted at car on Assembly Line ";
    }

}


class Wheel1 implements wheel{
    private long timeDelay=1;
    public void wheelFit(int serialNo){
           global.secondsPassed[serialNo]+=timeDelay;
           try  {  
            
            Thread.sleep(timeDelay*1000);  
        }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 
           

    }

}
class Wheel2 implements wheel{
    private long timeDelay=4;
    public void wheelFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Wheel3 implements wheel{
    private long timeDelay=3;
    public void wheelFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Interior1 implements interior{
    private long timeDelay=8;
    public void interiorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Interior2 implements interior{
    private long timeDelay=7;
    public void interiorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Interior3 implements interior{
    private long timeDelay=4;
    public void interiorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color1 implements color{
    private long timeDelay=3;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color2 implements color{
    private long timeDelay=12;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color3 implements color{
    private long timeDelay=9;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color4 implements color{
    private long timeDelay=7;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color5 implements color{
    private long timeDelay=5;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color6 implements color{
    private long timeDelay=6;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color7 implements color{
    private long timeDelay=7;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color8 implements color{
    private long timeDelay=5;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color9 implements color{
    private long timeDelay=6;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color10 implements color{
    private long timeDelay=8;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color11 implements color{
    private long timeDelay=4;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Color12 implements color{
    private long timeDelay=10;
    public void colorFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Frame1 implements frame{
    private long timeDelay=3;
    public void frameFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
          // System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Frame2 implements frame{
    private long timeDelay=5;
    public void frameFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Frame3 implements frame{
    private long timeDelay=7;
    public void frameFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Frame4 implements frame{
    private long timeDelay=9;
    public void frameFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Frame5 implements frame{
    private long timeDelay=8;
    public void frameFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine1 implements engine{
    private long timeDelay=6;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine2 implements engine{
    private long timeDelay=2;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine3 implements engine{
    private long timeDelay=5;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine4 implements engine{
    private long timeDelay=1;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine5 implements engine{
    private long timeDelay=3;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine6 implements engine{
    private long timeDelay=3;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}class Engine7 implements engine{
    private long timeDelay=2;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Engine8 implements engine{
    private long timeDelay=2;
    public void engineFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis1 implements chasis{
    private long timeDelay=8;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis2 implements chasis{
    private long timeDelay=9;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis3 implements chasis{
    private long timeDelay=6;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis4 implements chasis{
    private long timeDelay=4;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis5 implements chasis{
    private long timeDelay=5;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis6 implements chasis{
    private long timeDelay=6;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}
class Chasis7 implements chasis{
    private long timeDelay=7;
    public void chasisFit(int serialNo){
        global.secondsPassed[serialNo]+=timeDelay;
        try  {  
         
         Thread.sleep(timeDelay*1000);  
     }catch(InterruptedException e){System.out.println(e);}    
//           System.out.print( global.formatElapsedTime(global.secondsPassed[serialNo])); 

    }

}


class Car{
    int serialNo;
    Car(int Sn){
        this.serialNo=Sn;
    }
    public synchronized void fitFrame(int fn){
        switch(fn){  
        case 1: {
            Frame1 fr1= new Frame1();
            fr1.frameFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+fr1.printFit()+serialNo); 
            //fr1.printFit();
            //System.out.print(serialNo);
            break;
        }
        case 2: {
            Frame2 fr1= new Frame2();
            fr1.frameFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+fr1.printFit()+serialNo);
             break;
        }
        case 3: {
            Frame3 fr1= new Frame3();
            fr1.frameFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+fr1.printFit()+serialNo);
             break;
        }
        case 4: {
            Frame4 fr1= new Frame4();
            fr1.frameFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+fr1.printFit()+serialNo);
             break;
        }
        case 5: {
            Frame5 fr1= new Frame5();
            fr1.frameFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+fr1.printFit()+serialNo);
             break;
        }
        //switch statement
        //calling frameFit then printFIt
      
    }
    //System.out.println( );
    }
    public synchronized void fitEngine(int en){
        switch(en){ 
        case 1: {
            Engine1 eng= new Engine1();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 2: {
            Engine2 eng= new Engine2();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 3: {
            Engine3 eng= new Engine3();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 4: {
            Engine4 eng= new Engine4();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 5: {
            Engine5 eng= new Engine5();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 6: {
            Engine6 eng= new Engine6();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 7: {
            Engine7 eng= new Engine7();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
         case 8: {
            Engine8 eng= new Engine8();
            eng.engineFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+eng.printFit()+serialNo);
             break;
        }
        //switch statement
         //calling engineFit then printFIt
         
    }
        //System.out.println( );
    }
    public synchronized void fitChasis(int cn){
        //switch statement
         //calling chasisFit then printFIt
         
          switch(cn){ 
        case 1: {
            Chasis1 intr = new Chasis1();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);
             break;
        }
         case 2: {
            Chasis2 intr = new Chasis2();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);

             break;
        }
         case 3: {
           Chasis3 intr = new Chasis3();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);

             break;
        }
       case 4: {
           Chasis4 intr = new Chasis4();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);

             break;
        }
        case 5: {
           Chasis5 intr = new Chasis5();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);

             break;
        }
        case 6: {
           Chasis6 intr = new Chasis6();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);

             break;
        }
        case 7: {
           Chasis7 intr = new Chasis7();
            intr.chasisFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);

             break;
        }


       
 
    }


   // System.out.println( );
    }
    public synchronized void fitInterior(int in){
        //switch statement
         //calling interiorFit then printFIt
 switch(in){ 
        case 1: {
            Interior1 intr = new Interior1();
            intr.interiorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);
             break;
        }
         case 2: {
            Interior2 intr = new Interior2();
            intr.interiorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);
             break;
        }
         case 3: {
            Interior3 intr = new Interior3();
            intr.interiorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+intr.printFit()+serialNo);
             break;
        }
    }
    //System.out.println( );
}
    public synchronized void fitColor(int con){
        //switch statement
         //calling colorFit then printFIt
    

 switch(con){ 
	case 1:{
Color1 col = new Color1();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 2 :{
Color2 col = new Color2();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 3 :{
Color3 col = new Color3();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 4 :{
Color4 col = new Color4();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 5 :{
Color5 col = new Color5();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 6 :{
Color6 col = new Color6();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 7 :{
Color7 col = new Color7();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 8 :{
Color8 col = new Color8();
            col.colorFit(serialNo);
            col.printFit();
            System.out.print(serialNo);
             break;
}
case 9 :{
Color9 col = new Color9();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 10 :{
Color10 col = new Color10();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 11 :{
Color11 col = new Color11();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}
case 12 :{
Color12 col = new Color12();
            col.colorFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+col.printFit()+serialNo);
             break;
}




    }
 
	 
    //System.out.println( );
}
    public synchronized void fitWheel(int wn){
        //switch statement
         //calling colorFit then printFIt
 switch(wn){ 
          case 1: {
            Wheel1 whl = new Wheel1();
            whl.wheelFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+whl.printFit()+serialNo);
             break;
        }
        case 2: {
            Wheel2 whl = new Wheel2();
            whl.wheelFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+whl.printFit()+serialNo);
             break;
        }
        case 3: {
           Wheel3 whl = new Wheel3();
            whl.wheelFit(serialNo);
            System.out.println( global.formatElapsedTime(global.secondsPassed[serialNo])+whl.printFit()+serialNo);
             break;
        }
    }
    //System.out.println( );
}

}
class AssemblyLine extends Thread{
   
    private int ft,wt,et,it,ct,cot,serialNo;
    AssemblyLine(int ft,int wt,int et,int it,int ct,int cot,int Sn){
        this.ft=ft;
        this.wt=wt;
        this.et=et;
        this.it=it;
        this.ct=ct;
        this.cot=cot;
        this.serialNo=Sn;
        
    }
    public void run()
    {
        
        
        Car newCar=new Car(serialNo);
     
        newCar.fitFrame(ft);
        newCar.fitWheel(wt);
        newCar.fitEngine(et);
        newCar.fitInterior(it);
        newCar.fitChasis(ct);
        newCar.fitColor(cot);
       System.out.println(global.formatElapsedTime(global.secondsPassed[serialNo])+ "Car production finished at Assembly line "+serialNo);
       global.x+=this.serialNo;
       if(global.x==global.totalNo) {
    	   System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("All cars Produced. Exiting Program");
       }
    	   


        
    }
  
}

class global{
	  static int [] secondsPassed=new int[1000];
	  static int totalNo;
	  static int x;
	  public static String formatElapsedTime(int seconds) {
		    if (seconds< 10)
		    	return "00:0" + seconds+" ";
		    else if (seconds < 60)
	            return "00:" + seconds+" ";
	        else if (seconds < 3600)
	            return (seconds / 60) + ":" + seconds%60+" ";
	        else
	            return (seconds / 3600) +":" + (seconds%3600)/60+ seconds%60+" ";
	    }
	  
	}

public class main
{
	public static void main(String[] args) {
		
		new input();
		

		
}
}

