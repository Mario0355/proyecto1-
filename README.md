# proyecto1-

## descripcion

biblioteca 
el proposito del programa es para poder solicitar libros ingresarlos y verificar si se guardan en la base de datos, tambien para que el cliente ingrese sus datos y al momento de que ingrese sus datos y le de ingresar directa mente sus datos se guaeden en base de datos y lo mismo seria para el usuario 
se uso saron  como base de datos mysql para checar que se guarden los datos que se ponen en el programa se usos neatbens para crear el programa y enlazarlo con las paginas de github y zube

## problema identificado

queremos hacer un programa donde podamos crear una biblioteca virtual, primero subir los libros que estaran disponibles, despues crear el acceso a los usuarios para que puedan ingresar para ver los libros que estan disponibles en la pagina.
el motivo del proyecto es para poder sacarlo al mercado como una aplicacion o pagina web ya que surgio la idea por un profesor y decidi crear la biblioteca y no queria dejalo en pausa cuando puedo trabajar sobre el proyecto para hacerlo mejor.

## solucion 

mejorar la pagina corregir los errores que muestra el codigo y empezar a trabajar mas a fondo en la base de datos donded se van a cargar los libros donde se van a almacenar y tambien donde se van a almacenar los datos del usuario.
tambien se podra llevar un buen control de los usuarios de cuatos usuarios han ingresado, se llebara un buen control en la bse de datos de los libros que se han descargado de que libron han buscado y con ver en los libros que mas buscan y no lo tenemos disponible podremos agregar el libro que buscan y dar un mejor servicio al usuario ( clientes) 

## arquitectura

![¨](diagrama.jpg)



## tabla de contenidos


       -[futuro a largo mediano plazo](#futuro-a-largo-mediano-plazo)
       
       

### instrucciones 

- la pagina te abrira una pagina de internet donde estara la pagina principal de la biblioteca donde estaran las opciones de consultar libro o ingresar usuario, si la damos en consultar libro te pedira los datos como, nombre del libro, tipo de libro, editor o escritor.

### ejecucion de prueba manualmente

- Las pruebas se realizan de una manera sencilla, si se abre la página principal de phpMyAdmin y no se tiene respuesta es porque no se ha iniciado el servidor MySQL Server.

Otra prueba es al ingresar información en las tablas y que no se guarde el registro en la base de datos.

Las pruebas no pueden ser muy variadas para este sistema porque su funcionamiento es básico y solo interviene el sistema con la base de datos.

## configuracion 

- la configuracion de la biblioteca necesitaras que se instale neatbens para que se enlace con MY SQL y todo lo que ingresemos en neatbens lo guarde directo en MY SQL. 

## manual para usuario final 

- El usuario ingresará a la aplicación ubicada en el escritorio de la computadora principal. La primera pantalla que visualizará será el menú principal con las opciones:

- consulta de libros 
- ingresar usuario

## metodos de pago 


- En la pantalla Pagos Trabajadores se controlará la información con referencia a los pagos realizados a los trabajadores tomando en cuenta que los pagos son realizados semanalmente. La pantalla solo cuenta con una tabla donde ingresarán los datos del empleado, dicha tabla tiene las columnas:

Nombre
Fecha
Total pago

el usuario tendra que corroborar que este bien lo que se le esta cobrando y una vez que este seguro que este bien lo que va a pagar se ira para confirmar pago una vez que le de clic tendra que ingresar el numero de tarjeta si quiere factura ingresar sus datos para que se le mande su factura a su correo electronico.

## pedido 

En la opción Pedidos se tendrá el botón Modificar, al dar clic en el botón el usuario ingresará a la pantalla principal Pedidos y Bordado.

La pantalla controlará las modificaciones de las fechas de entrega para Pedidos y Bordado; en la sección de Pedidos se tendrá un texto donde el usuario ingresará el modelo del libro a buscar, a continuación, dará clic en el botón “Buscar”, en la tabla se mostrarán los resultados a partir de la búsqueda realizada en la base de datos; el usuario seleccionará la fila en la columna del libro deseado.

En la parte inferior de la pantalla se encuentra un texto donde el usuario ingresará el nuevo estatus del modelo seleccionado, teniendo como opciones:

Modificar la fecha de entrega
Cambiar el estatus a Entregado

En la sección de Bordados se tendrá un TextField donde el usuario ingresará el tipo del libro a buscar, a continuación, dará clic en el botón “Buscar”, en la tabla se mostrarán los resultados a partir de la búsqueda realizada en la base de datos; el usuario seleccionará la fila en la columna del libro deseado.

## total a pagar 

En el menú principal se seleccionará la pestaña Cuenta donde se mostrará el botón Modificar, al dar clic en dicho botón el usuario ingresará en la pantalla principal Cuenta Total.

En la pantalla Cuenta Total se controlará la información de los pedidos realizados por los compradores, se divide en tres secciones:

usuario
cuantos libros 
tipo de libro

Las tres tablas cuentan con las mismas columnas las cuales son:

libros 
No. libros
Cantidad
Precio
Total

## administrador 

- No se cuentan con áreas exclusivas porque este sistema lo utilizará solamente el gerente de la empresa, se instalará solamente en su equipo personal. El administrador podrá ver las mismas funciones que el gerente.

## futuro a largo mediano plazo

-Los requerimientos por implementar son:

Control en las fechas de entrega, marcar advertencia por fecha de vencimiento en caso de que el libro sea rentado el linea.
rentar libro en linea.
Generar reporte mensual de ingresos y egresos.
Desarrollo de aplicación móvil.
