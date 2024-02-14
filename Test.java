class Estudiante{
    String nombre;
    float promedio;
    String matricula;


public String SetGetNombre(String nom){
    nombre = nom;
    return nombre;
}

public float SetGetPromedio(float prom){
    promedio = prom;
    return promedio;
}

public String SetGetMatricula(String mat){
    matricula = mat;
    return matricula;
}
}

public class Test{
    public static void main(String args[]){
        String temp;
        float tempn;
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();

        System.out.println("Estudiante 1:");
        temp = est1.SetGetNombre("Juan");
        System.out.println("Nombre:"+temp);
        tempn = est1.SetGetPromedio(9);
        System.out.println("Promedio:"+tempn);
        temp = est1.SetGetMatricula("1299766");
        System.out.println("Matricula:"+temp);

        System.out.println("Estudiante 2:");
        temp = est1.SetGetNombre("Pedro");
        System.out.println("Nombre:"+temp);
        tempn = est1.SetGetPromedio(6);
        System.out.println("Promedio:"+tempn);
        temp = est1.SetGetMatricula("1236766");
        System.out.println("Matricula:"+temp);

        System.out.println("Estudiante 3:");
        temp = est1.SetGetNombre("Samuel");
        System.out.println("Nombre:"+temp);
        tempn = est1.SetGetPromedio(7);
        System.out.println("Promedio:"+tempn);
        temp = est1.SetGetMatricula("1290982");
        System.out.println("Matricula:"+temp);

        
    }
}