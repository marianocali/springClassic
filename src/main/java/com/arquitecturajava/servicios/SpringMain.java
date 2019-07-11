package com.arquitecturajava.servicios;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        // crear un contexto para anotaciones
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();

        // registrar los archivos de anotaciones que son de configuración con componentScan
        contexto.register(SpringConfigurador.class);

        // refrescar el conteto
        contexto.refresh();

        //invocar el bean
        Servicio servicio = contexto.getBean(Servicio.class);
        String result = servicio.mensaje();
        System.out.println(result);
        contexto.close();
    }
}
