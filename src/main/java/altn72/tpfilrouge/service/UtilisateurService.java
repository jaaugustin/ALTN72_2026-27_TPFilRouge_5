package altn72.tpfilrouge.service;

import altn72.tpfilrouge.modele.Utilisateur;
import altn72.tpfilrouge.modele.UtilisateurRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UtilisateurService implements UserDetailsService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nomUtilisateur) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findByIdConnexion(nomUtilisateur)
                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé : " + nomUtilisateur));

        return new User(
                utilisateur.getIdConnexion(),
                utilisateur.getMotDePasseHache(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + utilisateur.getProfil()))
        );
    }
}