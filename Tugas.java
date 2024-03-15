public class Tugas {
    String MataKuliah;
    String Tugas;
    String DeadLine;

    public Tugas(String MataKuliah, String Tugas, String DeadLine) {
        this.MataKuliah = MataKuliah;
        this.Tugas = Tugas;
        this.DeadLine = DeadLine;
    }

    public String getMataKuliah() {
        return MataKuliah;
    }

    public String getTugas() {
        return Tugas;
    }

    public String getDeadLine() {
        return DeadLine;
    }

    @Override
    public String toString() {
        return "Tugas [Matakuliah= " + MataKuliah + "Tugas= " + Tugas + "Terakhir= " + DeadLine + "]";
    }

}