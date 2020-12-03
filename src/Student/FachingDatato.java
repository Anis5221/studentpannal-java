/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parso
 */
public class FachingDatato {
    
    public ResultSet Find(int st){
        Connection con = MyConnection.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("SELECT * FROM `user1` WHERE `sid`=?");
            ps.setInt(1, st);
            rs = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(FachingDatato.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
