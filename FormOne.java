/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author npget
 */
public class FormOne extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormOne
     */
    public FormOne() throws IOException {
        initComponents();
          CoreSelect();
        CoreResult();
        
         jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ComboLista = new javax.swing.JComboBox();
        BtnGo = new javax.swing.JButton();
        FieldData = new javax.swing.JTextField();
        FieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        FieldNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldNote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelinfo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FormArcher");
        setAutoscrolls(true);

        BtnGo.setText("Go!");
        BtnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGoActionPerformed(evt);
            }
        });

        jLabel1.setText("mm/yyyy");

        jLabel2.setText("Nominativo");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("Numero");

        FieldNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNoteActionPerformed(evt);
            }
        });

        jLabel4.setText("Note");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnGo)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(FieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldNote, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGo)
                    .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(FieldNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    
      //Filtra in base al testo 
    
    private void BtnGoActionPerformed(java.awt.event.ActionEvent evt) {                                      
            // TODO add your handling code here:
     
        //Mi faccio dare il sorter impostato nella tabella (vedi caricaArchivioTot())
        final TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) jTable2.getRowSorter();
      
        
        // preparo un array list per i filtraggi ... 
        java.util.List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(4);
     
             //Imposto vari filtri sul nuovo array 
        
         if(!"".equals(FieldNum.getText())){
        filters.add(RowFilter.regexFilter(FieldNum.getText(), 2));
         }
         
          if(!"".equals(FieldName.getText())){
       filters.add(RowFilter.regexFilter("(?i)"+FieldName.getText(), 3));
         }
        
        
        if(!"".equals(FieldData.getText())){
        filters.add(RowFilter.regexFilter(FieldData.getText(), 4));
         }
        
  if(   !"".equals(FieldNote.getText())){
        filters.add(RowFilter.regexFilter("(?i)"+FieldNote.getText(), 5));
         }
  
  // qui non è tanto chiaro ma ci sto 
       RowFilter<Object,Object> serviceFilter = RowFilter.andFilter(filters);
  
// sparo tutto sul sorter iniziale 
       sorter.setRowFilter(serviceFilter);    
        
        /*
         * Il filtro nasconde le righe che non matchano come espressione regolare, con il testo del campo fielddate, 
         * usando come dato quello della colonna 4
         * Per generare questo filtro, si usa il metodo predefinito RowFilter.regexFilter(valore, colonne da confrontare...)
         * RowFilter fornisce anche altri metodi standard di filtraggio (e.g. confrontando con una Data, un numero, o combinando
         * con gli operatori booleani)
         * vedi https://docs.oracle.com/javase/8/docs/api/javax/swing/RowFilter.html
         */
 
        
     
    }                                     



    private void FieldNoteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    
    public void CoreSelect() throws IOException {
 
        String csvFile = "/home/npget/NetBeansProjects/csvOne/src/gui/sezioni.csv";
        // mettere a null una variabile non inizializzata e' abbastanza diffuso.
        //inoltre non consumo una stringa vuota che va allocata in memoria (ottimizzazione)
        String line = null; 
 
        /*
         + Questa sintassi ( disponibile per java7+) permette di aprire risorse che saranno visibili nel blocco interno ma 
         * vengono chiuse in automatico all'uscita del blocco (chiamando il metodo close())
         */
        try(FileReader csvReader = new FileReader(csvFile); BufferedReader br = new BufferedReader(csvReader)) {
 
            while ((line = br.readLine()) != null) {
 
                // use comma as separator, inline senza dichiarare una variabile che mi sembra autoesplicativa...
                String[] csvrighe = line.split(",");
 
 
                //    String[] sezioni = {"[Id= " + csvrighe[0] + " , name=" + csvrighe[3] + "]"};
                /*
                 *La combo si aspetta come Item un qualunque Object, per cui ne creo uno ad-hoc che mi raccolga i dati di interesse 
                 * vedi il file associato "Sezione.java"
                 * La lista visualizza l'item nell'elenco usando il metodo "toString()" dell'oggetto stesso.
                 * Il metodo toString() e' definito di default per tutti gli Object e sottoclassi, ma ogni sottoclasse puo' ridefinirlo
                 * per decidere come essere visualizzata, di solito all'interno dei log, negli strumenti di debug, o come in questo caso,
                 * come elemento di una combobox di swing
                 */
                final Sezione sezione = new Sezione(csvrighe[0], csvrighe[3]);
                ComboLista.addItem(sezione);
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    public void CoreResult() throws IOException {
        String csvFilearch = "/home/npget/NetBeansProjects/csvOne/src/gui/archivio.csv";
        String line = null; //vedi sopra
 
        //preparo una lista che contenga come ciascun elemento una riga del file, spezzata fra le virgole
        List<String[]> righeArchivio = new ArrayList<>();
        /*
         * In Java e' buona pratica dichiarare le variabili con l'interfaccia piu' generica a cui appartengono quando possibile
         * Ad esempio, benche' ho creato una lista gestita internamente come array (ArrayList), nella dichiarazione uso List che e'
         * la sua interfaccia. Il vantaggio e' che si puo' successivamente cambiare l'implementazione specifica della lista da ArrayList
         * ad altro, senza dover modificare tutti i riferimenti alla mia variabile, perche' i riferimenti "vedono" la mia lista con il
         * suo tipo generico (List), che non cambia con la specifica implementazione.
         *
         * E' buona prassi specificare il tipo di oggetti contenuti nella Lista, usando la notazione fra parentesi angolaris.
         * List<String[]> e' una lista in cui ciascun elemento e' un array di Stringhe
         * Nella espressione assegnata uso ArrayList<>() senza specificare il tipo di elementi, perche' il compilatore (da java7+)
         * e' in grado di inferirlo da solo a partire dalla dichiarazione
         */
 
        //vedi sopra per la sintassi try(...) {...}
        try(FileReader csvArchReader = new FileReader(csvFilearch); BufferedReader br = new BufferedReader(csvArchReader)) {
 
            while ((line = br.readLine()) != null) {
 
                //Per ogni riga del file aggiungo un array di valori alla lista dinamica
                righeArchivio.add(line.split(","));
 
            }
 
            //definisco il modello della tabella un pezzo alla volta, per avere maggiore flessibilita'
            final DefaultTableModel modelloArch = new DefaultTableModel();
            //dichiaro le colonne
            modelloArch.setColumnIdentifiers(new String[]{"IDA", "CodBar", "Numero", "Nome", "Data","Note"});
 
            //aggiungo i dati al modello iterando sulla lista popolata da file
            for (String[] riga : righeArchivio) {
                //per ogni riga letta dal file e salvata in righeArchivio creo un vettore
                final Vector<String> rigaDati = new Vector<>();
                //aggiungo i campi di interesse nel vettore
                rigaDati.add(riga[0]);
                rigaDati.add(riga[2]);
                rigaDati.add(riga[3]);
                rigaDati.add(riga[4]);
                rigaDati.add(riga[5]);
                rigaDati.add(riga[6]);
                //aggiungo il vettore al modello della tabella
                modelloArch.addRow(rigaDati);
            }
 
            /*
             * Creo un'istanza di una classe che gestisce l'ordinamento dei dati per il nostro modello 
             * di tabella, che passo come argomento
             * Questo oggetto servira' in seguito per eseguire il filtro dei dati!
             *
             * vedi anche https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#sorting
             */
            final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelloArch);
            
            //imposto nella tabella il modello e l'oggetto che fara' l'ordinamento
            jTable2.setModel(modelloArch);
            jTable2.setRowSorter(sorter);
 
 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    
     
       //Questo e' tutto ok!
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Point point = evt.getPoint();
        int row, column;
        row = jTable2.rowAtPoint(point);
        column = jTable2.columnAtPoint(point);
 
        labelinfo.setText("Click alla:Riga:" +
                        row + " | Colonna:" + column +
                        " Vale: " + jTable2.getValueAt(row, column)
        );
    }
 
  
    
    
    
    



    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnGo;
    private javax.swing.JComboBox ComboLista;
    private javax.swing.JTextField FieldData;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldNote;
    private javax.swing.JTextField FieldNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelinfo;
    // End of variables declaration                   
}
