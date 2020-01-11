package com.accommodation.frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ManagementWindow {

    private JFrame frame;
    private JTable table;
    private JTextField studentFirstNameField;
    private JTextField studentLastNameField;
    private JTextField roomNumberField;
    public String year="I";
    public String faculty="Arh";
    public String sex = "M";
    public String search;

 
    public static void launch() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	ManagementWindow window = new ManagementWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public ManagementWindow() {
        initialize();
    }
    
    
    
    
    void refreshTable() {
       
    }
    
//	void refreshTableHb() {
//		 StudentRepository stdRepo= new StudentRepository();
//		 table.setModel(stdRepo.studentToTableModel(stdRepo.findAll()));
//	}

    

//    public static void generateEmptyRooms() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/scheduler", "root", "test");
//            Statement stmt = con.createStatement();
//
//            String orientare;
//
//            for (int i = 1; i < 1000; i++) {
//                if (i % 100 >= 5 && i % 100 <= 23)
//                    orientare = "Strada";
//                else orientare = "Campus";
//                String insert = "insert into rooms (nr_camera, nr_studenti, orientare) values (" + i + ",0,'" + orientare + "') ;";
//                PreparedStatement pstmt = con.prepareStatement(insert);
//                if (isValidRoom(i)) {
//                    pstmt.execute(insert);
//                }
//            }
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    Connection connection = null;
    


   

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
     
        frame = new JFrame("Gestiune Camine");
        frame.setBounds(100, 100, 776, 503);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        

        JButton addStudentButton = new JButton("Add Student");
        addStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               
            }
        });
        addStudentButton.setBounds(27, 32, 174, 23);
        frame.getContentPane().add(addStudentButton);

        JButton showEmptyRoomsButton = new JButton("Show Empty Rooms");
        showEmptyRoomsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
            }
        });
        showEmptyRoomsButton.setBounds(223, 32, 146, 23);
        frame.getContentPane().add(showEmptyRoomsButton);

        JButton showNotFullRoomsButton = new JButton("Show Not Full Rooms");
        showNotFullRoomsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
            }
        });
        showNotFullRoomsButton.setBounds(379, 32, 157, 23);
        frame.getContentPane().add(showNotFullRoomsButton);
        
        
        
        JButton deleteButton = new JButton("Delete Student");
        deleteButton.setBounds(27, 66, 174, 23);
        frame.getContentPane().add(deleteButton);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            }
        });

        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(223, 66, 527, 387);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        JButton refreshButton = new JButton("Refresh");
        refreshButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        refreshButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
            }
        });
        refreshButton.setBounds(56, 419, 108, 23);
        frame.getContentPane().add(refreshButton);

        JLabel studentFirstNameLabel = new JLabel("First Name");
        studentFirstNameLabel.setBounds(27, 100, 131, 23);
        frame.getContentPane().add(studentFirstNameLabel);

        studentFirstNameField = new JTextField();
        studentFirstNameField.setBounds(27, 124, 174, 23);
        frame.getContentPane().add(studentFirstNameField);
        studentFirstNameField.setColumns(10);

        JLabel studentLastNameLabel = new JLabel("Last Name");
        studentLastNameLabel.setBounds(27, 147, 89, 23);
        frame.getContentPane().add(studentLastNameLabel);

        studentLastNameField = new JTextField();
        studentLastNameField.setBounds(27, 170, 174, 23);
        frame.getContentPane().add(studentLastNameField);
        studentLastNameField.setColumns(10);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(27, 207, 46, 14);
        frame.getContentPane().add(lblGender);

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"M", "F"}));
        comboBox.setMaximumRowCount(2);
        comboBox.setBounds(70, 204, 38, 20);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                sex = comboBox.getSelectedItem().toString();
            }
        });
        frame.getContentPane().add(comboBox);

        JLabel lblRoom = new JLabel("Room");
        lblRoom.setBounds(118, 207, 46, 14);
        frame.getContentPane().add(lblRoom);

        roomNumberField = new JTextField();
        roomNumberField.setBounds(149, 204, 52, 20);
        frame.getContentPane().add(roomNumberField);
        roomNumberField.setColumns(10);

        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(0, 255, 153));
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(209, 23, 5, 430);
        frame.getContentPane().add(separator);

        JLabel lblFaculty = new JLabel("Faculty");
        lblFaculty.setBounds(27, 232, 46, 14);
        frame.getContentPane().add(lblFaculty);

        JComboBox FacultyComboBox = new JComboBox();
        FacultyComboBox.setMaximumRowCount(5);
        FacultyComboBox.setModel(new DefaultComboBoxModel(new String[]{"Arh", "AC", "ETTI", "IE", "Constr"}));
        FacultyComboBox.setBounds(27, 249, 57, 20);
        FacultyComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                faculty = FacultyComboBox.getSelectedItem().toString();
            }
        });
        frame.getContentPane().add(FacultyComboBox);

        JLabel lblYear = new JLabel("Year");
        lblYear.setBounds(118, 232, 46, 14);
        frame.getContentPane().add(lblYear);

        JComboBox YearComboBox = new JComboBox();
        YearComboBox.setModel(new DefaultComboBoxModel(new String[]{"I", "II", "III", "IV", "V", "VI"}));
        YearComboBox.setMaximumRowCount(6);
        YearComboBox.setBounds(118, 249, 57, 20);
        YearComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                year = YearComboBox.getSelectedItem().toString();
            }
        });
        frame.getContentPane().add(YearComboBox);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"SearchWhat?", "firstName", "lastName", "sex", "roomNr", "faculty", "yearStudy"}));
        comboBox_1.setBounds(223, 7, 123, 20);
        comboBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search = comboBox_1.getSelectedItem().toString();
            }
        });
        frame.getContentPane().add(comboBox_1);

        JTextField searchField = new JTextField();
        searchField.setBounds(437, 7, 313, 21);
        frame.getContentPane().add(searchField);
        searchField.setColumns(10);

        JButton SearchButton = new JButton("Search");
        SearchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
            }
        });
        SearchButton.setBounds(358, 7, 79, 20);
        frame.getContentPane().add(SearchButton);

//        JButton showSelectedRoomBtn = new JButton("Show Selected Room\r\n");
//        showSelectedRoomBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent arg0) {
//                try {
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/scheduler", "root", "test");
//                    Statement stmt = con.createStatement();
//
//                    String selectRoom = "SELECT * FROM students WHERE roomNr = " + table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
//                    PreparedStatement selectRoomPS = connection.prepareStatement(selectRoom);
//
//                    System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
//
//                    ResultSet selectRoomRs = selectRoomPS.executeQuery(selectRoom);
//                    table.setModel(DbUtils.resultSetToTableModel(selectRoomRs));
//                    con.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        showSelectedRoomBtn.setBounds(546, 32, 204, 23);
//        frame.getContentPane().add(showSelectedRoomBtn);
        
        
        
        JButton showSelectedRoomBtn = new JButton("Show Selected Room\r\n");
        showSelectedRoomBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
//               StudentRepository stdRepo = new StudentRepository();
//               String roomNr = table.getValueAt(table.getSelectedRow(), 4).toString();
//               System.out.println(roomNr);
//              // List result = stdRepo.findByRoomNr(table.getValueAt(table.getSelectedRow(), 4)).toString());
//               table.setModel(stdRepo.studentToTableModel(stdRepo.findByRoomNr(Integer.parseInt(roomNr))));
//               
            }
        });
        showSelectedRoomBtn.setBounds(546, 32, 204, 23);
        frame.getContentPane().add(showSelectedRoomBtn);
    }
}
