package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.Rectangle;

public class TriviaVentana {

	private JFrame frmTriviafut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriviaVentana window = new TriviaVentana();
					window.frmTriviafut.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TriviaVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Nos conectamos con la base de datos
		//Connection con = BD.initBD("trivia.db");
		//Creamos las tablas
		//BD.crearTablas(con);
		
		
		//private JTable tablaJugadores; //Aspecto gráfico
		//private DefaultTableModel modeloJugadores; //La estructura de datos que contiene la información de la tabla
		//private JScrollPane scrollTabla; //Scroll para la tabla
				
				
		frmTriviafut = new JFrame();
		frmTriviafut.setTitle("TriviaFut");
		frmTriviafut.setBounds(100, 100, 400, 600);
		frmTriviafut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTriviafut.getContentPane().setLayout(null);
		frmTriviafut.setResizable(false);
		
		JPanel panelGeneral = new JPanel();
		panelGeneral.setBounds(0, 21, 384, 491);
		frmTriviafut.getContentPane().add(panelGeneral);
		panelGeneral.setLayout(new CardLayout(0, 0));
		
		JPanel panelTrivia = new JPanel();
		panelTrivia.setBackground(UIManager.getColor("Button.darkShadow"));
		panelGeneral.add(panelTrivia);
		
		JLabel labelTrivia = new JLabel("Trivia");
		panelTrivia.add(labelTrivia);
		
		JScrollPane panelCartasScroll = new JScrollPane();
		panelGeneral.add(panelCartasScroll);
		
		JScrollPane panelTiendaScroll = new JScrollPane();
		panelGeneral.add(panelTiendaScroll);
		
		JPanel panelAjustes = new JPanel();
		panelAjustes.setBackground(UIManager.getColor("Button.darkShadow"));
		panelGeneral.add(panelAjustes);
		
		JLabel lblNewLabel = new JLabel("Equipo");
		panelAjustes.add(lblNewLabel);
		
		JPanel panelTop = new JPanel();
		panelTop.setBounds(2, 0, 382, 21);
		frmTriviafut.getContentPane().add(panelTop);
		panelTop.setLayout(new BorderLayout(0, 0));
		
		JLabel labelDinero = new JLabel("520💰");
		labelDinero.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		labelDinero.setPreferredSize(new Dimension(150, 14));
		panelTop.add(labelDinero, BorderLayout.EAST);
		
		JLabel labelNombre = new JLabel("javisito15");
		labelNombre.setPreferredSize(new Dimension(150, 14));
		panelTop.add(labelNombre, BorderLayout.WEST);
		
		JPanel panelBot = new JPanel();
		panelBot.setBounds(0, 512, 384, 50);
		frmTriviafut.getContentPane().add(panelBot);
		panelBot.setLayout(null);
		
		JPanel panelBotTrivia = new JPanel();
		panelBotTrivia.setBounds(0, 0, 96, 50);
		panelBot.add(panelBotTrivia);
		panelBotTrivia.setLayout(new CardLayout(0, 0));
		
		JButton btnTrivia = new JButton("Trivia");
		panelBotTrivia.add(btnTrivia);
		
		JPanel panelBotCartas = new JPanel();
		panelBotCartas.setBounds(96, 0, 96, 50);
		panelBot.add(panelBotCartas);
		panelBotCartas.setLayout(new CardLayout(0, 0));
		
		JButton btnCartas = new JButton("Cartas");
		panelBotCartas.add(btnCartas);
		
		JPanel panelBotTienda = new JPanel();
		panelBotTienda.setBounds(192, 0, 96, 50);
		panelBot.add(panelBotTienda);
		panelBotTienda.setLayout(new CardLayout(0, 0));
		
		JButton btnTienda = new JButton("Tienda");
		panelBotTienda.add(btnTienda);
		
		JPanel panelBotEquipo = new JPanel();
		panelBotEquipo.setBounds(288, 0, 96, 50);
		panelBot.add(panelBotEquipo);
		panelBotEquipo.setLayout(new CardLayout(0, 0));
		
		JButton btnAjustes = new JButton("Equipo");
		panelBotEquipo.add(btnAjustes);
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//borra el antiguo panel
				panelGeneral.removeAll();
				panelGeneral.repaint();
				panelGeneral.revalidate();
				//pone el nuevo panel
				panelGeneral.add(panelAjustes);
				panelGeneral.repaint();
				panelGeneral.revalidate();
				
			}
		});
		btnTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//borra el antiguo panel
				panelGeneral.removeAll();
				panelGeneral.repaint();
				panelGeneral.revalidate();
				//pone el nuevo panel
				panelGeneral.add(panelTiendaScroll);
				panelGeneral.repaint();
				panelGeneral.revalidate();
				
			}
		});
		btnCartas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//borra el antiguo panel
				panelGeneral.removeAll();
				panelGeneral.repaint();
				panelGeneral.revalidate();
				//pone el nuevo panel
				panelGeneral.add(panelCartasScroll);
				panelGeneral.repaint();
				panelGeneral.revalidate();
				
			}
		});
		btnTrivia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//borra el antiguo panel
				panelGeneral.removeAll();
				panelGeneral.repaint();
				panelGeneral.revalidate();
				//pone el nuevo panel
				panelGeneral.add(panelTrivia);
				panelGeneral.repaint();
				panelGeneral.revalidate();
				
			}
		});
		
		
		////IMPORTANTE LO DE ABAJO ES PARA LEER LOS DATOS DE LOS FUTBOLISTAS DEL BASE DE DATOS
		//
		//
		////NO FUNCIONA PORQUE BASE DE DATOS, NO TENEMOS BASE DE DATOS, HAY QUE ACLARAR VARIAS COSAS DE COMO LO VAMOS
		////A HACER ETC. PERO ESTA SERÍA LA BASE, Y ALGO SIMILAR TENDRÍA QUE HACERSE PARA LA COLECCION
		//
		//
		////parte de la Tienda exclusivamente (tabla etc)
		//
		////1-Creo el modelo
		//modeloJugadores = new DefaultTableModel();
		//
		////2-Añadimos la fila de títulos al modelo
		//String [] columnas = {"FOTO","NOMBRE","PUNTOS", "ROL"};
		//modeloJugadores.setColumnIdentifiers(columnas);
		//
		////3-Cargo el modelo con los datos de los jugadores de la BD
		//ArrayList<Jugador> aJugadores = BDTrivia.obtenerListaPersonas(con); //Obtenemos la lista de Jugadores de la BBDD
		//for(Jugador j: aJugadores) { //Recorro cada Jugador
		//	String [] datos = {j.getFoto(),j.getNombre(),j.getPuntos(),j.getFoto()};
		//	modeloJugadores.addRow(datos); //Añadimos al modelo de la tabla la persona
		//}
		////Le asignamos el modelo a la JTable
		//tablaJugadores = new JTable(modeloJugadores);
		//scrollTabla  = new JScrollPane(tablaJugadores);
		////Añadir el scrollHorizontal
		////scrollTabla.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		////scrollTabla.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//scrollTabla.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//scrollTabla.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		////Añado al panel el scroll que contiene la tabla
		//contentPane.add(scrollTabla, BorderLayout.CENTER);
		
		
	}
		
		
	
}
