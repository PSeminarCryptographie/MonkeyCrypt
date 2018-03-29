/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import alcollectors.MoCr_SettingsAL;
import crypt.Options;
import crypt.Tools;
/**
 *
 * @author Jonas
 */
public class MoCr_Frame_Settings extends javax.swing.JFrame {
   
    public MoCr_SettingsAL myAL;
    String IOFont;
    String CFont;
    
    public MoCr_Frame_Settings(MoCr_Frame f) {
        this.IOFont = f.IOFont;
        this.CFont = f.CFont;
        initComponents();
        myAL = new MoCr_SettingsAL(f, this);
        MoCr_SettingsFrame_ResetButton.addActionListener(myAL);
        MoCr_SettingsFrame_Validation.addActionListener(myAL);
        MoCr_SettingsFrame_Colourbox.addActionListener(myAL);
        MoCr_SettingsFrame_Checkbox.setSelected(true);
    }
    
    public void renewalRoutine(String in) {
        MoCr_SettingsFrame_AlphabetField.setText(in);
        MoCr_SettingsFrame_ClearBox.setSelectedIndex(0);
    }

    public boolean isCheckboxSelected() {
        return MoCr_SettingsFrame_Checkbox.isSelected();
    }
    
    public String getAlphabetInput() {
        return MoCr_SettingsFrame_AlphabetField.getText();
    }
    
    public void setStandardAlphabet() {
        MoCr_SettingsFrame_AlphabetField.setText("abcdefghijklmnopqrstuvwxyz");
    }
    
