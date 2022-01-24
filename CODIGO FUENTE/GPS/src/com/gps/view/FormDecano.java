/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormDecano.java
 *
 * Created on 30-nov-2011, 0:30:01
 */
package com.gps.view;

import com.gps.comboboxmodel.CbModelFacuDecano;
import com.gps.logic.LogicFacultad;
import com.gps.tablemodel.TableModelDecano;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */
public class FormDecano extends javax.swing.JPanel {

    /** Creates new form FormDecano */
    public FormDecano() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblFacultad = new javax.swing.JLabel();
        cbFacultad = new com.gps.util.JComboBoxAutocomplete();
        lblDocente = new javax.swing.JLabel();
        txtDecano = new javax.swing.JTextField();
        btnAddDecano = new javax.swing.JButton();
        panelFechas = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        chkestado = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.border.title"))); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        lblFacultad.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.lblFacultad.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblFacultad, gridBagConstraints);

        cbFacultad.setEditable(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(cbFacultad, gridBagConstraints);
        cbFacultad.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.jComboBox1.AccessibleContext.accessibleDescription")); // NOI18N

        lblDocente.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.lblDocente.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblDocente, gridBagConstraints);

        txtDecano.setColumns(40);
        txtDecano.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.txtDecano.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txtDecano, gridBagConstraints);

        btnAddDecano.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.btnAddDecano.text")); // NOI18N
        btnAddDecano.setToolTipText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.btnAddDecano.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(btnAddDecano, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(panelFechas, gridBagConstraints);

        btnGuardar.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.btnGuardar.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(btnGuardar, gridBagConstraints);

        lblEstado.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.lblEstado.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblEstado, gridBagConstraints);

        chkestado.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.chkestado.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(chkestado, gridBagConstraints);

        btnCancelar.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.btnCancelar.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(btnCancelar, gridBagConstraints);

        lblId.setText(org.openide.util.NbBundle.getMessage(FormDecano.class, "FormDecano.lblId.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lblId, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDecano;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cbFacultad;
    private javax.swing.JCheckBox chkestado;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFacultad;
    private javax.swing.JLabel lblId;
    private javax.swing.JPanel panelFechas;
    private javax.swing.JTextField txtDecano;
    // End of variables declaration//GEN-END:variables
    //Inicio de Atributos de clase            
    private JTable tablaDatos;
    private TableModelDecano modeloDatos;  
    private CbModelFacuDecano cbmodfac=new CbModelFacuDecano(LogicFacultad.listarFacultad(BigDecimal.ZERO));
    private JDateChooser fechainicio;
    private JDateChooser fechafin;
    private JSpinnerDateEditor txtfechainicio = new JSpinnerDateEditor();
    private JSpinnerDateEditor txtfechafin = new JSpinnerDateEditor();
    private JLabel lblInicio = new JLabel("INICIO");
    private JLabel lblFin = new JLabel("FIN");
    //Fin de Atributos de clase
    
    public FormDecano(JTable tabla,TableModelDecano modelo ) {
        tablaDatos=tabla;
        modeloDatos=modelo;
        tabla.setModel(modelo);
        tablaDatos.getColumnModel().getColumn(0).setMaxWidth(30);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(200);
        tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(200);                
        initComponents();        
        cbFacultad.setModel(cbmodfac);
        txtDecano.setEditable(false);
        btnAddDecano.setIcon(ViewLogin.picture.getIconI());
        fechainicio = new JDateChooser(txtfechainicio);
        fechafin = new JDateChooser(txtfechafin);
        fechainicio.setDate(new Date());
        fechafin.setDate(new Date());   
        panelFechas.add(lblInicio);
        panelFechas.add(fechainicio);
        panelFechas.add(lblFin);
        panelFechas.add(fechafin);
    }

    public JButton getBtnAddDecano() {
        return btnAddDecano;
    }

    public void setBtnAddDecano(JButton btnAddDecano) {
        this.btnAddDecano = btnAddDecano;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JComboBox getCbFacultad() {
        return cbFacultad;
    }

    public void setCbFacultad(JComboBox cbFacultad) {
        this.cbFacultad = cbFacultad;
    }

    public CbModelFacuDecano getCbmodfac() {
        return cbmodfac;
    }

    public void setCbmodfac(CbModelFacuDecano cbmodfac) {
        this.cbmodfac = cbmodfac;
    }

    public JCheckBox getChkestado() {
        return chkestado;
    }

    public void setChkestado(JCheckBox chkestado) {
        this.chkestado = chkestado;
    }

    public JDateChooser getFechafin() {
        return fechafin;
    }

    public void setFechafin(JDateChooser fechafin) {
        this.fechafin = fechafin;
    }

    public JDateChooser getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(JDateChooser fechainicio) {
        this.fechainicio = fechainicio;
    }

    public JLabel getLblDocente() {
        return lblDocente;
    }

    public void setLblDocente(JLabel lblDocente) {
        this.lblDocente = lblDocente;
    }

    public JLabel getLblEstado() {
        return lblEstado;
    }

    public void setLblEstado(JLabel lblEstado) {
        this.lblEstado = lblEstado;
    }

    public JLabel getLblFacultad() {
        return lblFacultad;
    }

    public void setLblFacultad(JLabel lblFacultad) {
        this.lblFacultad = lblFacultad;
    }

    public JLabel getLblFin() {
        return lblFin;
    }

    public void setLblFin(JLabel lblFin) {
        this.lblFin = lblFin;
    }

    public JLabel getLblInicio() {
        return lblInicio;
    }

    public void setLblInicio(JLabel lblInicio) {
        this.lblInicio = lblInicio;
    }

    public TableModelDecano getModeloDatos() {
        return modeloDatos;
    }

    public void setModeloDatos(TableModelDecano modeloDatos) {
        this.modeloDatos = modeloDatos;
    }

    public JPanel getPanelFechas() {
        return panelFechas;
    }

    public void setPanelFechas(JPanel panelFechas) {
        this.panelFechas = panelFechas;
    }

    public JTable getTablaDatos() {
        return tablaDatos;
    }

    public void setTablaDatos(JTable tablaDatos) {
        this.tablaDatos = tablaDatos;
    }

    public JTextField getTxtDecano() {
        return txtDecano;
    }

    public void setTxtDecano(JTextField txtDecano) {
        this.txtDecano = txtDecano;
    }

    public JSpinnerDateEditor getTxtfechafin() {
        return txtfechafin;
    }

    public void setTxtfechafin(JSpinnerDateEditor txtfechafin) {
        this.txtfechafin = txtfechafin;
    }

    public JSpinnerDateEditor getTxtfechainicio() {
        return txtfechainicio;
    }

    public void setTxtfechainicio(JSpinnerDateEditor txtfechainicio) {
        this.txtfechainicio = txtfechainicio;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }
    
    
    

}