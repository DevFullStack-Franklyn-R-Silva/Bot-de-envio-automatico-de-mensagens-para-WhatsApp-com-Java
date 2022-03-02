import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class BotWhatsApp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		int x = 1;

		Robot robot = new Robot();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu texto:");
		String Text = scanner.nextLine();

		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		System.out.println("O spam começará em 5 segundos");
		Thread.sleep(5000); // cronometro 5 seg

		while (x <= 100) {

			Thread.sleep(1000);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			x++;

		}
		scanner.close();

	}

}