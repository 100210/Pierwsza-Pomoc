package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
class Screen17 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private Label Label1;
  private Image Image1;
  private HorizontalArrangement HorizontalArrangement2;
  private Image Image3;
  protected void $define() {
    this.AppName("PierwszaPomoc");
    this.Scrollable(true);
    this.Title("Screen17");
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
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Width(-1098);
    Image3 = new Image(HorizontalArrangement2);
    Image3.Height(540);
    Image3.Width(350);
    Image3.Picture("jakwezwacpomoc.png");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}