package View.Beasiswa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewData extends JFrame {
    public JTable table;
    public JTextField tfId, tfNama, tfIpk, tfPortofolio, tfWawancara;
    public JComboBox<String> cbJalur;
    public JButton btnAdd, btnUpdate, btnDelete, btnClear;

    public ViewData() {
        setTitle("Sistem Seleksi Penerimaan Beasiswa");
        setSize(850, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 550, 350);
        add(scrollPane);

        JLabel lNama = new JLabel("Nama Pendaftar:");
        lNama.setBounds(600, 20, 150, 20);
        add(lNama);
        tfNama = new JTextField();
        tfNama.setBounds(600, 40, 200, 25);
        add(tfNama);

        JLabel lJalur = new JLabel("Jalur Beasiswa:");
        lJalur.setBounds(600, 70, 150, 20);
        add(lJalur);
        cbJalur = new JComboBox<>(new String[]{"Jalur Akademik", "Jalur Non-Akademik"});
        cbJalur.setBounds(600, 90, 200, 25);
        add(cbJalur);

        JLabel lIpk = new JLabel("Nilai IPK:");
        lIpk.setBounds(600, 120, 150, 20);
        add(lIpk);
        tfIpk = new JTextField();
        tfIpk.setBounds(600, 140, 200, 25);
        add(tfIpk);

        JLabel lPortofolio = new JLabel("Nilai Portofolio:");
        lPortofolio.setBounds(600, 170, 150, 20);
        add(lPortofolio);
        tfPortofolio = new JTextField();
        tfPortofolio.setBounds(600, 190, 200, 25);
        add(tfPortofolio);

        JLabel lWawancara = new JLabel("Nilai Wawancara:");
        lWawancara.setBounds(600, 220, 150, 20);
        add(lWawancara);
        tfWawancara = new JTextField();
        tfWawancara.setBounds(600, 240, 200, 25);
        add(tfWawancara);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(600, 280, 90, 25);
        add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(710, 280, 90, 25);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(600, 315, 90, 25);
        add(btnDelete);

        btnClear = new JButton("Clear");
        btnClear.setBounds(710, 315, 90, 25);
        add(btnClear);

        tfId = new JTextField(); // Field tersembunyi

        //tambahin controller

        //tambahin actionListener

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                tfId.setText(table.getValueAt(row, 0).toString());
                tfNama.setText(table.getValueAt(row, 1).toString());
                cbJalur.setSelectedItem(table.getValueAt(row, 2).toString());
                tfIpk.setText(table.getValueAt(row, 3).toString());
                tfPortofolio.setText(table.getValueAt(row, 4).toString());
                tfWawancara.setText(table.getValueAt(row, 5).toString());
            }
        });

        setVisible(true);
    }
}