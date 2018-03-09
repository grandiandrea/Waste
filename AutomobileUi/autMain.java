import java.util.*;
import java.awt.*;
import javax.swing.*;
public class autMain{
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JLabel msglabel;
	public static void main(String[] args){
		Autosalone salone = new Autosalone();
		Scanner reader = new Scanner(System.in);
		autMain uiMaino = new autMain();
	  uiMaino.showFlowLayout();
		String menu = "1. Aggiungi nuova auto\n2. Rimuovi auto\n3. Cerca auto\n4. Elenca auto\n5. Vendi auto\n6. Elenca auto vendute\n7. Riordina per velocita`";
		boolean loop = true;
		while(loop){
			System.out.println("1. Aggiungi nuova auto\n2. Rimuovi auto\n3. Cerca auto\n4. Elenca auto\n5. Vendi auto\n6. Elenca auto vendute\n7. Riordina per velocita`");
			int inpt = reader.nextInt();
			switch(inpt){
				case 1:
					salone.aggiungi(inputAuto());
					break;
				case 2:
					System.out.println("Inserisci indice auto da rimuovere:");
					salone.rimuovi(inputAuto());
					break;
				case 3:
					System.out.println("Inserisci auto da cercare:");
					Automobile temp = salone.get(salone.cercaAuto(inputAuto()));
					System.out.println(temp.toString());
				case 4:
					salone.visualizza();
					break;
				case 5:
					salone.vendi(inputAuto());
					break;
				case 6:
					salone.visualizzaVendute();
					break;
				case 7:
					salone.sort();
					break;
				default:
					loop = false;
					break;
			}
		}

	}
	public static Automobile inputAuto(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci marca: ");
		String marca = sc.next();
		System.out.println("Inserisci modello: ");
		String modello = sc.next();
		System.out.println("Inserisci targa: ");
		String targa = sc.next();
		System.out.println("Inserisci numero posti: ");
		int nPosti = sc.nextInt();
		System.out.println("Inserisci velocita' massima: ");
		int velMax = sc.nextInt();
		return new Automobile(marca,modello,targa,nPosti,velMax);
	}
	public autMain(){
	  prepareGUI();
	}
	private void prepareGUI(){
	  mainFrame = new JFrame("Java SWING Examples");
	  mainFrame.setSize(400,400);
	  mainFrame.setLayout(new GridLayout(3, 1));

	  headerLabel = new JLabel("",JLabel.CENTER );
	  statusLabel = new JLabel("",JLabel.CENTER);
	  statusLabel.setSize(350,100);

	  mainFrame.addWindowListener(new WindowAdapter() {
	     public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
	     }
	  });
	  controlPanel = new JPanel();
	  controlPanel.setLayout(new FlowLayout());

	  mainFrame.add(headerLabel);
	  mainFrame.add(controlPanel);
	  mainFrame.add(statusLabel);
	  mainFrame.setVisible(true);
	}
	private void showFlowLayout(){
	  headerLabel.setText("Layout in action: FlowLayout");

	  JPanel panel = new JPanel();
	  panel.setBackground(Color.darkGray);
	  panel.setSize(200,200);
	  FlowLayout layout = new FlowLayout();
	  layout.setHgap(10);
	  layout.setVgap(10);

	  panel.setLayout(layout);
	  panel.add(new JButton("OK"));
	  panel.add(new JButton("Cancel"));
	  controlPanel.add(panel);
	  mainFrame.setVisible(true);
	}
}
