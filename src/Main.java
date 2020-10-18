
import javax.swing.*;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
	
JPanel MasterPanel = new JPanel();
JPanel MenuPanel = new JPanel();
JPanel ClassOnePanel = new JPanel(new BorderLayout());
JPanel science1 = new JPanel(new BorderLayout());
JPanel art1Topic = new JPanel();
JPanel engish1TopicOnePanel = new JPanel();

JButton classOneButton = new JButton("Class One");
JButton classTwoButton = new JButton("Class Two");
JButton classThreeButton = new JButton("Class Three");
JButton back1 = new JButton("<<Back");
JButton back2 = new JButton("<<Back");
JButton back3 = new JButton("<<Back");
JButton eng11Button = new JButton("<<Back");
JButton E1Eback = new JButton("<<Back");
JButton E1Submit = new JButton("Submit");

JButton biology1 = new JButton("Biology");
JButton physics1 = new JButton("Physics");
JButton chemistry1 = new JButton("Chemistry");
JButton maths1 = new JButton("Mathematics");

JButton literature1 = new JButton("Literature");
JButton civic1 = new JButton("Civic Edu.");
JButton government1 = new JButton("Government");
JButton english1 = new JButton("English");

JButton accounting1 = new JButton("Accounting");
JButton marketing1 = new JButton("Marketing");
JButton economics1 = new JButton("Economics");
JButton commerce1 = new JButton("English");

JLabel eng1ETime1 = new JLabel("00");
JLabel eng1ETime2 = new JLabel("10");
JLabel eng1ETime3 = new JLabel("00");

JTabbedPane tabPaneClassOne = new JTabbedPane();
JTabbedPane tabPaneClassTwo = new JTabbedPane();
JTabbedPane tabPaneClassThree = new JTabbedPane();


JList biology1List = new JList(new Object[] {"Recognising Living Things","Living Things and Non-Living Things","Classification of Living Things","Organisation of Life","Plant nutrition","Nutrient Cycling in nature","Nutrition in Animals","Modes of nutrition","Basic Ecological concept","Growth","Examination"});
JList English1List = new JList(new Object[] {"English Alphabets","The consonant sounds: /j/ and /z/","Revision of common nouns","Uses of capital letter","Narrative composition/essay","Reading comprehension","Vocabulary development: words related to agriculture","Sentences","Expository essay","Reading comprehension","The consonant /w/","Noun Phrase","Reading comprehension","Summary writing","Countable/uncountable nouns","Writing: Popular articla for various reading audience","Syllabic consonants","Reading Comprehension","More on summary writing","Pronouns(Introduction)","Vocabulary development","Words associated with religion","Regular and irregular verbs","Reading comprehesion","Consonant clusters","Pronouns (other types)","Formal letter","Speech writing","Semi-formal letter","Differences between phrases and clauses","Examination"});
JList economics1List = new JList(new Object[] {"Division of Labour","Scale of Production (Small, Medium and Large","Firm and Industry","Business Organization","Joint stock companies","Public enterprises","Population","Theories of Population","Labour Market","Examination"});


CardLayout MasterCard = new CardLayout();
CardLayout science1Card = new CardLayout();
CardLayout art1Card = new CardLayout();
CardLayout commercial1Card = new CardLayout();

