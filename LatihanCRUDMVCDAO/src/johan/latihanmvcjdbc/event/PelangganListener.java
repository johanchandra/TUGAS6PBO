/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johan.latihanmvcjdbc.event;

import johan.latihanmvcjdbc.entity.Pelanggan;
import johan.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author AsusPC
 * NIM : 10116522
NAMA : JOHAN CHANDRA
PBO 12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();

}
