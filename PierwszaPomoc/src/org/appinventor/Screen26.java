package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TableArrangement;
class Screen26 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private Label Label1;
  private Image Image1;
  private TableArrangement TableArrangement1;
  private Label Label2;
  private Label Label3;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Title("Screen26");
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
    TableArrangement1.Height(-1050);
    TableArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(TableArrangement1);
    Label2.Column(0);
    Label2.FontBold(true);
    Label2.FontSize(22);
    Label2.Row(0);
    Label2.Text("O Aplikacji");
    Label3 = new Label(TableArrangement1);
    Label3.Column(0);
    Label3.Height(-1020);
    Label3.Width(-1098);
    Label3.Row(1);
    Label3.Text("Aplikacja ma na celu edukowanie z zakresu udzielania pierwszej pomocy. Docelowym źródłem odbiorców są wszystkie grupy wiekowe, osoby posiadające smartfon z systemem Android.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}