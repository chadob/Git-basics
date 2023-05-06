public class QuitButton extends TitleButton implements GameButton {

	private title: "ExitGame";
	private purpose:"Quit";

	public "ExitGame"<br> getTitle() {
 		return this.title; 
	}

	public void setTitle("ExitGame"<br> title) {
 		this.title = title; 
	}

	public "Quit" getPurpose() {
 		return this.purpose; 
	}

	public void setPurpose("Quit" purpose) {
 		this.purpose = purpose; 
	}

}
