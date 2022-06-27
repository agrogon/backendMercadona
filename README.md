# backendMercadona

## Development server
Run `java -jar mercadona-0.0.1-SNAPSHOT.jar` for a dev server. Navigate to `http://localhost:8080/`

### Pages

#### Main
You will be able to create a new product. In addition, you will get a list of products and you will be able to modify them and get more information.

#### Create
You will be able to create a new product by filling their different fields. After saving, you will return to the main page and you will be able to view your new product.

#### Modify
You will be able to modify an existing product after clicking the "Editar" button. Once you have filled in the different fields and saved, you will return to the main page and you will see your update.

#### Delete
You will be able to delete an existing product after clicking the "Eliminar" button. Once you clicked, the page will refresh automatically.

## Database
Navigate, in another tab, to `http://localhost:8080/h2-console`. There, you will be able to see how the database manages all the products.

Set the field `JDBC URL` as follows: `jdbc:h2:mem:testdb` and click the "Connect" button.

To see how it works, select the "Product" table and click the "Run" button to execute the query that appears in the box. There, you will be able to see any new product, any modification or, if the product has been removed, you simply will not see it anymore.

Tip: You can perform any action through the different pages and see in real time the content of the table.