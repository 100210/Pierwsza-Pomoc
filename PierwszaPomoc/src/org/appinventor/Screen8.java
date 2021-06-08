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
class Screen8 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private Label Label1;
  private Image Image1;
  private TableArrangement TableArrangement1;
  private Label Label2;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Label3;
  private Image Image3;
  private Label Label4;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen8");
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
    TableArrangement1.Columns(1);
    TableArrangement1.Height(-1010);
    TableArrangement1.Width(-1098);
    TableArrangement1.Rows(1);
    Label2 = new Label(TableArrangement1);
    Label2.Column(0);
    Label2.FontBold(true);
    Label2.FontSize(22);
    Label2.Height(-1009);
    Label2.Width(-1098);
    Label2.Row(0);
    Label2.Text("URAZY");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.Height(1520);
    Label3.Width(310);
    Label3.Text("Uraz może powstać z powodu różnych przyczyn np. zadziałanie czynnika elektrycznego, termicznego czy mechanicznego. Następuje wtedy uszkodzenie w obszarze komórek, tkanek oraz narządów. Uraz powstaje poprzez zadziałanie energii zewnętrznej powodującej uszkodzenie. Na skutek urazu mechanicznego może nastąpić uszkodzenie narządu ruchu. Uszkodzenie zależy od tego w jakim stopniu doszło do urazu, w jaki miejscu oraz jakiego rodzaju zaszły zmiany. Mechaniczne pourazowe urazy"
    +"możemy podzielić na, zwichnięcia, skręcenia, złamania oraz stłuczenia. \n\n Zwichnięcie powstaje na skutek zadziałanie dużego urazu. Jest to pourazowe uszkodzenie stawu, w której dochodzi do całkowitej utraty łączności powierzchni stawowych. Należy zabezpieczyć kończynę przed ruchem poprzez unieruchomienie. I zgłosić się do specjalisty w celu nastawienia zwichniętego stawu.\n\n"
    +"Skręcenie powstaje wskutek naderwania i naciągnięcia aparatu więzadłowo-torebkowego stawu. Zostaje zachowana ruchomość, ale uwidoczniają się zniekształcenia w obrębie stawu. Postępowanie ratownicze polega na zabezpieczeniu stawu poprzez unieruchomienie go i co najmniej dwóch sąsiadujących kości.\n\n"
    +"Złamanie jest to przerwanie ciągłości tkanki kostnej na skutek zadziałania ogromnej siły. Można podzielić je na złamanie otwarte i złamanie zamknięte. W celu zabezpieczenia złamania stosuje się zasadę Potta, czyli należy unieruchomić uszkodzoną kość oraz co najmniej dwa sąsiadujące stawy.\n\n"
    +"Jednym z poważnych urazów ciała jest amputacja. Najczęściej jest ona następstwem wypadków w pracy głównie w rolnictwie czy na budowie, a także wypadków komunikacyjnych. Osoba poszkodowana u której doszło do amputacji może gwałtownie krwawić, dlatego szybko powinno się zatamować krwawienie. Amputacje dzieli się na całkowitą i niecałkowitą. Podczas amputacji niecałkowitej musimy zabezpieczyć i unieruchomić daną część ciała, tak aby udało się zachować pozostałe krążenie, gdyż jest szansa na operacyjne odtworzenie ciągłości części ciała. Gdy mamy do czynienia z amputacją całkowitą należy zabezpieczyć kikuta jak również amputowaną część ciał. Należy to uczynić w następujący sposób:\n\n"
    +"1. owinąć amputowaną część ciała jałową gazą;\n"
    +"2. umieścić w plastikowym worku;\n"
    +"3. dany worek włożyć do kolejnego worka, w którym znajduje się woda z kostkami lodu.\n\n"
    +"Prawidłowe zabezpieczenie amputowanej części spowalnia procesy metaboliczne co wpływa na zwiększenie czasu żywotność tej części i umożliwia wykonanie skutecznej reimplantacji.\n\n Kolejnym ciężkim urazem jest ciało obce wbite w ciało. Należy pamiętać ze pod żadnym pozorem nie można wyciągać ciała obcego z rany gdyż możemy uszkodzić naczynia i może dojść do krwotoku. Należy jedynie zabezpieczyć ciało obce przed przemieszczaniem się. Można to uczynić poprzez stabilizacje ciała obcego przykładają zwinięte bandaże obok i zawinięcie. Sposób zaopatrzenia został przedstawiony poniżej. Następnie specjalista w warunkach klinicznych usunie ciało obce.");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(160);
    Image3.Width(320);
    Image3.Picture("cialoobce.png");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.Height(17);
    Label4.Width(310);
    Label4.Text("Ciało obce w ranie");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}