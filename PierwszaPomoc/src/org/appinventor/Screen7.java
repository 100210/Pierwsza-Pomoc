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
class Screen7 extends Form implements HandlesEventDispatching {
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
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen7");
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
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(-1098);
    Label2.Row(0);
    Label2.Text("RANY");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.Height(2150);
    Label3.Width(310);
    Label3.Text("Rany najeżą do najczęstszych obrażeń w codziennym życiu. Rana to wszystkie uszkodzenia tkanek, którym towarzyszy przerwanie ciągłości powłok ciała. Powstaje ona wskutek działanie niskiej lub wysokiej temperatury, urazu mechanicznego czy substancji chemicznej.\n\n Rany można podzielić ze względu na charakter otworów zewnętrznych na:"
    +"\n- rany o brzegach regularnych (gładkich)- kłute, rąbane, cięte;  "
    +"\n- rany o brzegach nieregularnych- miażdżone, szarpane, zatrute, tłuczone, kąsane;   "
    +"\n- rany postrzałowe- ślepe, styczne, przestrzałowe.\n\n  "
    +"Postępowanie ratownicze polega na tym aby zwrócić uwagę czy rana krwawi czy też nie. Jeśli rana nie krwawi należy założyć opatrunek jałowy osłonowy. Natomiast gdy rana krwawi należy zatamować wypływ krwi poprzez założenie opatrunku uciskowego.\n\n Krwotok to przerwanie ciągłości naczyń krwionośnych w zamkniętym układnie krążenia.\n\n  "
    +"Krwotok możemy podzielić ze względu na:                                                                                                                                                                                                                                                                                                            "
    +"\n~miejsce występowania:                                                                                                                                                                                                                                                                                                                            "
    +"\n- wewnętrzny- wypływ krwi występuje wewnątrz ciała;                                                                                                                                                                                                                                                                                                "
    +"\n- zewnętrzny– wypływ krwi występuje z rany na zewnątrz;                                                                                                                                                                                                                                                                                             "
    +"\n-pośredni- wypływ krwi ma miejsce wewnątrz organizmu lecz wydostaje się na zewnątrz poprzez naturalne otwory ciała;                                                                                                                                                                                                                                  "
    +"\n\n~ rodzaj naczynia:                                                                                                                                                                                                                                                                                                                                  "
    +"\n- tętniczy- utlenowana, jasnoczerwona krew wypływająca szybko, pulsacyjnie i pod dużym ciśnieniem z naczynia tętniczego;        "
    +"\n- żylny– nieutlenowana, ciemnoczerwona krew wypływająca powoli z naczynia żylnego;                                               "
    +"\n- włośniczkowy- krew wypływa z cienkościennego, drobnego naczynia krwionośnego.\n\n                                               "
    +"Priorytetowym postępowaniem w krwotokach jest ich zatamowanie poprzez wykonanie bezpośredniego ucisku na ranę, czy też założenie opatrunku uciskowego, a w ostateczności użycie opaski uciskowej powyżej rany.\n\nOdmrożenie jest czasowe lub nieodwracalne uszkodzenie skóry (tkanek powłoki właściwej), powstające w wyniku działania na nią niskiej temperatury. Ciężkość i rozległość uszkodzenia skóry zależą od temperatury otoczenia oraz czasu, w jakim skóra była poddana działaniu niskiej temperatury. Wiatr i duża wilgotność powietrza nasilają skutki działania mrozu. Zmiany w naczyniach krwionośnych, spowodowane spożyciem dużej ilości alkoholu, powodują u poszkodowanych ciężkie odmrożenia, często przyczyniając się do nadmiernego wychłodzenia ciała i w wyniku tego śmierci. Miejsca szczególnie narażone na odmrożenie to: nos, uszy, policzki oraz palce rąk i stóp.\n\nGłębokość odmrożenia"+
    "Ciężkość odmrożenia, podobnie jak oparzenia, określa się w stopniach.    "
    +"\n\n     "
    +"I stopień charakteryzuje się przejściowymi zaburzeniami w krążeniu krwi w skórze, bólem, często silnym, bladością lub sinoczerwonym zabarwieniem skóry, obrzękiem, pieczeniem i świądem skóry,\n\n    "
    +"II stopień odmrożenia to pojawiające się na skórze pęcherze z płynem surowiczym,\n\n           "
    +"III stopień – martwica powierzchowna skóry,\n\n     "
    +"IV stopień – martwica głęboka, której ulegają np. palce, uszy lub nos. W takim przypadku może dojść do samoistnej amputacji odmrożonej części ciała.\n\n Pierwsza pomoc w przypadku odmrożenia, szczególnie gdy odmrożona część ciała jest jeszcze blada, obejmuje możliwe szybkie przywrócenie w niej krążenia krwi. W tym celu stosujemy szybkie ogrzanie zaatakowanej kończyny w coraz wyższej temperaturze lub ogrzewanie ręcznikami. Ogrzewanie należy rozpocząć wodą o temperaturze 25–30°C, aby po kilkunastu minutach zwiększyć ją aż do 38–40°C. Tego rodzaju postępowanie należy stosować do czasu, gdy tkanki uzyskają odpowiednią temperaturę.        "
    +"W trakcie ogrzewania odmrożonych części ciała może pojawić się nieprzyjemne uczucie mrowienia i pieczenia (niekiedy bardzo boleśne). Po kąpieli można odmrożone miejsca delikatnie nacierać małą ilością 70 proc. alkoholu etylowego aż do momentu, gdy skóra stanie się różowa. Następnie zaleca się założenie jałowego opatrunku z grubą warstwą waty. Z tak ciepło owiniętymi kończynami chory powinien zostać przetransportowany do szpitala.\n\n       "
    +"Uwaga! Nie wolno nacierać odmrożonych fragmentów ciała śniegiem lub zimną wodą, ponieważ może to spowodować więcej negatywnych skutków niż pożytku na skutek uszkodzenia zmarzniętych tkanek. W przypadku odmrożeń zaleca się również spożywanie ciepłych napojów/wodnistych pokarmów. ");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(190);
    Image3.Width(320);
    Image3.Picture("odmrozenie.jpg");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.Height(17);
    Label4.Width(310);
    Label4.Text("Stopnie Odmrożenia");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.Height(1470);
    Label5.Width(310);
    Label5.Text("\nOparzenie jest to uszkodzenie skóry i w zależności od stopni oparzenia także głębiej położonych tkanek lub narządów wskutek działania ciepła, żrących substancji chemicznych (stałych, płynnych, gazowych), prądu elektrycznego, promieni słonecznych – UV, promieniowania (RTG, UV i innych ekstremalnych czynników promiennych). Przy rozległych oparzeniach ogólnoustrojowy wstrząs może doprowadzić do zgonu.\n\n Głębokości oparzenia dzielimy na:   "
    +"\n"
    +"I stopnień- obejmuje naskórek, a jego objawami klinicznymi są zaczerwienienie skóry i niewielki obrzęk. Zmiany są silnie bolesne. Po 2-3 dniach zmianom skórnym towarzyszy silne swędzenie. Oparzenia te goją się szybko, w ciągu kilku dni. Powstają najczęściej na skutek krótkotrwałego działania pary wodnej, niezbyt gorącej wody lub w wyniku przedłużonej ekspozycji na słońce.\n\n II stopnień- dzielimy je na oparzenia powierzchowne i głębokie.\n\n      "
    +"~ II stopnia powierzchowne (II a) – obejmuje naskórek i część skóry właściwej. W obrazie klinicznym tego oparzenia, oprócz zaczerwienienia i obrzęku, pojawiają się pęcherze wypełnione surowiczym płynem. Pokrywę pęcherzy tworzy martwy naskórek, który unosi się do góry pod wpływem gromadzącego się pod nim płynu tkankowego. Tym oparzeniom towarzyszy silna bolesność. Oparzenie to goi się w ciągu 10-21 dni. Do powstania oparzenia IIa dochodzi zwykle po oblaniu powierzchni skóry wrzątkiem, gorącym olejem lub po kontakcie skóry z parą wodną."
    +"\n\n ~ II stopnia głębokie (II b) – obejmuje naskórek i pełną grubość skory właściwej. W obrazie tego oparzenia stwierdza się biało zabarwioną skórę z czerwonymi punktami w okolicy mieszków włosowych. Dochodzi do uszkodzenia zakończeń nerwowych co zmniejsza bolesność. Oparzenie to goi się w ciągu kilku tygodni."
    +"\n \nIII stopnień - obejmuje całą grubość skóry właściwej z naczyniami, nerwami skórnymi i podskórną tkanką tłuszczową. Skóra ma zabarwienie perłowo-białe lub brunatne, jest twarda i wysuszona. Bolesność jest nieznaczna. Z okolicy objętej oparzeniem można łatwo usunąć włosy. Oparzenie to goi się bardzo długo i na ogół wymaga przeszczepu skóry."
    +"\n\n IV stopnień- obejmuje jeszcze niżej położone tkanki tj. mięśnie, ścięgna, kości. W najcięższych przypadkach występuje zwęglenie oparzonej części ciała. Bolesność jest nieznaczna.\n\n Pierwszą pomocą przy oparzeniach, niezależnie od rodzaju oparzenia, powinno być jak najszybsze schłodzenie oparzonej powierzchni pod zimną, bieżącą wodą przez około 20 minut lub do ustania bólu. W przypadku kontaktu z powierzchnią oparzoną należy używać rękawiczek. Jeżeli oparzenie dotyczy jamy ustnej zaleca się płukanie zimną wodą lub ssanie kostek lodu. Należy pamiętać, że chłodzenie oparzonych obszarów może powodować dreszcze. Chłodzenie jest tym bardziej skuteczne, im szybciej jest zastosowane od momentu oparzenia. W sytuacji gdy dochodzi do oparzenia skóry dłoni przed chłodzeniem oparzonej powierzchni należy zdjąć biżuterię. Po schłodzeniu należy założyć na oparzone miejsce jałowy opatrunek. Można także stosować opatrunki hydrożelowe, które nie przyklejają się do ran i przyspieszają gojenie.");
    Image4 = new Image(VerticalScrollArrangement1);
    Image4.Height(140);
    Image4.Width(320);
    Image4.Picture("stopnie-oparzenia.jpg");
    Label6 = new Label(VerticalScrollArrangement1);
    Label6.FontBold(true);
    Label6.Height(17);
    Label6.Width(310);
    Label6.Text("Stopnie Oparzeń");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}