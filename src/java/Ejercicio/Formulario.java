/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Ejercicio;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ALICIA PETRO
 */
@WebServlet(name = "Formulario", urlPatterns = {"/Formulario"})
public class Formulario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("username");
        String contraseña = request.getParameter("password");
        String mensaje;

        // Validar credenciales
        if ("Alicia".equals(usuario)) {
            if ("123".equals(contraseña)) {
                // Establecer el nombre de usuario como atributo para la página de bienvenida
                request.setAttribute("usuario", usuario);
                // Redirigir a la página de bienvenida
                request.getRequestDispatcher("Bienvenida.jsp").forward(request, response);
                return;  // Salir del método después de redirigir
            } else {
                mensaje = "Contraseña incorrecta.";
            }
        } else {
            mensaje = "Nombre de usuario incorrecto.";
        }

        // Establecer el mensaje como atributo de la solicitud para la página de error
        request.setAttribute("mensaje", mensaje);
        // Redirigir la solicitud a la página de error
        request.getRequestDispatcher("Error.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        procesarSolicitud(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        procesarSolicitud(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Descripción corta";
    }
}
