package com.kategori.kategori.KategoriRepository;

import com.kategori.kategori.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriRepository extends JpaRepository<Kategori, Integer> {}

