package org.examplejava.CompilationandDeployment;

public class ClassDinamic {

    @SafeVarargs
    final <T> void metodoVarargs (T... json) {
        for (T js : json) {
            System.out.println("Elemento: " + js);
        }
    }

    public void dinamicClass() {
        try {
            Class<?> clase = Class.forName("org.examplejava.CompilationandDeployment.ClassMethod");
            Object instancia = clase.getDeclaredConstructor().newInstance();
            System.out.println("Instancia creada: " + instancia.getClass().getName());
            clase.getMethod("method").invoke(instancia);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            ClassDinamic main = new ClassDinamic();
            main.metodoVarargs("Agua", "Tierra", "Aire", "Fuego", 10, 432);
            main.dinamicClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
