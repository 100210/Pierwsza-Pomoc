package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.ActivityStarter;
class Screen25 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private Label Label1;
  private Image Image1;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Label2;
  private Label Label3;
  private Image Image3;
  private Label Label4;
  private Button Button3;
  private Label Label5;
  private Image Image4;
  private Label Label6;
  private Button Button2;
  private ActivityStarter ActivityStarter1;
  private ActivityStarter ActivityStarter2;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen25");
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
    VerticalScrollArrangement1.Width(-1098);
    Label2 = new Label(VerticalScrollArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(20);
    Label2.Height(-1006);
    Label2.Width(-1098);
    Label2.Text("POLECAMY");
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.FontBold(true);
    Label3.Height(-1005);
    Label3.Width(-1098);
    Label3.Text(" "
    +"PIERWSZA POMOC PODRĘCZNIK DLA STUDENTÓW");
    Image3 = new Image(VerticalScrollArrangement1);
    Image3.Height(-1020);
    Image3.Width(-1015);
    Image3.Picture("g-pierwsza-pomoc-podrecznik-dla-studentow_10456_150x190.jpg");
    Image3.ScalePictureToFit(true);
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontSize(14);
    Label4.Height(-1020);
    Label4.Width(-1098);
    Label4.Text("W podręczniku Mariusza Goniewicza Pierwsza pomoc omówione są czynności ratujące życie w nagłych wypadkach. Omówione są m. in. podstawowe zabiegi resuscytacyjne u dorosłych i dzieci, postępowanie z chorym nieprzytomnym, pierwsza pomoc w przypadku obrażeń, oparzeń, hipotermii oraz zatrucia");
    Button3 = new Button(VerticalScrollArrangement1);
    Button3.FontBold(true);
    Button3.FontSize(11);
    Button3.Width(LENGTH_FILL_PARENT);
    Button3.Text("IDŹ NA STRONĘ");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.FontBold(true);
    Label5.Width(LENGTH_FILL_PARENT);
    Label5.Text("APTECZKA PATROLOWA");
    Image4 = new Image(VerticalScrollArrangement1);
    Image4.Height(-1015);
    Image4.Width(-1025);
    Image4.Picture("apteczna.jpg");
    Image4.ScalePictureToFit(true);
    Label6 = new Label(VerticalScrollArrangement1);
    Label6.FontSize(14);
    Label6.Height(-1020);
    Label6.Width(-1098);
    Label6.Text("Apteczka Patrolowa\n"
    +"Rozmiar opakowania: 125 x 100 x 10 mm\n       "
    +"Skład apteczki:\n   "
    +"•1 szt. Ustnik do sztucznego oddychania\n"
    +"•4 szt. Rękawice winylowe\n"
    +"•1 szt. Chusteczka alkoholowa");
    Button2 = new Button(VerticalScrollArrangement1);
    Button2.FontBold(true);
    Button2.FontSize(11);
    Button2.Width(LENGTH_FILL_PARENT);
    Button2.Text("IDŹ NA STRONĘ");
    ActivityStarter1 = new ActivityStarter(this);
    ActivityStarter2 = new ActivityStarter(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}