example of classic Spring project constructed to show
how we need to manage dependencies in a classic way.

Steps:
1 - Create a Service class with a method to invocate. In this case mensaje method
2 - Create a SpringConfigurator class to indicate Spring where scan in order to find classes

@Configuration indicate this is configuration class
@ComponentScan("com.arquitecturajava.servicios") where find beans

3 - Create Main class. In the main we have to do 3 things
3 -1 create context for anotations using AnnotationConfigApplicationContext
3 -2 register the files of anotation compponentScan
3 -3 refresh the context
3 -4 invoke the bean

