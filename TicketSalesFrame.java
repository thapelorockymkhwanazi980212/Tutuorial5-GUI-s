
package ac.za.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TicketSalesFrame extends JFrame 
{
    private JLabel headingLabel, nameLabel, surnameLabel, cellponenumberLabel,hometeamlabel, awayteamLabel,costpriceLabel, numberofticketsLabel, totalamountLabel;
    private JTextField nameTextField, surnameTextField, cellphonenumberTextField, hometeamTextField, awayteamTextField, costpriceTextField, totalamountTextField;
    private JSlider numberofticketsSlider;
    private JButton buyButton, clearButton, exitButton;
    private JPanel headingPanel, namePanel, surnamePanel,cellphonenumberPanel, hometeamPanel, awayteamPanel, costpricePanel, numberofticketsPanel,totalAmountPanel,buttonsPanel,
            customerdetailsPanel, ticketsdetailsPanel, ticketandbuttonsPanel, mainPanel;

    public TicketSalesFrame() 
    {
        setTitle("Ticket Sales");
        setSize(600, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //labels
        headingLabel = new JLabel("Soccer Match Tickets");
        headingLabel.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD,40));
        headingLabel.setForeground(Color.GREEN);
        headingLabel.setForeground(Color.CYAN);
        
        nameLabel = new JLabel("Name:             ");
        surnameLabel = new JLabel("Surname:       ");
        cellponenumberLabel = new JLabel("Cellphone no:");
        hometeamlabel = new JLabel("Home team:");
        awayteamLabel = new JLabel("Away team: ");
        costpriceLabel = new JLabel("Cost price:R");
        numberofticketsLabel = new JLabel("Number of tickets required:");  
        totalamountLabel = new JLabel("Total amount due:R");
        
        //text fields
        nameTextField = new JTextField(15);
        nameTextField.setFocusable(true);
        
        surnameTextField = new JTextField(15);
        hometeamTextField = new JTextField(15);
        cellphonenumberTextField = new JTextField(15);
        awayteamTextField = new JTextField(15);
        costpriceTextField = new JTextField(15);
        
        totalamountTextField = new JTextField(15);
        totalamountTextField.setText("To be calculated");
        totalamountTextField.setEditable(false);
        
        //slider
        numberofticketsSlider = new JSlider();
        
        //buttons
        buyButton = new JButton("Buy");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        //panels
        headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); //north
        headingPanel.add(headingLabel);
        
        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        cellphonenumberPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonenumberPanel.add(cellponenumberLabel);
        cellphonenumberPanel.add(cellphonenumberTextField);
        
        hometeamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hometeamPanel.add(hometeamlabel);
        hometeamPanel.add(hometeamTextField);
        
        awayteamPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayteamPanel.add(awayteamLabel);
        awayteamPanel.add(awayteamTextField);
        
        costpricePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costpricePanel.add(costpriceLabel);
        costpricePanel.add(costpriceTextField);
        
        numberofticketsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numberofticketsPanel.add(numberofticketsLabel);
        numberofticketsPanel.add(numberofticketsSlider);
        
        totalAmountPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalAmountPanel.add(totalamountLabel);
        totalAmountPanel.add(totalamountTextField);
        
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));//south
        buttonsPanel.add(buyButton);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(exitButton);
        
        customerdetailsPanel = new JPanel(new GridLayout(3,1,1,1));
        customerdetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2), "Customer details"));
        customerdetailsPanel.add(namePanel);
        customerdetailsPanel.add(surnamePanel);
        customerdetailsPanel.add(cellphonenumberPanel);
        
        ticketsdetailsPanel = new JPanel(new GridLayout(5,1));
        ticketsdetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2), "Ticket details"));
        ticketsdetailsPanel.add(hometeamPanel);
        ticketsdetailsPanel.add(awayteamPanel);
        ticketsdetailsPanel.add(costpricePanel);
        ticketsdetailsPanel.add(numberofticketsPanel);
        ticketsdetailsPanel.add(totalAmountPanel);
        
        ticketandbuttonsPanel = new JPanel(new GridLayout(2,1));//center
        ticketandbuttonsPanel.add(ticketsdetailsPanel);
        ticketandbuttonsPanel.add(buttonsPanel);
        
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(headingPanel, BorderLayout.NORTH);
        mainPanel.add(customerdetailsPanel ,BorderLayout.CENTER);
        mainPanel.add(ticketandbuttonsPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        
        //before adding to github ho nale error ya cellphone number
        
        pack();
        setVisible(true);
   }
    
}
