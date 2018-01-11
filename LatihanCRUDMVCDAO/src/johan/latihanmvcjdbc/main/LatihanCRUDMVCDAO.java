/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johan.latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.List;
import johan.latihanmvcjdbc.database.KingsBarbershopDatabase;
import johan.latihanmvcjdbc.entity.Pelanggan;
import johan.latihanmvcjdbc.error.PelangganException;
import johan.latihanmvcjdbc.service.PelangganDao;

/**
 *
 * @author AsusPC
 * NIM : 10116522
NAMA : JOHAN CHANDRA
PBO 12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {

        PelangganDao dao = new KingsBarbershopDatabase().getPelangganDao();
        dao.deletePelanggan(1);
    }

}
