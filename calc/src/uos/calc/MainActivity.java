package uos.calc;


import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Button button[]=new Button[12];
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView=(TextView) findViewById(R.id.textView1);
		
		button[0]=(Button)findViewById(R.id.button1);
		button[1]=(Button)findViewById(R.id.button2);
		button[2]=(Button)findViewById(R.id.button3);
		button[3]=(Button)findViewById(R.id.button4);
		button[4]=(Button)findViewById(R.id.button5);
		button[5]=(Button)findViewById(R.id.button6);
		button[6]=(Button)findViewById(R.id.button7);
		button[7]=(Button)findViewById(R.id.button8);
		button[8]=(Button)findViewById(R.id.button9);
		button[9]=(Button)findViewById(R.id.button0);
		button[10]=(Button)findViewById(R.id.button11);
		button[11]=(Button)findViewById(R.id.button12);
		
		for (int i = 0; i <button.length; i++) {
			button[i].setOnClickListener(listener);
		}
	}
    protected CharSequence getResult() {
        String text = textView.getText().toString();
        String[] array = text.split("\\+");
        int result = 0;
        for (int i = 0; i < array.length; i++) {
                result += Integer.parseInt(array[i]);
        }
        return String.valueOf(result);
    }
	 Button.OnClickListener listener=new Button.OnClickListener(){
 		//이 리스너를 등록한 버튼이 눌려졌을때 실행되는 콜백 메소드
     	public void onClick(View v) {
 			
     		switch(v.getId()){
     		case R.id.button0:
     			textView.setText(textView.getText()+"0");
 				break;
     		case R.id.button1:
     			textView.setText(textView.getText()+"1");
 				break;
 			case R.id.button2:
 				textView.setText(textView.getText()+"2");
 				break;
 			case R.id.button3:
 				textView.setText(textView.getText()+"3");
 				break;
 			case R.id.button4:
     			textView.setText(textView.getText()+"4");
 				break;
 			case R.id.button5:
 				textView.setText(textView.getText()+"5");
 				break;
 			case R.id.button6:
 				textView.setText(textView.getText()+"6");
 				break;
 			case R.id.button7:
     			textView.setText(textView.getText()+"7");
 				break;
 			case R.id.button8:
 				textView.setText(textView.getText()+"8");
 				break;
 			case R.id.button9:
 				textView.setText(textView.getText()+"9");
 				break;
 			case R.id.button11:
 				textView.setText(textView.getText()+"+");
 				break;
 			case R.id.button12:
 				textView.setText(getResult());
 				break;
 			}
     		
 		}
     };
	
}
