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
class Screen9 extends Form implements HandlesEventDispatching {
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
  private Label Label5;
  private Image Image4;
  private Label Label6;
  private Label Label7;
  private Image Image5;
  private Label Label8;
  private Label Label9;
  private Image Image6;
  private Label Label10;
  private Label Label11;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen9");
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
    Label2.Height(-1010);
    Label2.Width(-1098);
    Label2.Row(0);
    Label2.Text("STANY NAGŁE");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.Height(545);
    Label3.Width(310);
    Label3.Text("Stany nagłe, czyli sytuacje, które wystąpiły w nieoczekiwanym momencie, są gwałtowne i nie były możliwe do przewidzenie. Przykładem stanu nagłego jest np. padaczka, zawał, wstrząs, udar, porażenie prądem. \n\n Padaczka (epilepsja) jest to przewlekłe zaburzenie pracy mózgu, charakteryzuje się nawracającymi napadami drgawek, którym może towarzyszyć utrata przytomności. Zazwyczaj padaczka jest samoistna, ale może być również wywołana poprzez alkohol, leki, stres, urazy głowy. Napady drgawek są nagłe. Najpierw osoba poszkodowana traci przytomność i upada potem następuje napięcie całego ciała i występują niekontrolowane ruchy kończyn, głowy i tułowia.\n\n Postępowanie podczas wystąpienia ataku drgawek, należy u osoby poszkodowanej zabezpieczyć głowę, aby nie doznała dodatkowego urazu. Nie wolno krępować ruchów ciała. Zabronione jest również wkładanie ciał obcych miedzy zęby, bo może dojść do niedrożności dróg oddechowych. Po ustąpieniu drgawek należy sprawdzić parametry życiowe poszkodowanego i ułożyć go w pozycji bocznej bezpiecznej. Po napadzie drgawek osoba będzie zmęczona i splątana. Nie budź jej i zapewnij spokój kontrolując parametry życiowe.\n");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(140);
    Image3.Width(320);
    Image3.Picture("padaczka.png");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.Height(17);
    Label4.Width(310);
    Label4.Text("Postępowanie Podczas Padaczki");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.Height(880);
    Label5.Width(310);
    Label5.Text("\nWstrząs jest „stanem niewystarczającego do aktualnego zapotrzebowania dostarczenia tleniu i innych substancji odżywczych do tkanek lub ich nieprawidłowego przez te tkanki przyswajania”.\n\n Wstrząs ze względu mechanizmu powstania dzielimy na:"
    +"\n- kardiogenny;"
    +"\n- anafilaktyczny;"
    +"\n- septyczny;"
    +"\n- hipowolemiczny;"
    +"\n- neurogenny\n\nWstrząs objawia się:\n"
    +"\n- chłodną, bladą wilgotną skórą;"
    +"\n- osłabienie, zawroty głowy, senność;"
    +"\n- nudności;"
    +"\n- pocenie się;"
    +"\n- ból;"
    +"\n- wzmożone pragnienie;"
    +"\n- zmniejszenie oddawania moczu;"
    +"\n- szybki płytki oddech;"
    +"\n- szybkie słabe tętno;"
    +"\n- utrata przytomności;"
    +"\n- zaburzenia rytmu serca, zatrzymanie krążenia.\n\n"
    +"Postępowanie ratownicze polega przede wszystkim na natychmiastowym wezwaniu pomocy specjalistycznej. Następnie usunąć przyczynę wstrząsu (zatamować masywne krwawienia, zaopatrzyć złamania). Należy rozluźnić krępujące części garderoby, ulżyć poszkodowanego w pozycji przeciwwstrząsowej (na twardym podłożu z głową ułożoną niżej niż tułów i z uniesionymi kończynami dolnymi na ok 30cm).");
    Image4 = new Image(VerticalScrollArrangement1);
    Image4.Height(100);
    Image4.Width(320);
    Image4.Picture("pozycjaprzeciwwstrzasowa.png");
    Label6 = new Label(VerticalScrollArrangement1);
    Label6.FontBold(true);
    Label6.Height(17);
    Label6.Width(310);
    Label6.Text("Pozycja Przeciwwstrząsowa");
    Label7 = new Label(VerticalScrollArrangement1);
    Label7.Height(440);
    Label7.Width(310);
    Label7.Text("\nZawał martwica mięśnia sercowego spowodowana jego niedokrwieniem wskutek zamknięcia tętnicy wieńcowej doprowadzającej krew do serca. Zawał może być spowodowany miażdżycą naczyń wiecowych, cukrzycą, otyłością, nadciśnieniem tętniczym czy paleniem tytoniu. \n\n Charakterystyczny objaw zawału to silny, piekący lub gniotący ból w klatce piersiowej promieniujący do szyi, lewego ranienia bądź brzucha. Objawy towarzyszące to duszność, bladość, poty, kołatanie serca, przyspieszenie bicia serca czy też nudności, omdlenie gorączka.\n\n       "
    +"Gdy pojawi się taki ból jak opisany powyżej należy niezwłocznie wezwać pogotowie. Poszkodowanego ułożyć w pozycji półsiedzącej z nieznacznie uniesionym tułowiem i rozluźnić ubranie. ");
    Image5 = new Image(VerticalScrollArrangement1);
    Image5.Height(150);
    Image5.Width(310);
    Image5.Picture("zawal.png");
    Label8 = new Label(VerticalScrollArrangement1);
    Label8.FontBold(true);
    Label8.Height(17);
    Label8.Width(310);
    Label8.Text("Pozycja Półsiedząca przy zawale");
    Label9 = new Label(VerticalScrollArrangement1);
    Label9.Height(710);
    Label9.Width(310);
    Label9.Text("\nUdar mózgu jest to nagłe wystąpienie ogniskowych zaburzeń czynności mózgu, które są spowodowane wyłącznie przyczynami naczyniowymi, związanymi z mózgowym. przepływem krwi, trwających dłużej niż 24h.\n\n Wyróżnia się dwa rodzaje udaru mózgu: krwotoczny i niedokrwienny. \n\n - Krwotoczny powstaje w wyniku powstaje w wyniku pęknięcia ściany tętnicy mózgowej i wylania krwi poza naczynie. \n\n- Niedokrwienny powstaje natomiast poprzez zatkania naczynia tętnicy dostarczającej krew do mózgu.\n\n Objawy udaru:\n   "
    +"- asymetria twarzy- opadnięty kącik ust;  "
    +"\n- osłabienie kończyn po jednej stronie;  "
    +"\n- zaburzenia widzenia;                    "
    +"\n- zaburzenia mowy;                         "
    +"\n- zaburzenie równowagi;                     "
    +"\n- nagły silny ból głowy\n\n Gdy wystąpi któryś z powyższych objawów należy jak najszybciej wezwać pogotowie ratunkowe. Wystąpieniu udaru czas ma kluczową role, ponieważ od 4,5h od wystąpienia pierwszych objawów są najważniejsze. Jeśli w tym czasie wdroży się leczenie trombolityczne jest duża szansa na uratowanie życia i ograniczenia niepełnosprawności. Dlatego przyjęto ze złota godzina udarowa wynosi 3-6godzin i w tym czasie osoba poszkodowana powinna się znaleźć w szpitalu, w którym jest oddział udarowy.");
    Image6 = new Image(VerticalScrollArrangement1);
    Image6.Height(180);
    Image6.Width(320);
    Image6.Picture("udar.png");
    Label10 = new Label(VerticalScrollArrangement1);
    Label10.FontBold(true);
    Label10.Height(17);
    Label10.Width(310);
    Label10.Text("Rodzaje udaru mózgu");
    Label11 = new Label(VerticalScrollArrangement1);
    Label11.Height(440);
    Label11.Width(310);
    Label11.Text("\nPorażanie prądem jest bardzo niebezpieczne, gdyż może spowodować ona szereg różnorodnych obrażeń tj. zdezorientowanie, rozległe oparzenia czy też zatrzymanie oddechu lub krążenia. Ciężkość objawów zależy od wielu czynników np. od natężenia i napięcia prądu, czasu przepływu prądu rażenia, powierzchnie styku przewodnictwa czy też drogi przepływu przez ciało poszkodowanego oraz impedancja organizmu.\n\n Aby udzielić pierwszej pomocy osobie poszkodowanej porażonej prądem w pierwszej kolejności należy odłączyć źródło napięcia . Gdy będzie już bezpiecznie można podejść do poszkodowanego i ocenić stan świadomości oraz parametrów życiowych (oddech, krążenie). Potem należy podjąć odpowiednie czynność w zależności od stanu osoby poszkodowanej.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}