/*
*Aqui vamos a contruir la clase numero complejo, que es la que nos va dar la posibilidad de generar un numero complejo, y ademas de sus operaciones
*Progrmador: Gerardo Ayala Juarez
*
*/
package Logica; //Es para decir el paquete donde sera alojado la clase
//Aqui van las librerias que se van a ocupar para ejecutar el proyecto

public class NumComplejo{ //La clase se va llamar numero complejo;
    private double x;//Parte real
    private double y;//Parte Imaginaria
    private double tetha;//El angulo para poder construir la forma euleriana, euleriana y trigonometrica.
    private double modulo;//El modulo para la forma euleriana y trigonometrica.

    public NumComplejo(){//Constructor sin parametros
        this.x = 0;//Inicializamos la parte real;
        this.y = 0;//Inicializamos la parte Imaginaria
        this.tetha=0;
        this.modulo=0;
    }
    public NumComplejo(double x, double y){//Constructor con parametros
        this.x = x;//Para la asignaciond de la parte real
        this.y = y;//Para la asignacion de la parte imaginaria
        this.ta();//Calculamos tetha y el modulo
    }
    public NumComplejo(double modulo, float tetha){
        this.modulo = modulo;
        this.tetha= (double)tetha;
        this.toxy();//calculamos x y y;

    }
    private void toxy(){//Esta funcion es privada para que el constructor la use;
        this.x = Math.cos(this.radTetha())*this.modulo;
        this.y = Math.sin(this.radTetha())*this.modulo;
    }

    private void ta(){//Esta funcion es privada para que el construcor la use,
        modulo = Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
        if(this.x==0&&this.y==0){
            this.modulo=0;
            this.tetha=0;
        }
        else if(this.x==0&&this.y!=0){
            if(y>0){
                this.tetha=90;
            }
            else if(y<0){
                this.tetha=270;
            }
        }
        else if(this.y==0 && this.x !=0){
            if(x>0){
                this.tetha =0;
            }
            if(x<0){
                this.tetha =180;
            }
        }
        else{
            this.tetha = Math.atan(this.y/this.x);
                    //atg(this.y/this.x);
        }
        this.tetha=Math.toDegrees(tetha);
    }
    //Son los que devuelven los valores de cada aspecto
    public double getModulo() {
        return modulo;
    }
    public double getTetha() {
        return tetha;
    }
    public double radTetha(){
        return Math.toRadians(tetha);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    //Son los que asignan valores directamente
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
        this.ta();
    }
    public void settm(double tetha, double modulo){
        this.tetha=tetha;
        this.modulo=modulo;
        this.toxy();
    }
    @Override
    public String toString(){
        if(this.y>0)
        return "("+String.format("%.3f",x)+"+"+String.format("%.3f",y)+"i)";
        else
        return "("+String.format("%.3f",x)+"-"+String.format("%.3f",Math.abs(y))+"i)";
            
    }
    public String toTrigonometrica(){
        return String.format("%.3f",modulo)+"(cos("+String.format("%.3f",tetha)+")+i sin("+String.format("%.3f",tetha)+"))";
    }
    public String toEuler(){
        if(this.y>=0)
        return String.format("%.3f",modulo)+"e^(i("+String.format("%.3f",tetha)+"))";
        else
        return "("+String.format("%.3f",modulo)+")e^(("+String.format("%.3f",tetha)+"))";
    }
    //Pasamos a las operaciones
    public NumComplejo Suma(NumComplejo i){
        double xr = this.x+i.getX();
        double yr = this.y+i.getY();
        this.setXY(xr, yr);
        this.ta();
        return this;
    }
    public NumComplejo Resta(NumComplejo i){
        double xr = this.x-i.getX();
        double yr = this.y-i.getY();
        this.setXY(xr, yr);
        this.ta();
        return this;   
    }
    public NumComplejo Multiplicacion(NumComplejo i){
        double xr = this.x*i.getX() - this.y*i.getY();
        double yr = this.x*i.getY() + this.y*i.getX();
        this.setXY(xr, yr);
        this.ta();
        return this;   
    }
    public NumComplejo Division(NumComplejo i){
        double cd= i.getX()*i.getX() + i.getY()*i.getY();
            double xr = 0;
            double yr =0;
        if(cd!=0){
             xr = (this.x*i.getX() + this.y*i.getY())/cd;
             yr = (this.y*i.getX() - this.x*i.getY())/cd;
        }
        else{
             xr =0;
             yr =0;
        } 
        this.setXY(xr, yr);
        this.ta();
        return this;   
    }
    public NumComplejo Conjugado(){
        NumComplejo resultado = new NumComplejo(this.x , this.y*-1);
        return resultado;
    }

    public NumComplejo Potencia(int i){
        NumComplejo  resultado = new NumComplejo(this.x,this.y);
        for(int j =1; j<i;j++){
            resultado.Multiplicacion(resultado);
        }
        return resultado;
        }
    
    public static NumComplejo Potencia(NumComplejo z,int i){
        NumComplejo  resultado = z;
        for(int j =1; j<i;j++){
            resultado.Multiplicacion(resultado);
        }
        return resultado;
        }
    
    public static NumComplejo Suma(NumComplejo h, NumComplejo i){
        double xr = h.getX()+i.getX();
        double yr = h.getY()+i.getY();
        
        return (new NumComplejo(xr,yr));
    }
    public static NumComplejo Resta(NumComplejo h, NumComplejo i){
        double xr = h.getX()-i.getX();
        double yr = h.getY()-i.getY();
        return new NumComplejo(xr,yr);   
    }
    public static NumComplejo Multiplicacion(NumComplejo h, NumComplejo i){
        double xr = h.getY()*i.getX() - h.getY()*i.getY();
        double yr = h.getX()*i.getY() + h.getY()*i.getX();
        return new NumComplejo(xr,yr);
    }
    public static NumComplejo Division(NumComplejo h, NumComplejo i){
        double cd= i.getX()*i.getX() + i.getY()*i.getY();
            double xr = 0;
            double yr =0;
        if(cd!=0){
             xr = (h.getX()*i.getX() + h.getY()*i.getY())/cd;
             yr = (h.getY()*i.getX() - h.getX()*i.getY())/cd;
        }
        else{
             xr =0;
             yr =0;
        } 
        return new NumComplejo(xr,yr);   
    }
    public static NumComplejo Conjugado(NumComplejo h){
        NumComplejo resultado = new NumComplejo(h.getX() , h.getY()*-1);
        return resultado;
    }

    public static NumComplejo Potencia(int i, NumComplejo h){
        NumComplejo  resultado = new NumComplejo(h.getX(),h.getY());
        for(int j =1; j<i;j++){
            resultado.Multiplicacion(h);
            System.out.println(resultado.toString());
        }
        return resultado;
        }
    public static NumComplejo[] raiz(int i, NumComplejo h){
        NumComplejo[] raices = new NumComplejo[i];
        float f=i;
        float s = (float)Math.pow(h.getModulo(),(1.0/(double)i));
        float Y ;
        for(int j =0;j<i;j++){
            Y= (float)((h.radTetha()+(2*j*Math.PI))/((float)i));
            raices[j]= new NumComplejo(s,(float)Math.toDegrees(Y));
        }
        return raices;
    }
    
    public static void  main (String[] argg){
        
    }
 
}