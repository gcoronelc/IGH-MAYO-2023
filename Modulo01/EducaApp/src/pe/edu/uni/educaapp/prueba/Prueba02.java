package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.service.EducaService;


public class Prueba02 {
    
    public static void main(String[] args) {
        try {
            EducaService service = new EducaService();
            service.procMatricula(3, 6, 5000, 4);
            System.out.println("Proceso ok.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
