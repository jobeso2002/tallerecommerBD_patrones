se aplico el patron abstract factory y methodo factory porque con la clase ConfiguracionBD, que es responsable de la creación de objetos en este caso, las diferentes implementaciones de la interfaz IProductoDAO para cada motor de base de datos.
y el metodo factory se aplica dentro del método configureAdapterDB(). Donde este método decide cuál implementación se va a llevar a cabo de la interfaz IProductoDAO instanciar ya sea BD_MySQL, BD_Oracle o BD_Postgres, del motor de base de datos configurado.


![sisecommerce drawio](https://github.com/user-attachments/assets/df127d03-850f-4207-9766-cfa28a9698f2)
