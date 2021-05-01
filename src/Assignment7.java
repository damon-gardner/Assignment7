import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Assignment7 extends JPanel {
    // Variables declaration
    private List<Book> books;
    MySQLAccess db = new MySQLAccess();
    //Swing components
    private static JFrame frame;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTF;
    private javax.swing.JLabel countLabel;
    private javax.swing.JButton displayButton;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JLabel headLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTextField isbnTF;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField countTF;
    private javax.swing.JTextField priceTF;
    private java.awt.Label label1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel textbookLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTF;
    // End of variables declaration

    public Assignment7(){
        initComponents();
    }

    private void initComponents() {
        //JLabels
        this.headLabel = new javax.swing.JLabel();
        this.isbnLabel = new javax.swing.JLabel();
        this.authorLabel = new javax.swing.JLabel();
        this.titleLabel = new javax.swing.JLabel();
        this.countLabel = new javax.swing.JLabel();
        this.priceLabel = new javax.swing.JLabel();
        this.textbookLabel = new javax.swing.JLabel();
        this.gradeLabel = new javax.swing.JLabel();
        //JTextFields
        this.isbnTF = new javax.swing.JTextField();
        this.authorTF = new javax.swing.JTextField();
        this.titleTF = new javax.swing.JTextField();
        this.priceTF = new javax.swing.JTextField();
        this.countTF = new javax.swing.JTextField();
        //Others
        this.jCheckBox1 = new javax.swing.JCheckBox();
        this.jSlider1 = new javax.swing.JSlider();
        this.addButton = new javax.swing.JButton();
        this.displayButton = new javax.swing.JButton();
        this.jScrollPane3 = new javax.swing.JScrollPane();
        this.jTable2 = new javax.swing.JTable();


        isbnLabel.setLabelFor(isbnTF);
        isbnTF.setColumns(10);
        isbnTF.setToolTipText("10 digit ISBN value");

        authorLabel.setLabelFor(authorTF);
        authorTF.setColumns(32);
        authorTF.setToolTipText("enter author name");

        titleLabel.setLabelFor(titleTF);
        titleTF.setColumns(32);
        titleTF.setToolTipText("title of the book");

        countLabel.setLabelFor(countTF);
        countTF.setColumns(5);
        countTF.setToolTipText("The count of pages in book");

        priceLabel.setLabelFor(priceTF);
        priceLabel.setText("Price");
        gradeLabel.setLabelFor(jSlider1);
        gradeLabel.setText("Grade Level");
        textbookLabel.setLabelFor(jCheckBox1);
        textbookLabel.setText("Textbook");
        jCheckBox1.setToolTipText("Check if book is a textbook");










        priceTF.setColumns(5);
        priceTF.setText("$");






        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(12);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setEnabled(false);

        headLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        headLabel.setText("Book.java");

        addButton.setText("Add Book");
        displayButton.setText("Display Catalog");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ISBN", "Author", "Title", "Price", "Page Count", "Grade Level"
                }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(authorLabel)
                                                        .addComponent(titleLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(authorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(countLabel)
                                                        .addComponent(priceLabel))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(countTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(textbookLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(addButton)
                                .addGap(105, 105, 105)
                                .addComponent(displayButton, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addGap(128, 128, 128))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(172, 172, 172)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(headLabel)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(isbnLabel)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(isbnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(219, 219, 219)
                                                        .addComponent(gradeLabel)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(headLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(isbnLabel)
                                        .addComponent(isbnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(authorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(authorLabel))
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(titleLabel)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(countLabel)
                                                        .addComponent(countTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(priceLabel)
                                                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jCheckBox1)
                                                        .addComponent(textbookLabel)
                                                        .addComponent(gradeLabel))))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addButton)
                                        .addComponent(displayButton))
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
        );

        isbnLabel.getAccessibleContext().setAccessibleName("isbnLabel");
        authorLabel.getAccessibleContext().setAccessibleName("titleLabel");
        titleTF.getAccessibleContext().setAccessibleName("Title");
    }// </editor-fold>

    protected static void initGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setPreferredSize(new Dimension(480, 360));
        JComponent contentPane = new Assignment7();
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        //db.readDataBase();
        SwingUtilities.invokeLater(Assignment7::initGUI);
    }
}
