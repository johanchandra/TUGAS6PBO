/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johan.latihanmvcjdbc.service;


import java.util.List;
import johan.latihanmvcjdbc.entity.Pelanggan;
import johan.latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author AsusPC
 * 
NIM : 10116522
NAMA : JOHAN CHANDRA
PBO 12
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan (String email) throws PelangganException;
    
    public List <Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
