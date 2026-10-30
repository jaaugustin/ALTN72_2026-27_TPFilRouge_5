package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.UtilisateurDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute("utilisateurConnecte")
    public UtilisateurDetails getUtilisateurConnecte(@AuthenticationPrincipal UtilisateurDetails userDetails) {
        return userDetails;
    }
}