/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

/**
 *
 * @author Hugo
 */
import  java.awt. * ;
import  javax.swing. * ;

import  org.fife.ui.rtextarea. * ;
import  org.fife.ui.rsyntaxtextarea. * ;
import  org.fife.ui.rsyntaxtextarea.templates. * ;

public class PanelTextos extends JPanel {
    
    RSyntaxTextArea textArea;
    public PanelTextos() throws HeadlessException {
           
        this.setLayout(new BorderLayout());
        textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea);
        this.add(sp);
      
        RSyntaxTextArea.setTemplatesEnabled(true);
      
        CodeTemplateManager ctm = RSyntaxTextArea.getCodeTemplateManager();
        
        CodeTemplate ct = new StaticCodeTemplate("sout", "System.out.println(", null);
        ctm.addTemplate(ct);
     
        ct = new StaticCodeTemplate("fb", "for (int i=0; i<", "; i++) {\n\t\n}\n");
        ctm.addTemplate(ct);

      /*setContentPane(cp);
      setTitle("CodeTemplate Demo");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setLocationRelativeTo(null);*/
    
    }
    public void Agregartexto(String texto)
    {
        textArea.setText(texto);
    }
    public String Obtenertexto()
    {
        return textArea.getText();
    }
    /*
    public static void main(String[] args) {
      // Start all Swing applications on the EDT.
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new PanelTextos().setVisible(true);
         }
      });
    }
    */     
}