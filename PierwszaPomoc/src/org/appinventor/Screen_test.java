package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
import com.google.appinventor.components.runtime.Button;
class Screen_test extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement4;
  private Image Image11;
  private Label Label1;
  private Image Image10;
  private TableArrangement TableArrangement1;
  private Label Label2;
  private Label Label3;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Title("Screen_test");
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
    TableArrangement1 = new TableArrangement(this);
    TableArrangement1.Columns(1);
    TableArrangement1.Height(-1005);
    TableArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(TableArrangement1);
    Label2.Column(0);
    Label2.FontBold(true);
    Label2.FontSize(20);
    Label2.Height(-1008);
    Label2.Width(-1098);
    Label2.Row(0);
    Label2.Text("TEST ");
    Label3 = new Label(this);
    Label3.Text(" ");
    Button1 = new Button(this);
    Button1.Width(LENGTH_FILL_PARENT);
    Button1.Text("Rozpocznij Test");
    Button2 = new Button(this);
    Button2.Width(LENGTH_FILL_PARENT);
    Button2.Text("Wyjdź do Menu");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}