package sem6.DZ.noutbuk;

// �������� ��� ���������� ������ ������� ��� �������� ������� - �������� ���� � ������. ����������� � java.
// ������� ��������� ���������.
// �������� �����, ������� ����� ����������� � ������������ �������� (��� ��������) ���������� � ������� ��������,
// ���������� �������. �������� ���������� ����� ������� � Map.
// ��������: �������� �����, ��������������� ������������ ��������:
// 1 - ���
// 2 - ����� ��
// 3 - ������������ �������
// 4 - ���� �
// ����� ����� ��������� ����������� �������� ��� ��������� ���������,
// ��������� ��������� ���������� ����� ����� � Map.
// ������������� �������� �� ��������������� ��������� � ������� ���������� �� ��������.
// ������ ����� ��� ������ ������� �� ��� �����������
// P.S. ������ ������ ������ � ����� ��������

import java.util.*;

public class Noutbuk {
    private int osu;
    private int zd;
    private String os;
    private String color;
    private String madeIn;

    public Noutbuk(int osu, int zd, String os, String color, String madeIn) {
        this.osu = osu;
        this.zd = zd;
        this.os = os;
        this.color = color;
        this.madeIn = madeIn;
    }

    public int getOsu() {
        return osu;
    }

    public int getZd() {
        return zd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    @Override
    public String toString() {
        return "osu: " + osu + ", zd: " + zd + ", os: " + os + ", color: " + color + ", madeIn: " + madeIn;
    }

    public static void main(String[] args) {
        System.out.println("\n ~����� ���������� � ������� �������!~");
        Noutbuk nout1 = new Noutbuk(2, 128, "Linux", "White", "China");
        Noutbuk nout2 = new Noutbuk(4, 256, "Windows", "Grey", "USA");
        Noutbuk nout3 = new Noutbuk(6, 500, "Ubuntu", "black", "Great Britain");
        Noutbuk nout4 = new Noutbuk(8, 750, "Fedora", "blue", "Japan");
        Noutbuk nout5 = new Noutbuk(16, 500, "Solaris", "gold", "Indonesia");

        System.out.println("\n�������� ���������:");
        System.out.println(nout1);
        System.out.println(nout2);
        System.out.println(nout3);
        System.out.println(nout4);
        System.out.println(nout5);
        
        Set<Noutbuk> nouts = new HashSet<>();
        nouts.add(nout1);
        nouts.add(nout2);
        nouts.add(nout3);
        nouts.add(nout4);
        nouts.add(nout5);

        mainMenu(nouts);
    }

    static void mainMenu(Set<Noutbuk> nouts) {

        System.out.println("\n����");
        System.out.println("1: osu");
        System.out.println("2: zd");
        System.out.println("3: os");
        System.out.println("4: color");
        System.out.println("5: madeIn");
        System.out.println("6: �����");
        System.out.print("������� ����� ��������� ��������� ������ ��� �������: ");

        Scanner sc = new Scanner(System.in);
        String numb = sc.nextLine();
        if (numb == "6") {
            System.out.println("\n ~���� ���� ������!~\n");
            sc.close();
            return;
        }

        Map<String, String> variation = new HashMap<>(); // ������ �������� ��������� ���������
        
        if (numb != "6") {
            for (int i = 0; i < numb.length(); i++) {
                if (numb.charAt(i) == '1') {
                    System.out.print("������� ����������� �������� osu: ");
                    String numb1 = sc.nextLine();
                    variation.put("osu", numb1);
                }
                if (numb.charAt(i) == '2') {
                    System.out.print("������� ����������� �������� zd: ");
                    String numb2 = sc.nextLine();
                    variation.put("zd", numb2);
                }
                if (numb.charAt(i) == '3') {
                    System.out.print("������� �������� os: ");
                    String numb3 = sc.nextLine();
                    variation.put("os", numb3);
                }
                if (numb.charAt(i) == '4') {
                    System.out.print("������� �������� color: ");
                    String numb4 = sc.nextLine();
                    variation.put("color", numb4);
                }
                if (numb.charAt(i) == '5') {
                    System.out.print("������� �������� madeIn: ");
                    String numb5 = sc.nextLine();
                    variation.put("madeIn", numb5);
                }
            }
            System.out.println("�������� ���������:\n" + variation);

            System.out.println();
            // ������ �� ��������� �� ������ nouts �� ���������� ����������:
            for (Noutbuk nout: nouts){
                int count = 1;
                for (Map.Entry<String, String> entry: variation.entrySet()){
                    if (entry.getKey().equalsIgnoreCase("osu")) {
                        if (nout.getOsu() < Integer.parseInt(entry.getValue())) {
                            break;
                        }
                        count++;
                    }
                    if (entry.getKey().equalsIgnoreCase("zd")) {
                        if (nout.getZd() < Integer.parseInt(entry.getValue())) {
                            break;
                        }
                        count++;
                    }
                    if (entry.getKey().equalsIgnoreCase("os")) {
                        if (!(nout.getOs().equalsIgnoreCase(entry.getValue()))) {
                            break;
                        }
                        count++;
                    }
                    if (entry.getKey().equalsIgnoreCase("color")) {
                        if (!(nout.getOs().equalsIgnoreCase(entry.getValue()))) {
                            break;
                        }
                        count++;
                    }
                    if (entry.getKey().equalsIgnoreCase("madeIn")) {
                        if (!(nout.getOs().equalsIgnoreCase(entry.getValue()))) {
                            break;
                        }
                        count++;
                    }
                    if (count == variation.size()) {
                        System.out.println(nout);
                    }
                    
                }
            }
        }
    }
}

