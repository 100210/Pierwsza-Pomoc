package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
class Screen4 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private Label Label1;
  private Image Image1;
  private TableArrangement TableArrangement1;
  private Label Label2;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Image Image3;
  private Label Label3;
  private Image Image4;
  private Label Label5;
  private Label Label4;
  private Image Image5;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen4");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1015);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Image2 = new Image(HorizontalArrangement1);
    Image2.Height(-1014);
    Image2.Width(-1020);
    Image2.Picture("unnamed.png");
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(27);
    Label1.Height(-1014);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("PIERWSZA\n POMOC");
    Image1 = new Image(HorizontalArrangement1);
    Image1.Height(-1014);
    Image1.Width(-1020);
    Image1.Picture("logo2.png");
    TableArrangement1 = new TableArrangement(this);
    TableArrangement1.Height(-1010);
    TableArrangement1.Width(LENGTH_FILL_PARENT);
    TableArrangement1.Rows(1);
    Label2 = new Label(TableArrangement1);
    Label2.Column(0);
    Label2.FontBold(true);
    Label2.FontSize(22);
    Label2.Height(-1010);
    Label2.Width(-1098);
    Label2.Row(0);
    Label2.Text("OCENA MIEJSCA ZDARZENIA");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(100);
    Image3.Width(320);
    Image3.Picture("bezpieczenstwo.jpg");
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.Height(980);
    Label3.Width(310);
    Label3.Text("W pierwszej kolejno??ci nale??y oceni?? miejsce zdarzenia poprzez sprawdzenie mo??liwych zagro??e?? dla ratownika, osoby ratowanej i os??b trzecich oraz zabezpieczenie"+"miejsca zdarzenia jak r??wnie?? w??asnej osoby (za??o??enie r??kawiczek). Gdy jest ju?? bezpiecznie mo??na przyst??pi?? do udzielania pierwszej pomocy.\n\n Do udzielenia pierwszej pomocy zobowi??zany jest ka??dy cz??owiek. Reguluje to Art. 162 Kodeksu Karnego ???Kto cz??owiekowi znajduj??cemu si?? w po??o??eniu gro????cym bezpo??rednim niebezpiecze??stwem utraty ??ycia, ci????kiego uszkodzenia cia??a lub ci????kiego rozstroju zdrowia, nie udziela pomoc , mog??c j?? udzieli?? bez nara??ania siebie i innej osoby na niebezpiecze??stwo utraty ??ycia lub powa??nemu uszczerbku na zdrowiu, podlega karze pozbawienia wolno??ci do lat trzech.\n \n    Ka??da osoba mo??e by?? ??wiadkiem b??d?? uczestnikiem zdarzenia, w kt??rym zdrowie lub ??ycie cz??owieka jest zagro??one. W takich sytuacjach liczy si?? CZAS podj??cia czynno??ci ratunkowych. W ratownictwie wyznacznikiem tego czasu jest Z??ota godzinna, czyli jest to czas od momentu zaistnia??ego zdarzenia do momentu udzielenia specjalistycznej pomocy we w??a??ciwym szpitalu. Nie powinna przekracza?? 60 minut. Z??ota godzina do ka??dego zdarzenia jest inna i zale??y od stanu ci????ko??ci osoby poszkodowanej. Czas jest mierzony tempem przemian metabolicznych, kt??re zachodz?? w organizmie poszkodowanego. Im uraz jest wi??kszy to spirala ??mierci rozwija si?? szybciej.\n\n Aby udoskonali?? szybko???? reakcji w udzielaniu pomocy zosta?? stworzony ??a??cuch prze??ycia. Sk??ada si?? on z 5 ogniw, kt??re s?? od siebie zale??ne. Kolejno???? ogniw jest kluczowa, gdy?? pomini??cie kt??rego?? z nich mo??e wp??yn???? negatywnie na stan osoby poszkodowanej. Prawid??owa kolejno????, jako???? i czas reakcji decyduje na dalszym losie osoby poszkodowanej. W sk??ad ??a??cucha prze??ycia wchodzi:"
    +"\n- natychmiastowe rozpoznanie warunk??w zagra??aj??cych ??yciu (zatrzymanie kr????enia) i wezwanie pomocy;\n - niezw??oczne podj??cie si?? resuscytacji kr????eniowo-oddechowej;"
    +"\n - wczesna defibrylacja;"
    +"\n - efektywne zaawansowane zabieg resuscytacyjne;"
    +"\n -odpowiednia opieka poresuscytacyjna. ");
    Image4 = new Image(VerticalScrollArrangement1);
    Image4.Height(70);
    Image4.Width(320);
    Image4.Picture("lancuch.jpg");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.FontBold(true);
    Label5.Height(17);
    Label5.Width(300);
    Label5.Text("??a??cuch prze??ycia");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.Height(240);
    Label4.Width(325);
    Label4.Text("\nWZYWANIE POMOCY \n Je??li potrzebujesz natychmiastowej pomocy, bo zagro??one jest Twoje lub czyje?? ??ycie, nale??y zadzwoni??: \n Numer Alarmowy 112,\nPogotowie Ratunkowe - 999, \n Stra?? Po??arna - 998 \n Policja - 997 \n Poni??ej w tabeli znajduje si?? poprawna kolejno???? zg??aszania zdarzenia oraz co nale??y dok??adnie poda?? dyspozytorowi numeru ratunkowego. Pami??taj te??, aby samemu si?? NIGDY nie roz????cza?? jako pierwszy.");
    Image5 = new Image(VerticalScrollArrangement1);
    Image5.Height(270);
    Image5.Width(320);
    Image5.Picture("jakwezwacpomoc.png");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}