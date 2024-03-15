import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DoublyArrayList {
    public static void main(String[] args) {
        LinkedList<Tugas> listTugas = new LinkedList<Tugas>();

        Scanner sc = new Scanner(System.in);
        boolean menu = false;
        while (menu != true) {
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");

            System.out.println("Pilih opsi");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Input depan/belakang");
                    System.out.println("1. Input depan");
                    System.out.println("2. Input belakang");
                    int opsi = sc.nextInt();
                    switch (opsi) {
                        case 1:
                            System.out.println("Input Data Tugas");
                            System.out.print("Mata Kuliah : ");
                            String MataKuliah1 = sc.next();
                            System.out.print("Tugas : ");
                            String Tugas1 = sc.next();
                            sc.nextLine();
                            System.out.print("Deadline : ");
                            String DeadLine1 = sc.nextLine();

                            listTugas.addFirst(new Tugas(MataKuliah1, Tugas1, DeadLine1));

                        case 2:
                            System.out.print("Mata Kuliah : ");
                            String MataKuliah2 = sc.next();
                            System.out.print("Tugas : ");
                            String Tugas2 = sc.next();
                            sc.nextLine();
                            System.out.print("Deadline : ");
                            String DeadLine2 = sc.nextLine();

                            listTugas.addLast(new Tugas(MataKuliah2, Tugas2, DeadLine2));
                    }
                    break;

                case 2:
                    System.out.println("Pilih opsi");
                    System.out.println("1. Hapus depan");
                    System.out.println("2. Hapus belakang");
                    System.out.println("3. Hapus berdasarkan matakuliah");
                    input = sc.nextInt();
                    sc.nextLine();
                    switch (input) {
                        case 1:
                            listTugas.removeFirst();
                            break;
                        case 2:
                            listTugas.removeLast();
                            break;
                        case 3:
                            String tugas = sc.next();
                            ListIterator<Tugas> iter = listTugas.listIterator();
                            while (iter.hasNext()) {
                                Tugas ob = iter.next();
                                if (ob.getTugas().equals(tugas)) {
                                    iter.remove();
                                }
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Pilih opsi");
                    System.out.println("1. Print awal");
                    System.out.println("2. Print akhir");
                    input = sc.nextInt();
                    sc.nextLine();
                    switch (input) {
                        case 1:
                            for (Tugas item : listTugas) {
                                System.out.println(item);
                            }
                            break;
                        case 2:
                            ListIterator<Tugas> iterator = listTugas.listIterator();
                            if (iterator.hasNext()) {
                                while (iterator.hasNext()) {
                                    iterator.next();
                                }
                                while (iterator.hasPrevious()) {
                                    System.out.println(iterator.previous());
                                }
                            } else {
                                System.out.println("List kosong.");
                            }
                            break;
                    }
            }
        }
    }
}