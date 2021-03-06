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
    Label2.Text("STANY NAG??E");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.Height(545);
    Label3.Width(310);
    Label3.Text("Stany nag??e, czyli sytuacje, kt??re wyst??pi??y w nieoczekiwanym momencie, s?? gwa??towne i nie by??y mo??liwe do przewidzenie. Przyk??adem stanu nag??ego jest np. padaczka, zawa??, wstrz??s, udar, pora??enie pr??dem. \n\n Padaczka (epilepsja) jest to przewlek??e zaburzenie pracy m??zgu, charakteryzuje si?? nawracaj??cymi napadami drgawek, kt??rym mo??e towarzyszy?? utrata przytomno??ci. Zazwyczaj padaczka jest samoistna, ale mo??e by?? r??wnie?? wywo??ana poprzez alkohol, leki, stres, urazy g??owy. Napady drgawek s?? nag??e. Najpierw osoba poszkodowana traci przytomno???? i upada potem nast??puje napi??cie ca??ego cia??a i wyst??puj?? niekontrolowane ruchy ko??czyn, g??owy i tu??owia.\n\n Post??powanie podczas wyst??pienia ataku drgawek, nale??y u osoby poszkodowanej zabezpieczy?? g??ow??, aby nie dozna??a dodatkowego urazu. Nie wolno kr??powa?? ruch??w cia??a. Zabronione jest r??wnie?? wk??adanie cia?? obcych miedzy z??by, bo mo??e doj???? do niedro??no??ci dr??g oddechowych. Po ust??pieniu drgawek nale??y sprawdzi?? parametry ??yciowe poszkodowanego i u??o??y?? go w pozycji bocznej bezpiecznej. Po napadzie drgawek osoba b??dzie zm??czona i spl??tana. Nie bud?? jej i zapewnij spok??j kontroluj??c parametry ??yciowe.\n");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(140);
    Image3.Width(320);
    Image3.Picture("padaczka.png");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.Height(17);
    Label4.Width(310);
    Label4.Text("Post??powanie Podczas Padaczki");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.Height(880);
    Label5.Width(310);
    Label5.Text("\nWstrz??s jest ???stanem niewystarczaj??cego do aktualnego zapotrzebowania dostarczenia tleniu i innych substancji od??ywczych do tkanek lub ich nieprawid??owego przez te tkanki przyswajania???.\n\n Wstrz??s ze wzgl??du mechanizmu powstania dzielimy na:"
    +"\n- kardiogenny;"
    +"\n- anafilaktyczny;"
    +"\n- septyczny;"
    +"\n- hipowolemiczny;"
    +"\n- neurogenny\n\nWstrz??s objawia si??:\n"
    +"\n- ch??odn??, blad?? wilgotn?? sk??r??;"
    +"\n- os??abienie, zawroty g??owy, senno????;"
    +"\n- nudno??ci;"
    +"\n- pocenie si??;"
    +"\n- b??l;"
    +"\n- wzmo??one pragnienie;"
    +"\n- zmniejszenie oddawania moczu;"
    +"\n- szybki p??ytki oddech;"
    +"\n- szybkie s??abe t??tno;"
    +"\n- utrata przytomno??ci;"
    +"\n- zaburzenia rytmu serca, zatrzymanie kr????enia.\n\n"
    +"Post??powanie ratownicze polega przede wszystkim na natychmiastowym wezwaniu pomocy specjalistycznej. Nast??pnie usun???? przyczyn?? wstrz??su (zatamowa?? masywne krwawienia, zaopatrzy?? z??amania). Nale??y rozlu??ni?? kr??puj??ce cz????ci garderoby, ul??y?? poszkodowanego w pozycji przeciwwstrz??sowej (na twardym pod??o??u z g??ow?? u??o??on?? ni??ej ni?? tu????w i z uniesionymi ko??czynami dolnymi na ok 30cm).");
    Image4 = new Image(VerticalScrollArrangement1);
    Image4.Height(100);
    Image4.Width(320);
    Image4.Picture("pozycjaprzeciwwstrzasowa.png");
    Label6 = new Label(VerticalScrollArrangement1);
    Label6.FontBold(true);
    Label6.Height(17);
    Label6.Width(310);
    Label6.Text("Pozycja Przeciwwstrz??sowa");
    Label7 = new Label(VerticalScrollArrangement1);
    Label7.Height(440);
    Label7.Width(310);
    Label7.Text("\nZawa?? martwica mi????nia sercowego spowodowana jego niedokrwieniem wskutek zamkni??cia t??tnicy wie??cowej doprowadzaj??cej krew do serca. Zawa?? mo??e by?? spowodowany mia??d??yc?? naczy?? wiecowych, cukrzyc??, oty??o??ci??, nadci??nieniem t??tniczym czy paleniem tytoniu. \n\n Charakterystyczny objaw zawa??u to silny, piek??cy lub gniot??cy b??l w klatce piersiowej promieniuj??cy do szyi, lewego ranienia b??d?? brzucha. Objawy towarzysz??ce to duszno????, blado????, poty, ko??atanie serca, przyspieszenie bicia serca czy te?? nudno??ci, omdlenie gor??czka.\n\n       "
    +"Gdy pojawi si?? taki b??l jak opisany powy??ej nale??y niezw??ocznie wezwa?? pogotowie. Poszkodowanego u??o??y?? w pozycji p????siedz??cej z nieznacznie uniesionym tu??owiem i rozlu??ni?? ubranie. ");
    Image5 = new Image(VerticalScrollArrangement1);
    Image5.Height(150);
    Image5.Width(310);
    Image5.Picture("zawal.png");
    Label8 = new Label(VerticalScrollArrangement1);
    Label8.FontBold(true);
    Label8.Height(17);
    Label8.Width(310);
    Label8.Text("Pozycja P????siedz??ca przy zawale");
    Label9 = new Label(VerticalScrollArrangement1);
    Label9.Height(710);
    Label9.Width(310);
    Label9.Text("\nUdar m??zgu jest to nag??e wyst??pienie ogniskowych zaburze?? czynno??ci m??zgu, kt??re s?? spowodowane wy????cznie przyczynami naczyniowymi, zwi??zanymi z m??zgowym. przep??ywem krwi, trwaj??cych d??u??ej ni?? 24h.\n\n Wyr????nia si?? dwa rodzaje udaru m??zgu: krwotoczny i niedokrwienny. \n\n - Krwotoczny powstaje w wyniku powstaje w wyniku p??kni??cia ??ciany t??tnicy m??zgowej i wylania krwi poza naczynie. \n\n- Niedokrwienny powstaje natomiast poprzez zatkania naczynia t??tnicy dostarczaj??cej krew do m??zgu.\n\n Objawy udaru:\n   "
    +"- asymetria twarzy- opadni??ty k??cik ust;  "
    +"\n- os??abienie ko??czyn po jednej stronie;  "
    +"\n- zaburzenia widzenia;                    "
    +"\n- zaburzenia mowy;                         "
    +"\n- zaburzenie r??wnowagi;                     "
    +"\n- nag??y silny b??l g??owy\n\n Gdy wyst??pi kt??ry?? z powy??szych objaw??w nale??y jak najszybciej wezwa?? pogotowie ratunkowe. Wyst??pieniu udaru czas ma kluczow?? role, poniewa?? od 4,5h od wyst??pienia pierwszych objaw??w s?? najwa??niejsze. Je??li w tym czasie wdro??y si?? leczenie trombolityczne jest du??a szansa na uratowanie ??ycia i ograniczenia niepe??nosprawno??ci. Dlatego przyj??to ze z??ota godzina udarowa wynosi 3-6godzin i w tym czasie osoba poszkodowana powinna si?? znale???? w szpitalu, w kt??rym jest oddzia?? udarowy.");
    Image6 = new Image(VerticalScrollArrangement1);
    Image6.Height(180);
    Image6.Width(320);
    Image6.Picture("udar.png");
    Label10 = new Label(VerticalScrollArrangement1);
    Label10.FontBold(true);
    Label10.Height(17);
    Label10.Width(310);
    Label10.Text("Rodzaje udaru m??zgu");
    Label11 = new Label(VerticalScrollArrangement1);
    Label11.Height(440);
    Label11.Width(310);
    Label11.Text("\nPora??anie pr??dem jest bardzo niebezpieczne, gdy?? mo??e spowodowa?? ona szereg r????norodnych obra??e?? tj. zdezorientowanie, rozleg??e oparzenia czy te?? zatrzymanie oddechu lub kr????enia. Ci????ko???? objaw??w zale??y od wielu czynnik??w np. od nat????enia i napi??cia pr??du, czasu przep??ywu pr??du ra??enia, powierzchnie styku przewodnictwa czy te?? drogi przep??ywu przez cia??o poszkodowanego oraz impedancja organizmu.\n\n Aby udzieli?? pierwszej pomocy osobie poszkodowanej pora??onej pr??dem w pierwszej kolejno??ci nale??y od????czy?? ??r??d??o napi??cia . Gdy b??dzie ju?? bezpiecznie mo??na podej???? do poszkodowanego i oceni?? stan ??wiadomo??ci oraz parametr??w ??yciowych (oddech, kr????enie). Potem nale??y podj???? odpowiednie czynno???? w zale??no??ci od stanu osoby poszkodowanej.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}