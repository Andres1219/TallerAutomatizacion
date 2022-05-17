Feature: agregar producto al carrito de la aplicacion linio.com.co
  Yo como usuario de la aplicacion linio.com.co
  necesito agregar productos al carrito
  para acceder a las funcionalidades de la aplicacion

  Scenario: agregar producto al carrito de la aplicacion linio.com.co
    Given el usuario se encuentra en la aplicacion linio.com.co
    When el usuario selecciona la categoria y productos corecto
    Then el usuario ve el mensaje productos seleccionados <mensaje>