ButtonHandler buttonListener = new ButtonHandler();
MathematicsListener itemListener = new MathematicsListener();

	public void frame() {
//LISTENERS
		classOneButton.addActionListener(buttonListener);
		back1.addActionListener(buttonListener);
		back2.addActionListener(buttonListener);
		back3.addActionListener(buttonListener);
		english1.addActionListener(buttonListener);
		English1List.addListSelectionListener(itemListener);
		eng11Button.addActionListener(buttonListener);
		E1Eback.addActionListener(buttonListener);
		E1Submit.addActionListener(buttonListener);
		
		
		
		
//MAIN MENU	
		MenuPanel.setLayout(new BorderLayout());
		JPanel MenuTop = new JPanel();
		MenuTop.setLayout(new BorderLayout());
		JLabel ww = new JLabel("Welcome   to");
		ww.setFont(new Font("Calibril",Font.ITALIC,16));
		ww.setForeground(new Color(50,250,250));
		JLabel ww2 = new JLabel("STUDENT LIBRARY");
		ww2.setFont(new Font("Calibril",Font.BOLD,45));
		ww2.setForeground(new Color(220,50,250));
		JPanel ww_ = new JPanel();
		ww_.add(ww);
		JPanel ww2_ = new JPanel();
		ww2_.add(ww2);
		ww2_.setBackground(new Color(2,10,43));
		ww_.setBackground(new Color(2,10,43));
		MenuTop.add(ww_,BorderLayout.NORTH);
		MenuTop.add(ww2_, BorderLayout.CENTER);
		
		JPanel MenuCentre1 = new JPanel(new GridLayout(1,3,6,6));
		MenuCentre1.setBackground(new Color(2,10,30));
		MenuCentre1.add(classOneButton);
		MenuCentre1.add(classTwoButton);
		MenuCentre1.add(classThreeButton);
		
		classOneButton.setBackground(new Color(2,10,46));
		classTwoButton.setBackground(new Color(2,10,46));
		classThreeButton.setBackground(new Color(2,10,46));
		
		classOneButton.setForeground(Color.WHITE);
		classTwoButton.setForeground(Color.WHITE);
		classThreeButton.setForeground(Color.WHITE);
		
		classOneButton.setFont(new Font("Area Black",Font.BOLD,40));
		classTwoButton.setFont(new Font("Area Black",Font.BOLD,40));
		classThreeButton.setFont(new Font("Area Black",Font.BOLD,40));
		
		JButton new1 = new  JButton("");
		new1.setBackground(new Color(2,10,30));
		new1.setBorderPainted(false);
		JPanel new1_ = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		new1_.setBackground(new Color(2,10,30));
		new1_.add(new1);
		JPanel MenuCentre = new JPanel(new BorderLayout());
		MenuCentre.setBackground(new Color(2,10,30));
		MenuCentre.add(MenuCentre1,BorderLayout.CENTER);
		MenuCentre.add(new JLabel(" "),BorderLayout.SOUTH);
		MenuCentre.add(new JLabel("    "),BorderLayout.EAST);
		MenuCentre.add(new JLabel("    "),BorderLayout.WEST);
		MenuCentre.add(new1_,BorderLayout.NORTH);
		
		MenuPanel.add(MenuTop,BorderLayout.NORTH);
		MenuPanel.add(MenuCentre,BorderLayout.CENTER);
		
//CLASS ONE CATALOGUE
		JPanel classOnePanelTop = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel classOnePanelCenter = new JPanel(new GridLayout(1,1));
		classOnePanelCenter.setBackground(new Color(2,10,43));
		
		JLabel c1c = new JLabel("CLASS ONE CATALOGUE");
		classOnePanelTop.setBackground(new Color(2,10,43));
		c1c.setFont(new Font("Calibril",Font.BOLD,45));
		c1c.setForeground(new Color(220,50,250));
		classOnePanelTop.add(c1c);
		
		back1.setBackground(Color.red);
		back1.setFont(new Font("Calibril",Font.BOLD,16));
		back2.setBackground(Color.red);
		back2.setFont(new Font("Calibril",Font.BOLD,16));
		back3.setBackground(Color.red);
		back3.setFont(new Font("Calibril",Font.BOLD,16));
		
	//SCIENCE
		JPanel science1Subject = new JPanel(new GridLayout(5,1));
		science1Subject.add(biology1);
		science1Subject.add(maths1);
		science1Subject.add(chemistry1);
		science1Subject.add(physics1);
		science1Subject.add(back1);
		
		JPanel science1Topic = new JPanel();
		science1Topic.setLayout(science1Card);
		
		JScrollPane biology1Scroll = new JScrollPane(biology1List);
		
		
		JPanel biology1Panel = new JPanel();
		biology1Panel.add(biology1Scroll);
		JPanel s1wPanel = new JPanel();
		s1wPanel.add(new JLabel("Please select a Subject"));
		
		
		
		science1Topic.add(s1wPanel,"home");
		science1Topic.add(biology1Panel, "biology");
		
		
		
		science1.add(science1Subject, BorderLayout.WEST);
		science1.add(science1Topic,BorderLayout.CENTER);
		
	//ART
		JPanel art1 = new JPanel(new BorderLayout());
		
		
		JPanel art1Subject = new JPanel(new GridLayout(5,1));
		art1Subject.add(english1);
		art1Subject.add(literature1);
		art1Subject.add(government1);
		art1Subject.add(civic1);
		art1Subject.add(back2);
		
		
		art1Topic.setLayout(art1Card);
		
		JScrollPane english1Scroll = new JScrollPane(English1List);
		
		
		JPanel english1Panel = new JPanel(new GridLayout(1,1));
		english1Panel.add(english1Scroll);
		English1List.setFont(new Font("Calibril",Font.PLAIN,14));
		JPanel a1wPanel = new JPanel();
		a1wPanel.add(new JLabel("Please select a Subject"));
		
		
		art1Topic.add(a1wPanel,"home");
		art1Topic.add(english1Panel, "english");
		
		
		art1.add(art1Subject, BorderLayout.WEST);
		art1.add(art1Topic,BorderLayout.CENTER);
		
		
		
	//ENGLISH TOPIC ONE ( ENGLISH ALPHABET )
		
		JTextArea EOTOT = new JTextArea("\t\t\tENGLISH ALPHABET\n   The modern English alphabet is a Latin alphabet consisting of 26 letters, each having an upper- and lower-case form. It originated around the 7th century from Latin script. Since then, letters have been added or removed to give the current Modern English alphabet of 26 letters (which eventually became the ISO basic Latin alphabet). The word alphabet is a compound of the first two letters of the Greek alphabet, alpha and beta.\n    Written English has a large number of digraphs. It stands out almost uniquely as a European language without diacritics in native words. A diaeresis may be used to distinguish two vowels with separate pronunciation, such as \"cooperation\", from a double vowel. Very occasionally, a grave may be used to indicate that a normally silent vowel is pronounced (as in learnÃ¨d, an adjective).\n\n\tTHE ALPHABETS (UPPER-CASE):\n\t\tA, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z.\n\n\tTHE ALPHABETS (LOWER-CASE):\n\t\ta, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z.\n\n     MODERN LETTERS:\n    The names of the letters are sometimes spelled out. Some compound words (e.g., teeshirt, deejay, emcee, okay, etc.), derived forms (e.g., exed out, effing, to eff and blind, aitchless, etc.) and objects named after letters (e.g., em in printing and wye in railroading) may be written with the letter names. The spellings listed below are from the Oxford English Dictionary. Plurals of consonant names are formed by adding -s (e.g., bees, efs, ems) or -es in the cases of aitch, ess, and ex (i.e., aitches, esses, exes). Plurals of vowel names add -es (i.e., aes, ees, ies, oes, ues), but these are rare. Most commonly, the letter (generally in capitalized form) and not its name is used, in which case plural just adds -s.\n\n    OLD ENGLISH\n     The English language itself was first written in the Anglo-Saxon futhorc runic alphabet, in use from the 5th century. This alphabet was brought to what is now England, along with the proto-form of the language itself, by Anglo-Saxon settlers. Very few examples of this form of written Old English have survived, mostly as short inscriptions or fragments.\n    The Latin script, introduced by Christian missionaries, began to replace the Anglo-Saxon futhorc from about the 7th century, although the two continued in parallel for some time. As such, the Old English alphabet began to employ parts of the Roman alphabet in its construction. Futhorc influenced the emerging English alphabet by providing it with the letters thorn (Ãž Ã¾) and wynn (Ç· Æ¿). The letter eth (Ã� Ã°) was later devised as a modification of dee (D d), and finally yogh (Èœ È�) was created by Norman scribes from the insular g in Old English and Irish, and used alongside their Carolingian g.\n    The a-e ligature ash (Ã† Ã¦) was adopted as a letter in its own right, named after a futhorc rune Ã¦sc. In very early Old English the o-e ligature ethel (OE oe) also appeared as a distinct letter, likewise named after a rune, oeÃ°el. Additionally, the v-v or u-u ligature double-u (W w) was in use.\n    In the year 1011, a monk named ByrhtferÃ° recorded the traditional order of the Old English alphabet. He listed the 24 letters of the Latin alphabet first (including ampersand), then 5 additional English letters, starting with the Tironian note ond (â�Š), an insular symbol for and:\n\tA B C D E F G H I K L M N O P Q R S T V X Y Z & â�Š Ç· Ãž Ã� Ã†\n\n    MODERN ENGLISH\n    In the orthography of Modern English, thorn (Ã¾), eth (Ã°), wynn (Æ¿), yogh (È�), ash (Ã¦), and oe are obsolete. Latin borrowings reintroduced homographs of Ã¦ and oe into Middle English and Early Modern English, though they are largely obsolete (see\"Ligatures in recent usage\" below), and where they are used they are not considered to be separate letters (e.g. for collation purposes), but rather ligatures. Thorn and eth were both replaced by th, though thorn continued in existence for some time, its lowercase form gradually becoming graphically indistinguishable from the minuscule y in most handwriting. Y for th can still be seen in pseudo-archaisms such as \"Ye Olde Booke Shoppe\". The letters Ã¾ and Ã° are still used in present-day Icelandic, while Ã° is still used in present-day Faroese. Wynn disappeared from English around the 14th century when it was supplanted by uu, which ultimately developed into the modern w. Yogh disappeared around the 15th century and was typically replaced by gh.\n    The letters u and j, as distinct from v and i, were introduced in the 16th century, and w assumed the status of an independent letter. The variant lowercase form long s (Å¿) lasted into early modern English, and was used in non-final position up to the early 19th century. Today, the English alphabet is considered to consist of the following 26 letters:\nA a, B b, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n, O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y, Z z\n\n    LIGATURES IN RECENT USAGE\n    Outside of professional papers on specific subjects that traditionally use ligatures in loanwords, ligatures are seldom used in modern English. The ligatures Ã¦ and oe were until the 19th century (slightly later in American English) used in formal writing for certain words of Greek or Latin origin, such as encyclopÃ¦dia and coelom, although such ligatures were not used in either classical Latin or ancient Greek. These are now usually rendered as \"ae\" and \"oe\" in all types of writing, although in American English, a lone e has mostly supplanted both (for example, encyclopedia for encyclopaedia, and maneuver for manoeuvre).\n    Some fonts for typesetting English contain commonly used ligatures, such as for âŸ¨ttâŸ©, âŸ¨fiâŸ©, âŸ¨flâŸ©, âŸ¨ffiâŸ©, and âŸ¨fflâŸ©. These are not independent letters, but rather allographs.\n\n\n");
		
		EOTOT.setFont(new Font("Calibril",Font.PLAIN,15));
		EOTOT.setWrapStyleWord(true);
		EOTOT.setLineWrap(true);
		EOTOT.setEditable(false);
		
		JScrollPane EOTOTScroll = new JScrollPane(EOTOT);
		JPanel EOTopPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel eng1T1 = new JLabel("ENGLISH - Alphabets");
		eng1T1.setFont(new Font("Calibril",Font.BOLD,17));
		eng1T1.setForeground(Color.green);
		EOTopPanel.add(eng1T1);
		EOTopPanel.setBackground(new Color(2,10,43));
		eng11Button.setBackground(Color.red);
		JPanel eng11backPanel = new JPanel(new BorderLayout());
		eng11backPanel.add(eng11Button,BorderLayout.WEST);
		JPanel EOTOTCenter = new JPanel(new GridLayout(1,1));
		EOTOTCenter.add(EOTOTScroll);
		eng11backPanel.setBackground(new Color(2,10,43));
		engish1TopicOnePanel.setLayout(new BorderLayout());
		engish1TopicOnePanel.add(EOTopPanel,BorderLayout.NORTH);
		engish1TopicOnePanel.add(EOTOTCenter, BorderLayout.CENTER);
		engish1TopicOnePanel.add(eng11backPanel, BorderLayout.SOUTH);
		
	//ENGLISH ONE EXAMINATION
		JPanel engish1ExamPanel = new JPanel(new BorderLayout());
		
		
		JPanel EOETopPanel = new JPanel(new BorderLayout());
		JLabel eng1E = new JLabel("ENGLISH - CLASS ONE EXAMINATION");
		eng1E.setFont(new Font("Calibril",Font.BOLD,17));
		eng1E.setForeground(Color.green);
		JPanel eng1ER = new JPanel(new FlowLayout(FlowLayout.CENTER));
		eng1ER.add(eng1E);
		eng1ER.setBackground(new Color(2,10,43));
		EOETopPanel.add(eng1ER,BorderLayout.CENTER);
		JPanel eng1ETimePanel = new JPanel(new BorderLayout());
		
		eng1ETimePanel.setBackground(new Color(2,10,43));
		eng1ETime1.setFont(new Font("Calibril",Font.BOLD,14));
		eng1ETime1.setForeground(Color.green);
		eng1ETime2.setFont(new Font("Calibril",Font.BOLD,14));
		eng1ETime2.setForeground(Color.green);
		eng1ETime3.setFont(new Font("Calibril",Font.BOLD,14));
		eng1ETime3.setForeground(Color.green);
		JPanel eng1ETimeS = new JPanel(new GridLayout(1,6,0,0));
		eng1ETimeS.setBackground(new Color(2,10,43));
		eng1ETimeS.add(eng1ETime1);
		eng1ETimeS.add(new JLabel(":"));
		eng1ETimeS.add(eng1ETime2);
		eng1ETimeS.add(new JLabel(":"));
		eng1ETimeS.add(eng1ETime3);		
		eng1ETimePanel.add(eng1ETimeS,BorderLayout.WEST);
		eng1ETimePanel.add(new JLabel("             "));
		EOETopPanel.add(eng1ETimePanel,BorderLayout.EAST);
		EOETopPanel.setBackground(new Color(2,10,43));
		
		JPanel EOEOTCenter = new JPanel(new GridLayout(1,1));
		JPanel eng1QuestionPanel = new JPanel(new GridLayout(7,1));
		JPanel e1q1 = new JPanel(new GridLayout(5,1));
		e1q1.add(new JLabel("1.     Suite"));
		e1q1.add(new JRadioButton("thrice"));
		e1q1.add(new JRadioButton("suit"));
		e1q1.add(new JRadioButton("sweet"));
		e1q1.add(new JRadioButton("sweat"));
		
		
		JPanel e1q2 = new JPanel(new GridLayout(5,1));
		e1q2.add(new JLabel("2.     incite"));
		e1q2.add(new JRadioButton("inside"));
		e1q2.add(new JRadioButton("disquiet"));
		e1q2.add(new JRadioButton("excite"));
		e1q2.add(new JRadioButton("surmise"));
		
		
		JPanel e1q3 = new JPanel(new GridLayout(5,1));
		e1q3.add(new JLabel("3.     obtain"));
		e1q3.add(new JRadioButton("datain"));
		e1q3.add(new JRadioButton("detail"));
		e1q3.add(new JRadioButton("claim"));
		e1q3.add(new JRadioButton("relay"));
		
		JPanel e1q4 = new JPanel(new GridLayout(5,1));
		e1q4.add(new JLabel("4.     flood"));
		e1q4.add(new JRadioButton("chord"));
		e1q4.add(new JRadioButton("cud"));
		e1q4.add(new JRadioButton("curd"));
		e1q4.add(new JRadioButton("call"));
		
		
		JPanel e1q5 = new JPanel(new GridLayout(5,1));
		e1q5.add(new JLabel("5.     receipt"));
		e1q5.add(new JRadioButton("unkempt"));
		e1q5.add(new JRadioButton("dealt"));
		e1q5.add(new JRadioButton("deceit"));
		e1q5.add(new JRadioButton("leapt"));
		
		
		JPanel e1q6 = new JPanel(new GridLayout(5,1));
		e1q6.add(new JLabel("6.     firm"));
		e1q6.add(new JRadioButton("born"));
		e1q6.add(new JRadioButton("worm"));
		e1q6.add(new JRadioButton("burn"));
		e1q6.add(new JRadioButton("girl"));

		
		
//ADD ALL		
		eng1QuestionPanel.add(new JLabel("\tInstruction\n     From the words lettered A to D, choose the word that rhymes with the given word."));
		eng1QuestionPanel.add(e1q1);
		eng1QuestionPanel.add(e1q2);
		eng1QuestionPanel.add(e1q3);
		eng1QuestionPanel.add(e1q4);
		eng1QuestionPanel.add(e1q5);
		eng1QuestionPanel.add(e1q6);
		
		
		JScrollPane eng1Scroll = new JScrollPane(eng1QuestionPanel);
		EOEOTCenter.add(eng1Scroll);
		
		E1Eback.setBackground(Color.red);
		JPanel eng1EbackPanel = new JPanel(new BorderLayout());
		eng1EbackPanel.setBackground(new Color(2,10,43));
		eng1EbackPanel.add(E1Eback, BorderLayout.WEST);
		eng1EbackPanel.add(E1Submit,BorderLayout.EAST);
		
		
		
		engish1ExamPanel.setLayout(new BorderLayout());
		engish1ExamPanel.add(EOETopPanel,BorderLayout.NORTH);
		engish1ExamPanel.add(EOEOTCenter, BorderLayout.CENTER);
		engish1ExamPanel.add(eng1EbackPanel, BorderLayout.SOUTH);
		
	//COMMERCIAL
		JPanel commercial1 = new JPanel(new BorderLayout());
		
		JPanel commercial1Subject = new JPanel(new GridLayout(5,1));
		commercial1Subject.add(economics1);
		commercial1Subject.add(accounting1);
		commercial1Subject.add(commerce1);
		commercial1Subject.add(marketing1);
		commercial1Subject.add(back3);
		
		JPanel commercial1Topic = new JPanel();
		commercial1Topic.setLayout(commercial1Card);
		
		JScrollPane economics1Scroll = new JScrollPane(economics1List);
		economics1List.setFont(new Font("Calibril",Font.PLAIN,14));
		
		
		JPanel economics1Panel = new JPanel();		
		economics1Panel.add(economics1Scroll);
		JPanel c1wPanel = new JPanel();
		c1wPanel.add(new JLabel("Please select a Subject"));
		
		
		
		commercial1Topic.add(c1wPanel,"home");
		commercial1Topic.add(economics1Panel, "economics");
		
		
		
		commercial1.add(commercial1Subject, BorderLayout.WEST);
		commercial1.add(commercial1Topic,BorderLayout.CENTER);
		
		
		
		
		
		tabPaneClassOne.add(science1, "Science");
		tabPaneClassOne.add(art1, "Art");
		tabPaneClassOne.add(commercial1, "Commercial");
		
		
		
		classOnePanelCenter.add(tabPaneClassOne);
		
		ClassOnePanel.add(classOnePanelTop,BorderLayout.NORTH);
		ClassOnePanel.add(classOnePanelCenter,BorderLayout.CENTER);
		
//CLASS TWO CATALOGUE
		
		
		
		
//CLASS THREE CATALOGUE
		
		
		
		
//MASTER PANEL
		MasterPanel.setLayout(MasterCard);
		MasterPanel.add(MenuPanel, "home");
		MasterPanel.add(ClassOnePanel, "class1");
		MasterPanel.add(engish1TopicOnePanel,"eng1_1");
		MasterPanel.add(engish1ExamPanel,"eng1E");
		
		MasterCard.show(MasterPanel, "home");
		add(MasterPanel);
		
	}
	public void TestResult() {
		JPanel ResultPanel = new JPanel(new BorderLayout());
		JLabel Top = new JLabel("TEST RESULT");
		Top.setFont(new Font("Calibril",Font.BOLD,16));
		Top.setForeground(Color.green);
		
		JLabel center = new JLabel("0/7");
		center.setFont(new Font("Calibril",Font.BOLD,40));
		
		ResultPanel.add(Top,BorderLayout.NORTH);
		ResultPanel.add(center,BorderLayout.CENTER);
		
		add(ResultPanel);
		
	}
	
	public static void main(String [] args) {
		Main call = new Main();
		call.frame();
		call.setTitle("Student Library");
		call.setSize(1000,700);
		call.setLocationRelativeTo(null);
		call.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		call.setVisible(true);
		
	}
	
//EVENT HANDLINGS
	class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if (event.getSource()==classOneButton) {
				MasterCard.show(MasterPanel, "class1");
				
			}
			else if (event.getSource()==back1) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==back2) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==back3) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==english1) {
				art1Card.show(art1Topic, "english");
			}
			else if (event.getSource()==eng11Button) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==E1Eback) {
				MasterCard.show(MasterPanel, "home");
			}
			else if (event.getSource()==E1Submit) {
				Main cal = new Main();
				cal.TestResult();
				cal.setTitle("Student Library");
				cal.setSize(200,150);
				cal.setLocationRelativeTo(null);
				cal.setVisible(true);
				
			}
			
		}
	}
	class MathematicsListener implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e){
			int item = English1List.getSelectedIndex();
			if (item==0) {
				MasterCard.show(MasterPanel, "eng1_1");
				JOptionPane.showMessageDialog(null, "English Aphabet");
			}
			else if (item==30) {
				MasterCard.show(MasterPanel, "eng1E");
				JOptionPane.showMessageDialog(null, "English Examination");
			}
		}
	}
	
}
