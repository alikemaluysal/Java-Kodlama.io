public class Main {
    public static void main(String[] args) {
    OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
    ogretmenKrediManager.Hesapla();

    TarimKrediManager tarimKrediManager = new TarimKrediManager();
    KrediUI krediUI = new KrediUI();
    krediUI.KrediHesapla(ogretmenKrediManager);
    krediUI.KrediHesapla(new AskerKrediManager());
    }
}