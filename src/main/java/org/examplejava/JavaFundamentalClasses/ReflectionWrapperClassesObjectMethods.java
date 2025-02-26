package org.examplejava.JavaFundamentalClasses;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionWrapperClassesObjectMethods {

    private String nombre;
    private int edad;

    public ReflectionWrapperClassesObjectMethods() {}

    public ReflectionWrapperClassesObjectMethods(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Object Classes

    @Override
    public String toString() {
        return "Persona[nombre=" + nombre + ", edad=" + edad + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ReflectionWrapperClassesObjectMethods persona = (ReflectionWrapperClassesObjectMethods) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return 31 + nombre.hashCode() + edad;
    }

    // Wrapper classes

    public void wrapperClass(Integer i, int i2) {

        Integer f = Integer.valueOf(i2);
        System.out.println("\nint a Integer: " + f);
        System.out.println("Comparación entre Integers:");
        System.out.println(i.compareTo(f));

    }

    // Reflection

    public void infoClass() {
        Class<?> clazz = Persona.class;

        System.out.println("\nNombre de la clase " + clazz.getName());

        System.out.println("-------Campos-----");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " - " + field.getType());
        }

        System.out.println("-------Metodos-----");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("-------Constructores-----");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

    }

    public void privateField() {
        Persona p = new Persona("Mikael", 21);
        try {
            Field field = Persona.class.getDeclaredField("nombre");
            field.setAccessible(true);

            field.set(p, "M&K& ");

            Method method = Persona.class.getDeclaredMethod("method");
            method.invoke(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void invokeMethod() {

        Persona p = new Persona("Billie", 22);
        try {
            Method method = Persona.class.getDeclaredMethod("method");
            method.invoke(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void createInstance() {
        try {
            Constructor<Persona> constructor = Persona.class.getConstructor(String.class, int.class);
            Persona persona = constructor.newInstance("NoiseFeratu", 30);

            Method method = Persona.class.getDeclaredMethod("method");
            method.invoke(persona);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ReflectionWrapperClassesObjectMethods persona1 = new ReflectionWrapperClassesObjectMethods("Carlos", 30);
        ReflectionWrapperClassesObjectMethods persona2 = new ReflectionWrapperClassesObjectMethods("Carlos", 30);
        System.out.println(persona1);
        System.out.println(persona1.equals(persona2)); // true
        System.out.println(persona1.hashCode() == persona2.hashCode());
        System.out.println(persona1.getClass());

        ReflectionWrapperClassesObjectMethods p = new ReflectionWrapperClassesObjectMethods();
        p.wrapperClass(25, 15);
        p.wrapperClass(108, 108);
        p.wrapperClass(8, 1627);

        p.infoClass();
        p.privateField();
        p.invokeMethod();
        p.createInstance();
    }

}
