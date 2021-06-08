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
    Label3.Text("W pierwszej kolejności należy ocenić miejsce zdarzenia poprzez sprawdzenie możliwych zagrożeń dla ratownika, osoby ratowanej i osób trzecich oraz zabezpieczenie"+"miejsca zdarzenia jak również własnej osoby (założenie rękawiczek). Gdy jest już bezpiecznie można przystąpić do udzielania pierwszej pomocy.\n\n Do udzielenia pierwszej pomocy zobowiązany jest każdy człowiek. Reguluje to Art. 162 Kodeksu Karnego „Kto człowiekowi znajdującemu się w położeniu grożącym bezpośrednim niebezpieczeństwem utraty życia, ciężkiego uszkodzenia ciała lub ciężkiego rozstroju zdrowia, nie udziela pomoc , mogąc ją udzielić bez narażania siebie i innej osoby na niebezpieczeństwo utraty życia lub poważnemu uszczerbku na zdrowiu, podlega karze pozbawienia wolności do lat trzech.\n \n    Każda osoba może być świadkiem bądź uczestnikiem zdarzenia, w którym zdrowie lub życie człowieka jest zagrożone. W takich sytuacjach liczy się CZAS podjęcia czynności ratunkowych. W ratownictwie wyznacznikiem tego czasu jest Złota godzinna, czyli jest to czas od momentu zaistniałego zdarzenia do momentu udzielenia specjalistycznej pomocy we właściwym szpitalu. Nie powinna przekraczać 60 minut. Złota godzina do każdego zdarzenia jest inna i zależy od stanu ciężkości osoby poszkodowanej. Czas jest mierzony tempem przemian metabolicznych, które zachodzą w organizmie poszkodowanego. Im uraz jest większy to spirala śmierci rozwija się szybciej.\n\n Aby udoskonalić szybkość reakcji w udzielaniu pomocy został stworzony łańcuch przeżycia. Składa się on z 5 ogniw, które są od siebie zależne. Kolejność ogniw jest kluczowa, gdyż pominięcie któregoś z nich może wpłynąć negatywnie na stan osoby poszkodowanej. Prawidłowa kolejność, jakość i czas reakcji decyduje na dalszym losie osoby poszkodowanej. W skład łańcucha przeżycia wchodzi:"
    +"\n- natychmiastowe rozpoznanie warunków zagrażających życiu (zatrzymanie krążenia) i wezwanie pomocy;\n - niezwłoczne podjęcie się resuscytacji krążeniowo-oddechowej;"
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
    Label5.Text("Łańcuch przeżycia");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.Height(240);
    Label4.Width(325);
    Label4.Text("\nWZYWANIE POMOCY \n Jeśli potrzebujesz natychmiastowej pomocy, bo zagrożone jest Twoje lub czyjeś życie, należy zadzwonić: \n Numer Alarmowy 112,\nPogotowie Ratunkowe - 999, \n Straż Pożarna - 998 \n Policja - 997 \n Poniżej w tabeli znajduje się poprawna kolejność zgłaszania zdarzenia oraz co należy dokładnie podać dyspozytorowi numeru ratunkowego. Pamiętaj też, aby samemu się NIGDY nie rozłączać jako pierwszy.");
    Image5 = new Image(VerticalScrollArrangement1);
    Image5.Height(270);
    Image5.Width(320);
    Image5.Picture("jakwezwacpomoc.png");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}