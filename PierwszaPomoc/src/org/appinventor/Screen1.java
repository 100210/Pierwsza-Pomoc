package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
class Screen1 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement4;
  private Image Image11;
  private Label Label1;
  private Image Image10;
  private HorizontalArrangement HorizontalArrangement5;
  private Image Image1;
  private Image Image2;
  private Image Image3;
  private HorizontalArrangement HorizontalArrangement1;
  private Button Button1;
  private Button Button2;
  private Button Button3;
  private HorizontalArrangement HorizontalArrangement6;
  private Image Image7;
  private Image Image8;
  private Image Image9;
  private HorizontalArrangement HorizontalArrangement2;
  private Button Button4;
  private Button Button5;
  private Button Button6;
  private HorizontalArrangement HorizontalArrangement7;
  private Image Image4;
  private Image Image5;
  private Image Image6;
  private HorizontalArrangement HorizontalArrangement3;
  private Button Button7;
  private Button Button9;
  private Button Button8;
  private HorizontalArrangement HorizontalArrangement9;
  private HorizontalArrangement HorizontalArrangement8;
  private Button Button10;
  private Button Button11;
  private Button Button12;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1015);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Image11 = new Image(HorizontalArrangement4);
    Image11.Height(-1014);
    Image11.Width(-1020);
    Image11.Picture("unnamed.png");
    Label1 = new Label(HorizontalArrangement4);
    Label1.FontBold(true);
    Label1.FontSize(27);
    Label1.Height(-1014);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("PIERWSZA \n POMOC");
    Image10 = new Image(HorizontalArrangement4);
    Image10.Height(-1014);
    Image10.Width(-1020);
    Image10.Picture("logo2.png");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1010);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    Image1 = new Image(HorizontalArrangement5);
    Image1.Height(-1010);
    Image1.Width(LENGTH_FILL_PARENT);
    Image1.Picture("teoria.png");
    Image2 = new Image(HorizontalArrangement5);
    Image2.Height(-1010);
    Image2.Width(LENGTH_FILL_PARENT);
    Image2.Picture("praktyka.gif");
    Image3 = new Image(HorizontalArrangement5);
    Image3.Height(-1010);
    Image3.Width(LENGTH_FILL_PARENT);
    Image3.Picture("film.jpg");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1010);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(HorizontalArrangement1);
    Button1.Height(-1010);
    Button1.Width(LENGTH_FILL_PARENT);
    Button1.Text("TEORIA");
    Button2 = new Button(HorizontalArrangement1);
    Button2.Height(-1010);
    Button2.Width(LENGTH_FILL_PARENT);
    Button2.Text("SCENKI");
    Button3 = new Button(HorizontalArrangement1);
    Button3.Height(-1010);
    Button3.Width(LENGTH_FILL_PARENT);
    Button3.Text("FILMIKI");
    HorizontalArrangement6 = new HorizontalArrangement(this);
    HorizontalArrangement6.Height(-1010);
    HorizontalArrangement6.Width(LENGTH_FILL_PARENT);
    Image7 = new Image(HorizontalArrangement6);
    Image7.Height(-1010);
    Image7.Width(LENGTH_FILL_PARENT);
    Image7.Picture("test-clipart-4.jpg");
    Image8 = new Image(HorizontalArrangement6);
    Image8.Height(-1010);
    Image8.Width(LENGTH_FILL_PARENT);
    Image8.Picture("112.png");
    Image9 = new Image(HorizontalArrangement6);
    Image9.Height(-1010);
    Image9.Width(LENGTH_FILL_PARENT);
    Image9.Picture("wezwijpomoc.png");
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Button4 = new Button(HorizontalArrangement2);
    Button4.Height(-1010);
    Button4.Width(LENGTH_FILL_PARENT);
    Button4.Text("TEST");
    Button5 = new Button(HorizontalArrangement2);
    Button5.Height(-1010);
    Button5.Width(LENGTH_FILL_PARENT);
    Button5.Text("JAK WEZWA?? POMOC");
    Button6 = new Button(HorizontalArrangement2);
    Button6.Height(-1010);
    Button6.Width(LENGTH_FILL_PARENT);
    Button6.Text("WEZWIJ POMOC");
    HorizontalArrangement7 = new HorizontalArrangement(this);
    HorizontalArrangement7.Height(-1010);
    HorizontalArrangement7.Width(LENGTH_FILL_PARENT);
    Image4 = new Image(HorizontalArrangement7);
    Image4.Height(-1010);
    Image4.Width(LENGTH_FILL_PARENT);
    Image4.Picture("szpital.jpg");
    Image5 = new Image(HorizontalArrangement7);
    Image5.Height(-1010);
    Image5.Width(LENGTH_FILL_PARENT);
    Image5.Picture("AED.jpg");
    Image6 = new Image(HorizontalArrangement7);
    Image6.Height(-1010);
    Image6.Width(LENGTH_FILL_PARENT);
    Image6.Picture("zakupy.png");
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1010);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Button7 = new Button(HorizontalArrangement3);
    Button7.Height(-1010);
    Button7.Width(LENGTH_FILL_PARENT);
    Button7.Text("MAPA SZPITALI");
    Button9 = new Button(HorizontalArrangement3);
    Button9.Height(-1010);
    Button9.Width(LENGTH_FILL_PARENT);
    Button9.Text("MAPA AED");
    Button8 = new Button(HorizontalArrangement3);
    Button8.Height(-1010);
    Button8.Width(LENGTH_FILL_PARENT);
    Button8.Text("POLECANE");
    HorizontalArrangement9 = new HorizontalArrangement(this);
    HorizontalArrangement9.Height(-1020);
    HorizontalArrangement9.Width(-1098);
    HorizontalArrangement8 = new HorizontalArrangement(this);
    HorizontalArrangement8.AlignHorizontal(3);
    HorizontalArrangement8.AlignVertical(2);
    HorizontalArrangement8.BackgroundColor(0xFF444444);
    HorizontalArrangement8.Height(-1006);
    HorizontalArrangement8.Width(-1100);
    Button10 = new Button(HorizontalArrangement8);
    Button10.FontSize(12);
    Button10.Height(-1005);
    Button10.Width(-1030);
    Button10.Shape(1);
    Button10.Text("O APLIKACJI");
    Button11 = new Button(HorizontalArrangement8);
    Button11.FontSize(12);
    Button11.Height(-1005);
    Button11.Width(-1030);
    Button11.Shape(1);
    Button11.Text("REGULAMIN");
    Button12 = new Button(HorizontalArrangement8);
    Button12.BackgroundColor(0xFFCCCCCC);
    Button12.FontSize(12);
    Button12.Height(-1005);
    Button12.Width(-1030);
    Button12.Shape(1);
    Button12.Text("KONTAKT");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}