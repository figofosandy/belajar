import java.util.Scanner;

//import javax.management.relation.RoleUnresolved;

public class FirstClass {
    public static void main(String[] args) {
        //String[] nama=new String[5];
        //nama[0]="Linda";
        //nama[1]="Santi";
        //nama[2]="Susan";
        //nama[3]="Mila";
        //nama[4]="Ayu";
        String[] nama={"Linda","Santi","Susan","Mila","Ayu"};
        System.out.println("nama teman "+nama[2]);
        for (int i=0; i<nama.length; i++) {
            System.out.println("Nama orang index ke-"+i+" : "+nama[i]);
        }
    /*Pengulangan While
        int i=1;
        while (i<=5) {
            System.out.print("Looping ke-"+i+" ");
            i++;
        }
        */
    /*pengulangan for
        for(int i=1;i<=5;i++) {
            System.out.print("looping ke-"+i+" ");
        }
        */    
    /*Ganjil/genap/nol
        System.out.println("Angka Genap/Ganjil/Nol");
        System.out.println("Masukkan Angka di bawah ini:");
        Scanner input=new Scanner(System.in);
        int pilihan=input.nextInt();
        if(pilihan%2==1) {
            System.out.println("Angka "+pilihan+" adalah bilangan ganjil");
        }
        else if(pilihan%2==0) {
            System.out.println("Angka "+pilihan+" adalah bilangan genap");
        }
        else {
            System.out.println("Angka "+pilihan+" adalah nol");
        }
        */
    /*switch conditional
        char grade='A';
        switch(grade) {
            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("Great");
                break;
            default:
                System.out.println("Perfect");
                break;
        }
        */
    /*if conditional
        int x=30;
        if (x<20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        */
    /*ops logika
        boolean a=true;
        boolean b=false;
        System.out.println("a && b = "+(a&&b));
        System.out.println("a || b = "+(a||b));
        System.out.println("a ! b = "+!(a&&b));
        System.out.println("! a = "+!a);
        System.out.println("! b = "+!b);
        */
    /*iseng
    char kondisi;
    int pilihan;
    Scanner sc=new Scanner(System.in);
        do {
        do {
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Lingkaran");
        System.out.println("Masukkan pilihan :");
        pilihan=sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Masukkan Alas :");
                    float alas=sc.nextFloat();
                    System.out.println("Masukkan Tinggi :");
                    float tinggi=sc.nextFloat();
                    System.out.println("Luas adalah :"+(alas*tinggi/2));
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Masukkan Panjang :");
                    float panjang=sc.nextFloat();
                    System.out.println("Masukkan Tinggi :");
                    float tinggi_persegi=sc.nextFloat();
                    System.out.println("Luas adalah :"+(panjang*tinggi_persegi));
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Masukkan Jari-jari :");
                    float jari=sc.nextFloat();
                    System.out.println("Luas adalah :"+(jari*jari*22/7));
                    break;
                default:
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.println("Masukkan input yg sesuai pilihan\n");
            }}
            while(pilihan!=1&&pilihan!=2&&pilihan!=3); {}
        do {
        System.out.println("\nApakah anda ingin mencoba lagi (y/n) :");
        kondisi=sc.next().charAt(0);
        
            switch(kondisi) {
                case 'y':
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    break;
                case 'n':
                    System.out.println("Terimakasih");
                    break;
                default:                
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();    
                    System.out.println("Masukkan input yg sesuai pilihan");
            }
        }
        while (kondisi!='y'&&kondisi!='n'); {}
    }
    while(kondisi=='y'); {}
    if(sc!=null){
        sc.close();
    }
        
        /*Perbandingan
        int angka1=1;
        int angka2=2;
        System.out.println("a==b ="+(angka1==angka2));
        System.out.println("a!=b ="+(angka1!=angka2));
        System.out.println("a>b ="+(angka1>angka2));
        System.out.println("a<b ="+(angka1<angka2));
        System.out.println("a>=b ="+(angka1>=angka2));
        System.out.println("a<=b ="+(angka1<=angka2));
        */
        /*Ops aritmetika
        int angka1,angka2,tambah,kurang,kali,bagi,modulus;
        angka1=20;
        angka2=5;
        tambah=angka1+angka2;
        kurang=angka1-angka2;
        kali=angka1*angka2;
        bagi=angka1/angka2;
        modulus=angka1%angka2;
        angka1++;
        angka2--;
        System.out.println("Hasil dari "+angka1+"+"+angka2+"="+tambah);
        System.out.println("Hasil dari "+angka1+"-"+angka2+"="+kurang);
        System.out.println("Hasil dari "+angka1+"*"+angka2+"="+kali);
        System.out.println("Hasil dari "+angka1+"/"+angka2+"="+bagi);
        System.out.println("Hasil dari modulus"+angka1+"%"+angka2+"="+modulus);
        System.out.println("Hasil dari increment dari 20="+angka1);
        System.out.println("Hasil dari decrement dari 5="+angka2);
        */
        /*tipe data
        char nilai='A';
        String kalimat="Hello World!";
        double angka=1.1234567890123456;
        float bilangan=5.123456f;
        int integer=1;
        boolean status=true;
        float b=(float)2.555;
        System.out.println(status);
        System.out.println("contoh interger"+integer);
        System.out.println(bilangan);
        System.out.println(angka);
        System.out.println(nilai);
        System.out.println(b);
        System.out.println(kalimat);
        */        
    }
}