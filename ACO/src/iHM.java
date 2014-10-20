import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentListener;

public class iHM extends JFrame {

	private static final long serialVersionUID = 1L;
	//zone de texte
    private JTextArea zoneTexte;
    
    public iHM(MoteurEdition m) {
    	
        //creation de la zone de texte et ajout du listener pour faire le lien avec nos classes
        zoneTexte = new JTextArea(15, 80);
        zoneTexte.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        zoneTexte.setFont(new Font("monospaced", Font.PLAIN, 14));
        zoneTexte.getDocument().addDocumentListener(new ListenerModifications());
        JScrollPane scrollingText = new JScrollPane(zoneTexte);
        
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        // ajout barre de defilement
        content.add(scrollingText, BorderLayout.CENTER);

        // barre des options
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        
        Icon icone = new ImageIcon("icones/coller.png");
        JMenuItem menu= new JMenu();
        menu.setIcon(icone);
        menuBar.add(menu);

        setContentPane(content);
        setJMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Editeur texte [BERTIER - FOUCAULT]");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public Selection getSelection(){
    	
    	return new Selection(new Position(zoneTexte.getSelectionStart()), zoneTexte.getSelectionEnd()-zoneTexte.getSelectionStart());
    }
    
    public String getText(){
    	
    	return zoneTexte.getText(zoneTexte.getSelectionStart());
    }
}