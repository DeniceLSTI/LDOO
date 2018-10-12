
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Coronado
 */
@ManagedBean
@RequestScoped
public class NewJSFManagedBean {

 private final String code;
 private String nombre;
private String email;
private String validationCode;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String user) {
        this.nombre = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValidationCode() {
    if ((validationCode != null) && (validationCode.compareTo(code) == 0)) {
        // The validationCode is OK then we show the user data in validation.xhtml
        // El código validationCode es correcto entonces mostramos los datos en validation.xhtm
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
        return "<p>User accepted:</p>"
                + "<ul>"
                + " <li>Nombre: " + getNombre() + " </li>"
                + " <li>Email: " + getEmail() + " </li>"
                + "</ul>";
    } else {
        return "<p>Sorry, " + validationCode + " isn't valid.</p>"
                + "<p>Try again...</p>";
    }
        
        
        
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    public NewJSFManagedBean() {
        code = "XULES-CODE";
    System.out.println("Validation code (Código de validación): " + code);
    }
    }
    

