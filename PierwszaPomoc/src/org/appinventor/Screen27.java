package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
class Screen27 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private Label Label1;
  private Image Image1;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen27");
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
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalScrollArrangement1);
    Label2.Height(8110);
    Label2.Width(300);
    Label2.Text("REGULAMIN KORZYSTANIA Z APLIKACJI MOBINEJ PIERWSZA POMOC\n\n I.	PREMBUŁA\n "
    +"1.	Niniejszy dokument określa warunki dostępu i korzystania z aplikacji, zwany będzie dalej: ”Ogólne warunki”.\n"
    +"2.	Każdy użytkownik z chwilą podjęcia czynności zmierzających do korzystania z aplikacji zobowiązany jest do zapoznania się, przestrzegania oraz akceptacji Ogólnych warunków, bez ograniczeń i zastrzeżeń. \n"
    +"3.	W przypadku niewyrażenia zgody na wszystkie Ogólne warunki należy zaprzestać korzystania z aplikacji i natychmiast ją dezaktywować.\n"
    +"4.	Wszystkie nazwy handlowe, nazwy firm i ich logo, użyte w aplikacji należą do ich właścicieli i są używane wyłącznie w celach identyfikacyjnych. Mogą być one zastrzeżone znakami towarowymi. \n"
    +"5.	Zabrania się nieuprawnionego korzystania z zawartości aplikacji, utworów lub informacji, jak też ich nieuprawnionej reprodukcji, retransmisji lub innego użycia jakiegokolwiek elementu aplikacji, gdyż takie działanie może naruszyć m.in. prawa autorskie lub chronione znaki towarowe.\n"
    +"6.	Pytania lub uwagi dotyczące aplikacji można zgłaszać na następujący adres email: KK&JŻ@gmail.com \n\n"
    +"II.	DEFINICJE\n"
    +"1.	APLIKACJA¬- narzędzia, o nazwie: Pierwsza Pomoc, służycie do świadczenia usług elektronicznych;\n"
    +"2.	PRAWO WŁAŚCIWE- Do celów realizacji Ogólnych warunków zastosowanie na prawo polskie\n"
    +"3.	UŻYTKOWNIK- osoba fizyczne, osoba prawna albo jednostka organizacyjna nieposiadająca osobowości prawnej, której ustawa przyznaje zdolność prawną, korzystania z usług elektronicznych dostępnych w ramach aplikacji;\n"
    +"4.	WARUNKI- zbiór wszystkich postanowień m.in. niniejszym Ogólnych warunków, zasad polityki prywatności, plików cookies, regulaminu korzystania ze aplikacji oraz wszelkich innych warunków, znajdujących się w aplikacji, które dotyczą określonych funkcji, własności lub promocji, jak również obsługi w ramach klienta;\n"
    +"5.	WŁAŚCICIEL- Podmiot udostępniający niniejszą aplikację, mianowicie: Przedsiębiorcy Pani Kinga Kunefał oraz Pani Joanna Żurawik, prowadzące działalność gospodarczą pod firmą KK&JŻ, z siedzibą przy: 66-001 Zielona Góra, ul. Strumykowa 1, NIP: 99102479528"
    +"\n\nIII.	ZAKRES WARUNKÓW\n"
    +"1.	Właściciel zapewnia dostęp do zawartości aplikacji, zgodnie z poniższymi Ogólnymi warunkami.\n"
    +"2.	Zawartość i dane publikowane w aplikacji mają charakter informacji dla osób zainteresowanych i mogą być wykorzystywane jedynie do celów informacyjnych.\n"
    +"3.	Właściciel ma praw zamieszczenia treści reklamowych, które stanowią integralną część serwisu i prezentowanych w nim materiałów.\n"
    +"4.	Użytkownicy mogę korzystać z dostępu i usług oferowanych w aplikacji, pod warunkiem uprzedniego wyrażenia zgody na Ogólne warunki.\n\n"
    +"IV.	ZADADY KORZYSTANIA Z APLIKACJI\n"
    +"1.	Aplikacja jest obsługiwana mobilnie. Wymaga od Użytkownika systemu androida.\n"
    +"2.	Po zaakceptowaniu Warunków, Użytkownik ma prawo przeglądać, kopiować, drukować oraz rozpowszechniać, bez dokonywania zmian w treści, zawartości niniejszej aplikacji, pod warunkiem, że:\n"
    +"a.	Treści te będą wykorzystywane wyłącznie informacyjnie, w celach niekomercyjnych;\n"
    +"b.	Każda wykonana kopia będzie zawierała informację na temat praw autorskich lub dane dotyczące autora treści.\n"
    +"3.	Zakazane jest używanie i kopiowanie oprogramowania, procesów i technologii, stanowiących część aplikacji.\n"
    +"4.	Użytkownicy mogą korzystać z aplikacji jedynie w poszanowaniu przepisów ustawy prawo telekomunikacyjne, ustawy o świadczeniu usług drogą elektroniczną i odpowiednich przepisów prawa cywilnego.\n"
    +"5.	Zabronione jest korzystanie z aplikacji:\n"
    +"a.	W sposób prowadzący do naruszenia obowiązujących przepisów prawa;\n"
    +"b.	W jakikolwiek sposób niezgodny z prawem lub nieuczciwy, albo w sposób zmierzający do osiągnięcia niezgodnego z prawem lub nieuczciwego celu;\n"
    +"c.	Do celów związanych z wyrządzaniem szkody dzieciom lub prób wyrządzenia im jakiejkolwiek szkody;\n"
    +"d.	Do wysyłania, świadomego otrzymywania, wgrywania lub używania treści niezgodnych z Ogólnymi warunkami;\n"
    +"e.	 Do przekazywania lub prowokowania wysyłki jakichkolwiek niezamówionych lub nieuprawnionych reklam lub materiałów promocyjnych, jak również jakichkolwiek form podobnych, zaliczanych do zbiorczej kategorii SPAM;\n"
    +"f.	Do świadomego przekazywania jakichkolwiek danych, wysyłania lub wgrywania jakichkolwiek materiałów zawierających wirusy, konie trojańskie, oprogramowanie szpiegujące (spyware), oprogramowanie z reklamami (adware) lub inny szkodliwy program lub zbliżone kody komputerowe zaprogramowane, by niekorzystnie wpływać lub zagrażać na funkcjonowanie jakiegokolwiek oprogramowania lub sprzętu komputerowego albo niekorzystnie wpływać lub zagrażać Użytkownikowi.\n\n"
    +"V.	PRZECHOWYWANIE INFORMACJI O PREFERENCJACH UŻYTKOWNIKA PRZEZ APLIKACJĘ\n"
    +"1.	Aplikacja przechowuje informacje o dostępie Użytkownika i jego preferencji.\n"
    +"2.	Informacje te zwykle są przechowywane  przez aplikację, w celu śledzenia informacji dotyczącej używanego urządzeni. \n"
    +"3.	Informacje przechowywane przez aplikację są używane m.in. w celach reklamowych i statystycznych oraz w celu dostosowania aplikacji do indywidualnych potrzeb Użytkownika.\n"
    +"4.	Większość Użytkowników i niektórych przeglądarek mobilnych automatycznie akceptują przechowywanie informacji przez aplikacją, w tym pliki cookies. Jeżeli ustawienia te pozostają bez zmian, informacje te zostaną zapisane w aplikacji. \n"
    +"5.	Użytkownik może zmienić preferencje dotyczące akceptacji przechowywania informacji lub zaprzestać korzystania z aplikacji. Aby zmienić aplikacji należy dostosować ustawienia aplikacji.\n"
    +"6.	Warto pamiętać, że blokowanie lub brak akceptacji przechowywania informacji przez aplikację może uniemożliwić pełne z niej korzystanie.\n"
    +"7.	Przechowywane informacje będą wykorzystywane do niezbędnego zarządzania sesją, w tym:\n"
    +"•	 Rozpoznawania, gdy Użytkownik już wcześniej ściągał aplikację, co pozwala zidentyfikować liczę unikalnych Użytkowników, który korzystali z aplikacji i upewnić się, że Właściciel dysponuje wystarczającą pojemnością dla liczby Użytkowników;\n"
    +"•	Dostosowywania elementów układu szaty graficznej lub zawartości aplikacji;\n"
    +"•	Zbierania informacji statystycznych o tym, jak Użytkownik korzysta z aplikacji,  w celu ulepszenia aplikacji oraz możliwości pozyskania wiedzy na temat tego, które części aplikacji są najbardziej popularne dla Użytkownika.\n\n"
    +"VI.	USŁUGI DOSTĘPNE W RAMACH APLIKACJI\n"
    +"1.	Właściciel umożliwia w ramach aplikacji i.in.:\n"
    +"a.	udostępnianie na żądanie lokalizacji użytkownika \n"
    +"b.	część teoretyczna z podziałem na kategorie np.: \n"
    +"•	NZK (dorosły, dziecko, niemowlę), \n"
    +"•	rany, \n"
    +"•	urazy, \n"
    +"•	stany nagłe (zawał, udar, padaczka)\n"
    +"c.	część praktyczna \n"
    +"•	opis scenki \n"
    +"•	prawidłowy algorytm postępowania do danej scenki\n"
    +"d.	filmiki instruktarzowe\n"
    +"•	link kierujący do filmiku udostępnionego na platformie YouTube \n"
    +"e.	test wiedzy\n"
    +"•	ogólny (wymieszane pytanie z każdej kategorii)\n"
    +"•	podziałem na daną kategorie\n"
    +"f.	kolejność podawania informacji przy wezwaniu pomocy\n"
    +"g.	podane numery alarmowe możliwość połączenia się przez aplikacje\n"
    +"h.	lokalizacja defibrylatorów oraz szpitali  (Google Maps)\n"
    +"i.	produkty medyczne warte nabycia/ przeczytania\n"
    +"•	krótki opis produkty medycznego \n"
    +"•	link kierujący do danego produktu, gdzie można go nabyć\n"
    +"j.	reklamy\n\n"
    +"VII.	LINKI ZEWNĘTRZNA\n"
    +"1.	Odnośniki znajdujące się w niniejszej aplikacji, do innych stron internetowych, są podane wyłącznie w celu informacyjnym.\n"
    +"2.	Właściciel nie ponosi odpowiedzialności za treści znajdujące się na innych witrynach, ani za jakiekolwiek szkody wynikające z ich użytkowania.\n\n"
    +"VIII.	PORZANOWANIE WŁASNOŚCI INTELEKTUALNEJ\n"
    +"1.	Aplikacja oraz jej treści mogą być ochronione prawami aktorskimi, prawami dotyczącymi znaków towarowych oraz innymi przepisami związanymi z ochroną własności intelektualnej.\n"
    +"2.	Znaki, loga i inne spersonalizowane emblematy Właściciela, pojawiające się w aplikacji (zwane łącznie: ”Znakami”), stanowią znaki towarowe Właściciela.\n"
    +"3.	Z wyjątkiem osobnych, indywidualnych, pisemnych upoważnień, Użytkownik nie może wykorzystywać przez siebie, należących do Właściciela, Znaków: osobno, ani w zestawieniu z innymi elementami słownymi lub graficznymi, szczególnie w informacjach prasowych, reklamach, materiałach promocyjnych, marketingowych, w mediach, w materiałach pisemnych lub ustnych, w formie elektronicznej, w formie wizualnej ani w żadnej innej formie.\n\n"
    +"IX.	OCHRONA DANYCH UŻYTKOWNIKA\n"
    +"1.	Właściciel szanuje w pełni prywatność Użytkowników. Szczegółowe informacje na temat sposobu gromadzenia i przetwarzania danych osobowych Użytkownika lub innych informacji, jak również sytuacji, w których Właściciel może jej ujawnić, znajdują się w zakładce Polityka Prywatności."
    +"\n\n"
    +"X.	OGRANICZENIE ODPOWIEDZIALONOŚCI\n"
    +"1.	Aplikacja zawiera informacje o charakterze ogólnym. Sporządzone przez osobę do tego uprawnioną. Aplikacja zapewnia gwarancję treści merytorycznych. Zaleca się do uczestnictwa w szkoleniach/ kursach pierwszej pomocy, które umocnią zdobytą wiedzę/informacji z aplikacji. \n"
    +"2.	Aplikacja nie zapewnia gwarancji dotyczących jej treści, w szczególności gwarancji bezpieczeństwa, bezbłędności, braku wirusów czy złośliwych kodów, gwarancji dotyczących poprawnego działania czy jakości.\n"
    +"3.	Aplikacja nie zapewnia żadnej rękojmi,  wyraźniej lub dorozumianej, w tym gwarancji przydatności handlowej lub przydatności do określonego celu, nienaruszenia praw autorskich, dostosowania, bezpieczeństwa i rzetelności informacji.\n"
    +"4.	Użytkownik korzysta z aplikacji na własne ryzyko i przyjmuje na siebie pełną odpowiedzialność za szkody związanie lub wynikające z jej wykorzystania, zarówno bezpośrednie jak i pośrednie, uboczne, następcze, moralne lub inne szkody z tytułu odpowiedzialności umownej, deliktowej, z tytułu zaniedbań, w tym m.in. na utratę danych lub usług.\n"
    +"5.	Aplikacja nie ponosi żadnej odpowiedzialności za linki zamieszczone w aplikacji, szczególnie jeśli prowadzą do witryn, zasobów lub narzędzi utrzymywanych przez osoby trzecie.\n"
    +"6.	Właściciel nie ponosi odpowiedzialności, jeśli aplikacja jest z jakichkolwiek przyczyn tymczasowo lub długookresowo niedostępna\n"
    +"7.	Właściciel nie ponosi odpowiedzialności za informacje przekazywane w aplikacji, ani też nie może zapewnić całkowitego bezpieczeństwa komunikacji prowadzonych za pomocą aplikacji.\n"
    +"8.	Pomimo podejmowanie przez Właściciela największych starań, w kwestii zapewnienia dokładności i aktualności aplikacji, mogą pojawić się niezamierzone przez Właściciela błędy, które Użytkownik, po uch wykryciu, proszony jest zgłosić Właścicielowi.\n"
    +"9.	Wszelkie wskazane powyżej wyłączenia i ograniczenia odpowiedzialnością obowiązują na najszerszym dopuszczalnym prawnie zakresie, obejmując każdy typ istniejącej odpowiedzialności m.in. odpowiedzialności kontraktowej, deliktowej i każdej innej przewidzianej w polskim lub zagranicznym porządku prawnym.\n\n"
    +"XI.	STOSUNEK DO ZAWARTYCH UMÓW\n"
    +"1.	Jeśli nie postanowiono inaczej, Ogólne warunki stanowią kompletną i wyczerpującą umowę pomiędzy Użytkownikiem i Właścicielem, dotyczącym korzystania z aplikacji, w zakresie treści w nich zawartych oraz zastępują wszelkie inne porozumienia, uzgodnienia i umowy dotyczące przedmiotu (treści) niniejszych Ogólnych warunków."
    +"\n\n"
    +"XII.	ZMIANA WARUNKÓW APLIKACJI\n"
    +"1.	Właściciel aplikacji zastrzega sobie prawo do dokonywania modyfikacji niniejszych Ogólnych warunków, w dowolnym momencie ich obowiązywania, zamieszczając ich zaktualizowaną wersję w aplikacji, które zaczynają obowiązywać Użytkownika od momentu ich publikacji, chyba że inaczej wskazano w zmodyfikowanych Ogólnych warunkach.\n"
    +"2.	Użytkownik ma obowiązek zapoznania się z modyfikacjami Ogólnych warunków, o czym Właściciel poinformuje go, wysyłając do Niego wiadomość lub komunikat o zmianach Ogólnych warunków do zaakceptowania.\n"
    +"3.	Dalsze korzystanie z aplikacji jest równoznaczne z akceptacją zmodyfikowanych Warunków aplikacji."
    +"\n\n"
    +"XIII.	PODSTAWA PRAWNA\n"
    +"1.	W sprawach nieuregulowanych w niniejszych Ogólnych warunkach stosuje się odpowiednio następujące ustawy:\n"
    +"•	 ustawę prawo telekomunikacyjne z dnia 16 lipca 2004r. (tj. Dz.U. z 2019r. poz.2460,ze zm.);\n"
    +"•	ustawę o świadczeniu usług drogą elektroniczną z dnia 18 lipca 2002r. (t.j. Dz.U, z 2019r. poz. 123, ze zm.);\n"
    +"•	ustawę o prawie autorskim i ramach pokrewnych z dnia 4 lutego 1994r. (t.j. Dz.U z 2019r. poz. 1231, ze zm.);\n"
    +"•	ustawę kodeks /Cywilny z dnia 23 kwietnia 1964r. (t.j. Dz.U z 2019r. poz. 1145, ze zm.);\n"
    +"oraz inne właściwe przepisy prawa polskiego."
    +"");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}