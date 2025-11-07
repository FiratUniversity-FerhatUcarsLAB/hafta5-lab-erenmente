/*
 * Ad Soyad: [Muhammet Eren Mente]
 * Ogrenci No: [250542026]
 * Tarih: [07/11/2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // METOT 0: Yazdırma
    public static void sonucuYazdir(String etiket, double deger) {

        System.out.printf("%-10s: %.2f cm\n", etiket, deger);

    }

    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar

        double kareAlan = side * side;
        return kareAlan; // Degistirin

    }

    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar

        double kareCevre = 4 * side;
        return kareCevre; // Degistirin

    }

    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik

        double dikdörtgenAlan = width * height;
        return dikdörtgenAlan; // Degistirin

    }

    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)

        double dikdörtgenCevre = 2 * (width + height);
        return dikdörtgenCevre; // Degistirin

    }

    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz

        double daireAlan = Math.PI * Math.pow(radius, 2);
        return daireAlan; // Degistirin

    }

    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r

        double daireCevre = Math.PI * radius * 2;
        return daireCevre; // Degistirin

    }

    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2

        double ucgenAlan = (base * height) / 2;

        return ucgenAlan; // Degistirin
    }

    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c

        double cevre = a + b + c;

        return cevre; // Degistirin
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();

        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();

        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();

        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();

        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir

        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        // Alan ve cevre yazdir
        sonucuYazdir("Kare'nin alani: ", calculateSquareArea(squareSide));
        sonucuYazdir("Kare'nin Çevresi: ", calculateSquarePerimeter(squareSide));

        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        // Alan ve cevre yazdir
        sonucuYazdir("Dikdörtgen'in alani: ", calculateRectangleArea(rectWidth, rectHeight));
        sonucuYazdir("Dikdörtgen'in Çevresi: ", calculateRectanglePerimeter(rectWidth, rectHeight));

        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        // Alan ve cevre yazdir
        sonucuYazdir("Daire'nin alani: ", calculateCircleArea(radius));
        sonucuYazdir("Daire'nin Çevresi: ", calculateCircleCircumference(radius));

        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        // Alan ve cevre yazdir
        sonucuYazdir("Üçgen'in alani: ", calculateTriangleArea(base, height));
        sonucuYazdir("Üçgen'in Çevresi: ", calculateTrianglePerimeter(side1, side2, side3));

        System.out.println("========================================");

        input.close();
    }
}
