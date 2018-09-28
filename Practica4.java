package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Coronado
 */
@WebServlet(name = "ServletPractica4", urlPatterns = {"/ServletPractica4"})
public class ServletPractica4 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
    String nombre=request.getParameter("nombre");
    String apellidos=request.getParameter("apellidos");
    String fecha=request.getParameter("fecha");
    String usuario=request.getParameter("usuario");
    String clave=request.getParameter("clave");
   
    response.setContentType("text/html;charset=UTP-8");
    try(PrintWriter out = response.getWriter())
    {   
        out.println("nombre"+ nombre);
        out.println("apellidos"+ apellidos);
        out.println("fecha"+ fecha);
        out.println("usuario"+ usuario);
        out.println("clave"+ clave);
        
            
        }
    }
    
    
}
