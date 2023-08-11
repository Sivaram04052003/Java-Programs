import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

class ConsolePage extends Frame{
	public ConsolePage() {
		Label l=new Label("Display the name");
		Button b=new Button("Show");
		add(l);
		add(b);
		b.addActionListener( new ActionListener () {
			public void actionPerformed(ActionListener e) {
				b.setName("Sivarm");
			}
		});
		setVisible(true);
		setSize(400,500);
		b.setBounds(130, 100, 100, 30);
		
		
	}
	public static void main(String[] args) {
		new ConsolePage();
	}
}