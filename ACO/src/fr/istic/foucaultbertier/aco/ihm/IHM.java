package fr.istic.foucaultbertier.aco.ihm;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;

import fr.istic.foucaultbertier.aco.Observable;
import fr.istic.foucaultbertier.aco.Observateur;
import fr.istic.foucaultbertier.aco.commandes.Coller;
import fr.istic.foucaultbertier.aco.commandes.Copier;
import fr.istic.foucaultbertier.aco.commandes.Couper;
import fr.istic.foucaultbertier.aco.commandes.SupprimerTexte;
import fr.istic.foucaultbertier.aco.moteur.Buffer;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;

/**
 * Interface graphique de notre éditeur
 * Utilise une JTextArea pour l'affichage du buffer
 */
public final class IHM extends JFrame implements Observateur, ActionListener
{

	private static final long serialVersionUID = 1L;
	
	//Boutons
	private final JButton coller;
	private final JButton copier;
	private final JButton couper;
	private final JButton supprimer;

	//Zone de texte
	private final JTextArea zoneTexte;

	//Moteur d'�dition
	private final MoteurEdition moteur;
	
	//Listener d'insertions
	private final FiltreModifications filtreModifs;
	
    public IHM(final MoteurEdition moteur){

    	this.moteur = moteur;
    	filtreModifs = new FiltreModifications(moteur);
    	
        zoneTexte = new JTextArea(15, 80);
        zoneTexte.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        zoneTexte.setFont(new Font("monospaced", Font.PLAIN, 14));
        zoneTexte.addCaretListener(new ListenerSelection(moteur));
        ((AbstractDocument)zoneTexte.getDocument()).setDocumentFilter(filtreModifs);
        JScrollPane scrollingText = new JScrollPane(zoneTexte);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        
        //Ajout de la barre de défilement
        content.add(scrollingText, BorderLayout.CENTER);

        //Création de la barre d'outils
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));

        //Instanciation des boutons
        coller = new JButton();
        copier = new JButton();
        couper = new JButton();
        supprimer = new JButton();

        //Association des icones aux boutons
        coller.setIcon(new ImageIcon(getClass().getResource("/icones/coller.png")));
        copier.setIcon(new ImageIcon(getClass().getResource("/icones/copier.png")));
        couper.setIcon(new ImageIcon(getClass().getResource("/icones/couper.png")));
        supprimer.setIcon(new ImageIcon(getClass().getResource("/icones/supprimer.png")));

        //Association des bulles d'aide
        coller.setToolTipText("Coller");
        copier.setToolTipText("Copier");
        couper.setToolTipText("Couper");
        supprimer.setToolTipText("Supprimer");

        //Spécification des listeners
        coller.addActionListener(this);
        copier.addActionListener(this);
        couper.addActionListener(this);
        supprimer.addActionListener(this);

        //Ajout des boutons à la barre d'outils
        menuBar.add(copier);
        menuBar.add(couper);
        menuBar.add(coller);
        menuBar.add(supprimer);

        //Mise en place des éléments dans la fenêtre
        setContentPane(content);
        setJMenuBar(menuBar);

        //Ajout des comportements par d�faut et des propriété propres à notre éditeur + Affichage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Editeur de texte v1 [BERTIER - FOUCAULT]");
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

	@Override
	public final void miseAJour(Observable o) {
		
		/* Pr�conditions */
		if(o == null){
			
			throw new IllegalArgumentException("o est � null");
		}
		
		/* Traitement */
		if(o instanceof Buffer){
			
			Buffer buffer = (Buffer) o;
			
			//On désactive le filtre pour éviter de renvoyer une commande
			filtreModifs.desactiver();
			
			zoneTexte.setText(buffer.getContenu());
			zoneTexte.setCaretPosition(buffer.getOffsetModif());
			
			filtreModifs.activer();
		}
	}

	@Override
	public final void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==coller){
		
			new Coller(moteur).executer();
		}
		else if (e.getSource()==copier){
		
			new Copier(moteur).executer();
		}
		else if (e.getSource()==couper){
		
			new Couper(moteur).executer();
		}
		else if (e.getSource()==supprimer){
		
			new SupprimerTexte(moteur).executer();
		}
	}
}