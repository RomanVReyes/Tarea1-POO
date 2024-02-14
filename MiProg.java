class Estudiante{
    String nombre;
    float promedio;
    String matricula;


public void setNombre(String nom){
    nombre = nom;
}
public String getNombre(){
    return nombre;
}

public void setPromedio(float prom){
    promedio = prom;
}
public float getPromedio(){
    return promedio;
}

public void setMatricula(String mat){
    matricula = mat;
}
public String getMatricula(){
    return matricula;
}

public String SetGetNombre(String nom){
    nombre = nom;
    return nombre;
}
}

public class MiProg{
    public static void main(String args[]){
        String temp;
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();
        est1.setNombre("Juan");
        est1.setPromedio(7);
        est1.setMatricula("1299755");
        
        est2.setNombre("Pedro");
        est2.setPromedio(9);
        est2.setMatricula("1299888");

        est3.setNombre("Samuel");
        est3.setPromedio(6);
        est3.setMatricula("1257888");

        System.out.println("Estudiante 1:");
        System.out.println("Nombre:"+est1.getNombre());
        System.out.println("Promedio:"+est1.getPromedio());
        System.out.println("Matricula:"+est1.getMatricula());

        System.out.println("Estudiante 2:");
        System.out.println("Nombre:"+est2.getNombre());
        System.out.println("Promedio:"+est2.getPromedio());
        System.out.println("Matricula:"+est2.getMatricula());

        System.out.println("Estudiante 3:");
        System.out.println("Nombre:"+est3.getNombre());
        System.out.println("Promedio:"+est3.getPromedio());
        System.out.println("Matricula:"+est3.getMatricula());
    }
}