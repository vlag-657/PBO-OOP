class User {
    public String nama;
    public String id;
    public int usia;
    public String pekerjaan;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }
    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }

    public static void main(String[] args){
        User user1 = new User();
        user1.setNama("Muhammad Adistya Rafif Rasendriya");
        user1.setId("254311026");
        user1.setUsia(19);
        user1.setPekerjaan("Mahasiswa");
        System.out.printf("User 1 Nama: %s\nID: %s\nUsia: %d\nPekerjaan: %s\n", user1.nama, user1.id, user1.usia, user1.pekerjaan);

        User user2 = new User();
        user2.nama = "Daffa Hafist Atha Kuncoro";
        user2.id = "254311025";
        user2.usia = 29;
        user2.pekerjaan = "Software Engineer";
        System.out.printf("User 2 Nama: %s\nID: %s\nUsia: %d\nPekerjaan: %s\n", user2.nama, user2.id, user2.usia, user2.pekerjaan);

    }

}