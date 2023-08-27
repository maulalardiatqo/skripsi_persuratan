-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 01 Mar 2023 pada 10.08
-- Versi Server: 5.7.17-log
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_persuratan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_disposisi`
--

CREATE TABLE `tbl_disposisi` (
  `id_disposisi` varchar(20) NOT NULL,
  `instruksi` text NOT NULL,
  `diteruskan_kepada` varchar(60) NOT NULL,
  `status_disposisi` varchar(60) NOT NULL,
  `tgl_disposisi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_level`
--

CREATE TABLE `tbl_level` (
  `id_level` int(11) NOT NULL,
  `nama_level` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_level`
--

INSERT INTO `tbl_level` (`id_level`, `nama_level`) VALUES
(1, 'Kepala Sekolah'),
(2, 'Staff TU');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_sifat_surat`
--

CREATE TABLE `tbl_sifat_surat` (
  `id_sifat_surat` int(11) NOT NULL,
  `sifat_surat` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_sifat_surat`
--

INSERT INTO `tbl_sifat_surat` (`id_sifat_surat`, `sifat_surat`) VALUES
(1, 'PENTING'),
(2, 'RAHASIA');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_surat`
--

CREATE TABLE `tbl_surat` (
  `id` int(11) NOT NULL,
  `sifat_surat` varchar(100) NOT NULL,
  `no_surat` varchar(250) NOT NULL,
  `tgl_surat` date NOT NULL,
  `type_surat` int(11) NOT NULL,
  `dari` varchar(100) NOT NULL,
  `kepada` varchar(100) NOT NULL,
  `perihal` varchar(100) NOT NULL,
  `deskripsi` varchar(250) NOT NULL,
  `file_surat` varchar(280) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_surat`
--

INSERT INTO `tbl_surat` (`id`, `sifat_surat`, `no_surat`, `tgl_surat`, `type_surat`, `dari`, `kepada`, `perihal`, `deskripsi`, `file_surat`) VALUES
(1, '- Penting', 'asdfa', '2023-01-21', 2, 'adsf', 'aadsfads', 'adsf', 'adsfa', 'Surat_dariasdfads0.pdf'),
(2, '- Penting', 'ASDFA', '2023-01-21', 1, 'asdfa', 'asdfads', 'asdfad', 'adsfads', 'ASDFA.png'),
(3, '- Rahasia', 'asdfa', '2023-01-11', 1, 'asdfa', 'sdfasd', 'adsfa', 'asdfads', 'asdfa.png'),
(4, '- Penting', 'asdfas', '2023-01-05', 2, 'adsfadsf', 'asdfadsf', 'asdfads', 'adsfadsf', 'asdfas.png'),
(5, '- Rahasia', 'adsfas', '2023-01-15', 1, 'adsfadsf', 'adsfads', 'adsfads', 'adsfads', 'adsfas.png'),
(6, '- Penting', '1321234adsf', '2023-01-06', 2, 'adsfads', 'adsfads', 'asdfads', 'adsfdas', '1321234adsf.png');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_type_surat`
--

CREATE TABLE `tbl_type_surat` (
  `id_type_surat` int(11) NOT NULL,
  `type_surat` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_type_surat`
--

INSERT INTO `tbl_type_surat` (`id_type_surat`, `type_surat`) VALUES
(1, 'SURAT MASUK'),
(2, 'SURAT KELUAR');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id_user` varchar(10) NOT NULL,
  `id_level` varchar(20) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `jk` char(1) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_user`
--

INSERT INTO `tbl_user` (`id_user`, `id_level`, `nama_user`, `jk`, `username`, `password`, `status`) VALUES
('USER001', '1', 'SOLEH', 'L', 'KEPALA', 'KEPALA', 'AKTIF'),
('USER002', '2', 'AENUL', 'L', 'ADMIN', 'ADMIN', 'AKTIF');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_level`
--
ALTER TABLE `tbl_level`
  ADD PRIMARY KEY (`id_level`);

--
-- Indexes for table `tbl_sifat_surat`
--
ALTER TABLE `tbl_sifat_surat`
  ADD PRIMARY KEY (`id_sifat_surat`);

--
-- Indexes for table `tbl_surat`
--
ALTER TABLE `tbl_surat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_type_surat`
--
ALTER TABLE `tbl_type_surat`
  ADD PRIMARY KEY (`id_type_surat`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_level`
--
ALTER TABLE `tbl_level`
  MODIFY `id_level` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_sifat_surat`
--
ALTER TABLE `tbl_sifat_surat`
  MODIFY `id_sifat_surat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_surat`
--
ALTER TABLE `tbl_surat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tbl_type_surat`
--
ALTER TABLE `tbl_type_surat`
  MODIFY `id_type_surat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
