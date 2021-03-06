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
    Label3.Text("Uraz mo??e powsta?? z powodu r????nych przyczyn np. zadzia??anie czynnika elektrycznego, termicznego czy mechanicznego. Nast??puje wtedy uszkodzenie w obszarze kom??rek, tkanek oraz narz??d??w. Uraz powstaje poprzez zadzia??anie energii zewn??trznej powoduj??cej uszkodzenie. Na skutek urazu mechanicznego mo??e nast??pi?? uszkodzenie narz??du ruchu. Uszkodzenie zale??y od tego w jakim stopniu dosz??o do urazu, w jaki miejscu oraz jakiego rodzaju zasz??y zmiany. Mechaniczne pourazowe urazy"
    +"mo??emy podzieli?? na, zwichni??cia, skr??cenia, z??amania oraz st??uczenia. \n\n Zwichni??cie powstaje na skutek zadzia??anie du??ego urazu. Jest to pourazowe uszkodzenie stawu, w kt??rej dochodzi do ca??kowitej utraty ????czno??ci powierzchni stawowych. Nale??y zabezpieczy?? ko??czyn?? przed ruchem poprzez unieruchomienie. I zg??osi?? si?? do specjalisty w celu nastawienia zwichni??tego stawu.\n\n"
    +"Skr??cenie powstaje wskutek naderwania i naci??gni??cia aparatu wi??zad??owo-torebkowego stawu. Zostaje zachowana ruchomo????, ale uwidoczniaj?? si?? zniekszta??cenia w obr??bie stawu. Post??powanie ratownicze polega na zabezpieczeniu stawu poprzez unieruchomienie go i co najmniej dw??ch s??siaduj??cych ko??ci.\n\n"
    +"Z??amanie jest to przerwanie ci??g??o??ci tkanki kostnej na skutek zadzia??ania ogromnej si??y. Mo??na podzieli?? je na z??amanie otwarte i z??amanie zamkni??te. W celu zabezpieczenia z??amania stosuje si?? zasad?? Potta, czyli nale??y unieruchomi?? uszkodzon?? ko???? oraz co najmniej dwa s??siaduj??ce stawy.\n\n"
    +"Jednym z powa??nych uraz??w cia??a jest amputacja. Najcz????ciej jest ona nast??pstwem wypadk??w w pracy g????wnie w rolnictwie czy na budowie, a tak??e wypadk??w komunikacyjnych. Osoba poszkodowana u kt??rej dosz??o do amputacji mo??e gwa??townie krwawi??, dlatego szybko powinno si?? zatamowa?? krwawienie. Amputacje dzieli si?? na ca??kowit?? i nieca??kowit??. Podczas amputacji nieca??kowitej musimy zabezpieczy?? i unieruchomi?? dan?? cz?????? cia??a, tak aby uda??o si?? zachowa?? pozosta??e kr????enie, gdy?? jest szansa na operacyjne odtworzenie ci??g??o??ci cz????ci cia??a. Gdy mamy do czynienia z amputacj?? ca??kowit?? nale??y zabezpieczy?? kikuta jak r??wnie?? amputowan?? cz?????? cia??. Nale??y to uczyni?? w nast??puj??cy spos??b:\n\n"
    +"1. owin???? amputowan?? cz?????? cia??a ja??ow?? gaz??;\n"
    +"2. umie??ci?? w plastikowym worku;\n"
    +"3. dany worek w??o??y?? do kolejnego worka, w kt??rym znajduje si?? woda z kostkami lodu.\n\n"
    +"Prawid??owe zabezpieczenie amputowanej cz????ci spowalnia procesy metaboliczne co wp??ywa na zwi??kszenie czasu ??ywotno???? tej cz????ci i umo??liwia wykonanie skutecznej reimplantacji.\n\n Kolejnym ci????kim urazem jest cia??o obce wbite w cia??o. Nale??y pami??ta?? ze pod ??adnym pozorem nie mo??na wyci??ga?? cia??a obcego z rany gdy?? mo??emy uszkodzi?? naczynia i mo??e doj???? do krwotoku. Nale??y jedynie zabezpieczy?? cia??o obce przed przemieszczaniem si??. Mo??na to uczyni?? poprzez stabilizacje cia??a obcego przyk??adaj?? zwini??te banda??e obok i zawini??cie. Spos??b zaopatrzenia zosta?? przedstawiony poni??ej. Nast??pnie specjalista w warunkach klinicznych usunie cia??o obce.");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(160);
    Image3.Width(320);
    Image3.Picture("cialoobce.png");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.Height(17);
    Label4.Width(310);
    Label4.Text("Cia??o obce w ranie");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}