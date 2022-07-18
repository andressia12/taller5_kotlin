<h1 align="center">Proyecto Final diplomado desarrollo movil</h1>
<h3 align="center"> Aplicación movil para el control de cultivos</h3>
 Presentado por por: 
 
    Diego Sachica
    
    Johnny Argote
    
    Marco Vanegas
    
    Andrés Siachoque
    
    
# Tabla de Contenidos
[1. Introducción](#introducción)

[2. Herramientas usadas para la solución](#herramientas-usadas-para-la-solución)

[3. Necesidad](#necesidad)

[4. Diseño de interfaz](#diseño-de-interfaz)

[5. Firebase](#firebase)

[6. Arquitectura de software](#arquitectura-de-software)

[7. Metología usada](#metodologia-usada)

[8.Desarrollo Proyecto](#Desarrollo-Proyecto)



# Introducción

La agricultura tiene una gran importancia en la economía de muchos países en desarrollo debido a su significativa contribución a la producción interna y el empleo, así como por su aporte a la seguridad alimentaria, esencial sobre todo para los países menos industrializados. Sin embargo, en todo el mundo en desarrollo la agricultura sigue afrontando dificultades. En los años 90 la producción agrícola per cápita tanto para el mercado interno como para el de exportación disminuyó, y a fines de la década de 1990 sólo aportaban el 1 por ciento de las exportaciones agrícolas mundiales. En efecto, a pesar de todas las oportunidades económicas atribuidas a la globalización y el comercio internacional, por lo general los pequeños campesinos del mundo en desarrollo no sólo no pueden participar en los mercados internacionales sino que tienen que competir con los productos de importación en sus propios mercados internos.

Antes de la pandemia, la agricultura como sector productivo no generaba el interés que concita en la actualidad como proveedor estratégico de alimentos, pilar de la seguridad alimentaria y bastión en la lucha contra la inflación. Estudios recientes comprueban que la contribución del valor agregado de la agricultura a la economía es muy superior en América Latina, incluida Colombia. Un estudio de la FAO (Organización de las Naciones Unidas para la Agricultura y la Alimentación) sobre Transformación Rural de Carolina Trivelli y Julio Berdegué, menciona que el aporte agropecuario ampliado a la economía podría ser del 30% en el país, al igual que, en promedio, en 9 países evaluados de la región. Los autores sostienen que el peso total de la agricultura ampliada representan un multiplicador de la economía agrícola, que podría elevar, en promedio, hasta por cuatro el impacto del valor real de la agricultura

Dicho esto, se decidió  que ayudar al agriculto colombiano a hacer parte de un mundo cada vez más globalizado e industrializado por medio de la implementación de una aplicación móvil que le permita tener un mayor control sobre sus cultivos garantizando una mejor calidad y eficiencia en cada uno de estos.

# Herramientas usadas para la solución
<h2>Kotlin</h2>

Kotlin es un lenguaje de programación estático de código abierto que admite la programación funcional y orientada a objetos lo que lo hace muy práctico de usar, además, en cuanto al tema de desarrollo de aplicaciones móviles android  es uno de los  más usados y con mayor soporte gracias a Google.

![Kotlin.jpg](https://i.postimg.cc/wTsZy7js/Kotlin.jpg)

<h2> Android studio </h2> 

Es el entorno de desarrollo integrado oficial para la plataforma Android, está basado en el software IntelliJ IDEA de JetBrain y soporta varios lenguajes de programacíón incluyendo Kotlin, esta basado en Gradle que es un emulador rápido y cargado de funciones.

[![Andorid-studio.jpg](https://i.postimg.cc/rsdh6YPP/Andorid-studio.png)](https://postimg.cc/q6TcyQ0s)

<h2> Figma </h2> 
La herramienta balsamiq nos permitirá crear el prototipo y modelado del proyecto, debido a que esta herramienta es una de las mejores 
para crear prototipos, bocetos o wireframes es Balsamiq Mockups


[![figma.jpg](https://i.postimg.cc/x17p5Qpb/figma.webp)](https://postimg.cc/NK6xG3cg)

Figma es una herramienta para diseñar prototipos, wireframes, interfaces… Todo aquello que posea una interfaz gráfica se puede diseñar desde Figma ya sean páginas web, pantallas de móvil e incluso para smartwatches, su mayor ventaja es que es una plataforma  colaborativa.

<h2> Firebase  </h2> 

Firebase básicamente es una plataforma móvil diseñada y creada por Google, teniendo como principal función desarrollar y facilitar la creación de aplicaciones para dispositivos móviles que cuenten con una alta calidad a pesar de su rápida elaboración.

[![firebase.png](https://i.postimg.cc/ZRZRMCw9/firebase.png)](https://postimg.cc/WDWTDbLj)

# Necesidad
Basados en el objetivo de desarrollo sostenible 9 titulado "Construir infraestructuras resilientes, promover la industrialización sostenible y fomentar la innovación" se obtiene que en los países en desarrollo, apenas el 30% de la producción agrícola se somete a procesos industriales. En los países de altos ingresos, el 98% se procesa. Esto sugiere que hay grandes oportunidades para los países en desarrollo en materia de agronegocios, por lo que fundamentados en esto se ve el una oportunidad de mejora  

El incorrecto manejo del inventario perjudica las prácticas de los laboratorios debido a que afecta los procesos de formación y procesos de investigación al encontrar incoherencias en los inventarios . Esto genera que se compren mayores cantidades de reactivos innecesarios, o que se venzan los reactivos por lo que ya no se pueden usar en procesos de investigación. Por otro lado, se debe tener control de las salidas y las entradas de los productos para saber cuando se debe adquirir más de un producto o cuando hay suficiente cantidad para las prácticas. 

# Interfaz gráfica

A continuación se muestran los mockups de la aplicación explicados uno a uno y según el hilo que debe llevar el usurio por la apliación.

LOGIN 

Si el usuario ya está registrado puede ingresar con su usuario y contraseña como credenciales propuestas por este mismo, de lo contrario deberá acceder a la opción registrate ahora.

[![Vista-1.jpg](https://i.postimg.cc/SKnRmkkd/Vista-1.png)](https://postimg.cc/Y4wM3c4L)

REGISTRARSE

La aplicación solicitará correo de ingreso y contraseña proporcionadas por el usuario, además de la confirmación de la misma. Una vez confirmada la contraseña podrá finalizar su proceso de registro; posteriormente será redirigido a la ventana login para iniciar sesión con las credenciales creadas anteriormente.

[![Vista-2.png](https://i.postimg.cc/X7D04FqM/Vista-2.png)](https://postimg.cc/1f6dK8DM)

VENTANA DE CARGA

Una vez el usuario esté logueado se visualizará la ventana de carga por aproximadamente tres segundos mientras cargan los datos de la aplicación, lo cual le indicará al usuario que el ingreso fué correcto.

[![Vista-3.jpg](https://i.postimg.cc/cLrtLQcf/Vista-3.png)](https://postimg.cc/RWxZPJy0)

HOME

En esta ventana podrá interactuar con el menú principal con cinco opciones diferentes.

[![Vista-4.jpg](https://i.postimg.cc/BZzRL3Tk/Vista-4.png)](https://postimg.cc/bdQmWKF9)

1) AGREGAR CULTIVO

Ésta opción lo redirigirá a una nueva ventana con un formulario para agregar algún cultivo donde se solicitará algunos datos de este.

[![vista-13.jpg](https://i.postimg.cc/xCZRp0gz/vista-13.jpg)](https://postimg.cc/CBjkzp3h)

2) VER CULTIVO

esta opción lo redirige a una nueva ventana donde el usuario podrá visualizar cada uno de sus cultivos y acceder a ellos independientemente, igualmente se visualiza una gráfica tipo anillo con los porcentajes de área de los cultivos. 

[![Vista-5.png](https://i.postimg.cc/N0PZ6whK/Vista-5.png)](https://postimg.cc/d7rWFpVF)

SELECCIONAR CULTIVO

Una vez seleccionado el cultivo se accee a otra ventana donde están las opciones: Informe general, horas trabajadas, hectáreas trabajadas y agua regada.

[![Vista-6.jpg](https://i.postimg.cc/y6hvBzf0/Vista-6.png)](https://postimg.cc/rzmSC72p)

- OPCIÓN INFORME GENERAL 

Una vez se seleccione esta ocpción se podra ver el balance de horas trabajadas por medio de una graficade barras y el clima de la región por medio de un mapa y algunos datos del clima

[![Vista-7.jpg](https://i.postimg.cc/xTMkB0tS/Vista-7.png)](https://postimg.cc/bsYNtf76)

[![Vista-8.jpg](https://i.postimg.cc/qvW5qx2K/Vista-8.png)](https://postimg.cc/hXbr3xy4)

- HORAS TRABAJADAS

Al seleccionar esta popción se mostrará un formulario donde se visualiza el tiempo trabajado y la fecha.

[![Vista-9.jpg](https://i.postimg.cc/VNyKmLcB/Vista-9.png)](https://postimg.cc/9DpdB20r)

- AGUA REGADA

En esta opción se visualizará un formulario con los campos: cantidad de metros cúbicos y fecha.

[![Vista-10.jpg](https://i.postimg.cc/G2KKFFTq/Vista-10.png)](https://postimg.cc/xJkLYbRz)

- HECTÁREAS TRABAJADAS 

Se visualizará un formulario con los campo: cantidad de hectáreas y fecha. 

[![Vista-11.jpg](https://i.postimg.cc/g0PH1Svg/Vista-11.png)](https://postimg.cc/ZWVNdLsN)

3) ACTIVIDADES

En esta opción se despliega un calendario para agregar actividades dependiendo de la fecha, al seleccionar el día se abrirá una nueva ventana para crear la actividad para registrar. 

[![Vista-13.jpg](https://i.postimg.cc/x8WzM856/Vista-13.png)](https://postimg.cc/MfmH8WhB)

[![Vista-14.jpg](https://i.postimg.cc/BvMPNMNL/Vista-14.png)](https://postimg.cc/sBG2gPks)

4) OPCIÓN PERFIL

En esta opción se accede a una nueva ventana donde se visualiza el correo del usuario y donde se permite cerrar sesión.

5) OPCIÓN TIPS SOBRE TUS CULTIVOS 

En esta opción se redirige a una nueva ventana, donde se encuentran cinco consejos para un buen cultivo.

[![Vista-12.jpg](https://i.postimg.cc/Qx9gCGm6/Vista-12.png)](https://postimg.cc/gnpLt7fR)





![inisiosesion.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/iniciosesion.png)

En caso de que el usuario ingrese como invitado logrará navegar por el inventario y podrá buscar los productos para ver la información de cada uno, sin embargo, no tendrá permiso de insertar, eliminar o modificar ningún producto del laboratorio

![invitado.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/invitado.png)

Por otro lado, si el usuario inicia sesión va a tener el permiso de insertar, modificar y eliminar productos del inventario. Las sigueintes imagenes mostrarán los datos de cada uno de los productos del inventario como lo son Equipos, Reactivos y Materiales. 

![crud.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/crud.png)
![crudreac](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/crudreac.png)
![crudmat](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/crudmat.png)

Además, en una diferente sección se va a poder observar cual es la próxima fecha de revisión y mantenimiento en cuanto a los equipos, y cual es la fecha de vencimiento en cuanto a los reactivos como se muestra a continuación 

![revreactivos](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/revreac.png)
![revequipos](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/revreactivos.png)

# MER

El modelo entidad-relación del proyecto se muestra a continuación:
![Mer.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/MER.png)

# Arquitectura de Software

La arquitectura que se decidió implementar en el proyecto es la arquitectura cliente-servidor, esto debido a que los usuarios van a estar conectados al servidor de base de datos en donde se almacenará toda la información de los productos del laboratorio, por esto los recursos siempre estarán a disposición de los usuarios que van a hacer uso de esta información . Todas las gestiones que se realizarán van a estar concentradas en el servidor, además, el servidor tambien dispondrá de los requerimientos provenientes de los usuarios que tienen prioridad ,o, de la información que es de uso público. 

El proyecto se compondrá de una red LAN la cual tendrá 3 computadores para los usuarios una impresora y un servidor de base de datos donde se almacenará la información, los cuales estarán interconectados por medio de un switch. A continuación se muestra la arquitectura de software del proyecto realizada en Cisco Packet Tracer. 

![LAN.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/LAN.png)

# Metodología Ágil

El proyecto se realizará en base a una metodología ágil debido a que gracias a estas metodologías se logra adaptar a la forma de trabajo y a las condiciones del proyecto,utilizando enfoques flexibles para ofrecer mejoras y aumentar la satisfacción del cliente. Es por esto, que se decidió utilizar la metodología SCRUM.
La metodología SCRUM se utilizó debido a sus ventajas, las cuales son: innovación, flexibilidad, competitividad y productividad.
La metodología SCRUM se compone de diferentes etapas. 
- La primer etapa es de suma importancia debido a que se crea la visión del proyecto y el plan de lanzamiento.
- La segunda etapa es la de planificación y estimación donde se elaboran y se definen las primeras tareas y se aceptan sugerencias y optimizaciones del proceso
- La tercer etapa es la implementación donde se crean los primeros entregables diseñando la aplicación junto con las optimizaciones del cliente
- La cuarta etapa es la revisión e retroespectiva donde se construye y se implementa el programa realizando demostraciones y validaciones del mismo
- La quinta y última etapa es el lanzamiento donde se envían los entregables y se hace la respectiva evaluación y monitoreo del proyecto

![SCRUM.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagenes%20para%20el%20proyecto/SCRUM.png)

# Desarrollo Proyecto

### A continuación se expondrá el desarrollo y la demostración del proyecto:


Inicialmente se creo la base de datos que se usó para el proyecto la cual se nombró comó Lab_inventario donde por medio de esta se crearon las diferentes tablas para el desarrollo del proyecto, con un total de 4 tablas; Una tabla que contendrá los datos de los usuarios autorizados a modificar la base de datos. La segunda tabla contendrá los datos de los equipos registrados, la tercera tabla los datos de los reactivos registrados y finalmente, la cuarta tabla contendrá los materiales registrados. 
![sqltablas.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/sqltablas.png)

Una vez que se ejecuta el código este va a mostrar una ventana donde le usuario va a tener dos opciones; Si el usuario es un usuario autorizado, este podrá ingresar con sus credenciales y va a poder modificar, eliminar, e insertar datos haciendo click en iniciar sesión. Sin embargo, en dado caso que el usuario no este autorizado solo podrá ingresar a mirar el inventario y buscar los datos necesarios sin poder realizar ninguna modificación.

![login.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/login.png)

Si el usuario ingresa como invitado va poder realizar las busquedas necesarias y mirar el inventario, sin embargo si ya desea realizar un cambio el usuario debe iniciar sesión. A continuación se expone como un usuario no autorizado puede interactuar con el programa

### Inicio Invitado
![buscarinv.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/buscarinv.png)

### Pestaña Equipos vista invitado
![buscareqinv.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/buscareqinv.png)
### Pestaña Reactivos vista invitado
![buscarrecinv.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/buscarrecinv.png)
### Pestaña Materiales vista invitado
![buscarmatinv.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/buscarmatinv.png)

En dado caso que ya se dese iniciar sesión, en cada una de las pestañas mencionadas anteriormente hay un botón de inicio de sesión, y una vez presionado, redirige al usuario a hacer login, en caso que el usuario acceda con credenciales en las bases de datos el programa le mostrará una alerta de ingreso satisfactorio, y en caso de que el usuario ingrese credenciales que no se encuentren en la base de datos se negará el acceso. 

### Acceso Satisfactorio
![loginY.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/loginY.png)
### Acceso Denegado
![loginN.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/loginN.png)

Una vez que el usuario ingrese este logrará ver las diferentes opciones para modificar el inventario de laboratorio, cada una de las pestañas dejará al usuario autorizado insertar, eliminar o modificar un dato de una manera eficiente como se demuestra a continuación

### Inicio Admin
![admin.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/admin.png)

### Pestaña Equipos vista Admin
![admineq.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/admineq.png)
### Pestaña Reactivos vista Admin
![adminreac.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/adminreac.png)
### Pestaña Materiales vista invitado
![adminmat.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/adminmat.png)


Además si el usuario desea buscar un archivo una vez que ingrese a la pestaña de buscar esta lo redirigirá a la ventana de busqueda la cual es la misma que la de busqueda de invitado, sin embargo, si se ingresa a esta ventana una vez ya se ha iniciado sesión el programa ya no le dirá al usuario que inicie sesión sino le mostrará un botón de volver para que el usuario pueda volver a la ventana de modificación inmediatamente

### Búsqueda Admin
![adminbusc.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/adminbusc.png)

Finalmente tanto para vista invitado como para la vista de Admin la última pestaña que se verá en el programa es la venta autor, donde se verán los respectivos créditos y detalles de quien realizó el proyecto

### Autor
![adminautor.png](https://github.com/Stepha-gon/ProyectoFinalBD/blob/main/imagit/adminautor.png)


### Conclusiones 

Debido a la necesidad de un sistema de control eficiente para la gestión de la información en los laboratorios químicos, se realizó un programa el cual disminuya la deficiencia a la hora de buscar, insertar, modificar datos de los diferentes laboratorios. Gracias al programa desarrollado se concretaron las siguientes conclusiones:<br>
•	Se evidencio la necesidad de un nuevo sistema de control de inventarios, debido a las deficiencias que se presentaban al momento de la ejecución de los mismos. <br>
•	El desarrollo de un nuevo sistema de control de inventarios, mejora la eficiencia y velocidad al momento de realizar el inventario, además de brindar la información verídica en cuanto a la existencia y cantidad de los componentes del laboratorio. <br>
•	El programa para le gestión del sistema de inventario, disminuirá el tiempo en su ejecución, ofrecerá información total y verídica, y además administrará correctamente los componentes del laboratorio
