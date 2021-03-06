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
class Screen_test7 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement4;
  private Image Image12;
  private Label Label2;
  private Image Image13;
  private TableArrangement TableArrangement1;
  private Label Label4;
  private Label Label5;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Title("Screen_test7");
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1015);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Image12 = new Image(HorizontalArrangement4);
    Image12.Height(-1014);
    Image12.Width(-1020);
    Image12.Picture("unnamed.png");
    Label2 = new Label(HorizontalArrangement4);
    Label2.FontBold(true);
    Label2.FontSize(27);
    Label2.Height(-1014);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("PIERWSZA \n POMOC");
    Image13 = new Image(HorizontalArrangement4);
    Image13.Height(-1014);
    Image13.Width(-1020);
    Image13.Picture("logo2.png");
    TableArrangement1 = new TableArrangement(this);
    TableArrangement1.Columns(1);
    TableArrangement1.Height(-1005);
    TableArrangement1.Width(LENGTH_FILL_PARENT);
    Label4 = new Label(TableArrangement1);
    Label4.Column(0);
    Label4.FontBold(true);
    Label4.FontSize(20);
    Label4.Height(-1008);
    Label4.Width(-1098);
    Label4.Row(0);
    Label4.Text("TEST ");
    Label5 = new Label(this);
    Label5.FontItalic(true);
    Label5.FontSize(16);
    Label5.Width(LENGTH_FILL_PARENT);
    Label5.Text("Zako??czono Test!");
    Button1 = new Button(this);
    Button1.Width(LENGTH_FILL_PARENT);
    Button1.Text("Wykonaj Test ponownie");
    Button2 = new Button(this);
    Button2.Width(LENGTH_FILL_PARENT);
    Button2.Text("Wyjd??");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}