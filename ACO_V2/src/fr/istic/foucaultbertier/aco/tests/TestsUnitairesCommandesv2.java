package fr.istic.foucaultbertier.aco.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import fr.istic.foucaultbertier.aco.Enregistreur;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.CollerEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.CopierEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.CouperEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.InsTexteEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.SelectionnerEnregistrable;
import fr.istic.foucaultbertier.aco.commandes.enregistrables.SupTexteEnregistrable;
import fr.istic.foucaultbertier.aco.moteur.MoteurEdition;
import fr.istic.foucaultbertier.aco.moteur.MoteurImplementation;
import fr.istic.foucaultbertier.aco.moteur.Selection;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MoteurImplementation.class, Enregistreur.class})
public class TestsUnitairesCommandesv2 {

	private static MoteurEdition moteur;
	private static Enregistreur enregistreur;
	
	public TestsUnitairesCommandesv2() {
		
		moteur = PowerMockito.mock(MoteurImplementation.class);
		enregistreur = PowerMockito.mock(Enregistreur.class);
	}
	
	@Test
	public void testInsererTexteEnregistrable() {
		
		InsTexteEnregistrable cmd = new InsTexteEnregistrable(moteur, enregistreur, "Test");
		cmd.executer();
		Mockito.verify(moteur).insererTexte(Mockito.eq("Test"));
		Mockito.verify(enregistreur).enregistrer(Mockito.eq(cmd));
	}

	@Test
	public void testSelectionnerEnregistrable() {
		
		SelectionnerEnregistrable cmd = new SelectionnerEnregistrable(moteur, enregistreur, new Selection(0, 4));
		cmd.executer();
		Mockito.verify(enregistreur).enregistrer(Mockito.eq(cmd));
	}
	
	@Test
	public void testSupprimerTexteEnregistrable() {
		
		SupTexteEnregistrable cmd = new SupTexteEnregistrable(moteur, enregistreur);
		cmd.executer();
		Mockito.verify(enregistreur).enregistrer(Mockito.eq(cmd));
	}
	
	@Test
	public void testCopierEnregistrable() {
		
		CopierEnregistrable cmd = new CopierEnregistrable(moteur, enregistreur);
		cmd.executer();
		Mockito.verify(enregistreur).enregistrer(Mockito.eq(cmd));
	}
	
	@Test
	public void testCouperEnregistrable() {

		CouperEnregistrable cmd = new CouperEnregistrable(moteur, enregistreur);
		cmd.executer();
		Mockito.verify(enregistreur).enregistrer(Mockito.eq(cmd));
	}
	
	@Test
	public void testCollerEnregistrable() {
		
		CollerEnregistrable cmd = new CollerEnregistrable(moteur, enregistreur);
		cmd.executer();
		Mockito.verify(enregistreur).enregistrer(Mockito.eq(cmd));
	}

}
