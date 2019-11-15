package com.example.appinventory;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface BarangDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertBarang(Barang barang);

    @Update
    int updateBarang(Barang barang);

    @Query("SELECT * FROM tb_barang")
    Barang[] selectAllBarangs();

    @Delete
    int deleteBarang(Barang barang);

    @Query("SELECT * FROM tb_barang WHERE barangId = :id LIMIT 1")
    Barang selectBarangDetail(int id);
}