    public int getClearBoxIndex() {
        return MoCr_SettingsFrame_ClearBox.getSelectedIndex();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoCr_SettingsFrame_Validation = new javax.swing.JButton();
        MoCr_SettingsFrame_TabbedPane = new javax.swing.JTabbedPane();
        MoCr_SettingsFrame_CryptoSub = new javax.swing.JPanel();
        MoCr_SettingsFrame_Heading1 = new javax.swing.JLabel();
        MoCr_SettingsFrame_AlphabetField = new javax.swing.JTextField();
        MoCr_SettingsFrame_ResetButton = new javax.swing.JButton();
        MoCr_SettingsFrame_DesignSub = new javax.swing.JPanel();
        MoCr_SettingsFrame_TipCheck = new javax.swing.JCheckBox();
        MoCr_SettingsFrame_Checkbox = new javax.swing.JCheckBox();
        MoCr_SettingsFrame_ClearBox = new javax.swing.JComboBox<>();
        MoCr_SettingsFrame_Colourbox = new javax.swing.JComboBox<>();
        Heading1 = new javax.swing.JLabel();
        Heading2 = new javax.swing.JLabel();
        SizeField = new javax.swing.JTextField();
        MoCr_Settings_Lang = new javax.swing.JComboBox<>();
        MoCr_Settings_LangLabel = new javax.swing.JLabel();
        MoCr_SettingsFrame_ExclusionSub = new javax.swing.JPanel();
        ExclusionLabel = new javax.swing.JLabel();
        ExclusionField = new javax.swing.JTextField();
        AlphOnlyCheckbox = new javax.swing.JCheckBox();
        ScriptCombobox = new javax.swing.JComboBox<>();
        NotificatorLabel = new javax.swing.JLabel();

        setTitle("Einstellungen");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        MoCr_SettingsFrame_Validation.setFont(new java.awt.Font(CFont, 0, 14));
        MoCr_SettingsFrame_Validation.setText("Änderungen speichern");

        MoCr_SettingsFrame_TabbedPane.setFont(new java.awt.Font(CFont, 0, 11));

        MoCr_SettingsFrame_Heading1.setFont(new java.awt.Font(CFont, 1, 18));
        MoCr_SettingsFrame_Heading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoCr_SettingsFrame_Heading1.setText("Alphabet ändern");

        MoCr_SettingsFrame_AlphabetField.setFont(new java.awt.Font(IOFont, 0, 18));
        MoCr_SettingsFrame_AlphabetField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MoCr_SettingsFrame_ResetButton.setFont(new java.awt.Font(CFont, 0, 13));
        MoCr_SettingsFrame_ResetButton.setText("Standardalphabet wiederherstellen");

        javax.swing.GroupLayout MoCr_SettingsFrame_CryptoSubLayout = new javax.swing.GroupLayout(MoCr_SettingsFrame_CryptoSub);
        MoCr_SettingsFrame_CryptoSub.setLayout(MoCr_SettingsFrame_CryptoSubLayout);
        MoCr_SettingsFrame_CryptoSubLayout.setHorizontalGroup(
            MoCr_SettingsFrame_CryptoSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_SettingsFrame_CryptoSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoCr_SettingsFrame_CryptoSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoCr_SettingsFrame_ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_Heading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_AlphabetField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        MoCr_SettingsFrame_CryptoSubLayout.setVerticalGroup(
            MoCr_SettingsFrame_CryptoSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_SettingsFrame_CryptoSubLayout.createSequentialGroup()
                .addComponent(MoCr_SettingsFrame_Heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_SettingsFrame_AlphabetField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_SettingsFrame_ResetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MoCr_SettingsFrame_TabbedPane.addTab("Verschlüsselung", MoCr_SettingsFrame_CryptoSub);

        MoCr_SettingsFrame_TipCheck.setFont(new java.awt.Font(CFont, 0, 15));
        MoCr_SettingsFrame_TipCheck.setSelected(true);
        MoCr_SettingsFrame_TipCheck.setText("Tipps aktiviert");

        MoCr_SettingsFrame_Checkbox.setFont(new java.awt.Font(CFont, 0, 15));
        MoCr_SettingsFrame_Checkbox.setSelected(true);
        MoCr_SettingsFrame_Checkbox.setText("Vergrößerbarkeit des Hauptfensters aktiviert");

        MoCr_SettingsFrame_ClearBox.setFont(new java.awt.Font(CFont, 0, 12));
        MoCr_SettingsFrame_ClearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kein Feld leeren", "Alle Felder leeren", "Lokale Felder leeren", "Alle Schlüsselfelder leeren", "Ein- und Ausgabefelder leeren" }));

        MoCr_SettingsFrame_Colourbox.setFont(new java.awt.Font(CFont, 0, 12));
        MoCr_SettingsFrame_Colourbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blau", "Grün", "Gelb", "Rosa" }));

        Heading1.setFont(new java.awt.Font(CFont, 1, 12));
        Heading1.setText("Fensterfarbe");

        Heading2.setFont(new java.awt.Font(CFont, 1, 12));
        Heading2.setText("Schriftgröße");

        SizeField.setFont(new java.awt.Font(IOFont, 0, 11));
        SizeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SizeField.setText("13");

        MoCr_Settings_Lang.setFont(new java.awt.Font(CFont, 0, 12));
        MoCr_Settings_Lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deutsch", "English", "Italiano", "język polski" }));

        MoCr_Settings_LangLabel.setFont(new java.awt.Font(CFont, 1, 12));
        MoCr_Settings_LangLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoCr_Settings_LangLabel.setText("Sprache");

        javax.swing.GroupLayout MoCr_SettingsFrame_DesignSubLayout = new javax.swing.GroupLayout(MoCr_SettingsFrame_DesignSub);
        MoCr_SettingsFrame_DesignSub.setLayout(MoCr_SettingsFrame_DesignSubLayout);
        MoCr_SettingsFrame_DesignSubLayout.setHorizontalGroup(
            MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_SettingsFrame_DesignSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoCr_SettingsFrame_DesignSubLayout.createSequentialGroup()
                        .addComponent(Heading1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoCr_SettingsFrame_Colourbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MoCr_SettingsFrame_Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_TipCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MoCr_SettingsFrame_DesignSubLayout.createSequentialGroup()
                        .addGroup(MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Heading2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MoCr_Settings_LangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MoCr_SettingsFrame_DesignSubLayout.createSequentialGroup()
                                .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MoCr_SettingsFrame_ClearBox, 0, 281, Short.MAX_VALUE))
                            .addComponent(MoCr_Settings_Lang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        MoCr_SettingsFrame_DesignSubLayout.setVerticalGroup(
            MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_SettingsFrame_DesignSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Heading1)
                    .addComponent(MoCr_SettingsFrame_Colourbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Heading2)
                    .addComponent(SizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoCr_SettingsFrame_ClearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(MoCr_SettingsFrame_DesignSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MoCr_Settings_Lang, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(MoCr_Settings_LangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoCr_SettingsFrame_TipCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoCr_SettingsFrame_Checkbox)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MoCr_SettingsFrame_TabbedPane.addTab("Fenster", MoCr_SettingsFrame_DesignSub);

        ExclusionLabel.setFont(new java.awt.Font(CFont, 1, 10));
        ExclusionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExclusionLabel.setText("Folgende Zeichen ausschließen:");

        ExclusionField.setFont(new java.awt.Font(IOFont, 0, 16));
        ExclusionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AlphOnlyCheckbox.setFont(new java.awt.Font(CFont, 1, 12));
        AlphOnlyCheckbox.setText("Nur Zeichen des Alphabets einschließen");
        AlphOnlyCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlphOnlyCheckboxActionPerformed(evt);
            }
        });

        ScriptCombobox.setFont(new java.awt.Font(CFont, 1, 12));
        ScriptCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Groß-/Kleinschreibung beibehalten", "Ausgabe in Majuskeln", "Ausgabe in Minuskeln", "Zufällige Groß-/Kleinschreibung" }));

        javax.swing.GroupLayout MoCr_SettingsFrame_ExclusionSubLayout = new javax.swing.GroupLayout(MoCr_SettingsFrame_ExclusionSub);
        MoCr_SettingsFrame_ExclusionSub.setLayout(MoCr_SettingsFrame_ExclusionSubLayout);
        MoCr_SettingsFrame_ExclusionSubLayout.setHorizontalGroup(
            MoCr_SettingsFrame_ExclusionSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_SettingsFrame_ExclusionSubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoCr_SettingsFrame_ExclusionSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoCr_SettingsFrame_ExclusionSubLayout.createSequentialGroup()
                        .addComponent(ExclusionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExclusionField))
                    .addComponent(AlphOnlyCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(ScriptCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MoCr_SettingsFrame_ExclusionSubLayout.setVerticalGroup(
            MoCr_SettingsFrame_ExclusionSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_SettingsFrame_ExclusionSubLayout.createSequentialGroup()
                .addGroup(MoCr_SettingsFrame_ExclusionSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExclusionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExclusionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlphOnlyCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScriptCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        MoCr_SettingsFrame_TabbedPane.addTab("Darstellung", MoCr_SettingsFrame_ExclusionSub);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MoCr_SettingsFrame_Validation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoCr_SettingsFrame_TabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NotificatorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MoCr_SettingsFrame_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotificatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MoCr_SettingsFrame_Validation))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlphOnlyCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlphOnlyCheckboxActionPerformed
        // TODO add your handling code here:
        ExclusionField.setEditable(!AlphOnlyCheckbox.isSelected());
    }//GEN-LAST:event_AlphOnlyCheckboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox AlphOnlyCheckbox;
    public javax.swing.JTextField ExclusionField;
    public javax.swing.JLabel ExclusionLabel;
    public javax.swing.JLabel Heading1;
    public javax.swing.JLabel Heading2;
    public javax.swing.JTextField MoCr_SettingsFrame_AlphabetField;
    public javax.swing.JCheckBox MoCr_SettingsFrame_Checkbox;
    public javax.swing.JComboBox<String> MoCr_SettingsFrame_ClearBox;
    public javax.swing.JComboBox<String> MoCr_SettingsFrame_Colourbox;
    private javax.swing.JPanel MoCr_SettingsFrame_CryptoSub;
    private javax.swing.JPanel MoCr_SettingsFrame_DesignSub;
    private javax.swing.JPanel MoCr_SettingsFrame_ExclusionSub;
    public javax.swing.JLabel MoCr_SettingsFrame_Heading1;
    public javax.swing.JButton MoCr_SettingsFrame_ResetButton;
    public javax.swing.JTabbedPane MoCr_SettingsFrame_TabbedPane;
    public javax.swing.JCheckBox MoCr_SettingsFrame_TipCheck;
    public javax.swing.JButton MoCr_SettingsFrame_Validation;
    public javax.swing.JComboBox<String> MoCr_Settings_Lang;
    public javax.swing.JLabel MoCr_Settings_LangLabel;
    public javax.swing.JLabel NotificatorLabel;
    public javax.swing.JComboBox<String> ScriptCombobox;
    public javax.swing.JTextField SizeField;
    // End of variables declaration//GEN-END:variables
}
