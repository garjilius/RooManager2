/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneEntita;

import Entity.Task;

/**
 *
 * @author emanuelegargiulo
 */
public class GestioneTask {
        public static void aggiungiTask(Task input) {
        
        String query = "INSERT INTO Task VALUES (%d,'%s',%d,%d)";
        query = String.format(query, input.getID(), input.getOperazione(),
                input.getTipo(), input.getStanza());
        System.out.println(query);
        
        new GestioneDB().updateDB(query);
    }
}
