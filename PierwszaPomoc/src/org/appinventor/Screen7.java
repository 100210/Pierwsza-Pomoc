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
    Label3.Text("Rany naje???? do najcz??stszych obra??e?? w codziennym ??yciu. Rana to wszystkie uszkodzenia tkanek, kt??rym towarzyszy przerwanie ci??g??o??ci pow??ok cia??a. Powstaje ona wskutek dzia??anie niskiej lub wysokiej temperatury, urazu mechanicznego czy substancji chemicznej.\n\n Rany mo??na podzieli?? ze wzgl??du na charakter otwor??w zewn??trznych na:"
    +"\n- rany o brzegach regularnych (g??adkich)- k??ute, r??bane, ci??te;  "
    +"\n- rany o brzegach nieregularnych- mia??d??one, szarpane, zatrute, t??uczone, k??sane;   "
    +"\n- rany postrza??owe- ??lepe, styczne, przestrza??owe.\n\n  "
    +"Post??powanie ratownicze polega na tym aby zwr??ci?? uwag?? czy rana krwawi czy te?? nie. Je??li rana nie krwawi nale??y za??o??y?? opatrunek ja??owy os??onowy. Natomiast gdy rana krwawi nale??y zatamowa?? wyp??yw krwi poprzez za??o??enie opatrunku uciskowego.\n\n Krwotok to przerwanie ci??g??o??ci naczy?? krwiono??nych w zamkni??tym uk??adnie kr????enia.\n\n  "
    +"Krwotok mo??emy podzieli?? ze wzgl??du na:                                                                                                                                                                                                                                                                                                            "
    +"\n~miejsce wyst??powania:                                                                                                                                                                                                                                                                                                                            "
    +"\n- wewn??trzny- wyp??yw krwi wyst??puje wewn??trz cia??a;                                                                                                                                                                                                                                                                                                "
    +"\n- zewn??trzny??? wyp??yw krwi wyst??puje z rany na zewn??trz;                                                                                                                                                                                                                                                                                             "
    +"\n-po??redni- wyp??yw krwi ma miejsce wewn??trz organizmu lecz wydostaje si?? na zewn??trz poprzez naturalne otwory cia??a;                                                                                                                                                                                                                                  "
    +"\n\n~ rodzaj naczynia:                                                                                                                                                                                                                                                                                                                                  "
    +"\n- t??tniczy- utlenowana, jasnoczerwona krew wyp??ywaj??ca szybko, pulsacyjnie i pod du??ym ci??nieniem z naczynia t??tniczego;        "
    +"\n- ??ylny??? nieutlenowana, ciemnoczerwona krew wyp??ywaj??ca powoli z naczynia ??ylnego;                                               "
    +"\n- w??o??niczkowy- krew wyp??ywa z cienko??ciennego, drobnego naczynia krwiono??nego.\n\n                                               "
    +"Priorytetowym post??powaniem w krwotokach jest ich zatamowanie poprzez wykonanie bezpo??redniego ucisku na ran??, czy te?? za??o??enie opatrunku uciskowego, a w ostateczno??ci u??ycie opaski uciskowej powy??ej rany.\n\nOdmro??enie jest czasowe lub nieodwracalne uszkodzenie sk??ry (tkanek pow??oki w??a??ciwej), powstaj??ce w wyniku dzia??ania na ni?? niskiej temperatury. Ci????ko???? i rozleg??o???? uszkodzenia sk??ry zale???? od temperatury otoczenia oraz czasu, w jakim sk??ra by??a poddana dzia??aniu niskiej temperatury. Wiatr i du??a wilgotno???? powietrza nasilaj?? skutki dzia??ania mrozu. Zmiany w naczyniach krwiono??nych, spowodowane spo??yciem du??ej ilo??ci alkoholu, powoduj?? u poszkodowanych ci????kie odmro??enia, cz??sto przyczyniaj??c si?? do nadmiernego wych??odzenia cia??a i w wyniku tego ??mierci. Miejsca szczeg??lnie nara??one na odmro??enie to: nos, uszy, policzki oraz palce r??k i st??p.\n\nG????boko???? odmro??enia"+
    "Ci????ko???? odmro??enia, podobnie jak oparzenia, okre??la si?? w stopniach.    "
    +"\n\n     "
    +"I stopie?? charakteryzuje si?? przej??ciowymi zaburzeniami w kr????eniu krwi w sk??rze, b??lem, cz??sto silnym, blado??ci?? lub sinoczerwonym zabarwieniem sk??ry, obrz??kiem, pieczeniem i ??wi??dem sk??ry,\n\n    "
    +"II stopie?? odmro??enia to pojawiaj??ce si?? na sk??rze p??cherze z p??ynem surowiczym,\n\n           "
    +"III stopie?? ??? martwica powierzchowna sk??ry,\n\n     "
    +"IV stopie?? ??? martwica g????boka, kt??rej ulegaj?? np. palce, uszy lub nos. W takim przypadku mo??e doj???? do samoistnej amputacji odmro??onej cz????ci cia??a.\n\n Pierwsza pomoc w przypadku odmro??enia, szczeg??lnie gdy odmro??ona cz?????? cia??a jest jeszcze blada, obejmuje mo??liwe szybkie przywr??cenie w niej kr????enia krwi. W tym celu stosujemy szybkie ogrzanie zaatakowanej ko??czyny w coraz wy??szej temperaturze lub ogrzewanie r??cznikami. Ogrzewanie nale??y rozpocz???? wod?? o temperaturze 25???30??C, aby po kilkunastu minutach zwi??kszy?? j?? a?? do 38???40??C. Tego rodzaju post??powanie nale??y stosowa?? do czasu, gdy tkanki uzyskaj?? odpowiedni?? temperatur??.        "
    +"W trakcie ogrzewania odmro??onych cz????ci cia??a mo??e pojawi?? si?? nieprzyjemne uczucie mrowienia i pieczenia (niekiedy bardzo bole??ne). Po k??pieli mo??na odmro??one miejsca delikatnie naciera?? ma???? ilo??ci?? 70 proc. alkoholu etylowego a?? do momentu, gdy sk??ra stanie si?? r????owa. Nast??pnie zaleca si?? za??o??enie ja??owego opatrunku z grub?? warstw?? waty. Z tak ciep??o owini??tymi ko??czynami chory powinien zosta?? przetransportowany do szpitala.\n\n       "
    +"Uwaga! Nie wolno naciera?? odmro??onych fragment??w cia??a ??niegiem lub zimn?? wod??, poniewa?? mo??e to spowodowa?? wi??cej negatywnych skutk??w ni?? po??ytku na skutek uszkodzenia zmarzni??tych tkanek. W przypadku odmro??e?? zaleca si?? r??wnie?? spo??ywanie ciep??ych napoj??w/wodnistych pokarm??w. ");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(190);
    Image3.Width(320);
    Image3.Picture("odmrozenie.jpg");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.Height(17);
    Label4.Width(310);
    Label4.Text("Stopnie Odmro??enia");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.Height(1470);
    Label5.Width(310);
    Label5.Text("\nOparzenie jest to uszkodzenie sk??ry i w zale??no??ci od stopni oparzenia tak??e g????biej po??o??onych tkanek lub narz??d??w wskutek dzia??ania ciep??a, ??r??cych substancji chemicznych (sta??ych, p??ynnych, gazowych), pr??du elektrycznego, promieni s??onecznych ??? UV, promieniowania (RTG, UV i innych ekstremalnych czynnik??w promiennych). Przy rozleg??ych oparzeniach og??lnoustrojowy wstrz??s mo??e doprowadzi?? do zgonu.\n\n G????boko??ci oparzenia dzielimy na:   "
    +"\n"
    +"I stopnie??- obejmuje nask??rek, a jego objawami klinicznymi s?? zaczerwienienie sk??ry i niewielki obrz??k. Zmiany s?? silnie bolesne. Po 2-3 dniach zmianom sk??rnym towarzyszy silne sw??dzenie. Oparzenia te goj?? si?? szybko, w ci??gu kilku dni. Powstaj?? najcz????ciej na skutek kr??tkotrwa??ego dzia??ania pary wodnej, niezbyt gor??cej wody lub w wyniku przed??u??onej ekspozycji na s??o??ce.\n\n II stopnie??- dzielimy je na oparzenia powierzchowne i g????bokie.\n\n      "
    +"~ II stopnia powierzchowne (II a) ??? obejmuje nask??rek i cz?????? sk??ry w??a??ciwej. W obrazie klinicznym tego oparzenia, opr??cz zaczerwienienia i obrz??ku, pojawiaj?? si?? p??cherze wype??nione surowiczym p??ynem. Pokryw?? p??cherzy tworzy martwy nask??rek, kt??ry unosi si?? do g??ry pod wp??ywem gromadz??cego si?? pod nim p??ynu tkankowego. Tym oparzeniom towarzyszy silna bolesno????. Oparzenie to goi si?? w ci??gu 10-21 dni. Do powstania oparzenia IIa dochodzi zwykle po oblaniu powierzchni sk??ry wrz??tkiem, gor??cym olejem lub po kontakcie sk??ry z par?? wodn??."
    +"\n\n ~ II stopnia g????bokie (II b) ??? obejmuje nask??rek i pe??n?? grubo???? skory w??a??ciwej. W obrazie tego oparzenia stwierdza si?? bia??o zabarwion?? sk??r?? z czerwonymi punktami w okolicy mieszk??w w??osowych. Dochodzi do uszkodzenia zako??cze?? nerwowych co zmniejsza bolesno????. Oparzenie to goi si?? w ci??gu kilku tygodni."
    +"\n \nIII stopnie?? - obejmuje ca???? grubo???? sk??ry w??a??ciwej z naczyniami, nerwami sk??rnymi i podsk??rn?? tkank?? t??uszczow??. Sk??ra ma zabarwienie per??owo-bia??e lub brunatne, jest twarda i wysuszona. Bolesno???? jest nieznaczna. Z okolicy obj??tej oparzeniem mo??na ??atwo usun???? w??osy. Oparzenie to goi si?? bardzo d??ugo i na og???? wymaga przeszczepu sk??ry."
    +"\n\n IV stopnie??- obejmuje jeszcze ni??ej po??o??one tkanki tj. mi????nie, ??ci??gna, ko??ci. W najci????szych przypadkach wyst??puje zw??glenie oparzonej cz????ci cia??a. Bolesno???? jest nieznaczna.\n\n Pierwsz?? pomoc?? przy oparzeniach, niezale??nie od rodzaju oparzenia, powinno by?? jak najszybsze sch??odzenie oparzonej powierzchni pod zimn??, bie????c?? wod?? przez oko??o 20 minut lub do ustania b??lu. W przypadku kontaktu z powierzchni?? oparzon?? nale??y u??ywa?? r??kawiczek. Je??eli oparzenie dotyczy jamy ustnej zaleca si?? p??ukanie zimn?? wod?? lub ssanie kostek lodu. Nale??y pami??ta??, ??e ch??odzenie oparzonych obszar??w mo??e powodowa?? dreszcze. Ch??odzenie jest tym bardziej skuteczne, im szybciej jest zastosowane od momentu oparzenia. W sytuacji gdy dochodzi do oparzenia sk??ry d??oni przed ch??odzeniem oparzonej powierzchni nale??y zdj???? bi??uteri??. Po sch??odzeniu nale??y za??o??y?? na oparzone miejsce ja??owy opatrunek. Mo??na tak??e stosowa?? opatrunki hydro??elowe, kt??re nie przyklejaj?? si?? do ran i przyspieszaj?? gojenie.");
    Image4 = new Image(VerticalScrollArrangement1);
    Image4.Height(140);
    Image4.Width(320);
    Image4.Picture("stopnie-oparzenia.jpg");
    Label6 = new Label(VerticalScrollArrangement1);
    Label6.FontBold(true);
    Label6.Height(17);
    Label6.Width(310);
    Label6.Text("Stopnie Oparze??");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}