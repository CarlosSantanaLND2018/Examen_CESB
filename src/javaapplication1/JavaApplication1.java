
package javaapplication1;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Santana
 */
public class JavaApplication1 {
 // Todo en una sola clase
        /* Resultados calculadoos
        Cálculo del Área Cuadrado
        Cálculo del¨sÁrea rectangulo
        Cálculo del áreacirculo
        Cálculo del Área del Triangulo
        */
    
    public static void main(String[] args) {
        Area_cuadrado();/** @since 18:21 */
        
        double baseRectangulo=0;
        int alturaRectangulo=0;
        double areaRectangulo=alturaRectangulo*baseRectangulo;
         System.out.println(areaRectangulo);
         
        int radioCirculo=0;
        double Pi=3.14;
        double areaCirculo=(Pi * Math.pow(radioCirculo,2));
        int baseTriangulo=0;
        int alturaTriangulo=0;
        int areaTriangulo=((baseTriangulo*alturaTriangulo)/2);
       
        System.out.println(areaRectangulo);
        System.out.println(areaCirculo);
        System.out.println(areaTriangulo);  
    }

    public static void Area_cuadrado() {
        
        
        
        
        
        int alturaCuadrado=0;
        double baseCuadrado=0;
        double areaCuadrado=Math.pow(alturaCuadrado,2);
        System.out.println(areaCuadrado);
    }


    
    

