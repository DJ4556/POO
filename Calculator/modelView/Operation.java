
package modelView;

public class Operation {
    
    public static double Sum(double num1, double num2){
        
        double sum = num1 + num2;
        return sum;
        
    }
    
    public static double Rest(double num1, double num2){
        
        double rest = num1 - num2;
        return rest;
        
    }
    
    public static double Multiply(double num1, double num2){
        
        double mult = num1 * num2;
        return mult;
        
    }
    
    public static double Divide(double num1, double num2){
        
        double dvt = num1 / num2;
        return dvt;
        
    }
    
    public static double Root(double num1, double num2){
        
        double root = Math.pow(num1, 1/num2);
        return root;
        
    }
    
    public static double Exp(double num1, double num2){
        
        double exp = Math.pow(num1, num2);
        return exp;
        
    }
    
    public static double Log(double num1){
        
        double log = Math.log10(num1);
        return log;
        
    }
    
    public static double ln(double num1){
        
        double exp = Math.log(num1);
        return exp;
        
    }
    
    public static double Sen(double num1){
        
        double sen = Math.sin(num1);
        return sen;
        
    }
    
    public static double Cos(double num1){
        
        double cos = Math.cos(num1);
        return cos;
        
    }
    
    public static double Tan(double num1){
        
        double tan = Math.tan(num1);
        return tan;
        
    }
    
    public static double Cot(double num1){
        
        double cot = 1/Math.tan(num1);
        return cot;
        
    }
    
    public static double Sec(double num1){
        
        double sec = 1/Math.cos(num1);
        return sec;
        
    }
    
    public static double Csc(double num1){
        
        double csc = 1/Math.sin(num1);
        return csc;
        
    }
    
    public static double Arcsen(double num1){
        
        double arcsen = Math.toDegrees(Math.asin(num1));
        return arcsen;
        
    }
    
    public static double Arccos(double num1){
        
        double arccos = Math.toDegrees(Math.acos(num1));
        return arccos;
        
    }
    
    public static double Arctan(double num1){
        
        double arctan = Math.toDegrees(Math.atan(num1));
        return arctan;
    }
}
