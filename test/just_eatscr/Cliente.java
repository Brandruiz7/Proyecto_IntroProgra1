/*
 * Cliente
 *
 * @version 1.04
 *
 * Fecha 02-04-2021
 *
 * Copyright (c) "Preguntar a la profe"
 */
package just_eatscr;

import javax.swing.JOptionPane;

/**
 * Esta es la clase Cliente, acá podemos encontrar la información sobre
 * el usuario y datos de inicio de Sesión en la app Just Eats.
 *   
 * @author     Brandon Ruiz, Kervin Ruiz, Christopher Hernandez
 * @version    1.04    02 de Abril 2021
 * 
*/


public class Cliente 
{
    
   /** 
    * En esta clase se usarían las variables para poder identificar al cliente
    * en el inicio de sesión. También para asegurar la dirección donde se hará
    * el pedido, tomando en cuenta el número de celular y el nombre del cliente.
    */
    
    private int ID_Cliente = 0;
    private String Nombre = "";
    private String Usuario = "";
    private String Password = "";
    private String Ubicación = "";
    private String Correo = "";
    private String Teléfono = "";
    
    Cliente DatosUser[] = new Cliente [2];
    
    
    public Cliente()
    {
        
    }

   /** 
    * En este contructor se recopilaría información básica del cliente
    * 
    * @param Nombre
    * @param Usuario
    * @param Password
    * @param Ubicación
    * @param Correo
    * @param Teléfono
    * 
    */
    
    public Cliente(String Nombre, String Usuario, String Password, String Ubicación, String Correo, String Teléfono)
    {
        this.Nombre=Nombre;
        this.Usuario=Usuario;
        this.Password=Password;
        this.Ubicación=Ubicación;
        this.Correo=Correo;
        this.Teléfono=Teléfono;
    }
    
    /** 
    * Este es el metodo que permite al cliente regiatrar los datos 
    * que son necesarios dentro de la Aplicacion. Las variables 
    * creadas dentro del metodo son para llenar el arreglo
    * de objeto DatosUser.
    */
    
    public void registrarDatos(){
        String Nombre;
        String Usuario;
        String Password;
        String Ubicacion;
        String Correo;
        String Teléfono; 
        
        
        Nombre = JOptionPane.showInputDialog("Digite su Nombre: ");
        Usuario = JOptionPane.showInputDialog("Digite su alias de Usuario: ");
        Password = JOptionPane.showInputDialog("Digite su Password: ");
        Ubicacion = JOptionPane.showInputDialog("Digite su Ubicacion: ");
        Correo = JOptionPane.showInputDialog("Digite su Correo: ");
        Teléfono = JOptionPane.showInputDialog("Digite su Teléfono: ");
        
        DatosUser[ID_Cliente] = new Cliente(Nombre, Usuario, Password, Ubicacion, Correo, Teléfono );
        ID_Cliente++;
    }
    
    /** 
    * Este es el  metodo que permite al cliente iniciar sesion.
     * @return Verificacion        Esta variable guardara un valor 1 necesario para seguir el procesos  
    */
    
    public int iniciarSesion() {
        String User;
        String Pass;
        int Verificacion = 0;
        
        User = JOptionPane.showInputDialog("Digite su alias de Usuario: ");
        Pass = JOptionPane.showInputDialog("Digite su Password: ");
        
        for(int i = 0; i < DatosUser.length; i++) {
            if ((User.equals(DatosUser[i].Usuario)) && (Pass.equals(DatosUser[i].Password))) {
                JOptionPane.showMessageDialog(null,"Correcto");
                i = DatosUser.length;
               Verificacion=1;
            }else if((i+1) == DatosUser.length ) {
                JOptionPane.showMessageDialog(null,"Usario o Contraseña incorrectod"
                                            + "\nIngrese nuevamente");
            }
            
        }
        return Verificacion;
    }
            
    
    
    //gente usamos este para saber si se registro bien el usuario
    public void Mostrar() {
        for(int i = 0; i < DatosUser.length; i++) {
            JOptionPane.showMessageDialog(null, "User data " + (i+1) + " es: " + "\nNombre:" + DatosUser[i].Nombre );
        }
        
    }
    
    /** 
    * Este es el metodo que permite al cliente realizar compras de los diferentes
    * productos dentro de la App.
    * 
    * 
    */
    
    public void realizarCompra() {
        
    }
    
    /** 
    * Este es el metodo que permite al cliente realizar reclamos sobre sus peidos o 
    * productos comprados en la App. Dependiendo del reclamo este se almacenara 
    * de forma textual en una variable String.
    */
    
    public void realizarReclamo() {
        String Recl_Producto = "";
        String Recl_Pedido = "";
        int    Option; 
        
        do {
        Option = Integer.parseInt(JOptionPane.showInputDialog("         Just Eats               "
                                                           +"\nGracias por usar nuestro servicio"
                                                           +"\nPor favor indicar tipo de reclamo"
                                                           +"\n1-Recalmo sobre producto" 
                                                           +"\n2-Reclamo sobre pedido" 
                                                           +"\n3-Atras"));
        switch(Option) {
            case 1:
                Recl_Producto = JOptionPane.showInputDialog("Indique Reclamo de Preducto");
                JOptionPane.showMessageDialog(null, "Su reclamo sera tomado"
                                                  + "\n                     Gracias");
                break;
            case 2:
                Recl_Pedido = JOptionPane.showInputDialog("Indique Reclamo de Pedido");
                JOptionPane.showMessageDialog(null, "Su reclamo sera tomado"
                                                  + "\n                   Gracias");
                break;
            default:
                break;
        }
        } while(Option!=3);
    }
    
    /** 
    * Este es el metodo que permite al cliente realizar sugerencias a productos o bien
    * funciones de la App. Esta informacion se guardara en un variable tipo String.
    */
    
    public void realizarSugerencia() {
        String Sugerencia = "";
        
        Sugerencia = JOptionPane.showInputDialog("Indique cual es su sugerencia");
        JOptionPane.showMessageDialog(null, "Su sugerencia sera tomada en cuenta"
                                          + "\n                    Gracias");
    }
    

    public int getID_Cliente() 
    {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) 
    {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public String getUsuario() 
    {
        return Usuario;
    }

    public void setUsuario(String Usuario) 
    {
        this.Usuario = Usuario;
    }

    public String getPassword() 
    {
        return Password;
    }

    public void setPassword(String Password) 
    {
        this.Password = Password;
    }

    public String getUbicación() 
    {
        return Ubicación;
    }

    public void setUbicación(String Ubicación) 
    {
        this.Ubicación = Ubicación;
    }

    public String getCorreo() 
    {
        return Correo;
    }

    public void setCorreo(String Correo) 
    {
        this.Correo = Correo;
    }

    public String getTeléfono() 
    {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) 
    {
        this.Teléfono = Teléfono;
    }

  
}
